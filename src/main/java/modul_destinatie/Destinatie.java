/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_destinatie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Calendar;
import modul_inreg_colet.Pachet;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modul_inreg_colet.Persoana;
import modul_inreg_colet.Stare;

/**
 *
 * @author alinb
 */
public class Destinatie {
    long zileTrecute;
    boolean ridicat;
    boolean contactDest;
    boolean contactExp;
    Pachet pachet= new Pachet();
     PreparedStatement stmt1=null;
    
    public Destinatie(int zileTrecute,boolean ridicat, boolean contactDest,boolean contactExp)
    {
        this.zileTrecute=zileTrecute;
        this.ridicat=ridicat;
        this.contactDest=contactDest;
        this.contactExp=contactExp;
        
    }
    public Destinatie(){
            
    }
    
    
    public long pornireTimer(Pachet pachet)
    {   
        Date lul=pachet.getData();
        Date azi= Calendar.getInstance().getTime();
        long a = azi.getTime();
        long b= lul.getTime();
        zileTrecute=TimeUnit.MILLISECONDS.toDays((a-b));
        return zileTrecute;
    }
  
    public void retur(Pachet pachet,Persoana dest, Persoana exp)
    {
        
    try{ String url = "jdbc:mysql://localhost:3306/registration_details";
	Statement sql;
       Statement sql1;
      Statement sql2;
	ResultSet rs;
       ResultSet rs1;
       ResultSet rs2;
	Connection conn = DriverManager.getConnection(url, "root", "anglia");
	sql = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        sql1 = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
       sql2= (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	rs = sql.executeQuery("select * from packages");
        rs1 = sql1.executeQuery("select * from dest_person");
        rs2 = sql2.executeQuery("select * from exp_person");
        rs.next();
        rs1.next();
        rs2.next();
     //   String nume= new String();
        
        boolean found = false;
        boolean found1 = false;
       boolean found2 = false;
		do {
			if (pachet.getDestinatar().equals(rs.getString("nume_dest"))) {
                       

                             do{
                                    if(rs.getString("nume_dest").equals(rs1.getString("nume")))
                                    {
                                          
           
            
                                    rs1.updateString("nume", exp.getNume());
                                    rs1.updateString("adresa", exp.getAdresa());
                                    rs1.updateString("oras", exp.getOras());
                                    rs1.updateString("telefon", exp.getTelefon());
                                    rs1.updateString("mail", exp.getMail());
                                    rs1.updateRow();
                                        
                                        found1=true;
                                    }
                                    else
                                    {
                                        rs1.next();
                                    }
                                }while(!found1);
                                
                                do{
                                    if(rs.getString("nume_exp").equals(rs2.getString("nume")))
                                    {
                                       
            
                                    rs2.updateString("nume", dest.getNume());
                                    rs2.updateString("adresa", dest.getAdresa());
                                    rs2.updateString("oras", dest.getOras());
                                    rs2.updateString("telefon", dest.getTelefon());
                                    rs2.updateString("mail", dest.getMail());
                                    rs2.updateRow();
                                         
                                        found2=true;
                                    }
                                    else
                                    {
                                        rs2.next();
                                    }
                                    
                                    
                                }while(!found2);
                                 rs.updateString("stare", "in tranzit retur");
                                 Float pr;
                                 pr=pachet.getPret()+12;
                                 rs.updateFloat("pret", pr);
                                 rs.updateString("nume_dest", pachet.getExpeditor());
                                  rs.updateString("nume_exp", pachet.getDestinatar());
                                  rs.updateRow();
                                
				found = true;
			} else
                            rs.next();
                    } while (!found);
        
     }
     catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
       
        
    }}
    
 


