/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HOME
 */
public class Pila6 {
    public static void main(String[] args) {
        int[]pila=new int[4];
        int tope=-1;
        int[]datos={101, 102, 103, 104, 105, 106};
        
        for(int i=0;i<datos.length;i++){
        if(tope<pila.length-1){
        tope++;
        pila[tope]=datos[i];
        }else{
        System.out.println("El dispensador ya se encuentra lleno");
        }
        }
        if(tope>=0){
        System.out.println("Cima: "+pila[tope]);
        }
        
        while(tope>=0){
        int numero=pila[tope];
        pila[tope]=0;
        tope--;
        System.out.println("Sale plato :"+numero);
        }
    }
}
