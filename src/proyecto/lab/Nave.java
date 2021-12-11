package proyecto.lab;

public class Nave {

    private Asiento aEconomico[];
    private Asiento aEjecutivo[];
    Pasajero pasajero = null;

    public Nave() {
        aEconomico = new Asiento[24];
        aEjecutivo = new Asiento[4];

        aEjecutivo[0] = new Asiento(1, '1', '1');
        aEjecutivo[1] = new Asiento(2, '1', '3');
        aEjecutivo[2] = new Asiento(3, '1', '3');
        aEjecutivo[3] = new Asiento(4, '1', '1');
        aEconomico[0] = new Asiento(5, '2', '1');
        aEconomico[1] = new Asiento(6, '2', '2');
        aEconomico[2] = new Asiento(7, '2', '3');
        aEconomico[3] = new Asiento(8, '2', '3');
        aEconomico[4] = new Asiento(9, '2', '2');
        aEconomico[5] = new Asiento(10, '2', '1');
        aEconomico[6] = new Asiento(11, '2', '1');
        aEconomico[7] = new Asiento(12, '2', '2');
        aEconomico[8] = new Asiento(13, '2', '3');
        aEconomico[9] = new Asiento(14, '2', '3');
        aEconomico[10] = new Asiento(15, '2', '2');
        aEconomico[11] = new Asiento(16, '2', '1');
        aEconomico[12] = new Asiento(17, '2', '1');
        aEconomico[13] = new Asiento(18, '2', '2');
        aEconomico[14] = new Asiento(19, '2', '3');
        aEconomico[15] = new Asiento(20, '2', '3');
        aEconomico[16] = new Asiento(21, '2', '2');
        aEconomico[17] = new Asiento(22, '2', '1');
        aEconomico[18] = new Asiento(23, '2', '1');
        aEconomico[19] = new Asiento(24, '2', '2');
        aEconomico[20] = new Asiento(25, '2', '3');
        aEconomico[21] = new Asiento(26, '2', '3');
        aEconomico[22] = new Asiento(27, '2', '2');
        aEconomico[23] = new Asiento(28, '2', '1');

        pasajero = null;
    }

    public boolean obtenerEstadoAsientosClaseEjecutiva() {

        for (int i = 0; i < 27; i++) {
                    

        }
        
        
        
        return false;

    }

    public boolean obtenerEstadoAsientosClaseEconomica() {
        return false;

    }

    public int obtenerAsientoClaseEjecutivaDesocupado(char ubicacionAsiento) {
        return ubicacionAsiento;
    }

    public int obtenerAsientoClaseEconomicaDesocupado(char ubicacionAsiento) {
        return ubicacionAsiento;
    }

    public Pasajero ObtenerPasajeroClaseEjecutiva(String nombrePasajero) {
        return null;

    }

    public Pasajero obtenerPasajeroClaseEconomica(String nombrePasajero) {
        return null;

    }

    public Pasajero obtenerPasajeroClaseEjecutiva(int numeroAsiento) {
        return null;

    }

    public Pasajero obtenerPasajeroClaseEconomica(int numeroAsiento) {
        return null;

    }

    public void asignarPasajeroClaseEjecutiva(int numeroAsiento, Pasajero pasajero) {

    }

    public void asignarPasajeroClaseEconomica(int numeroAsiento, Pasajero pasajero) {

    }

    public void eliminarPasajeroClaseEjecutiva(int numeroAsiento) {

    }

    public void eliminarPasajeroClaseEconomica(int numeroAsiento) {

    }
}
