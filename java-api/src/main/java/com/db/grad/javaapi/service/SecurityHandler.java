package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.repository.SecurityRepository;
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

    @Autowired
    public SecurityHandler(SecurityRepository securityRepository) {
        this.securityRepository = securityRepository;
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

    public List<Security> getSecurityBy5DaysBodsDate(String dateRequest){

        List<Security> all = securityRepository.findAll();
        List<Security> result = new ArrayList<Security>();

        System.out.println(dateRequest);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate check = LocalDate.parse(dateRequest, formatter);

        LocalDate fiveDaysBeforeCurrentDate = check.minusDays(5);
        LocalDate fiveDaysAfterCurrentDate = check.plusDays(5);

        for (Security itr : all) {
            String convertedDate = convertDateFormat(itr.getBondMaturityDate(), "MM/dd/yyyy", "MM-dd-yyyy");
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


    //method used for converting from dd/mm/YYYY to dd-mm-YYY (it's easier for the url parser)
    public static String convertDateFormat(String inputDate, String inputFormat, String outputFormat) {
        SimpleDateFormat inputDateFormat = new SimpleDateFormat(inputFormat);
        SimpleDateFormat outputDateFormat = new SimpleDateFormat(outputFormat);

        try {
            Date date = inputDateFormat.parse(inputDate);
            return outputDateFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }


}
