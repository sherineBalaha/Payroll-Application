/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobs;

import Interfaces.IManager;
import Interfaces.IPaidPerson;
import oca.project.ContractSubordinate;

/**
 *
 * @author 91030283
 */
public class SalesConsultant extends ContractSubordinate implements IPaidPerson{

    public SalesConsultant(IManager manager) {
        super(27.5, manager);
    }
    
}
