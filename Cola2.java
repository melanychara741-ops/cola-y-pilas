/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HOME
 */
public class Cola2 {
    
    public static void main(String[] args) {
        int[]cola=new int[5];
        int[]datos={10,20,30,40};
        int cantidad=0;
        
        for(int i=0;i<datos.length;i++){
        cola[++cantidad]=datos[i];
        }
        
        if(cantidad>0){
        int retirar=cola[0];
        for(int i=0;i<cantidad-1;i++){
        cola[i]=cola[i+1];
        }
        cantidad--;
        cola[cantidad]=0;
        System.out.println("Primer retiro: "+retirar);
        }
        int[]nuevos={50,60};
        for(int i=0;i<nuevos.length;i++){
        if(cantidad<cola.length){
        cola[++cantidad]=nuevos[i];
        }
        }
        while(cantidad>0){
        int retirar=cola[0];
        
        for(int i=0;i<cantidad-1;i++){
         cola[i]=cola[i+1];
        }
        cantidad--;
        cola[cantidad]=0;
        System.out.println("Sale: "+retirar);
        
        }
    }
}
