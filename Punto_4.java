/*
Desarrolle una aplicación en Java que determine el sueldo bruto para un conjunto de empleados. La empresa paga
una tarifa normal por hora en las primeras 40 horas de trabajo de cada empleado, y en todas las horas trabajadas que
excedan de 40 paga por hora tarifa y media.
Usted recibe un arreglo E con los nombres de los empleados de la empresa, un arreglo H con el número de horas que
trabajó cada uno en la semana y un arreglo T con la tarifa por horas normal de cada empleado.
Con estos datos el programa debe determinar y mostrar el sueldo bruto de cada trabajador. 
 */
import java.util.Scanner;
/**
 * @author Kevin Ruiz
 */
public class Punto_4 {
    
    static String[]E;
    static int[]H;
    static int[]T;
    static int n;
    
    static void calsuel(int H[],int T[],String  E[]){
        double Sueldo;
        for (int i=0; i<E.length; i++){
            if(H[i] <=40){
                Sueldo=H[i]*T[i];
            }
            else{
                Sueldo = (40*T[i])+(H[i]-40)*(T[i]*1.5);
            }
            System.out.println("El sueldo del trabajador " +E[i]+ " es: " +Sueldo);
        }
    }
    public static void main(String[] args) {
        Scanner lector= new Scanner (System.in);
        System.out.println("cuantos trabajadores ingresara ");
        n = lector.nextInt();
        E = new String[n];
        H = new int[n];
        T = new int[n];
         
        for (int i=0; i<E.length; i++){
            System.out.println("Digite el nombre del trabajador " +i );
            E[i]=lector.next();

            System.out.println("Digite el numero de horas trabajadas ");
            H[i]=lector.nextInt();
            
            System.out.println("Digite la tarifa por hora del trabajador :");
            T[i]=lector.nextInt();
            
           calsuel(H,T,E);
           
        }
}
}
