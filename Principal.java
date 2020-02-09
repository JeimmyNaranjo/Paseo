
import java.util.Scanner;

/**
 * Problema de un colectivo  * 
 * @author Jeimmy Naranjo
 * @version 1
 */
public class Principal  //Declaracion de la clase Principal
{
    public static void main(String[] args) 
    {
        // Datos de entrada: 
        // 1. Definicion de variables
        // Datos de entrada
        int gordos, flacos, estadia;
    
        // Datos de salida
        double buses, platos, costoTplatos, habitaciones, costodiahabs, costoThabs;
        
      
        
        //Variables adicionales
        double asientosbus = 60; // Bus de 60 puestos
        double comida = 10000;  //Precio de cada comida
        double hab = 25000;  //Costo de cada habitacion
        
        
        
        // Necesito acceso al teclado
        Scanner teclado = new Scanner(System.in);
        // Preguntar datos de entrada
        System.out.print("Ingrese la cantidad de estudiantes gordos:");
        gordos = teclado.nextInt();
        System.out.print("Ingrese la cantidad de estudiantes flacos");
        flacos = teclado.nextInt();
        System.out.print("Ingrese la cantidad de dias del hospedaje");
        estadia = teclado.nextInt();
        
        
        // 2. Realizar calculos
        // Cantidad de buses
        
        double igordos = (double)gordos; //Cambiar  las variables ingresadas de enteros a dobles
        double iflacos = (double)flacos;
        buses = Math.ceil(((gordos*2) + flacos)/asientosbus);
        int ibuses = (int)buses;
        // Cantidad de platos a servir en toda la estadia
        platos = ((gordos*5) +  (flacos*3)) * estadia;
        int iplatos = (int)platos;
        // Costo total de los platos en la estadia
        costoTplatos = (((gordos*5) +  (flacos*3)) * estadia) * comida; 
        int icostoTplatos = (int)costoTplatos;
        // Cantidad de habitaciones
        habitaciones = Math.ceil((igordos + iflacos) / 4);
        int ihabitaciones = (int)habitaciones;
        // Costo por dia de las habitaciones
        costodiahabs = habitaciones * hab;
        int icostodiahabs = (int)costodiahabs;
        // Costo total de las habitaciones en la estadia
        costoThabs = costodiahabs * estadia;
        int icostoThabs = (int)costoThabs;
 
     
        
                  
       // 3. Mostrar datos de salida
        System.out.println("Cantidad de buses necesarios:" + ibuses);
        System.out.println("Cantidad de platos de comida a servir en toda la estadia:" + iplatos);
        System.out.println("Costo total de platos de comida a servir en toda la estadia" + icostoTplatos);
        System.out.println("Cantidad de habitaciones necesarias:" + ihabitaciones);
        System.out.println("Costo total por dia de habitaciones necesarias:" + icostodiahabs);
        System.out.println("Costo total por estadia de habitaciones necesarias:" + icostoThabs);
        

        
        
        
         
  } //Fin de la clase principal
}
