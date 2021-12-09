package proyecto.lab;

public class Pasajero {

    //Atributos
    String nPasajero, iPasajero;
    char dPasajero;
   
    //Metodos

    public Pasajero(String nombrePasajero, String identificacionPasajero, char destinoPasajero){
        nombrePasajero = nPasajero;
        identificacionPasajero = iPasajero;
        destinoPasajero = dPasajero;
        
    }

    public float oCostoBoletoPasajero(char asiento){
        
        return 0;
        
    }
    
    public String getnPasajero() {
        return nPasajero;
    }

    public void setnPasajero(String nPasajero) {
        this.nPasajero = nPasajero;
    }

    public String getiPasajero() {
        return iPasajero;
    }

    public void setiPasajero(String iPasajero) {
        this.iPasajero = iPasajero;
    }

    public char getdPasajero() {
        return dPasajero;
    }

    public void setdPasajero(char dPasajero) {
        this.dPasajero = dPasajero;
    }
    
}
