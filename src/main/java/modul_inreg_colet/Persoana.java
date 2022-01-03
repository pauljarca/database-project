package modul_inreg_colet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Persoana {
    String Nume;
    String Adresa;
    String numarTelefon;
    String Mail;
    String Oras;
    public Persoana(String Nume, String Adresa, String Oras, String numarTelefon, String Mail){
        this.Nume=Nume;
        this.Adresa=Adresa;
        this.numarTelefon=numarTelefon;
        this.Mail=Mail;
        this.Oras=Oras;
    }
    
    public Persoana(){
    
    }
    
    public String getNume(){ return Nume; }
    public String getAdresa() { return Adresa; }
    public String getTelefon() { return numarTelefon; }
    public String getMail() { return Mail; }
    public String getOras() { return Oras; }
    
    
    public void setNume(String n){ this.Nume=n; }
    public void setAdresa(String a) { this.Adresa=a; }
    public void setTelefon(String t) { this.numarTelefon=t; }
    public void setMail(String m) { this.Mail=m; }
    public void setOras(String o) { this.Oras=o; }
    
    public void addToDestDB(Persoana p) throws SQLException{
        Connection conn=null;
        PreparedStatement stmt1=null;
        String url="jdbc:mysql://localhost:3306/registration_details";
        String uname="root";
        String pass="anglia";
            
            String query1="INSERT into dest_person values(?, ?, ?, ?, ?)";
            conn=DriverManager.getConnection(url,uname,pass);
            stmt1=conn.prepareStatement(query1);
            stmt1.setString(1, p.getNume());
            stmt1.setString(2, p.getAdresa());
            stmt1.setString(3, p.getOras());
            stmt1.setString(4, p.getTelefon());
            stmt1.setString(5, p.getMail());
            stmt1.executeUpdate();
    }
    
    public void addToExpDB(Persoana p) throws SQLException{
        Connection conn=null;
        PreparedStatement stmt=null;
        String url="jdbc:mysql://localhost:3306/registration_details";
        String uname="root";
        String pass="anglia";
            
            String query1="INSERT into exp_person values(?, ?, ?, ?, ?)";
            conn=DriverManager.getConnection(url,uname,pass);
            stmt=conn.prepareStatement(query1);
            stmt.setString(1, p.getNume());
            stmt.setString(2, p.getAdresa());
            stmt.setString(3, p.getOras());
            stmt.setString(4, p.getTelefon());
            stmt.setString(5, p.getMail());
            stmt.executeUpdate();
    }
    
}

