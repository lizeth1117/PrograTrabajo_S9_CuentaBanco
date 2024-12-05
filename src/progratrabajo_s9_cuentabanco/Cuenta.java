/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progratrabajo_s9_cuentabanco;

import javax.swing.JOptionPane;

/**
 *
 * @author lizet
 */
public class Cuenta {

    String cliente, telefono, estadocuenta;
    int numerocuenta;
    float limite=999999 ;
    private float saldo,retiros,depositos;
    int contcuentas=0;

public Cuenta() {
    this.cliente="No definido";
    this.telefono = "No definido";
    this.numerocuenta = 0 ;
    this.limite = 999999;
    this.saldo = 0;
}
    

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }
    
    public float getSaldo(){
        
        return saldo;
    }
    public void depositar(float monto){
     if(monto>0){
         if(monto<(limite-saldo)){
          saldo=(saldo+monto);
         depositos=(depositos+monto);
         } else
             System.out.println("El valor del monto sobrepasa el limite");
     }else 
            System.out.println("Error, no puede ingresar numeros negativos ");
     }
         
    
    public void retirar(float monto){
        if(monto>0){
            if(monto<this.saldo){
           saldo=(saldo-monto);
           retiros=(retiros+monto);
        } else 
          System.out.println("Saldo Insuficiente ");      
        } else 
         System.out.println("Error, no puede ingresar numeros negativos");  
        }
    
    public void estadodecuenta(){
        System.out.println("*****ESTADO DE CUENTA*****\nNombre: "+cliente+
                "\nNumero de cuenta: "+numerocuenta+"\nTelefono: "+telefono
                + "\nSaldo inicial......0.00 \nDepositos......."+depositos+
                "\nretiros......."+retiros+"\nSaldo actual....."+saldo);
    }
}
