package lab3ejercicio2;

import java.util.Scanner;

public class Lab3ejercicio2 {
     public static void main(String[] args) {
         
        Scanner entrada = new Scanner(System.in);
        
        float sueldo, suelxhora;
         
        int horas;
         
        System.out.println("Ingrese el salario por hora");
        suelxhora = entrada.nextFloat();
        System.out.println("Ingrese el total de horas trabajadas en la semana");
        horas = entrada.nextInt();
        
        sueldo = suelxhora * horas;
        
        System.out.println("El salario total semanal es: "+ sueldo);
    }
}
