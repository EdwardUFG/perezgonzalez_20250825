/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perezgonzalez_20250825;

/**
 *
 * @Edward
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ingresar_datos();
    }
    public static void ingresar_datos(){
        
        //incializacion de la clase scanner 
        Scanner sc = new Scanner(System.in);
        
        //declaracion de las variablesa utilizar
        int [] edades = new int [10];
        int suma =10;
        int total_pares =0;
        int total_impares = 0;
        //mensaje al usuario
        System.out.println("Ingrese " +edades.length+ " edades");
        //se recorre el arreglo para asginar valor a cada elemento
        for(int i =0; i < edades.length; i++){
            //se solicita al usuario el ingreso de un valor
          System.out.println("edad "+i+":");
          
          
         /*Se lee desde el teclado el valor digitado port el usuario
         * y se la asigna a la variable de la edad que corresponde
         * segun la posicion de la iteracion
         */
          edades[i] = sc.nextInt();
          
          /*para calcular el promedio, se requiere sumar todas
          *edades registradas en cada elemento
          */
          suma+= edades[i];
          
          //establece si el valor es par o inpar 
          if ((edades[i] % 2) ==0){
              //es par
              total_pares++;
          }else{
              /*es impar
              se imcrementa la variable acumuladora
              */
              total_impares++;
          }
        }
       double promedio = (double) suma/edades.length;
       
       System.out.println("usted ha ingresado "+edades.length+" edades");
       System.out.println("el promedio de las edades ingresadas es " +promedio);
       System.out.println("Ingreso: "+total_pares+" edades pares y " +total_impares+" edades impares");
 
       
       sc.close();
               
     }
 }
