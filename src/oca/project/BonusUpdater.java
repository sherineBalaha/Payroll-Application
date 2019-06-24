/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

import Interfaces.IManager;
import Interfaces.ISalariedPerson;
import Interfaces.ISubordinate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author 91030283
 */
public class BonusUpdater {
    
    
    public static double availableFund = Manager.managerBonusFund;
    public static String Message;
    public static int count = 0;
    public static String assignBonus (IManager manager,ISubordinate subordinate,double bonus) throws IOException
    {
        

        //decalarations required
        ArrayList<ISubordinate> subordinateList = new ArrayList<>();
        subordinateList= manager.getSubordinateList();
        Manager castedManager  = (Manager)manager;
        double bonusAssginedAlready = 0;
                
        //try and catch for exception handling
        try
        {
        for(ISubordinate s : subordinateList)
        {
            if(s == subordinate)
            {              
                //if a match of subordinate is found
                count++;
                if (availableFund >= bonus)
                {
                    
                    ISalariedPerson newSubordinate = (ISalariedPerson)subordinate;
                    bonusAssginedAlready = newSubordinate.getCurrentBonus();
                    if(bonusAssginedAlready == 0)
                    {
                        //assign him the bonus
                        newSubordinate.setCurrentBonus(bonus);
                        
                        //update manager's bonus
                        castedManager.applyBonus(bonus);
                   
                    }
                    else
                    {
                        Message = "This employess has been assigned bonus already.. can't assgin again";
                    }
                }
                else
                {
                     Message = "Current Manager's Fund is not enough..";
                     
                }
                
                
            }
            else 
            {       
                    throw new IOException();
            }
            
        }
        
    }
    catch (IOException ioe)
    {
          Message =  "Input Output exception caught!";
    }
    catch (Exception e)
    {
          Message = "General exception Caught!";
    }
        
        
        return Message;
    }
}
