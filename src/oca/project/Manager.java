/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

import Interfaces.IManager;
import Interfaces.ISubordinate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 91030283
 */
public class Manager extends SalariedSubordinate implements IManager{

    /**
     * @return the managerBonusFund
     */
    
    private ArrayList<ISubordinate> subordinateList ;
    public static double managerBonusFund = 5000;
    SalariedSubordinate salSubManager;
    
    public Manager(double baseSalary, IManager manager,ArrayList<ISubordinate> subordinateList) {
        
        super(baseSalary, manager);
        this.subordinateList = subordinateList;
        
    }
    
    public Manager(double baseSalary, IManager manager) {
        this(baseSalary, manager, new ArrayList<ISubordinate>());
    }
    
    @Override
    public ArrayList<ISubordinate> getSubordinateList() {
        //subordinateList = this.subordinateList ;
        return subordinateList;
    }
    
    
    @Override
    public double CalculatePay(Date startDateOfPayPeriod, double numberOfHours) throws Exception {
         return SalaryPaymentCalculator.calculatePay(this);
 
    }
    
    public String assignBonus (ISubordinate subordinate,double bonus) throws IOException
    {
        return BonusUpdater.assignBonus(this,subordinate,bonus);
    }
    
    public void applyBonus(double bonus)
    {
        setManagerBonusFund(getManagerBonusFund() - bonus);
    }

    /**
     * @param subordinateList the subordinateList to set
     */
    public void setSubordinateList(ArrayList<ISubordinate> subordinateList) {
        this.subordinateList = subordinateList;
    }
    
    public static double getManagerBonusFund() {
        return managerBonusFund;
    }

    /**
     * @param aManagerBonusFund the managerBonusFund to set
     */
    public static void setManagerBonusFund(double aManagerBonusFund) {
        managerBonusFund = aManagerBonusFund;
    }
    
  

    public String toString() {
        String fullName = this.firstName + " " + this.lastName;
        return fullName;
    }

    
  
    
}
