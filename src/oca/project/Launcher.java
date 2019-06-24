/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

import Interfaces.IManager;
import Interfaces.ISubordinate;
import java.util.ArrayList;
import java.util.Date;
import jobs.*;
import Forms.MainForm;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
/**
 *
 * @author 91030283
 */
public class Launcher {

    /**
     * @param args the command line arguments
     */
    
   
    
    public static MainForm mainForm;
    
    public static void main(String[] args) throws ParseException {
        
         ArrayList<Person> persons = new ArrayList<>();
        
//        IManager JamesMint = new IManager() {
//
//            @Override
//            public ArrayList<ISubordinate> getSubordinateList() {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public double CalculatePay(Date startDateOfPayPeriod, double numberOfHours) throws Exception {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        };
        
        CEO JamesMint =new CEO();
        JamesMint.firstName="James";
        JamesMint.lastName ="Mint";
        JamesMint.position="CEO";
        JamesMint.strDateOfBirth="28/12/1977";
        JamesMint.strStartDate = "10/01/2010";
        JamesMint.setTimePeriod(TimePeriods.MONTHLY);
        
        AdministrationManager BillJohns =new AdministrationManager(JamesMint);
        BillJohns.firstName="Bill";
        BillJohns.lastName ="Johns";
        BillJohns.position="Administration Manager";
        BillJohns.strDateOfBirth="13/04/1981";
        BillJohns.strStartDate = "10/05/2012";
        BillJohns.setTimePeriod(TimePeriods.MONTHLY);
        
        
        BranchManager KateHudson =new BranchManager(BillJohns);
        KateHudson.firstName="Kate";
        KateHudson.lastName ="Hudson";
        KateHudson.position="Branch Manager";
        KateHudson.strDateOfBirth="13/07/1981";
        KateHudson.strStartDate = "11/03/2013";
        KateHudson.setTimePeriod(TimePeriods.MONTHLY);
        
        BranchManager ScarletGreen =new BranchManager(BillJohns);
        ScarletGreen.firstName="Scarlet";
        ScarletGreen.lastName ="Green";
        ScarletGreen.position="Branch Manager";
        ScarletGreen.strDateOfBirth="20/03/1980";
        ScarletGreen.strStartDate = "10/05/2013";
        ScarletGreen.setTimePeriod(TimePeriods.MONTHLY);
        
        
        BranchManager AmandaGreen =new BranchManager(BillJohns);
        AmandaGreen.firstName="Amanda";
        AmandaGreen.lastName ="Green";
        AmandaGreen.position="Branch Manager";
        AmandaGreen.strDateOfBirth="05/04/1979";
        AmandaGreen.strStartDate = "14/10/2014";
        AmandaGreen.setTimePeriod(TimePeriods.MONTHLY);
        
        FinancialAdministrator EricWhite =new FinancialAdministrator(BillJohns);
        EricWhite.firstName="Eric";
        EricWhite.lastName ="White";
        EricWhite.position="Financial Administrator";
        EricWhite.strDateOfBirth="21/05/1984";
        EricWhite.strStartDate = "10/04/2011";
        EricWhite.setTimePeriod(TimePeriods.FORTNIGHTLY);
        
        
        HROfficer JuliaSmith =new HROfficer(JamesMint);
        JuliaSmith.firstName="Julia";
        JuliaSmith.lastName ="Smith";
        JuliaSmith.position="HR Officer";
        JuliaSmith.strDateOfBirth="17/02/1973";
        JuliaSmith.strStartDate = "13/06/2010";
        JuliaSmith.setTimePeriod(TimePeriods.MONTHLY);
        
             
        
        ProjectManager VictoriaBell =new ProjectManager(AmandaGreen);
        VictoriaBell.firstName="Victoria";
        VictoriaBell.lastName ="Bell";
        VictoriaBell.position="Project Manager";
        VictoriaBell.strDateOfBirth="11/01/19781";
        VictoriaBell.strStartDate = "30/04/2013";
        VictoriaBell.setTimePeriod(TimePeriods.FORTNIGHTLY);
        
        
        ProjectManager CharlotteHond =new ProjectManager(KateHudson);
        CharlotteHond.firstName="Charlotte";
        CharlotteHond.lastName ="Hond";
        CharlotteHond.position="Project Manager";
        CharlotteHond.strDateOfBirth="1/07/1988";
        CharlotteHond.strStartDate = "28/02/2012";
        CharlotteHond.setTimePeriod(TimePeriods.FORTNIGHTLY);
        
        ProjectManager ChristineBennet =new ProjectManager(ScarletGreen);
        ChristineBennet.firstName="Christine";
        ChristineBennet.lastName ="Bennet";
        ChristineBennet.position="Project Manager";
        ChristineBennet.strDateOfBirth="16/06/1982";
        ChristineBennet.strStartDate = "11/06/2011";
        ChristineBennet.setTimePeriod(TimePeriods.FORTNIGHTLY);
        
        Receptionist PeterGordon =new Receptionist(JuliaSmith);
        PeterGordon.firstName="Christine";
        PeterGordon.lastName ="Bennet";
        PeterGordon.position="Receptionist";
        PeterGordon.strDateOfBirth="30/09/1983";
        PeterGordon.strStartDate = "10/05/2010";     
        PeterGordon.setTimePeriod(TimePeriods.FORTNIGHTLY);
         
        SalesManager MichaelBrown =new SalesManager(JamesMint);
        MichaelBrown.firstName="Michael";
        MichaelBrown.lastName ="Brown";
        MichaelBrown.position="Sales Manager";
        MichaelBrown.strDateOfBirth="25/12/1985";
        MichaelBrown.strStartDate = "21/07/2012";
        MichaelBrown.setTimePeriod(TimePeriods.FORTNIGHTLY);
        
        SalesConsultant HelenChan =new SalesConsultant(MichaelBrown);
        HelenChan.firstName="Helen";
        HelenChan.lastName ="Chan";
        HelenChan.position="Sales Consultant";
        HelenChan.strDateOfBirth="11/01/1991";
      
                
       
        SeniorProgramDeveloper JohnNorton =new SeniorProgramDeveloper(VictoriaBell);
        JohnNorton.firstName="John";
        JohnNorton.lastName ="Norton";
        JohnNorton.position="Senior Program Developer";
        JohnNorton.strDateOfBirth="17/07/1980";
        JohnNorton.strStartDate = "10/09/2010";
        JohnNorton.setTimePeriod(TimePeriods.MONTHLY);
        
        ProgramDeveloper AlexDillon =new ProgramDeveloper(JohnNorton);
        AlexDillon.firstName="Alex";
        AlexDillon.lastName ="Dillon";
        AlexDillon.position="Program Developer";
        AlexDillon.strDateOfBirth="10/03/1989";
        AlexDillon.strStartDate = "14/09/2014";
        AlexDillon.setTimePeriod(TimePeriods.FORTNIGHTLY);
        
        SeniorProgramDeveloper AshleySimpson =new SeniorProgramDeveloper(CharlotteHond);
        AshleySimpson.firstName="Ashley";
        AshleySimpson.lastName ="Simpson";
        AshleySimpson.position="Senior Program Developer";
        AshleySimpson.strDateOfBirth="12/05/1984";
        AshleySimpson.strStartDate = "15/06/2010";
        AshleySimpson.setTimePeriod(TimePeriods.MONTHLY);
        
        ProgramDeveloper AndrewSampson =new ProgramDeveloper(AshleySimpson);
        AndrewSampson.firstName="Andrew";
        AndrewSampson.lastName ="Sampson";
        AndrewSampson.position="Program Developer";
        AndrewSampson.strDateOfBirth="09/04/1984";
        AndrewSampson.strStartDate = "04/07/2010";
        AndrewSampson.setTimePeriod(TimePeriods.FORTNIGHTLY);
        
        ProgramDeveloper DavidGalloway =new ProgramDeveloper(ChristineBennet);
        DavidGalloway.firstName="David";
        DavidGalloway.lastName ="Galloway";
        DavidGalloway.position="Program Developer";
        DavidGalloway.strDateOfBirth="06/12/1981";
        DavidGalloway.strStartDate = "05/11/2013";
        DavidGalloway.setTimePeriod(TimePeriods.MONTHLY);
        
        SystemAdministrator AndrewBlack =new SystemAdministrator(AmandaGreen);
        AndrewBlack.firstName="Andrew";
        AndrewBlack.lastName ="Black";
        AndrewBlack.position="System Administrator";
        AndrewBlack.strDateOfBirth="15/04/1976";
        AndrewBlack.strStartDate = "04/05/2012";
        AndrewBlack.setTimePeriod(TimePeriods.MONTHLY);
        
        SystemAdministrator JoanneDowman =new SystemAdministrator(KateHudson);
        JoanneDowman.firstName="Joanne";
        JoanneDowman.lastName ="Dowman";
        JoanneDowman.position="System Administrator";
        JoanneDowman.strDateOfBirth="13/12/1980";
        JoanneDowman.strStartDate = "07/07/2014";
        JoanneDowman.setTimePeriod(TimePeriods.FORTNIGHTLY);
            
        SystemAdministrator MichaelPerry =new SystemAdministrator(ScarletGreen);
        MichaelPerry.firstName="Michael";
        MichaelPerry.lastName ="Perry";
        MichaelPerry.position="System Administrator";
        MichaelPerry.strDateOfBirth="12/11/1977";
        MichaelPerry.strStartDate = "01/03/2014";
        MichaelPerry.setTimePeriod(TimePeriods.FORTNIGHTLY);
        
        SystemAnalyst AndrewBlank =new SystemAnalyst(VictoriaBell);
        AndrewBlank.firstName="Andrew";
        AndrewBlank.lastName ="Blank";
        AndrewBlank.position="System Analyst";
        AndrewBlank.strDateOfBirth="15/09/1981";
        AndrewBlank.strStartDate = "19/08/2014";
        AndrewBlank.setTimePeriod(TimePeriods.MONTHLY);
        
        SystemAnalyst CarolWhite =new SystemAnalyst(CharlotteHond);
        CarolWhite.firstName="Carol";
        CarolWhite.lastName ="White";
        CarolWhite.position="System Analyst";
        CarolWhite.strDateOfBirth="20/10/1975";
        CarolWhite.strStartDate = "10/01/2014";
        CarolWhite.setTimePeriod(TimePeriods.MONTHLY);
        
        SystemAnalyst BradTurner =new SystemAnalyst(ChristineBennet);
        BradTurner.firstName="Brad";
        BradTurner.lastName ="Turner";
        BradTurner.position="System Analyst";
        BradTurner.strDateOfBirth="22/11/1988";
        BradTurner.strStartDate = "26/05/2014";
        BradTurner.setTimePeriod(TimePeriods.MONTHLY);
        
        Tester JamesCarol =new Tester(VictoriaBell);
        JamesCarol.firstName="James";
        JamesCarol.lastName ="Carol";
        JamesCarol.position="Tester";
        JamesCarol.strDateOfBirth="22/11/1988";
       // JamesCarol.strStartDate = "26/05/2014";  //contractor
        
        Tester ElenaTang =new Tester(CharlotteHond);
        ElenaTang.firstName="Elena";
        ElenaTang.lastName ="Tang";
        ElenaTang.position="Tester";
        ElenaTang.strDateOfBirth="11/02/1969";
        //ElenaTang.strStartDate = "7/08/2013";  //contractor
        
        
        
        Tester TessaGreen =new Tester(CharlotteHond);
        TessaGreen.firstName="Tessa";
        TessaGreen.lastName ="Green";
        TessaGreen.position="Tester";
        TessaGreen.strDateOfBirth="31/10/1985";
        //TessaGreen.strStartDate = "8/07/2013";  //contractor
        
        Tester DavidChand =new Tester(ChristineBennet);
        DavidChand.firstName="David";
        DavidChand.lastName ="Chand";
        DavidChand.position="Tester";
        DavidChand.strDateOfBirth="11/04/1973";
        //DavidChand.strStartDate = "9/06/2014";  //contractor
        
        
        
        
        //craeting Array lists and adding subordinate lists to managers
        ArrayList BillJohnsSubList =new ArrayList<>();
        BillJohnsSubList.add(KateHudson);
        BillJohnsSubList.add(ScarletGreen);
        BillJohnsSubList.add(AmandaGreen);
        BillJohns.setSubordinateList(BillJohnsSubList);
        
        ArrayList JamesMintSubList =new ArrayList<>();
        JamesMintSubList.add(EricWhite);
        JamesMintSubList.add(JuliaSmith);
        JamesMintSubList.add(BillJohns);
        JamesMintSubList.add(MichaelBrown);
        JamesMint.setSubordinate(JamesMintSubList);
        
        ArrayList JohnNortonSubList =new ArrayList<>();
        JohnNortonSubList.add(AlexDillon);
        JohnNorton.setSubordinateList(JohnNortonSubList);
        
        ArrayList AshleySimpsonSubList =new ArrayList<>();
        AshleySimpsonSubList.add(AndrewSampson);
        AshleySimpson.setSubordinateList(AshleySimpsonSubList);
        
        
        ArrayList ChristineBennetSubList =new ArrayList<>();
        ChristineBennetSubList.add(DavidChand);
        ChristineBennetSubList.add(DavidGalloway);
        ChristineBennetSubList.add(BradTurner);
        ChristineBennet.setSubordinateList(ChristineBennetSubList);
        
       
        ArrayList AmandaGreenSubList =new ArrayList<>();
        AmandaGreenSubList.add(VictoriaBell);
        AmandaGreenSubList.add(AndrewBlack);
        AmandaGreen.setSubordinateList(AmandaGreenSubList);
        
        
        ArrayList KateHudsonSubList =new ArrayList<>();
        KateHudsonSubList.add(JoanneDowman);
        KateHudsonSubList.add(CharlotteHond);
        KateHudson.setSubordinateList(KateHudsonSubList);
        
        
        ArrayList ScarletGreenSubList =new ArrayList<>();
        ScarletGreenSubList.add(MichaelPerry);
        ScarletGreenSubList.add(ChristineBennet);
        ScarletGreen.setSubordinateList(ScarletGreenSubList);
        
        ArrayList JuliaSmithSubList =new ArrayList<>();
        JuliaSmithSubList.add(PeterGordon);
        JuliaSmith.setSubordinateList(JuliaSmithSubList);
        
        System.out.println("LIST: " + JuliaSmithSubList);
        System.out.println("LIST: " + JuliaSmith.getSubordinateList());
        
        ArrayList MichaelBrownSubList =new ArrayList<>();
        MichaelBrownSubList.add(HelenChan);
        MichaelBrown.setSubordinateList(MichaelBrownSubList);
        
        
        ArrayList VictoriaBellSubList =new ArrayList<>();
        VictoriaBellSubList.add(JohnNorton);
        VictoriaBellSubList.add(JamesCarol);
        VictoriaBellSubList.add(AndrewBlank);
        VictoriaBell.setSubordinateList(VictoriaBellSubList);
        
        
        
        ArrayList CharlotteHondSubList =new ArrayList<>();
        CharlotteHondSubList.add(AshleySimpson);
        CharlotteHondSubList.add(CarolWhite);
        CharlotteHondSubList.add(ElenaTang);
        CharlotteHondSubList.add(TessaGreen);
        CharlotteHond.setSubordinateList(CharlotteHondSubList);
        
           
        //adding persons created to arraylist 
        persons.add(BillJohns);
        persons.add(KateHudson);
        persons.add(ScarletGreen);
        persons.add(AmandaGreen);
        persons.add(JamesMint);
        persons.add(EricWhite);
        persons.add(JuliaSmith);
        persons.add(AlexDillon);
        persons.add(AndrewSampson);
        persons.add(DavidGalloway);
        persons.add(VictoriaBell);
        persons.add(CharlotteHond);
        persons.add(ChristineBennet);
        persons.add(PeterGordon);
        persons.add(HelenChan);
        persons.add(MichaelBrown);
        persons.add(JohnNorton);
        persons.add(AshleySimpson);
        persons.add(AndrewBlack);
        persons.add(JoanneDowman);
        persons.add(MichaelPerry);
        persons.add(AndrewBlank);
        persons.add(JamesMint);
        persons.add(CarolWhite);
        persons.add(BradTurner);
        persons.add(JamesCarol);
        persons.add(ElenaTang);
        persons.add(TessaGreen);
        persons.add(DavidChand);
        
        
        
        
        //calling mainzForm giving parameter array list of person
        mainForm = new MainForm(persons);
        
        mainForm.setVisible(true);
        
        
        
    }
    
}
