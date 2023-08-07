package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.dto.Bond;
import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.model.Security;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public interface SecurityRepository extends JpaRepository<Security, Integer> {

//    @Query(nativeQuery = true, value = "SELECT T.CUSIP,T.ISIN, s.BOND_CURRENCY, s.BOND_MATURITY_DATE, T.COUPON_PERCENT , T.UNIT_PRICE, T.FACE_VALUE ,  T.ISSUER_NAME, S.TYPE, S.STATUS, C.BOND_HOLDER, B.BOOK_NAME FROM TRADE T JOIN SECURITY S ON T.SECURITY_ID = S.SECURITY_ID JOIN COUNTER_PARTY C ON C.COUNTER_PARTY_ID=T.COUNTER_PARTY_ID JOIN BOOK B ON B.BOOK_ID=T.BOOK_ID;")
//    List<Bond> findBond ();

}
