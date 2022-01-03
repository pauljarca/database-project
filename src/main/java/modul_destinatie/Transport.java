/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_destinatie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modul_inreg_colet.Pachet;
import modul_inreg_colet.Stare;

import modul_destinatie.sediu;
/**
 *
 * @author alinb
 */
public class Transport {
   
    public void updateLocatie(Pachet pachet)
   {
        try{String url = "jdbc:mysql://localhost:3306/registration_details";
	Statement sql;
	ResultSet rs;
	Connection con1 = DriverManager.getConnection(url, "root", "anglia");
	sql = (Statement) con1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	rs = sql.executeQuery("select * from packages");
        rs.next();
    
        boolean found=false;
        do {
			if (pachet.getDestinatar().equals(rs.getString("nume_dest"))) {
                            
				rs.updateString("locatie_curenta",pachet.getLocatieCurenta());
                                rs.updateRow();
				found = true;
			} else
                            rs.next();
                    } while (!found);}catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        //drop down menu si selecteaza starea;
        //drop down menu si selecteaza starea;
        
        //drop down menu si selecteaza starea;
        
      
      //drop down menu si selecteaza starea;
      
    }
    
    public void updateStare(Pachet pachet)
    {
        try{String url = "jdbc:mysql://localhost:3306/registration_details";
	Statement sql;
	ResultSet rs;
	Connection con1 = DriverManager.getConnection(url, "root", "anglia");
	sql = (Statement) con1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	rs = sql.executeQuery("select * from packages");
        rs.next();
    
        boolean found=false;
        do {
			if (pachet.getDestinatar().equals(rs.getString("nume_dest"))) {
                            
				rs.updateString("stare",pachet.getStare());
                                if(pachet.getStare().equals("in asteptare"))
                                { Date date=Calendar.getInstance().getTime();
                                    Format dateFormat = new SimpleDateFormat("dd-MM-yy");
                                    String strDate= dateFormat.format(date);
                                    pachet.setData(strDate);
                                    rs.updateString("data_destinatie",strDate);
                                    
                                }
                                rs.updateRow();
				found = true;
			} else
                            rs.next();
                    } while (!found);}
         catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(sediu.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      //drop down menu si selecteaza starea;
      
    }

    

    
    
}
