/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HOME
 */
public class Cola1 {
    public static void main(String[] args) {
        int[]cola= new int[5];
        int frente=0;
        int fin=-1;
        int[]turnos={10, 20, 30};
        
        for(int i=0;i<turnos.length;i++){
        if(fin<cola.length-1){
        fin++;
        cola[fin]=turnos[i];
        System.out.println("Llego: "+turnos[i]);
         }
        }
        
        while(frente<=fin){
        int numero=cola[frente];
        cola[frente]=0;
        frente++;
        System.out.println("Salio: "+numero);
        }
    }
}
