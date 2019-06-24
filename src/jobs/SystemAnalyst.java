/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobs;

import Interfaces.IManager;
import oca.project.SalariedSubordinate;

/**
 *
 * @author 91030283
 */
public class SystemAnalyst extends SalariedSubordinate{
 
     public SystemAnalyst(IManager manager) {
        super(75000,manager);
    }
}
