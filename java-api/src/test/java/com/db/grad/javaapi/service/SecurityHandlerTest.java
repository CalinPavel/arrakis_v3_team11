package com.db.grad.javaapi.service;

import com.db.grad.javaapi.dto.Bond;
import com.db.grad.javaapi.model.Book;
import com.db.grad.javaapi.model.CounterParty;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.repository.BookRepository;
import com.db.grad.javaapi.repository.CounterPartyRepository;
import com.db.grad.javaapi.repository.SecurityRepository;
import com.db.grad.javaapi.repository.TradeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class SecurityHandlerTest {

    @Mock
    private SecurityRepository securityRepository;

    @InjectMocks
    private SecurityHandler securityHandler;

    @Test
    void testSaveSecurity() {
        Security security = new Security();
        Mockito.when(securityRepository.save(security)).thenReturn(security);

        Security savedSecurity = securityHandler.saveSecurity(security);

        assertEquals(security, savedSecurity);
        Mockito.verify(securityRepository, times(1)).save(security);
    }

    @Test
    void testGetSecurityById() {
        int securityId = 1;
        Security security = new Security();
        Mockito.when(securityRepository.findById(securityId)).thenReturn(Optional.of(security));

        Security retrievedSecurity = securityHandler.getSecurityById(securityId);

        assertEquals(security, retrievedSecurity);
        Mockito.verify(securityRepository, times(1)).findById(securityId);
    }

    @Test
    void testGetAllSecurities() {
        List<Security> securities = new ArrayList<>();
        securities.add(new Security());
        Mockito.when(securityRepository.findAll()).thenReturn(securities);

        List<Security> retrievedSecurities = securityHandler.getAllSecurities();

        assertEquals(securities, retrievedSecurities);
        Mockito.verify(securityRepository, times(1)).findAll();
    }

    @Test
    void testDeleteSecurity() {
        int securityId = 1;
        Mockito.doNothing().when(securityRepository).deleteById(securityId);

        securityHandler.deleteSecurity(securityId);

        Mockito.verify(securityRepository, times(1)).deleteById(securityId);
    }

    @Test
    void testGetSecurityByIssuerName() {
//        String issuerName = "ExampleIssuer";
//        List<Security> securities = new ArrayList<>();
//        securities.add(new Security());
//        when(securityRepository.findAll()).thenReturn(securities);
//
//        List<Security> retrievedSecurities = securityHandler.getSecurityByIssuerName(issuerName);
//
//        assertEquals(securities, retrievedSecurities);
//        verify(securityRepository, times(1)).findAll();
    }

    @Mock
    private TradeRepository tradeRepository;

    @Mock
    private CounterPartyRepository counterPartyRepository;

    @Mock
    private BookRepository bookRepository;

    @Test
    void testGetSecurityBy5DaysBonds() {
//        String issuerName = "ExampleIssuer";
//        List<Security> securities = new ArrayList<>();
//        securities.add(new Security());
//        when(securityRepository.findAll()).thenReturn(securities);
//
//        List<Security> result = securityHandler.getSecurityBy5DaysBonds(issuerName);
//
//        assertNotNull(result);
    }

    @Test
    void getSecurityBy5DaysBondsDate() {
//        String dateRequest = "2023-08-07";
//        List<Bond> bonds = new ArrayList<>();
//        bonds.add(new Bond());
//        when(securityRepository.findAll()).thenReturn(new ArrayList<>()); // Mocking empty securities for simplicity
//        when(tradeRepository.findAll()).thenReturn(new ArrayList<>()); // Mocking empty trades for simplicity
//        when(counterPartyRepository.getReferenceById(anyInt())).thenReturn(new CounterParty()); // Mocking CounterParty for simplicity
//        when(bookRepository.getReferenceById(anyInt())).thenReturn(new Book()); // Mocking Book for simplicity
//
//        List<Bond> result = securityHandler.getSecurityBy5DaysBondsDate(dateRequest);
//
//        assertNotNull(result);
    }

    @Test
    void convertToYYYYMMDD() {
        String inputDate = "15/08/2023";
        String expectedOutput = "2023-08-15";

        String convertedDate = SecurityHandler.convertToYYYYMMDD(inputDate);

        assertEquals(expectedOutput, convertedDate);
    }

    @Test
    void getBond() {
    }
}