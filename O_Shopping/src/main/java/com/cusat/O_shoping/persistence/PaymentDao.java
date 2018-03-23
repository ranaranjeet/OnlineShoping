package com.cusat.O_shoping.persistence;

import java.math.BigInteger;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cusat.O_shoping.model.Payment;


public interface PaymentDao extends JpaRepository<Payment, BigInteger>{

} 