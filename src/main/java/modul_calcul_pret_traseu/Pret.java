package modul_calcul_pret_traseu;


public class Pret {
    double Pret;

    public Pret(double Pret) {
    this.Pret=Pret;
    }
    public static double calculPret(double Kilometrii, String Categorie, float Greutate){
        double pret;
        pret=Kilometrii*(double)0.1;
        switch (Categorie) {
            case "FRAGIL":
                pret+=0.05*pret;
                break;
            case "PRETIOS":
                pret+=0.06*pret;
                break;
            case "PERICULOS":
                pret+=0.07*pret;
                break;
            default:
                break;
        }
        if(Greutate>1)
            pret+=2*(Greutate-1);
        return pret;
    }
}
