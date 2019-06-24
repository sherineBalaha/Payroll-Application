package Interfaces;

import java.util.ArrayList;

/**
 *
 * Interface that all the managers should implements
 */
public interface IManager extends IPaidPerson {
    
    ArrayList<ISubordinate> getSubordinateList();
   
}
