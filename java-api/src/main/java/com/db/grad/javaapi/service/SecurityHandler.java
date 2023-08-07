package com.db.grad.javaapi.service;

import com.db.grad.javaapi.dto.Bond;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.repository.BookRepository;
import com.db.grad.javaapi.repository.CounterPartyRepository;
import com.db.grad.javaapi.repository.SecurityRepository;
import com.db.grad.javaapi.repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SecurityHandler implements ISecurityService {

    private final SecurityRepository securityRepository;

    private final TradeRepository tradeRepository;

    private final CounterPartyRepository counterPartyRepository;

    private final BookRepository bookRepository;

    @Autowired
    public SecurityHandler(SecurityRepository securityRepository, TradeRepository tradeRepository, CounterPartyRepository counterPartyRepository, BookRepository bookRepository) {
        this.securityRepository = securityRepository;
        this.tradeRepository = tradeRepository;
        this.counterPartyRepository = counterPartyRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public Security saveSecurity(Security security) {
        return securityRepository.save(security);
    }

    @Override
    public Security getSecurityById(Integer securityId) {
        return securityRepository.findById(securityId).orElse(null);
    }

    @Override
    public List<Security> getAllSecurities() {
        return securityRepository.findAll();
    }

    @Override
    public void deleteSecurity(Integer securityId) {
        securityRepository.deleteById(securityId);
    }

    public List<Security> getSecurityByIssuerName(String name) {
        List<Security> all = securityRepository.findAll();
        List<Security> result = new ArrayList<Security>();

        for (Security security : all) {
            if (security.getIssuerName().equalsIgnoreCase(name)) {
                result.add(security);
            }
        }
        if(result.isEmpty())
            return null;

        return result;
    }


    public List<Security> getSecurityBy5DaysBods(String name) {
        List<Security> result = new ArrayList<Security>();
        result = getSecurityByIssuerName(name);

        List<Security> out = new ArrayList<Security>();

        LocalDate currentDate = LocalDate.now();
        LocalDate fiveDaysBeforeCurrentDate = currentDate.minusDays(5);
        LocalDate fiveDaysAfterCurrentDate = currentDate.plusDays(5);


        for (Security itr : result) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.parse(itr.getBondMaturityDate(), formatter);

            if (date.isAfter(fiveDaysBeforeCurrentDate) && date.isBefore(fiveDaysAfterCurrentDate)) {

                out.add(itr);
            }


        }

        if(out.isEmpty())
            return null;

        return out;
    }

    public List<Bond> getSecurityBy5DaysBondsDate(String dateRequest){

        List<Bond> all = getBond();
        List<Bond> result = new ArrayList<Bond>();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate check = LocalDate.parse(dateRequest, formatter);

        LocalDate fiveDaysBeforeCurrentDate = check.minusDays(5);
        LocalDate fiveDaysAfterCurrentDate = check.plusDays(5);


        for (Bond itr : all) {
            String convertedDate = convertToYYYYMMDD(itr.getBondMaturityDate());

            if(convertedDate == null)
                return null;

            LocalDate checkFromArray = LocalDate.parse(convertedDate, formatter);

            if (checkFromArray.isAfter(fiveDaysBeforeCurrentDate) && checkFromArray.isBefore(fiveDaysAfterCurrentDate)) {
                System.out.println("Input date is within ±5 days from the desired date.");
                result.add(itr);
            }
        }

        if(result.isEmpty())
            return null;

        return result;
    }


    //method used for converting from dd/mm/YYYY to YYYY-MM-dd (it's easier for the url parser)
    public static String convertToYYYYMMDD(String inputDate) {
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = inputFormat.parse(inputDate);
            return outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }



    public List<Bond> getBond() {
        List<Security> all = securityRepository.findAll();
        List<Bond> out = new ArrayList<>();

        for (Security itr : all) {
            Bond to_add = new Bond();

            to_add.setCusip(itr.getCusip());
            to_add.setIsin(itr.getIsin());
            to_add.setBondCurrency(itr.getBondCurrency());
            to_add.setIssuerName(itr.getIssuerName());
            to_add.setType(itr.getType());
            to_add.setBondMaturityDate(itr.getBondMaturityDate());
            to_add.setStatus(itr.getStatus());

            List<Trade> all_trades =  tradeRepository.findAll();

           for(Trade trade_itr : all_trades){
               if(trade_itr.getSecurity().getSecurityId() == (itr.getSecurityId())){
                   to_add.setCouponPercent(trade_itr.getCouponPercent());
                   to_add.setUnitPrice(trade_itr.getUnitPrice());
                   to_add.setFaceValue(trade_itr.getFaceValue());
                   to_add.setBookName( bookRepository.getReferenceById(trade_itr.getBook().getBookId()).getBookName());
                   to_add.setBondHolder(counterPartyRepository.getReferenceById(trade_itr.getCounterParty().getCounterPartyId()).getBondHolder());
               }
           }
           out.add(to_add);
        }
        return out;
    }

}
