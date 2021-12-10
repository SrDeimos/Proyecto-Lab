package proyecto.lab;

public class Nave {

    private Asiento aEconomico[];
    private Asiento aEjecutivo[];
    Pasajero pasajero;

    public Nave() {
        aEconomico = new Asiento[24];
        aEjecutivo = new Asiento[4];
        
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
