package proyecto.lab;

import java.util.Scanner;

public class Menu {

    Nave nave = new Nave();

    Pasajero pasajero;

    public Menu() {
        nave = new Nave();
    }

    int res;

    public void menuPrincipal() {

        Scanner tohru = new Scanner(System.in);
        
        boolean condicion = false;

        int count = 0;

        do {

            if (count >= 1) {
                System.out.println("  ");
                System.out.println("***Seleccion incorrecta, solamente hay selecciones del 1 al 7");
                System.out.println("Presionar <Enter> para continuar");
                tohru.nextLine();
                System.out.println("  ");
            }

            System.out.println("¡Seleccione una seccion del menu!");
            System.out.println("1)-. Registro de Reservaciones. (Se codea)");
            System.out.println("2)-. Eleminación de Reservaciones.");
            System.out.println("3)-. Modificación de Reservaciones.");
            System.out.println("4)-. Submenu Consulta de Reservaciones.");
            System.out.println("5)-. Mapa de ocupacion (Se codea)");
            System.out.println("6)-. Reporte de Reservaciones (Se codea)");
            System.out.println("7)-. Fin");
            res = tohru.nextInt();

            if (res >= 1 && res <= 7) {

                if (res == 7) {
                    System.out.println("Seleccion de seccion terminada");
                    return;
                }

                tohru.nextLine();

                condicion = getSelection(res);
            }

            count++;
        } while (!condicion);

        count = 0;

        switch (res) {
            case 1:
                registroReservaciones();
                break;
            case 5:
                mostrarMapadeOcupacion();
                break;
            case 6:
                break;
            default:
                break;
        }

        System.out.println("Debugg: Seleccion terminada");
    }

    public boolean getSelection(int numero) {

        boolean condicion;

        switch (numero) {
            case 1:
                System.out.println("Seccion seleccionada 'Registro de Reservaciones.'");

                condicion = sCorrecta();
                return condicion;
            case 2:
                System.out.println("Seccion seleccionada 'Eleminación de Reservaciones.'");

                condicion = sCorrecta();
                return condicion;
            case 3:
                System.out.println("Seccion seleccionada 'Modificación de Reservaciones.'");

                condicion = sCorrecta();
                return condicion;
            case 4:
                System.out.println("Seccion seleccionada 'Submenu Consulta de Reservaciones.'");

                condicion = sCorrecta();
                return condicion;
            case 5:
                System.out.println("Seccion seleccionada 'Mapa de ocupacion.'");

                condicion = sCorrecta();
                return condicion;
            case 6:
                System.out.println("Seccion seleccionada 'Reporte de Reservaciones'");

                condicion = sCorrecta();
                return condicion;
            default:
                System.out.println("Seleccion incorrecta, Intentelo denuevo");
                return false;

        }
    }

    public boolean sCorrecta() {

        Scanner tohru = new Scanner(System.in);

        String respuesta;

        System.out.println("¿La seleccion es correcta? (S/N)");
        respuesta = tohru.nextLine();

        if (respuesta.equalsIgnoreCase("S")) {
            return true;
        } else {
            return false;
        }
    }

    public void registroReservaciones() {

        //Presentar mapa de ocupacion primero*
        Scanner tec = new Scanner(System.in);

        String nPasajero, iPasajero;
        char dPasajero;

        //Se muestra mapa de ocupacion
        mostrarMapadeOcupacion();
        
        System.out.println("Bievenido, Porfavor ingrese su nombre!");
        nPasajero = tec.nextLine();

        System.out.println("");

        System.out.println("Destinos: "
                + "         Luna (LUN)"
                + "         Europa(EUR)"
                + "         Titán (TAN)");
        System.out.print("Ingresar destino: ");
        dPasajero = tec.nextLine().charAt(3);

        System.out.println("");

        System.out.println("Ingrese su 'ID':");
        iPasajero = tec.nextLine();

        Pasajero pasajero = new Pasajero(nPasajero,iPasajero,dPasajero);
        
        
        System.out.println("¿Que asiento desea escojer?");
        System.out.println("*Recuerde que solo hay asientos del 1 al 28*");
        
    }

    public void eliminarReservaciones() {
    }

    public void mostrarMapadeOcupacion() {
        System.out.println(" |1 " + nave.obtenerEstadoAsientosClaseEconomica() + "|" + "|2 "  + nave.obtenerAsientoClaseEconomicaDesocupado('1') + "|");
    }

}
