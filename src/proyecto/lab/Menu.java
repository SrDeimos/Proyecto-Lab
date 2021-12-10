package proyecto.lab;

import java.util.Scanner;

public class Menu {

    Nave nave;

    Pasajero pasajero;

    public Menu() {
        nave = new Nave();
    }

    int res;

    public void menuPrincipal() {

        boolean condicion = false;

        int count = 0;

        do {

            if (count >= 1) {
                System.out.println("  ");
                System.out.println("Seleccion incorrecta, solamente hay selecciones del 1 al 7");
                System.out.println("  ");
            }

            Scanner tohru = new Scanner(System.in);
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

                count += 0;
            }

            count++;
        } while (!condicion);

        switch (res) {
            case 1:
                registroReservaciones();
                break;
            case 5:
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

        Scanner tec = new Scanner(System.in);
        
        String nPasajero, iPasajero;
        char dPasajero;
        
        System.out.println("Bievenido, Porfavor ingrese su nombre!");
        nPasajero = tec.nextLine();
        pasajero.setnPasajero(nPasajero);
        
        System.out.println("");
        
        System.out.println("Destinos: "
                + "         Luna (LUN)"
                + "         Europa(EUR)"
                + "         Titán (TAN)");
        System.out.print("Ingresar destino: ");
        dPasajero = tec.nextLine().charAt(3);
        pasajero.setdPasajero(dPasajero);
        
        System.out.println("");
        
        System.out.println("Ingrese su 'ID':");
        iPasajero = tec.nextLine();
        pasajero.setiPasajero(iPasajero);
        
        System.out.println("");
        
        System.out.println("¿Que tipo de asiento escojera? ");
        
//        int cont;
//        cont = 0;
//        String nombre[] = new String[cont];
//        String id[] = new String[cont];
//        char destino[] = new char[cont];
//
//        while (cont == 0 && cont < 10) {
//            System.out.print("Nombre: ");
//            nombre[cont] = tec.nextLine();
//            pasajero.setnPasajero(nombre[cont]);
//            System.out.print("Identificación (ID): ");
//            id[cont] = tec.nextLine();
//            pasajero.setiPasajero(id[0]);
//            System.out.println("Destinos: "
//                    + "         Luna (LUN)"
//                    + "         Europa(EUR)"
//                    + "         Titán (TAN)");
//            System.out.print("Ingresar destino: ");
//            destino[cont] = tec.nextLine().charAt(0);
//            if (destino[cont]=='1'||destino[cont]=='2'||destino[cont]=='3'){
//                pasajero.setdPasajero(destino[cont]);
//            }
//            else{
//                System.out.println("*** Error: Destino del pasajero inválido.");
//                System.out.println("Presionar <Enter> para continuar.");
//                System.out.print("Ingresar destino: ");
//                destino[cont] = tec.nextLine().charAt(0);
//                pasajero.setdPasajero(destino[cont]);   
//            }
//            cont++;
//        }
    }
    
    public void eliminarReservaciones( ){
        
    }
    
    

}
