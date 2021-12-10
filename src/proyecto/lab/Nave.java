package proyecto.lab;

public class Nave {

    private Asiento aEconomico[];
    private Asiento aEjecutivo[];
    Pasajero pasajero;

    public Nave() {
        aEconomico = new Asiento[24];
        aEjecutivo = new Asiento[4];
        
        aEjecutivo[0] = new Asiento(1,'1','1');
        aEjecutivo[1] = new Asiento(2,'1','3');
        aEjecutivo[2] = new Asiento(3,'1','3');
        aEjecutivo[3] = new Asiento(4,'1','1');
        aEconomico[0] = new Asiento(5,'2','1');
        aEconomico[1] = new Asiento(6,'2','2');
        
        
        pasajero = null;
    }
    public boolean obtenerEstadoAsientosClaseEjecutiva(){
        return false;
        
    }
    public boolean obtenerEstadoAsientosClaseEconomica(){
        return false;
        
    }
    public int obtenerAsientoClaseEjecutivaDesocupado(char ubicacionAsiento){
        return ubicacionAsiento;
    }
    public int obtenerAsientoClaseEconomicaDesocupado(char ubicacionAsiento){
        return ubicacionAsiento;
    }
    public Pasajero ObtenerPasajeroClaseEjecutiva (String nombrePasajero){
        return null;

    }
    public Pasajero obtenerPasajeroClaseEconomica (String nombrePasajero){
        return null;

    }
    public Pasajero obtenerPasajeroClaseEjecutiva(int numeroAsiento){
        return null;

    }
    public Pasajero obtenerPasajeroClaseEconomica(int numeroAsiento){
        return null;
        
    }
    public void asignarPasajeroClaseEjecutiva(int numeroAsiento, Pasajero pasajero){
        
    }
    public void asignarPasajeroClaseEconomica(int numeroAsiento, Pasajero pasajero){
        
    }
    public void eliminarPasajeroClaseEjecutiva(int numeroAsiento){
        
    }
    public void eliminarPasajeroClaseEconomica(int numeroAsiento){
        
    }

}
