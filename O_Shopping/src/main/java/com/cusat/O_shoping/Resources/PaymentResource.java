package com.cusat.O_shoping.Resources;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cusat.O_shoping.model.Payment;
import com.cusat.O_shoping.persistence.PaymentDao;



public class PaymentResource {

	PaymentDao paymentdao;
	
	@Inject
	public PaymentResource(PaymentDao paymentdao) 	{
	 	this.paymentdao=paymentdao;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Payment> getpayment() {
		List<Payment> payment =paymentdao.findAll();
		return payment;
	}
	
	@POST
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public Payment save(@Valid Payment payment) {
        return paymentdao.save(payment);
    }
}
