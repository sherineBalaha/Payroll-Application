/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

import Interfaces.IManager;
import Interfaces.IPaidPerson;
import Interfaces.ISubordinate;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;

/**
 *
 * @author 91030283
 */

//IContractSubordinate is not existant!!  IPaidInstead
public class ContractSubordinate extends Person implements IPaidPerson, ISubordinate{
    
    public int workHours;
    public double hourlyRate;
    public IManager manager;
    public double overtimeHourlyRate;
    public String strOvertimeHourlyRateRounded;
    
    public ContractSubordinate  (double hourlyRate,IManager manager)
    {
        this.hourlyRate = hourlyRate;
        this.manager = manager;
        
    }

    @Override
    public double CalculatePay(Date startDateOfPayPeriod, double numberOfHours) throws Exception {
        
        
           if (numberOfHours > 160) 
        {
            this.overtimeHourlyRate = hourlyRate * 0.10;
            DecimalFormat twoDecimalFormat = new DecimalFormat("#.##");
            strOvertimeHourlyRateRounded = twoDecimalFormat.format(overtimeHourlyRate);
            
        }
        return  Double.parseDouble(strOvertimeHourlyRateRounded) ;
    }

    @Override
    public IManager getManager() {
        return this.manager;
    }
    
   
    
    
                
   
    
    
            
         
    
    
    
}
