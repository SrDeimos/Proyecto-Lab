package proyecto.lab;
import java.util.Scanner;
public class Menu {
    //op=opción (1,2,3,etc), res= respuesta de si desea continuar S/N
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
            System.out.println("*** Error: Opción inválida.");
            System.out.print("Presione ENTER para continuar");
            tec.nextLine();
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
            }
                
        }
}
}
