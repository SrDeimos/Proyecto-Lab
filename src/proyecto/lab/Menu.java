package proyecto.lab;
import java.util.Scanner;
public class Menu {
    char op, res;
    public void menuPrincipal(){
        Scanner tec = new Scanner (System.in);
        System.out.printf("\nMenú Principal");
        System.out.printf("\nRegistro de reservaciones: 1");
        System.out.printf("\nEliminación de Reservaciones: 2");
        System.out.printf("\nModificación de Reservaciones: 3");
        System.out.printf("\nSubmenú Consulta de Reservaciones: 4");
        System.out.printf("\nMapa de Ocupación: 5");
        System.out.printf("\nReporte de reservaciones: 6");
        System.out.printf("Salir: 7");
    
        System.out.printf("¿Qué desea hacer? ");
        op = tec.nextLine().charAt(0);
        
        if (op>=1 && op<=7)
        {
         System.out.printf("\nProceso en construcción ¿Desea continuar? S/N");
         res = tec.nextLine().charAt(0);
         
        }
        else
        {
            System.out.print("*** Error: Opción inválida.");
            for (op=0;op>=8;){
                System.out.printf("\nMenú Principal");
                System.out.printf("\nRegistro de reservaciones: 1");
                System.out.printf("\nEliminación de Reservaciones: 2");
                System.out.printf("\nModificación de Reservaciones: 3");
                System.out.printf("\nSubmenú Consulta de Reservaciones: 4");
                System.out.printf("\nMapa de Ocupación: 5");
                System.out.printf("\nReporte de reservaciones: 6");
                System.out.printf("Salir: 7");
    
                System.out.printf("¿Qué desea hacer? ");
                //ola
            }
                
        }
}
}
