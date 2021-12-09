package proyecto.lab;

public class Asiento {
    
int numeroAsiento;
    char claseAsiento, ubicacionAsiento;
    Pasajero pasajero = new Pasajero();
    public Asiento(){
        
    }
    public Asiento(int numeroAsiento, char claseAsiento, char ubicacionAsiento){
        
    }
    public void asignarNumeroAsiento (int numeroAsiento){
        this.numeroAsiento = numeroAsiento;
    }
    public int obtenerNumeroAsiento (){
        return numeroAsiento;
    }
    public void asignarClaseAsiento(char claseAsiento){
        this.claseAsiento = claseAsiento;
    }
    public char obtenerClaseAsiento(char claseAsiento){
        return claseAsiento;
    }
    public void asignarUbicacionAsiento(char ubicacionAsiento){
        this.ubicacionAsiento = ubicacionAsiento;
    }
    public char obtenerUbicacionAsiento(){
        return ubicacionAsiento;
    }
    public void asignarPasajero(Pasajero pasajero){
        this.pasajero = pasajero;
    }
    public Pasajero obtenerPasajero(){
        return pasajero;
    }
    public void desocuparAsiento(){
        pasajero = null;
    }
    public boolean obtenerEstadoAsiento(){
        
    }
}
