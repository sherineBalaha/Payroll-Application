/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobs;

import java.util.ArrayList;
import java.util.Date;
import Interfaces.IManager;
import Interfaces.ISubordinate;
import oca.project.Manager;

/**
 *
 * @author 91030283
 */
public class BranchManager extends Manager implements IManager {

    private ArrayList<ISubordinate> subordinateList ;
    
    public BranchManager(IManager manager) {
        super(90000, manager);
    }

    
    
}
