/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactgit;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabian y Carlos
 */
public class RefactGit {

    /**
     * @param args the command line arguments
     */
    static int nf=0;
    static int nc =0;
    static int columna =0;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        columna= Integer.parseInt(JOptionPane.showInputDialog("Desea realizar la matriz: \n1: Matriz de 3 \n2: Matriz de 4 \n3: Matriz de 5"));
        
        
        crear_matriz(columna);
        
        int matriz[][] = new int[nf][nc];
        
        // LLenar matriz
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                 matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion ["+(i+1)+" "+(j+1)+"] de la matriz"));
            }
        }
        
        // Imprimir matriz
        
        String resultado = "";
        
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                resultado += matriz[i][j];
                resultado += " ";
            }
            resultado += "\n"; 
        }
        
        JOptionPane.showMessageDialog(null,resultado);
        
    }
    
    public static void crear_matriz(int numero) {
        
        if(numero == 1){nf=3; nc =3; }
        if(numero == 2){nf=4; nc =4; }
        if(numero == 3){nf=5; nc =5; }
        
    }
    
}
