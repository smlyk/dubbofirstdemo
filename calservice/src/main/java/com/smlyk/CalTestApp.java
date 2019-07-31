package com.smlyk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class CalTestApp
{
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");

        ISaleOrderService saleOrderService = (ISaleOrderService) applicationContext.getBean("saleOrderService");

        System.out.println(saleOrderService.getSaleOrderList());
    }
}
