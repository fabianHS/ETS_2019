/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactgit;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabian y Carlos
 */
public class RefactGit {

    /**
     * @param args the command line arguments
     */
    static int Numero_filas=0;
    static int Numero_columnas =0;
    static int numero =0;
    static int matriz[][] = new int[Numero_filas][Numero_columnas];
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        numero= Integer.parseInt(JOptionPane.showInputDialog("Desea realizar la matriz: \n1: Matriz de 3 \n2: Matriz de 4 \n3: Matriz de 5"));
        
        
        crear_matriz(numero);
        
        llenar_matriz();
        
        imprimir_matriz();
        
    }

    public static void imprimir_matriz() throws HeadlessException {
        // Imprimir matriz
        
        String resultado = "";
        
        for (int i = 0; i < Numero_filas; i++) {
            for (int j = 0; j < Numero_columnas; j++) {
                resultado += matriz[i][j];
                resultado += " ";
            }
            resultado += "\n"; 
        }
        
        JOptionPane.showMessageDialog(null,resultado);
    }

    public static void llenar_matriz() throws HeadlessException, NumberFormatException {
        // LLenar matriz
        for (int i = 0; i < Numero_filas; i++) {
            for (int j = 0; j < Numero_columnas; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion [" + (i + 1) + " " + (j + 1) + "] de la matriz"));
            }
        }
    }
    
    public static void crear_matriz(int numero) {
        
        if(numero == 1){Numero_filas=3; Numero_columnas =3; }
        if(numero == 2){Numero_filas=4; Numero_columnas =4; }
        if(numero == 3){Numero_filas=5; Numero_columnas =5; }
        
    }
    
}
