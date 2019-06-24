/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import oca.project.ContractSubordinate;

import oca.project.Person;
import oca.project.SalariedSubordinate;
import oca.project.TimePeriods;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oca.project.Launcher;
import oca.project.PayrollReportItem;

/**
 *
 * @author 91030283
 */
public class PersonaInformationForm extends javax.swing.JFrame {

    /**
     * Creates new form PersonaInformationForm
     */
    
    
    //declare and inastantiate ArrayList of persons
    private ArrayList<Person> persons = new ArrayList<>();
    private MainForm mainForm;
    Date  startDateSelectedContSub = new Date();
    
    //combo box and model declarations
    DefaultComboBoxModel<Object> NameComboBoxsModel = new javax.swing.DefaultComboBoxModel<>();
    
    //enumerator's declaration
    String Message = "";
    
    //Add/submit button declarations
    String strstartDateSelectedContSub = "";
    String strWorkHoursSelectedContSub = "";
    ContractSubordinate selectedContSub;
    

    
    PayrollReportItem            newPayrollReportItem ;
    ArrayList<PayrollReportItem> mainPayrollReportItems;
    Person selectedperson;
    
    
    public PersonaInformationForm() throws ParseException {
        initComponents();
       
        // *** populating name combo box with all employees goes into SetPersons method
        
                
        }
          

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inforOptionPane = new javax.swing.JOptionPane();
        PersonalInfoOptionPane = new javax.swing.JOptionPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contractorYesNoBox = new javax.swing.JList();
        timePeriodLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TimePeriodMonthlyFortnightlyTxtBox = new javax.swing.JComboBox();
        contractorWorkerLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        startDateOfPayPeriodLbl = new javax.swing.JLabel();
        hoursOfWorkLbl = new javax.swing.JLabel();
        hourlyRateTxt = new javax.swing.JTextField();
        hourlyRateLbl = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        startDateOfPayPeriodTxtBox = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        hoursOfWorkTxt = new javax.swing.JTextField();
        nameComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateOfBirthTxt = new javax.swing.JTextField();
        startDateTxt = new javax.swing.JTextField();
        baseSalaryLbl = new javax.swing.JLabel();
        baseSalaryTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Date of Birth :");

        contractorYesNoBox.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Yes", "No" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        contractorYesNoBox.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        contractorYesNoBox.setToolTipText("");
        contractorYesNoBox.setEnabled(false);
        jScrollPane1.setViewportView(contractorYesNoBox);

        timePeriodLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        timePeriodLbl.setForeground(new java.awt.Color(51, 51, 255));
        timePeriodLbl.setText("Time Period :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Personal Information ");

        TimePeriodMonthlyFortnightlyTxtBox.setBackground(new java.awt.Color(153, 255, 153));
        TimePeriodMonthlyFortnightlyTxtBox.setForeground(new java.awt.Color(51, 51, 255));
        TimePeriodMonthlyFortnightlyTxtBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Monthly", "Fortnightly" }));
        TimePeriodMonthlyFortnightlyTxtBox.setToolTipText("");

        contractorWorkerLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contractorWorkerLbl.setForeground(new java.awt.Color(51, 51, 255));
        contractorWorkerLbl.setText("Contractor worker :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Name :");

        startDateOfPayPeriodLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        startDateOfPayPeriodLbl.setForeground(new java.awt.Color(51, 51, 255));
        startDateOfPayPeriodLbl.setText("Start Date of Pay Period :");

        hoursOfWorkLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hoursOfWorkLbl.setForeground(new java.awt.Color(51, 51, 255));
        hoursOfWorkLbl.setText("Hours of work :");

        hourlyRateTxt.setEditable(false);
        hourlyRateTxt.setToolTipText("");
        hourlyRateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourlyRateTxtActionPerformed(evt);
            }
        });

        hourlyRateLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hourlyRateLbl.setForeground(new java.awt.Color(51, 51, 255));
        hourlyRateLbl.setText("Hourly rate :");

        addBtn.setBackground(new java.awt.Color(153, 255, 153));
        addBtn.setForeground(new java.awt.Color(51, 51, 255));
        addBtn.setText("Add/Submit");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        startDateOfPayPeriodTxtBox.setEditable(false);
        startDateOfPayPeriodTxtBox.setToolTipText("");
        startDateOfPayPeriodTxtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateOfPayPeriodTxtBoxActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(153, 255, 153));
        backBtn.setForeground(new java.awt.Color(51, 51, 255));
        backBtn.setText("Back");
        backBtn.setBorderPainted(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        hoursOfWorkTxt.setEditable(false);
        hoursOfWorkTxt.setToolTipText("");
        hoursOfWorkTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursOfWorkTxtActionPerformed(evt);
            }
        });

        nameComboBox.setBackground(new java.awt.Color(153, 255, 153));
        nameComboBox.setEditable(true);
        nameComboBox.setForeground(new java.awt.Color(51, 51, 255));
        nameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Contractor :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Start Date :");

        dateOfBirthTxt.setEditable(false);
        dateOfBirthTxt.setToolTipText("");
        dateOfBirthTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateOfBirthTxtActionPerformed(evt);
            }
        });

        startDateTxt.setEditable(false);
        startDateTxt.setToolTipText("");
        startDateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateTxtActionPerformed(evt);
            }
        });

        baseSalaryLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        baseSalaryLbl.setForeground(new java.awt.Color(51, 51, 255));
        baseSalaryLbl.setText("Base Salary :");

        baseSalaryTxt.setEditable(false);
        baseSalaryTxt.setToolTipText("");
        baseSalaryTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseSalaryTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(startDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(startDateOfPayPeriodLbl)
                                .addGap(18, 18, 18)
                                .addComponent(startDateOfPayPeriodTxtBox))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(hourlyRateLbl)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(addBtn)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(163, 163, 163)
                                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(hourlyRateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(hoursOfWorkLbl)
                                        .addGap(80, 80, 80)
                                        .addComponent(hoursOfWorkTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(contractorWorkerLbl)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(timePeriodLbl)
                                            .addComponent(baseSalaryLbl))
                                        .addGap(91, 91, 91)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TimePeriodMonthlyFortnightlyTxtBox, 0, 120, Short.MAX_VALUE)
                                            .addComponent(baseSalaryTxt)
                                            .addComponent(jScrollPane1))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(dateOfBirthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(342, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateOfBirthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(startDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TimePeriodMonthlyFortnightlyTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timePeriodLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(baseSalaryLbl)
                    .addComponent(baseSalaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(contractorWorkerLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDateOfPayPeriodLbl)
                    .addComponent(startDateOfPayPeriodTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoursOfWorkLbl)
                    .addComponent(hoursOfWorkTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourlyRateLbl)
                    .addComponent(hourlyRateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hourlyRateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourlyRateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hourlyRateTxtActionPerformed

    private void startDateOfPayPeriodTxtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDateOfPayPeriodTxtBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startDateOfPayPeriodTxtBoxActionPerformed

    private void hoursOfWorkTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursOfWorkTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hoursOfWorkTxtActionPerformed

    private void dateOfBirthTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateOfBirthTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateOfBirthTxtActionPerformed

    private void startDateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startDateTxtActionPerformed

    private void baseSalaryTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseSalaryTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baseSalaryTxtActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try
        {
            
        
        DateFormat formate = new SimpleDateFormat("dd/mm/yyyy");
           
        strstartDateSelectedContSub = startDateOfPayPeriodTxtBox.getText();
        startDateSelectedContSub = formate.parse(strstartDateSelectedContSub);
        
        strWorkHoursSelectedContSub = hoursOfWorkTxt.getText();
        double  doubleWorkHoursSelectedContSub = Double.parseDouble(strWorkHoursSelectedContSub);
        double amountPaidToContractor = selectedContSub.CalculatePay (startDateSelectedContSub,doubleWorkHoursSelectedContSub);
        
        //create report item
        newPayrollReportItem = new PayrollReportItem((Person)selectedContSub, amountPaidToContractor,startDateSelectedContSub, null ); //null because it contractor..no time period
        mainPayrollReportItems = mainForm.getPayrollReportItems();
        mainPayrollReportItems.add(newPayrollReportItem);          
        
        Message = "Payment has been added to " + selectedContSub.firstName +" "+ selectedContSub.lastName;
        JOptionPane.showMessageDialog(this, Message,"Announcement",JOptionPane.INFORMATION_MESSAGE);
        }
        
         
        catch (Exception e)
        {
          Message = "General exception Caught!";
          JOptionPane.showMessageDialog(this, Message,"Announcement",JOptionPane.INFORMATION_MESSAGE);
          
        }
        finally
        {
          JOptionPane.showMessageDialog(this, Message,"Announcement",JOptionPane.INFORMATION_MESSAGE);
        }
       
                
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        this.setVisible(false);
        Launcher.mainForm.setVisible(true);

    }//GEN-LAST:event_backBtnActionPerformed

    private void nameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameComboBoxActionPerformed

                selectedperson = (Person)nameComboBox.getSelectedItem();
                
                dateOfBirthTxt.setText(selectedperson.strDateOfBirth);
   
                //check wether contractor or not
                if (selectedperson instanceof SalariedSubordinate)
                {
                    //set base salary
                    SalariedSubordinate selectedSalSub =(SalariedSubordinate) selectedperson;
                    startDateTxt.setText(selectedSalSub.strStartDate);
                    double  doubleSelectedSalSub       = selectedSalSub.getBaseSalary();
                    String  strSelectedSalSub          = String.valueOf(doubleSelectedSalSub);
                    baseSalaryTxt.setText(strSelectedSalSub);
                    contractorYesNoBox.setSelectedValue("No", false);
                    
                    //setting time period enumerator
                    TimePeriods timePeriodOfselectedSalSub = selectedSalSub.getTimePeriod();
                    System.out.println(timePeriodOfselectedSalSub);
                    TimePeriodMonthlyFortnightlyTxtBox.setSelectedItem(timePeriodOfselectedSalSub);
                    TimePeriodMonthlyFortnightlyTxtBox.setEditable(false);
                                        
                    //hiding contractor's field when it is salaried Subordinate
                    contractorWorkerLbl.setVisible(false);
                    startDateOfPayPeriodLbl.setVisible(false);
                    startDateOfPayPeriodTxtBox.setVisible(false);
                    hoursOfWorkLbl.setVisible(false);
                    hoursOfWorkTxt.setVisible(false);
                    hourlyRateLbl.setVisible(false);
                    hourlyRateTxt.setVisible(false);
                    
                }    
                else if (selectedperson instanceof ContractSubordinate)
                {
                    
                    //set fields of Contractor and adding to arraylist
                    selectedContSub =(ContractSubordinate) selectedperson;
                    double  doubleselectedContSub       = selectedContSub.hourlyRate;
                    hourlyRateTxt.setText(String.valueOf(doubleselectedContSub));
                    contractorYesNoBox.setSelectedValue("Yes", false);   
                        
                    
                    //hiding SalariedSub's  field when it is contractor
                    timePeriodLbl.setVisible(false);
                    TimePeriodMonthlyFortnightlyTxtBox.setVisible(false);
                    baseSalaryLbl.setVisible(false);
                    baseSalaryTxt.setVisible(false);
                    
                                       
                    startDateOfPayPeriodTxtBox.setEditable(true);  
                    hoursOfWorkTxt.setEditable(true);              
                    String  Message = "Please enter both start date of pay period and hours worked for  " + selectedContSub.firstName +" " + selectedContSub.lastName ;
                    inforOptionPane = new JOptionPane(Message,2,1);    
                    inforOptionPane.setVisible(true);
               

                }




    }//GEN-LAST:event_nameComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PersonaInformationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonaInformationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonaInformationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonaInformationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    new PersonaInformationForm(Launcher.mainForm.persons).setVisible(true);
//                } catch (ParseException ex) {
//                    Logger.getLogger(PersonaInformationForm.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JOptionPane PersonalInfoOptionPane;
    private javax.swing.JComboBox TimePeriodMonthlyFortnightlyTxtBox;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel baseSalaryLbl;
    private javax.swing.JTextField baseSalaryTxt;
    private javax.swing.JLabel contractorWorkerLbl;
    private javax.swing.JList contractorYesNoBox;
    private javax.swing.JTextField dateOfBirthTxt;
    private javax.swing.JLabel hourlyRateLbl;
    private javax.swing.JTextField hourlyRateTxt;
    private javax.swing.JLabel hoursOfWorkLbl;
    private javax.swing.JTextField hoursOfWorkTxt;
    private javax.swing.JOptionPane inforOptionPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox nameComboBox;
    private javax.swing.JLabel startDateOfPayPeriodLbl;
    private javax.swing.JTextField startDateOfPayPeriodTxtBox;
    private javax.swing.JTextField startDateTxt;
    private javax.swing.JLabel timePeriodLbl;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the persons
     */
    public ArrayList<Person> getPersons() {
        return persons;
    }

    /**
     * @param persons the persons to set
     */
    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
        
        //populating name combo box with all employees
        for (Person person : persons) {
          
                NameComboBoxsModel.addElement(person);
                
            }    
                nameComboBox.setModel(NameComboBoxsModel);
    
    }

    /**
     * @return the mainForm
     */
    public MainForm getMainForm() {
        return mainForm;
    }

    /**
     * @param mainForm the mainForm to set
     */
    public void setMainForm(MainForm mainForm) {
        this.mainForm = mainForm;
    }
}
