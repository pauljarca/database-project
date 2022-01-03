/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_inreg_colet;

import java.util.regex.Pattern;

/**
 *
 * @author paulv
 */
public class Verify {
    public static boolean verifyNume(String n){
       return !n.matches(".*\\d.*");
    }
    
    public static boolean verifyMail(String m){
        String emailRagex="^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRagex);
        if(m==null)
            return false;
        return pat.matcher(m).matches();
    }
    
    public static boolean verifyCod(String cod){
        if(cod.length()!=12)
            return false;
        return true;
    }
    
    public static boolean verifyTelefon(String tlf)
    {   
        if(tlf==null)
            return false;
        return true;
    }
    
    public static boolean verifyNrNegativ(float pret)
    {
        if(pret<0)
            return false;
        return true;
    }
}
