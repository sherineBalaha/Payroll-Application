/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

import Interfaces.ISalariedPerson;
import Interfaces.IManager;
import Interfaces.IPaidPerson;
import Interfaces.ISubordinate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 91030283
 */
public class SalariedSubordinate extends Person implements IPaidPerson,ISalariedPerson,ISubordinate{
    
   
     private IManager       subordinateManager;
     private TimePeriods    salaryFreqTimePeriod; 
     private double         baseSalary;
     private double         bonus;
     
     private Date           startDate    = new Date();
     DateFormat             formate      = new SimpleDateFormat("dd/mm/yyyy");
     public String          strStartDate = formate.format(getStartDate());
     
     public SalariedSubordinate(double baseSalary,IManager manager)
    {
            this.subordinateManager    = manager;
            this.baseSalary            = baseSalary;
            
    }

    
    public double CalculatePay(Date startDateOfPayPeriod, double numberOfHours) throws Exception {
         return SalaryPaymentCalculator.calculatePay(this);
    }

   
    @Override
    public void setCurrentBonus(double currentBonus) {
       this.bonus = currentBonus;
    }

    /**
     * @return the subordinateManager
     */
    public IManager getSubordinateManager() {
        return subordinateManager;
    }

    /**
     * @param subordinateManager the subordinateManager to set
     */
    public void setSubordinateManager(IManager subordinateManager) {
        this.subordinateManager = subordinateManager;
    }


    /**
     * @return the baseSalary
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * @param baseSalary the baseSalary to set
     */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

   
    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public TimePeriods getTimePeriod() {
        return salaryFreqTimePeriod;
    }

    @Override
    public void setTimePeriod(TimePeriods timePeriod) {
        this.salaryFreqTimePeriod = timePeriod;
    }

    @Override
    public double getCurrentBonus() {
        return bonus;
    }

    @Override
    public IManager getManager() {
       return subordinateManager;
    }

    @Override
    public Date getDateStarted() {
        return this.startDate;
    }
    
    
}
