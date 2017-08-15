
package p1_201602491;

import java.util.Scanner;

/**
  * @author Carlos Luna
 */
public class MenuP_201602491 {
    
    String start ;
    public int opcion;
    public boolean flag = true;
    
    public MenuP_201602491(){
        
        System.out.println("Carlos Francisco Luna Nova");
        System.out.println("201602491");
        System.out.println("IPC1 A Practica 1");
        System.out.println("BUSCAMINAS!!!");
        
        this.start();
        this.menudificultad();
        this.selector();
    }
    
    public void start(){
    
        Scanner scmp = new Scanner(System.in);
        start = scmp.nextLine();
    }
    
    public void menudificultad(){
    
        System.out.println("BUSCAMINAS!!!");
        System.out.println("1. Principiante");
        System.out.println("2. Intermedio");
        System.out.println("3. Experto");
        System.out.println("4. Salir");
        System.out.println("");
        System.out.println("Ingrese opcion:");
    }
    
    public void selector(){
        
        while(flag){
        
            Scanner scop = new Scanner(System.in);
            opcion = scop.nextInt();
            
            switch(opcion){

                case 1:
                   System.out.println("NIVEL PRINCIPIANTE");
                break;

                case 2:

                break;

                case 3:

                break;

                case 4:
                    flag = false;
                break;
            }
        }
    }
    
}
