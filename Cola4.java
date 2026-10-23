/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HOME
 */
public class Cola4 {
    public static void main(String[] args) {
        int[]cola=new int[4];
        int[]pila=new int[4];
        int frente=0;
        int fin=-1;
        int tope=-1;
        
        for(int num=1;num<=4;num++){
        cola[++fin]=num;
        }
        
        while(frente<=fin){
        pila[++tope]=cola[frente];
        cola[frente]=0;
        frente++;
        
        }
        frente=0;
        fin=-1;
        
        while(tope>=0){
        cola[++frente]=pila[tope];
        pila[tope]=0;
        tope--;
        }
        System.out.println("Auxiliar vacia: " + (tope == -1));

while (frente <= fin) {
    int numero = cola[frente];
    cola[frente] = 0;
    frente++;
    System.out.println("Sale: " + numero);
}
    }
    
}
