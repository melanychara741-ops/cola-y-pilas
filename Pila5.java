/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HOME
 */
public class Pila5 {
    public static void main(String[] args) {
        int[]array={5, 12, 8, 15, 20};
        int[]origen=new int[5];
        int[] destino=new int[5];
        int topeOrigen=-1;
        int topeDestino=-1;
        
        for(int i=0;i<array.length;i++){
        origen[++topeOrigen]=array[i];
        }
        while(topeOrigen>=0){
        int numero=origen[topeOrigen];
        origen[topeOrigen]=0;
        topeOrigen--;
        if(numero>=10){
        topeDestino++;
        destino[topeDestino]=numero;
        }
        }
        
        while(topeDestino>=0){
        int num=destino[topeDestino];
        destino[topeDestino]=0;
        topeDestino--;
        System.out.println("Sale: "+num);
        }
    }
    
}
