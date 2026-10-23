/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HOME
 */
public class Cola5 {
    public static void main(String[] args) {
        int[]cola=new int [3];
        int[]pila=new int [3];
        int[][]rondas={{10,20,30},{40,50}};
        int frente=0;
        int fin=-1;
        int tope=-1;
        
        for(int ronda=0;ronda<rondas.length;ronda++){
        System.out.println("Ronda "+(ronda+1));
        for(int i=0;i<rondas[ronda].length;i++){
        int num=rondas[ronda][i];
        cola[++fin]=num;
        pila[++tope]=num;
        }
        }
        
        while(frente<=fin){
        int num=cola[frente];
        cola[frente]=0;
        frente++;
        System.out.println("Sale: "+num);
        }
        
        while(tope>=0){
        int nume=pila[tope];
        pila[tope]=0;
        tope--;
        System.out.println("Sale: "+nume);
        }
        tope=-1;
        frente=0;
        fin=-1;
        System.out.println("Pila vacia: " + (tope == -1));
        System.out.println("Cola vacia: " + (frente > fin));
    }
    
}
