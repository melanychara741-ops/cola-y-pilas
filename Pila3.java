/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HOME
 */
public class Pila3 {
    public static void main(String[] args) {
    int []pila= new int[4];
    int tope=-1;
    int []array= {7, 12, 5, 8, 20, 15};
    
    for(int i=0;i<array.length;i++){
    
    if(array[i]%2==0){
        if(tope<pila.length-1){
tope++;
    pila[tope]=array[i];
        }else{
        System.out.println("La pila ya se encuentra llena");
        }
}

    }
    
    while (tope>=0){
    int retirar=pila[tope];
    pila[tope]=0;
    tope--;
    System.out.println("Sale: "+retirar);
    }
    }
}
