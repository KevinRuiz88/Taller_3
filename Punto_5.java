/*
. Los resultados de las últimas elecciones a la alcaldía de Valledupar fueron las siguientes:
Comuna      Candidato       Candidato       Candidato       Candidato
                A               B               C               D
  1            194             48              206             45
  2            180             20              320             16
  3            221             90              140             20
  4            432             50              821             14
  5            820             61              946             18
Escribe un programa en java que realice los siguientes cálculos: 
• Imprimir la tabla de votaciones, incluyendo sus cabeceras
• Calcular e imprimir el número total de votos recibidos por cada candidato y su porcentaje de votación con
relación al total de votos emitidos. Indicar cuál ha sido el candidato más votado (En caso de empate, se
escoge a cualquiera).
• Si algún candidato recibe más del 50% de los votos, el programa imprimirá un mensaje declarándole
ganador.
• Cual fue la comuna que mayor porcentaje de votación tuvo (En caso de empate, se escoge cualquiera).

 */

/**
 *
 * @author Kevin Ruiz
 */
public class Punto_5 {
     public static void main(String[] args) {
        String titulos[] = {"Comuna", "Candidato A", "Candidato B", "Candidato C", "Candidato D"};
        int votos[][] = {{1, 2, 3, 4, 5}, {194, 180, 221, 432, 820}, {48, 20, 90, 50, 61}, {206, 320, 140, 821, 946}, {45, 16, 20, 14, 18}};
        int ttvotos[] = new int[5];
        String masvotado = "", winner = "";
        int cont = 0, mayorvot = 0,numcomuna=0;
        double porcentaje, votemitidos = 0, mayporcentaje = 0;
        int ttcomuna[] = new int[5];
        double maycomuna=0, porcentaje_comuna;

        for (int i = 0; i <= titulos.length - 1; i++) {
            System.out.print(titulos[i] + "\t");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int m = 0; m < 5; m++) {
                System.out.print(votos[m][i] + "\t      ");
            }
            System.out.println("");
        }
        System.out.println("\n---- Total Votos ----");

        for (int i = 1; i < 5; i++) {
            for (int m = 0; m < 5; m++) {
                ttvotos[cont] += votos[i][m];
            }
            votemitidos += ttvotos[cont];
            cont++;
        }
        cont = 0;

        for (int i = 0; i < 5; i++) {
            for (int m = 1; m < 5; m++) {
                ttcomuna[cont] += votos[m][i];
            }
            porcentaje_comuna = (ttcomuna[cont] * 100) / votemitidos;
            if (porcentaje_comuna > maycomuna) {
                maycomuna = porcentaje_comuna;
                numcomuna = i+1;
            }
            cont++;
        }
        cont = 0;
        
        for (int j = 1; j < 5; j++) {

            porcentaje = (ttvotos[cont] * 100) / votemitidos;
            System.out.printf("El " + titulos[j] + " tiene " + ttvotos[cont] + " total de votos con un porcentaje del %.2f \n", porcentaje);
            
            if (ttvotos[cont] > mayorvot) {
                mayorvot = ttvotos[cont];
                masvotado = titulos[j];
            }
            
            if (porcentaje > mayporcentaje) {
                mayporcentaje = porcentaje;
                winner = titulos[j];
            }
            cont++;
        }
        System.out.println("          Conclusiones          ");
        System.out.println("El " + masvotado + " con " + mayorvot + " votos fue el que obtuvo la mayor cantidad de votos");
        System.out.printf("El " + winner + " ha sido el ganador por que tiene el %.2f porciento de los votos\n", mayporcentaje);
        System.out.printf("La comuna "+numcomuna+" con %.2f porciento de votos es la que tiene mayor porcentaje de votos\n",maycomuna);

    }
}
