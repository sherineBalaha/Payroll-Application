/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobs;

import Interfaces.IManager;
import Interfaces.ISubordinate;
import java.util.ArrayList;
import oca.project.SalariedSubordinate;

/**
 *
 * @author 91030283
 */

public class FinancialAdministrator extends SalariedSubordinate{
    
    private ArrayList<ISubordinate> subordinateList ;
    
    public FinancialAdministrator(IManager manager) {
        super(75000,manager);
    }
    
   
    
    
}
