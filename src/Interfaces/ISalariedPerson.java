package Interfaces;

import java.util.Date;
import oca.project.TimePeriods;

/**
 *
 * Interface to be implemented by all people working at the company
 * who are getting salaries 
 */
public interface ISalariedPerson extends IPaidPerson {
    
    //getter and setter methods for pay period   
    TimePeriods getTimePeriod();
    
    void setTimePeriod(TimePeriods timePeriod);
    
    //getter and setter methods for Bonuses that might be assigned 
    //to subordinate by manager
    double getCurrentBonus();
    
    // Andrew Buntain recommended adding both these methods
    double getBaseSalary();
    Date getDateStarted ();
    
    void setCurrentBonus(double currentBonus);
    
}
