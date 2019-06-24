/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

import java.util.Date;

/**
 *
 * @author 91030283
 */
public class PayrollReportItem {
    
    
    Person person;
    double personSalary;
    Date startOfPayPeriod;
    TimePeriods PayPeriod; 
    
    
    public PayrollReportItem(Person person,double salary,Date startOfPayPeriod,TimePeriods PayPeriod)
    {
        this.person= person;
        this.personSalary=salary;
        this.startOfPayPeriod= startOfPayPeriod;
        this.PayPeriod=PayPeriod;
    }
    
    
    public String toString()
    {
        String message = "" + person.firstName +" "+ person.lastName + "was paid" + this.personSalary +"on the "+ this.startOfPayPeriod + "Payment Period:"+ this.PayPeriod;
        return message;
    }
    
}
