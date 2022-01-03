package modul_inreg_colet;

public enum Stare{
DIRECT{
    public String toString(){
    return "in tranzit direct";
    }
},
ASTEPTARE{
    public String toString(){
    return "in asteptare destinatar";
    }
},

RETUR{
    public String toString(){
    return "in tranzit retur";
    }
}
}
