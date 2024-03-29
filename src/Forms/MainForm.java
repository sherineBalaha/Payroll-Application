/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

// import static Forms.MainForm.payDate;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import oca.project.Person;
import java.util.ArrayList;
import java.util.Date;
import oca.project.PayrollReportItem;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oca.project.Launcher;
import oca.project.TimePeriods;
/**
 *
 * @author 91030283
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     * @param person
     */
    
    
    //declarations needed
    ArrayList<Person> persons;
    //will be used to rec payments made to salaried and contractor persons
    private ArrayList<PayrollReportItem> payrollReportItems = new ArrayList<>();
    
    //Monthly and fortnightly dates
     
    private Date           MonthlyPayDate         = new Date();
    private Date           FortnightlyPayDate     = new Date();
    
    DateFormat             formate                = new SimpleDateFormat("dd/mm/yyyy");
    
    Calendar currentMonthStart = Calendar.getInstance();
    Calendar currentFortnightStart = Calendar.getInstance();
    
    //currentMonthStart = formate.parse(strCurrentMonthStart);
    
    AssignBonusForm assignBonusForm;
    AddPaymentsForm addPaymentForm;
    PersonaInformationForm personalInformationForm ;  
    PayrollReportsForm payrollReportsForm ;
    
   
    public MainForm(ArrayList<Person> persons) throws ParseException {
        initComponents();
        
        //Fortnightly and monthly start dates
        String strCurrentMonthStart                   =  "01/01/2015 4:5 PM, PDT";
        String strCurrentFortnightStart               =  "01/01/2015 4:5 PM, PDT";
        MonthlyPayDate                      = formate.parse(strCurrentMonthStart);
        FortnightlyPayDate                  = formate.parse(strCurrentFortnightStart);
         
        
        
       this.setBounds(0, 0, 700, 700);
       this.setVisible(true);
       
       assignBonusForm         =   new AssignBonusForm();
       addPaymentForm          =   new AddPaymentsForm(payrollReportItems);
       payrollReportsForm      =   new PayrollReportsForm(payrollReportItems);
       personalInformationForm =   new PersonaInformationForm();
       
       this.setPersonsToAllForms(persons);  
       assignBonusForm.setVisible(false);
       
        //start date of each person on list
       
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        assinBonusBtn = new javax.swing.JButton();
        createPaymentBtn = new javax.swing.JButton();
        runReportBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        personalDetailBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Best IT Payroll");

        assinBonusBtn.setBackground(new java.awt.Color(153, 255, 153));
        assinBonusBtn.setForeground(new java.awt.Color(51, 51, 255));
        assinBonusBtn.setText("Assign Bonus");
        assinBonusBtn.setToolTipText("");
        assinBonusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assinBonusBtnActionPerformed(evt);
            }
        });

        createPaymentBtn.setBackground(new java.awt.Color(153, 255, 153));
        createPaymentBtn.setForeground(new java.awt.Color(51, 51, 255));
        createPaymentBtn.setText("Create Payments");
        createPaymentBtn.setToolTipText("");
        createPaymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPaymentBtnActionPerformed(evt);
            }
        });

        runReportBtn.setBackground(new java.awt.Color(153, 255, 153));
        runReportBtn.setForeground(new java.awt.Color(51, 51, 255));
        runReportBtn.setText("Run Reports");
        runReportBtn.setToolTipText("");
        runReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runReportBtnActionPerformed(evt);
            }
        });

        closeBtn.setBackground(new java.awt.Color(153, 255, 153));
        closeBtn.setForeground(new java.awt.Color(51, 51, 255));
        closeBtn.setText("Close");
        closeBtn.setToolTipText("");
        closeBtn.setBorderPainted(false);
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        personalDetailBtn.setBackground(new java.awt.Color(153, 255, 153));
        personalDetailBtn.setForeground(new java.awt.Color(51, 51, 255));
        personalDetailBtn.setText("Personal Details and Contractor Data Entry");
        personalDetailBtn.setToolTipText("");
        personalDetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalDetailBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel1))
                            .addComponent(createPaymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(assinBonusBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(runReportBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(personalDetailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(385, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(assinBonusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(personalDetailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createPaymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(runReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void assinBonusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assinBonusBtnActionPerformed

        
        assignBonusForm.setBounds(0, 0, 700, 700);
        assignBonusForm.setVisible(true);
        Launcher.mainForm.setVisible(false);
       
        

    }//GEN-LAST:event_assinBonusBtnActionPerformed

    private void createPaymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPaymentBtnActionPerformed

        addPaymentForm.setBounds(0, 0, 700, 700);
        addPaymentForm.setVisible(true);
        Launcher.mainForm.setVisible(false);
    }//GEN-LAST:event_createPaymentBtnActionPerformed

    private void runReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runReportBtnActionPerformed

        payrollReportsForm.setBounds(0, 0, 700, 700);
        payrollReportsForm.setVisible(true);
        Launcher.mainForm.setVisible(false);
    }//GEN-LAST:event_runReportBtnActionPerformed

    private void personalDetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalDetailBtnActionPerformed
       

       personalInformationForm.setBounds(0, 0, 1000, 1000);
       personalInformationForm.setVisible(true);
       Launcher.mainForm.setVisible(false);
       
    }//GEN-LAST:event_personalDetailBtnActionPerformed

    public void setPersonsToAllForms(ArrayList<Person> persons)
    {
        assignBonusForm.setPersons(persons);
        addPaymentForm.setPersons(persons);
        personalInformationForm.setPersons(persons);
        payrollReportsForm.setPersons(persons);
        
    }
    
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        final ArrayList<Person> persons = new ArrayList<>();
        
    try
    {
        String strPayDate= "01/10/2020 4:5 PM, PDT";   
        Date payDate = new Date();
        
        DateFormat formate  = new SimpleDateFormat("dd/mm/yyyy");
        payDate = formate.parse(strPayDate);
        }    
     catch (ParseException pe)
        {
              System.out.println(pe);

        }
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
        
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assinBonusBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton createPaymentBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton personalDetailBtn;
    private javax.swing.JButton runReportBtn;
    // End of variables declaration//GEN-END:variables


    /**
     * @return the payrollReportItems
     */
    public ArrayList<PayrollReportItem> getPayrollReportItems() {
        return payrollReportItems;
    }

    /**
     * @param payrollReportItems the payrollReportItems to set
     */
    public void setPayrollReportItems(ArrayList<PayrollReportItem> payrollReportItems) {
        this.payrollReportItems = payrollReportItems;
    }

    /**
     * @return the MonthlyPayDate
     */
    public Date getMonthlyPayDate() {
        return MonthlyPayDate;
    }

    /**
     * @param MonthlyPayDate the MonthlyPayDate to set
     */
    public void setMonthlyPayDate(Date MonthlyPayDate) {
        this.MonthlyPayDate = MonthlyPayDate;
    }

    /**
     * @return the FortnightlyPayDate
     */
    public Date getFortnightlyPayDate() {
        return FortnightlyPayDate;
    }

    /**
     * @param FortnightlyPayDate the FortnightlyPayDate to set
     */
    public void setFortnightlyPayDate(Date FortnightlyPayDate) {
        this.FortnightlyPayDate = FortnightlyPayDate;
    }
}
