/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobs;

import Interfaces.IManager;
import Interfaces.ISubordinate;
import java.util.ArrayList;
import oca.project.Manager;

/**
 *
 * @author 91030283
 */
public class HROfficer extends Manager implements  IManager{

    private ArrayList<ISubordinate> subordinateList ;
    
    public HROfficer(IManager manager) {
        super(50000, manager);
    }


}
