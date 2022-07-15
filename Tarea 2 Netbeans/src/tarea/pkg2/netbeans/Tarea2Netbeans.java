package tarea.pkg2.netbeans;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class Tarea2Netbeans {

   
   public static void main(String[] args) {
        System.out.println("*****************************************");
        System.out.println("* Tarea #2                              *");
        System.out.println("* Programacion II                       *");
        System.out.println("* Autor: Gerardo Antonio González Vargas*");
        System.out.println("* Fecha de Entrega: 15 de julio de 2022 *");
        System.out.println("*****************************************");
        System.out.println("");
        System.out.println("Ingrese la linea matematica separando los valores y el operador (+, -, *, /) con espacio");
        Scanner scan = new Scanner(System.in);//creo un scanner para leer la linea matematica
        String linea = scan.nextLine();//leo la linea matematica
       scan.close();//cierro el scanner
        String[] individuos = linea.split(" "); //separo la linea en individuos
        if(individuos[1].equals("+")){ //calculo el resultado en base al operador ingresado
            System.out.println(Integer.parseInt(individuos[0]) + Integer.parseInt(individuos[2]));
        }else if(individuos[1].equals("-")){
            System.out.println(Integer.parseInt(individuos[0]) - Integer.parseInt(individuos[2]));
        }else if(individuos[1].equals("*")){
            System.out.println(Integer.parseInt(individuos[0]) * Integer.parseInt(individuos[2]));
        }else if(individuos[1].equals("/")){
            System.out.println(Integer.parseInt(individuos[0]) / Integer.parseInt(individuos[2]));
        }else{
            System.out.println("Operador no valido");

        

        
        
        
    }
}
}