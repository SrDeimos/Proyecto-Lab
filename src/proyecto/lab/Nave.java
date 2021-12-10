package proyecto.lab;

public class Nave {

    Asiento asientoClaseEje[];
    Asiento asientoClaseEco[];
    Pasajero pasajero;

    public Nave() {
        asientoClaseEco = new Asiento[0];
        asientoClaseEco = new Asiento[1];
        asientoClaseEco = new Asiento[2];
        asientoClaseEco = new Asiento[3];
        asientoClaseEco = new Asiento[4];
        asientoClaseEco = new Asiento[5];
        asientoClaseEco = new Asiento[6];
        asientoClaseEco = new Asiento[7];
        asientoClaseEco = new Asiento[8];
        asientoClaseEco = new Asiento[9];
        asientoClaseEco = new Asiento[10];
        asientoClaseEco = new Asiento[11];
        asientoClaseEco = new Asiento[12];
        asientoClaseEco = new Asiento[13];
        asientoClaseEco = new Asiento[14];
        asientoClaseEco = new Asiento[15];
        asientoClaseEco = new Asiento[16];
        asientoClaseEco = new Asiento[17];
        asientoClaseEco = new Asiento[18];
        asientoClaseEco = new Asiento[19];
        asientoClaseEco = new Asiento[20];
        asientoClaseEco = new Asiento[21];
        asientoClaseEco = new Asiento[22];
        asientoClaseEco = new Asiento[23];
        asientoClaseEje = new Asiento[0];
        asientoClaseEje = new Asiento[1];
        asientoClaseEje = new Asiento[2];
        asientoClaseEje = new Asiento[3];
        asientoClaseEje = new Asiento[4];
        pasajero = null;
    }
    public boolean obtenerEstadoAsientosClaseEjecutiva(){
        
    }
    public boolean obtenerEstadoAsientosClaseEconomica(){
        
    }
    public int obtenerAsientoClaseEjecutivaDesocupado(char ubicacionAsiento){
        return ubicacionAsiento;
    }
    public int obtenerAsientoClaseEconomicaDesocupado(char ubicacionAsiento){
        return ubicacionAsiento;
    }
    public Pasajero ObtenerPasajeroClaseEjecutiva (String nombrePasajero){
        return nombrePasajero;
    }
    public Pasajero obtenerPasajeroClaseEconomica (String nombrePasajero){
        return nombrePasajero;
    }
    public Pasajero obtenerPasajeroClaseEjecutiva(int numeroAsiento){
        return numeroAsiento;
    }
    public Pasajero obtenerPasajeroClaseEconomica(int numeroAsiento){
        
    }
    public void asignarPasajeroClaseEjecutiva(int numeroAsiento, Pasajero){
        
    }
    public void asignarPasajeroClaseEconomica(int numeroAsiento, Pasajero){
        
    }
    public void eliminarPasajeroClaseEjecutiva(int numeroAsiento){
        
    }
    public void eliminarPasajeroClaseEconomica(int numeroAsiento){
        
    }

}
