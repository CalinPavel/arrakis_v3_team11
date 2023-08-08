package com.db.grad.javaapi.service;

import com.db.grad.javaapi.dto.Bond;
import com.db.grad.javaapi.model.Book;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.repository.BookRepository;
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
public class TradeHandler implements ITradeService{

    private TradeRepository tradeRepository;

    @Autowired
    public TradeHandler(TradeRepository tradeRepository){
        this.tradeRepository= tradeRepository;
    }

    @Override
    public Trade saveTrade(Trade trade) {
        return tradeRepository.save(trade);
    }

    @Override
    public Trade getTradeById(Integer tradeId) {
        return tradeRepository.findById(tradeId).orElse(null);
    }

    @Override
    public List<Trade> getAllTrades() {
        return tradeRepository.findAll();
    }

    @Override
    public void deleteTrade(Integer tradeId) {
        tradeRepository.deleteById(tradeId);
    }

    public List<Trade> getTradesByDate(String dateRequest){
        List<Trade> result = new ArrayList<>();
        List<Trade> all = tradeRepository.findAll();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate check = LocalDate.parse(dateRequest, formatter);

        LocalDate fiveDaysBeforeCurrentDate = check.minusDays(5);
        LocalDate fiveDaysAfterCurrentDate = check.plusDays(5);

        for (Trade itr : all) {
            String convertedDate = convertToYYYYMMDD(itr.getTradeDate());

            if(convertedDate == null)
                return null;

            LocalDate checkFromArray = LocalDate.parse(convertedDate, formatter);

            if (checkFromArray.isAfter(fiveDaysBeforeCurrentDate) && checkFromArray.isBefore(fiveDaysAfterCurrentDate)) {
                System.out.println("Input date is within ±5 days from the desired date.");
                result.add(itr);
            }
        }
        return result;
    }


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

}
