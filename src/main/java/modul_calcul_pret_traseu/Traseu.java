package modul_calcul_pret_traseu;

import java.util.Vector;

public class Traseu {
    String orasStart;
    String orasFinish;
    float Kilometrii;
    Vector<String> traseu;

    public Traseu(String orasStart, String orasFinish, float Kilometrii, Vector<String> traseu) {
        this.orasStart = orasStart;
        this.orasFinish = orasFinish;
        this.Kilometrii = Kilometrii;
        this.traseu = traseu;
    }
    
    public float calculRutaOptima(String Categorie){
        switch (Categorie) {
            case "FRAGIL":
                
                break;
            case "PRETIOS":
                
                break;
            case "PERICULOS":
                
                break;
            default:
                break;
        }
        return 0;
    }
            
}
