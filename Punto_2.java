/*
Desarrolle una aplicación en Java que determine si alguno de los clientes de una tienda de departamentos se ha
excedido del límite de crédito en una cuenta. Para cada cliente se tienen los siguientes datos:
a) el saldo al inicio del mes.
b) el total de abonos en el mes.
c) el total de deducciones aplicadas a la cuenta del cliente en el mes.
d) el límite de crédito permitido.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Kevin Ruiz
 */
public class Punto_2 {
     public static void main(String[] args){
        int saldoin, abonosmes, totdeducciones, limit, nuevosaldo;
        
       limit = Integer.parseInt(JOptionPane.showInputDialog("Digite el limite del credito: "));
       saldoin = Integer.parseInt(JOptionPane.showInputDialog("Digite el saldo inicial:  "));
       abonosmes = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor total de abonos: "));
       totdeducciones = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor total en deducciones: "));
        nuevosaldo = saldoin + abonosmes - totdeducciones ;
        
        if(nuevosaldo > limit){
        
            JOptionPane.showMessageDialog(null, "Se excedio el limite de su credito ");
        }
        else{
          JOptionPane.showMessageDialog(null, "No se excedio el limite de su credito ");  
        }
    } 
}
