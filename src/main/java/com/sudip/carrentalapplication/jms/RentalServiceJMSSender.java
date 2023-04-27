package com.sudip.carrentalapplication.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

public class RentalServiceJMSSender implements IJMSSender{
    @Autowired
    JmsTemplate jmsTemplate;

    public void sendJMSMessage (String text){
//		ObjectMapper mapper = new ObjectMapper();
        System.out.println("JMSSender: sending JMS message ="+text);
        jmsTemplate.convertAndSend("taxServiceQueue", text);
    }

}
