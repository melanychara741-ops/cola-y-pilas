/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HOME
 */
import java.util.Scanner;

public class Cola7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[] cola= new String[5];
        int frente=0;
        int fin=-1;
        int opc;
        do{
        System.out.println("//MENU//");
        System.out.println("1. Registrar");
        System.out.println("2. Atender");
        System.out.println("3. Verificar clientes pendientes");
        System.out.println("4. Salir");
        System.out.println("Ingresa una opcion");
        opc=scan.nextInt();
        
        switch(opc){
            case 1:
                if(fin<cola.length-1){
                    System.out.println("Ingresa un nombre: ");
                String nombre=scan.nextLine();
                cola[++fin]=nombre;
                System.out.println("Cliente registrado de manera exitosa");
                }else{
                System.out.println("Cola llena");
                }
                break;
            case 2:
                if(frente<=fin){
                String atendido=cola[frente];
                cola[frente]=null;
                frente++;
                System.out.println("Atendiendo: "+atendido);
                }else{
                System.out.println("No hay clientes en la fila");
                }
                
                break;
                case 4:
                if(frente<=fin){
                System.out.println("Clientes pendientes: ");
                for(int i=frente;i<fin;i++){
                System.out.println("Posicion "+i+" : "+cola[i]);
                }
                }else{
                System.out.println("No hay clientes para atender");
                }
                break;
                case 5:
                System.out.println("Hasta luego..");
                break;
                default:
                System.out.println("Opcion invalida");
                break;
        
        }
        }while(opc !=5);
        scan.close();
}
    }

