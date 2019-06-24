/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

import Interfaces.ISalariedPerson;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;



/**
 *
 * @author 91030283
 */
public class SalaryPaymentCalculator {
    
    public static final int NUMBER_OF_MONTHS_IN_YEAR = 12;
    public static final int NUMBER_OF_FORTHNIGHTS_IN_YEAR = 26;
    public static final double NUMBER_OF_MILLISECONDS_IN_YEAR = 1000 * 60 * 60 * 24 * 364.25;
    
      
    public static String strFirstDate;
    public static String strSecondDate;      
    
    public static Date firstDate = new Date();
    public static Date secondDate = new Date();
    
    
    public static String strComparedToDate;
    public static Date comparedToDate = new Date();
  
    public static double finalYearlyPay =0 ;
    public static double finalYearlyPayRounded =0;

    
    
    public static double yearsBetween(Date firstDate,Date secondDate) throws ParseException  
    {

        double difference = 0;
        
        try{
            long y1MilliSec = firstDate.getTime();
            long y2MilliSec = secondDate.getTime();
        
            double y1 = y1MilliSec/NUMBER_OF_MILLISECONDS_IN_YEAR;
            double y2 = y2MilliSec/NUMBER_OF_MILLISECONDS_IN_YEAR;
        
            difference= y2-y1;
      }
        
        
        catch (Exception e)
        {
              System.out.println(e);

        }

        return difference;
    }
    
    public static double calculateCurrentSalaryWithIncrease(double baseSalary,Date dateStarted)
    {
        int totalAmountOfIncrease =0;
        double newSalary = 0 ;
        double doubleNumberOfYears=0;
        int numberOfIncreases =0;
        int amountOfIncreasePerTwoYears =0;
        
        try{
            
              DateFormat formate  = new SimpleDateFormat("dd/mm/yyyy");
              strComparedToDate =  "01/01/2015 4:5 PM, PDT";
              comparedToDate = formate.parse(strComparedToDate);
              
              doubleNumberOfYears = SalaryPaymentCalculator.yearsBetween(comparedToDate, dateStarted);
              
              numberOfIncreases = (int)(doubleNumberOfYears /2 ) ;
              amountOfIncreasePerTwoYears =(int)( baseSalary * 0.02);
              totalAmountOfIncrease = numberOfIncreases * amountOfIncreasePerTwoYears;
               
              newSalary = baseSalary + totalAmountOfIncrease;
              
          
        }  
           
        catch (ParseException pe)
        {
              System.out.println(pe);

        }
       
        
           return  newSalary;
    }
    
    public static double calculateFinalYearlyPay(ISalariedPerson salariedPerson)
    {
        
        // tutor : Andrew Buntain recommended adding getBaseSalary() and getDateSalary() to the interface
        double baseSalary = salariedPerson.getBaseSalary();
        Date   dateStarted =salariedPerson.getDateStarted();
        double bonus = salariedPerson.getCurrentBonus();
        
                
        // tutor : Andrew Buntain recommended adding getBaseSalary() to the interface
        finalYearlyPay = calculateCurrentSalaryWithIncrease(baseSalary,dateStarted) + bonus; 
        
        DecimalFormat twoDecimalFormat = new DecimalFormat("#.##");
        String strFinalYearlyPayRounded = twoDecimalFormat.format(SalaryPaymentCalculator.finalYearlyPay);
        finalYearlyPayRounded =  Double.parseDouble(strFinalYearlyPayRounded) ;
            
        return finalYearlyPayRounded;
    }
    
     public static double calculatePay(ISalariedPerson salariedPerson)
     {
         TimePeriods timePeriodEnum;
         finalYearlyPay = SalaryPaymentCalculator.calculateFinalYearlyPay(salariedPerson);
         double payments = 0;
         
         //check the enum of the salaried Person passed if monthly
         if (salariedPerson.getTimePeriod() == TimePeriods.MONTHLY)
         {
             
             double monthlyPayments = finalYearlyPay/NUMBER_OF_MONTHS_IN_YEAR;
             payments = monthlyPayments;
           
         }  
         
        
         else //check the enum of the salaried Person passed if fortnightly  
         {
            double fortnightlyPayments = finalYearlyPay/ NUMBER_OF_FORTHNIGHTS_IN_YEAR;
            payments = fortnightlyPayments; 
         }
             
         return payments;
     }
    
    
}
