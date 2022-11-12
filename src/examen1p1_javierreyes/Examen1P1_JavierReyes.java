/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_javierreyes;
import java.util.Scanner;
/**
 *
 * @author Javier Reyes
 */
public class Examen1P1_JavierReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        // TODO code application logic here
        boolean salir = false;
       int opcion;
       while(!salir){
           System.out.println("Bienvenido al menu del primer examen de laboratorio");
           System.out.println("las opciones del menu son estas");
           System.out.println("1.Conjuntos ");
           System.out.println("2.Cifrado por Substitucion ");
           System.out.println("3.Sobre ");
           System.out.println("4.salir ");
           opcion = lea.nextInt();
           switch (opcion){
               case 1:
                  Conjuntos1();
                   break;
               case 2:
                   Csubstitucion2();
                   break;
      
               case 3: 
                   Sobre3();
                   case 4:
                   salir=true;
               break;
           } 
           System.out.println("Gracias por haber utilizado el menu");
           System.out.println("fin del menu"); 
       }               
    }
    public static void Conjuntos1(){      
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la primer cadena: ");
        String letras=entrada.nextLine();
        System.out.println("ingrese la segunda cadena: ");
        String letras2=entrada.nextLine();
        if(letras == letras2){
            System.out.println("ambos conjuntos son iguales");
        }else{
        
        }
        
        
    }
    public static void Csubstitucion2(){      
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese una cadena: ");
        String palabra=entrada.nextLine();
        
        
        
    }
    public static void Sobre3(){      
        Scanner lea = new Scanner (System.in);
        
        System.out.println("ingrese el contorno: ");
        String contorno=lea.nextLine();
        System.out.println("Ingrese un numero");
            int total1 = lea.nextInt();
                while (total1 < 0){
                    System.out.println("Ingrese un numero");
                      total1 = lea.nextInt();
                }
                  for (int i = 0; i < total1; i++){
                      System.out.print("  "+contorno); //espaciado arriba
                  }
                  System.out.println("  ");// primer for para que se muestre la primera linea de arriba 
                    for (int i = 0; i < total1 - 2; i++){
                       System.out.print("  "+contorno);
                          for (int j = 0; j < total1 - 2; j++){// for sirve para el espaciado de en medio
                             System.out.print("   "); 
                          }
                          System.out.println("  "+contorno);
                    }
                    for (int i = 0; i < total1; i++){// parte de abajo del cuadrado.
                       System.out.print("  "+contorno);// espaciado abajo
                    }
                    System.out.println();
    }
    
    
}
