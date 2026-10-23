/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HOME
 */
public class Pila1 {
    public static void main(String[] args) {
        //inicializar la pila
        
        int[]pila=new int[5];
        int tope=-1;
        
        //insertar elementos a la pila
        
        for(int i=0;i<pila.length;i++){
        tope++;
        pila[tope]=(i+1)*10;
        }
        
        if(tope>=0){
        System.out.println("Cima: "+pila[tope]);
        System.out.println("Cantidad: "+pila[tope+1]);
        }
        
        if(tope>=0){
        int retirado=pila[tope];
        pila[tope]=0;
        tope--;
        System.out.println("sale: "+retirado);
        }
        System.out.println("vacia: "+(tope==-1));
        
            int n=30;
    if(tope< pila.length-1){
    tope++;
    pila[tope]=n;
    
    }
    }
    

}
