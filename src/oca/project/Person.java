/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author 91030283
 */
public class Person extends Object {
    
    public String firstName;
    public String lastName;
    public String position;
    
    
    public String strDateOfBirth;
    public String strStartOfPaymentDate;              
    
    public Date dateOfBirth = new Date();
    public Date startOfPaymentDate = new Date();

    
    public Person()
    {        
        DateFormat formate = new SimpleDateFormat("dd/mm/yyyy");
        strDateOfBirth = formate.format(dateOfBirth);
        strStartOfPaymentDate = formate.format(startOfPaymentDate);
        
    }
    
    public String toString()
    {
        //will be used to display in a comboBox in PersonalDataForm and Report Form
        return this.firstName +" "+ this.lastName;
    }
    
    
    
}
