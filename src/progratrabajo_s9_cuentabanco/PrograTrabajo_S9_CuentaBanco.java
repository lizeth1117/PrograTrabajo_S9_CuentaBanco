/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progratrabajo_s9_cuentabanco;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lizet
 */
public class PrograTrabajo_S9_CuentaBanco {

    
    
    public static void main(String[] args) {
        // TODO code application logic here
    int opcion, otratrans;
    float monto;
    Scanner entrada= new Scanner(System.in);
    Cuenta c=new Cuenta();
    
    System.out.println("Ingrese su nombre completo");
    c.setCliente(entrada.nextLine());
    System.out.println("Ingrese un numero de telefono");
    c.setTelefono(entrada.next());
    System.out.println("Ingrese el numero de cuenta");  
    c.setNumerocuenta(entrada.nextInt());
    
    do{
    System.out.println("Seleccione una opcion:"
            + "\n1. Retirar \n2.Depositar\n3.Ver estado cuenta");
    opcion=entrada.nextInt();
        switch(opcion){
            case 1 -> {
                System.out.println("Ingrese la el monto que desea retirar");
                c.retirar(entrada.nextFloat());
                System.out.println("El nuevo saldo es "+c.getSaldo());
            }
            case 2 -> {
                System.out.println("Ingrese la el monto que desea depositar");
                monto=entrada.nextFloat();
                c.depositar(monto);
                System.out.println("El nuevo saldo es "+c.getSaldo());
            }
            case 3 -> c.estadodecuenta();
            default -> {
            }
        }
        System.out.println("\nDesea realizar otra transaccion?\n1.si\n2.No"); 
        otratrans=entrada.nextInt();
        } 
        while(otratrans==1);

}
}
