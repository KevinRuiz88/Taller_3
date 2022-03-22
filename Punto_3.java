/*
Una empresa grande paga a sus vendedores mediante comisiones. Los vendedores reciben $200 por semana, más el
9% de sus ventas brutas durante esa semana. Por ejemplo, un vendedor que vende $5,000 de mercancía en una
semana, recibe $200 más el 9% de 5,000, o un total de $650 en esa semana.
Del mismo modo, la empresa premia a los vendedores que cumplan los objetivos de venta con un incremento en el
pago de la semana, de acuerdo a las siguientes categorías de vendedores:
Categoría A – incrementa el pago semanal en 5% si las ventas superan $3000, en 7% sin son entre $5000 y $7000, y
10% si superan los $7000.
Categoría B – incrementa el pago semanal en 7% si las ventas superan $5000, %10 si son entre %10000 y $15000,
13% si superan los $15000.
Si usted cuenta con el registro de ventas diarias realizadas por un vendedor almacenados en un arreglo de 7 posiciones
(una para cada día de la semana), ¿cuál sería el pago semanal del vendedor en cada categoría?
 */
import javax.swing.JOptionPane;
/**
 * @author Kevin Ruiz 
 */
public class Punto_3 {
    public static void main(String[] args) {
     int[] day = new int[7];
        int incrementA = 0, incrementB = 0, interesA = 9, interesB = 9, ttvendido = 0, ingresem;
        double aumentA, aumentB;
        ingresem = 200;

        for (int i = 0; i <= 6; i++) {
            day[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el total vendido del dia " + (i + 1)));
            ttvendido += day[i];
        }
        //categoria A
        if (ttvendido > 3000) {
            incrementA = 5;
            if (ttvendido > 5000) {
                incrementA = 7;
                if (ttvendido > 7000) {
                    incrementA = 10;
                }
            }
        }
        interesA += incrementA;
        //categoria B
        if (ttvendido > 5000) {
            incrementB = 7;
            if (ttvendido > 10000) {
                incrementB = 10;
                if (ttvendido > 15000) {
                    incrementB = 13;
                }
            }
        }
        interesB += incrementB;

        aumentA = ingresem + ((ttvendido * interesA) / 100);
        
        aumentB = ingresem + ((ttvendido * interesA) / 100);

        JOptionPane.showMessageDialog(null, "el pago semanal en la categoria A es: " + aumentA);
        
        JOptionPane.showMessageDialog(null, "el pago semanal en la categoria B es: " + aumentB);
    }
}

