package hn.edu.ujcv.pii.Investigacion.ii;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Conexion prueba = new Conexion();
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int numero;
        try {
            System.out.println("Ingrese cuantas veces quiere que se repita el ciclo?");
            numero = teclado.nextInt();
            if (numero > 0) {
                for (int i = 0; i < numero; i++) {
                    System.out.println("Repeticion " + (i + 1));
                }
                prueba.conectar(0);
            } else {
                System.out.println("El numero que debe ingresar tiene que ser mayor o igual a 0");
                prueba.conectar(-1);
            }
        }catch (Exception e){
            System.err.println("Error " + e.getMessage());
        }
    }
}
