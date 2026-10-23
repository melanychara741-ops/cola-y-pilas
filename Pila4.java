/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HOME
 */
import java.util.Scanner;

public class Pila4 {
    
    public static void main(String[] args) {
        int[] pila= new int[5];
        int tope=-1;
        Scanner scan=new Scanner(System.in);
        
        
        int opc;
        
        do{
        System.out.println("///Menu///");
        System.out.println("1. Apilar");
        System.out.println("2. Desapilar");
        System.out.println("3. ver cima");
        System.out.println("4. Estadistica de la pila");
        System.out.println("5. Salir de aqui");
        System.out.println("Ingresa una opcion");
        opc=scan.nextInt();
        
        switch(opc){
            case 1:
                if(tope<pila.length-1){
                System.out.println("Ingresa un numero");
                int num=scan.nextInt();
                tope++;
                pila[tope]=num;
                System.out.println("numero ingresado exitosamente");
                }else{
                System.out.println("Pila llena");
                }
                break;
            case 2:
                if(tope>=0){
                int retirar=pila[tope];
                pila[tope]=0;
                tope--;
                System.out.println("Sale: "+retirar);
                }
                break;
            case 3:
                if(tope>=0){
                System.out.println("Cima: "+pila[tope]);
                }else{
                System.out.println("La pila esta vacia");
                }
                
                break;
            case 4:

                if (tope == -1) {
                        System.out.println("La pila esta vacia, no hay estadisticas.");
                    } else {
                        int menor = pila[tope];
                        int mayor = pila[tope];
                        int cantidad = 0;
                        long suma = 0;

                        while (tope >= 0) {
                            int numero = pila[tope];
                            pila[tope] = 0;
                            tope--;
                            suma += numero;
                            cantidad++;
                            if (numero < menor) {
                                menor = numero;
                            }
                            if (numero > mayor) {
                                mayor = numero;
                            }
                        }

                double prom= (double)suma/cantidad;
                System.out.println("Suma: "+suma);
                System.out.println("cantidad: "+ cantidad);
                System.out.println("promedio: "+prom);
                break;
                
                
                case 5:
                System.out.println("Salir de aqui");
                break;
            default:
                System.out.println("opcion invalida");
                break;     
        
        }
       
    }while(opc!=5);
    scan.close();
    
}
