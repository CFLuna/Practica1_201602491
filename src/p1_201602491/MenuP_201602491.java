
package p1_201602491;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Carlos Luna
 */
public class MenuP_201602491 {
    
    //Menu principial (Constructor)
    
    String start ;
    public int opcion;
    public boolean flag = true;
    
    public boolean flagm = true;
    
    Random rM = new Random();
    
    int[][] mPrincipiante = new int[4][4];
    int[][] mIntermedio = new int[6][6];
    int[][] mExperto = new int[8][8];
    
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
                    this.mPrincipiante();
                break;

                case 2:
                    this.mIntermedio();
                break;

                case 3:
                    this.mExperto();
                break;

                case 4:
                    flag = false;
                break;
            }
        }
    }
    
    public void rmP(){
        for(int i=0; i<=3; i++){
            for(int j=0; j<=3; i++){
                mPrincipiante[i][j] = rM.nextInt(15);
            }
        }
    }
    
    public void rmI(){
        for(int i=0; i<=5; i++){
            for(int j=0; j<=5; i++){
                mIntermedio[i][j] = rM.nextInt(15);
            }
        }
    }
    
    public void rmE(){
        for(int i=0; i<=7; i++){
            for(int j=0; j<=7; i++){
                mExperto[i][j] = rM.nextInt(15);
            }
        }
    }
    
    public void mPrincipiante(){
        
        System.out.println("NIVEL PRINCIPIANTE");
        for(int i=0; i<=3; i++){
            System.out.println();
            for(int j=0; j<=3; j++){
               System.out.printf(" %s ",mPrincipiante[i][j]);
            }
        }
        System.out.println("");
        this.menuM();
    }
    
    public void mIntermedio(){
        
        System.out.println("NIVEL INTERMEDIO");
        for(int i=0; i<=5; i++){
            System.out.println();
            for(int j=0; j<=5; j++){
                System.out.printf(" %s ",mIntermedio[i][j]);
            }
        }
        System.out.println("");
        this.menuM();
    }
    
     public void mExperto(){
        
        System.out.println("NIVEL EXPERTO");
        for(int i=0; i<=7; i++){
            System.out.println();
            for(int j=0; j<=7; j++){
                System.out.printf(" %s ",mExperto[i][j]);
            }
        }
        System.out.println("");
        this.menuM();
    } 
     
    public void menuM(){
        
        System.out.println("--------------------------");
        System.out.println("1. Voltear");
        System.out.println("2. Reiniciar");
        System.out.println("3. Salir");
        System.out.println("");
        System.out.println("Ingresar opcion:");
    }
    
}