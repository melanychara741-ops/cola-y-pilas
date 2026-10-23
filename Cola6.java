/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HOME
 */
public class Cola6 {
    public static void main(String[] args) {
        String[]cola=new String[5];
        int frente=0;
        int fin=-1;
        String[]nombres={"ANA", "CARLOS", "MARIA", "PEDRO" , "LAURA"};
        
        for(int i=0;i<nombres.length;i++){
        cola[++fin]=nombres[i];
        }
        
        for(int i=frente;i<=fin;i++){
        System.out.println("Posicion "+i+":"+cola[i]);
        }
        
        for(int atender=0;atender<3;atender++){
        if(frente<=fin){
        String usuario=cola[frente];
        cola[frente]=null;
        frente++;
        System.out.println("Atendido: "+usuario);
        }
        }
        System.out.println(" USUARIOS QUE QUEDAN ESPERANDO");
        if(frente<=fin){
        for(int i=frente;i<=fin;i++){
        System.out.println("Posicion "+i+" : "+cola[i]);
        }
        }else{
        System.out.println("Cola vacia");
        }
    }
}
