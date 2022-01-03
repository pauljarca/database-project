package modul_inreg_colet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Pachet{
    Persoana Expeditor;
    Persoana Destinatar;
    float Greutate;
    String codSpecial;
    String categorie;
    float pret;
    String locatieCurenta;
    String stare;
    Date dataDestinatie;

    public Pachet(Persoana Expeditor, Persoana Destinatar, float Greutate, String codSpecial, String categorie, float pret, String locatieCurenta, String stare, Date dataDestinatie) {
        this.Expeditor = Expeditor;
        this.Destinatar = Destinatar;
        this.Greutate = Greutate;
        this.codSpecial = codSpecial;
        this.categorie = categorie;
        this.pret = pret;
        this.locatieCurenta = locatieCurenta;
        this.stare = stare;
        this.dataDestinatie=dataDestinatie;
    }
    public Pachet(){
        
        
    }
    
    public String getExpeditor(){ return this.Expeditor.getNume(); }
    public String getDestinatar(){ return this.Destinatar.getNume(); } 
    public float getGreutate(){ return this.Greutate; }
    public String getCod(){ return this.codSpecial; }
    public String getCategorie() { return this.categorie; }
    public float getPret() { return this.pret; }
    public String getLocatieCurenta() { return this.locatieCurenta; }
    public String getStare() { return this.stare; }
    public Date getData() { return this.dataDestinatie; }
    
    public void setExpeditor(Persoana x){ this.Expeditor=x; }
    public void setDestinatar(Persoana x){ this.Destinatar=x; } 
    public void setGreutate(float x){ this.Greutate=x; }
    public void setCod(String x){ this.codSpecial=x; }
    public void setCategorie(String x) { this.categorie=x; }
    public void setPret(float x) { this.pret=x; }
    public void setLocatieCurenta(String x) { this.locatieCurenta=x; }
    public void setStare(String x) { this.stare=x; }
    public void setData(String d) throws ParseException{
     this.dataDestinatie= new SimpleDateFormat("dd-MM-yy").parse(d);
    }
    
    /*
    
    */
    
    public void addToOrderDB(Pachet p) throws SQLException
    {
        String url="jdbc:mysql://localhost:3306/registration_details";
        String uname="root";
        String pass="anglia";
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
            Date date = new Date();
        Connection conn=null;
        PreparedStatement stmt1=null;
            
            String query1="INSERT into packages values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            conn=DriverManager.getConnection(url,uname,pass);
            stmt1=conn.prepareStatement(query1);
            stmt1.setString(1, p.getCod());
            stmt1.setString(2, p.getExpeditor());
            stmt1.setString(3, p.getDestinatar());
            stmt1.setFloat(4, p.getGreutate());
            stmt1.setString(5, p.getCategorie());
            stmt1.setFloat(6, p.getPret());
            stmt1.setString(7, "in tranzit direct");
            stmt1.setString(8, formatter.format(date));
            stmt1.setString(9, p.getLocatieCurenta());
            stmt1.executeUpdate();
    }
    public static String asignCod(){
      String pattern ="yymmddHHmmss";
      //SimpleDateFormat codeFormat = new SimpleDateFormat(pattern);
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern); 
      LocalDateTime now = LocalDateTime.now();
      return dtf.format(now);
    }
    
}

