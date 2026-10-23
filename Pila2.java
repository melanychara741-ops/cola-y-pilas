/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HOME
 */
import java.util.Scanner;

public class Pila2 {
    
    public static void main(String[] args) {
        
        int [] pila=new int[5];
        Scanner scan=new Scanner(System.in);
        int tope=-1;
        int continuar=1;
        
        while(continuar==1){
        
            //validamos si la pila no esta llena
            
            if(tope>=pila.length-1){
            System.out.println("Lo lamento, la pila ya esta llena");
            break;
            }else{
            System.out.println("Ingresa el numero");
            int numero=scan.nextInt();
            tope++;
            pila[tope]=numero;
            System.out.println("Numero ingresado exitosamente");
            }
            
            //Confirmar si el usuario desea continuar
            
            if(tope<pila.length-1){
            System.out.println("Desea continuar: 1=SI /2=NO");
           continuar=scan.nextInt();
            }
        
        }
        for(int i=0;i<pila.length;i++){
        System.out.print("["+pila[i]+"]"+" ");
        }
        

        scan.close();
    }
    
}
