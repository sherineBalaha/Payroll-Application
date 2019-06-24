/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

import Interfaces.ISalariedPerson;
import Interfaces.IManager;
import Interfaces.ISubordinate;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 91030283
 */
public class CEO extends Person implements ISalariedPerson,IManager {

     private TimePeriods salaryFreqTimePeriod ; 
     private double baseSalary = 110000;
     private double bonus;
     private static double managerBonusFund = 5000;
     private ArrayList<ISubordinate> subordinateList = new ArrayList<>();
     
     private Date  startDate    = new Date();
     DateFormat    formate      = new SimpleDateFormat("dd/mm/yyyy");
     public String strStartDate = formate.format(getStartDate());
    
    
    @Override
    public TimePeriods getTimePeriod() {
        return this.salaryFreqTimePeriod;
    }

    @Override
    public void setTimePeriod(TimePeriods timePeriod) {

    }

    @Override
    public double getCurrentBonus() {
        return this.bonus;
    }

    @Override
    public void setCurrentBonus(double currentBonus) {

    }

    @Override
    public double CalculatePay(Date startDateOfPayPeriod, double numberOfHours) throws Exception {
        return SalaryPaymentCalculator.calculatePay(this);
    }

    @Override
    public ArrayList<ISubordinate> getSubordinateList() {
         return subordinateList;
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
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * @return the managerBonusFund
     */
    public double getManagerBonusFund() {
        return managerBonusFund;
    }

    /**
     * @param managerBonusFund the managerBonusFund to set
     */
    public void setManagerBonusFund(double managerBonusFund) {
        this.managerBonusFund = managerBonusFund;
    }

  
    /**
     * @param list the subordinateList to set
     */
    public void setSubordinate(ArrayList<ISubordinate> list) {
        this.subordinateList = list;
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
    
    public String assignBonus (ISubordinate subordinate,double bonus) throws IOException
    {
        return BonusUpdater.assignBonus(this,subordinate,bonus);
    }
    
    public void applyBonus(double bonus)
    {
        managerBonusFund -= bonus;
    }

    @Override
    public Date getDateStarted() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
