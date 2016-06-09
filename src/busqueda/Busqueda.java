package busqueda;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Busqueda {

    public static void main(String[] args) {
        int numeroElementos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero de elementos del array"));
        int[] numeros = new int[numeroElementos];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 5;
        }
        int numIndice = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor para el que se quiere conseguir el indice"));
        Busqueda ejemplo = new Busqueda();
        int indice = ejemplo.busquedaBinaria(numeros, numIndice, 0, numeros.length - 1);
        System.out.println("El indice del valor"+numIndice +" es: " + indice);
       
    }

    public int busquedaBinaria(int[] listado, int clave, int posInicial, int posFinal) {
        int posMitad = (posFinal + posInicial) / 2;
        if (clave == listado[posMitad]) {
            return posMitad;
        } else if (clave < listado[posMitad]) {
            if (posMitad - 1 <= posInicial) {
                return -1;
            } else {
                return busquedaBinaria(listado, clave, posInicial, posMitad - 1);
            }
        } else {
            if (posMitad + 1 >= posFinal) {
                return -1;
            } else {
                return busquedaBinaria(listado, clave, posMitad + 1, posFinal);
            }
        }
    }
}
