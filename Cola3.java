/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HOME
 */
public class Cola3 {
    
    public static void main(String[] args) {
        int[]datos={3, 8, 5, 10, 7, 2};
        int[]original=new int[datos.length];
        int[]pares=new int [datos.length];
        int frente=0;
        int fin=-1;
        int finpar=-1;
        int descartados=0;
        
        for(int i=0;i<datos.length;i++){
        original[++fin]=datos[i];
        }
        
        while(frente<=fin){
        int num=original[frente];
        original[frente]=0;
        frente++;
        if(original[frente]%2==0){
        pares[++finpar]=num;
        }else{
        descartados++;
        }
        
        int frentePar=0;
        
        while(frentePar<=finpar){
        int numepar=pares[frentePar];
        pares[frentePar]=0;
        frentePar++;
        System.out.println("Sale par: "+numepar);
        }
        }
    }
    
}
