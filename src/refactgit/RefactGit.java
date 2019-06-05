
package refactgit;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabian y Carlos
 */
public class RefactGit {

   //modificacion en nombre de variable
    static int Numero_Fila=0;
    static int nc =0;
    static int columna =0;
    
    public static void main(String[] args) {
       
        
        columna= Integer.parseInt(JOptionPane.showInputDialog("Desea realizar la matriz: \n1: Matriz de 3 \n2: Matriz de 4 \n3: Matriz de 5"));
        
        
        crear_matriz(columna);
        
        int matriz[][] = new int[Numero_Fila][nc];
        
        // LLenar matriz
        for (int i = 0; i < Numero_Fila; i++) {
            for (int j = 0; j < nc; j++) {
                 matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion ["+(i+1)+" "+(j+1)+"] de la matriz"));
            }
        }
        
        // Imprimir matriz
        
        String resultado = "";
        
        for (int i = 0; i < Numero_Fila; i++) {
            for (int j = 0; j < nc; j++) {
                resultado += matriz[i][j];
                resultado += " ";
            }
            resultado += "\n"; 
        }
        
        JOptionPane.showMessageDialog(null,resultado);
        
    }
    
    public static void crear_matriz(int numero) {
        
        if(numero == 1){Numero_Fila=3; nc =3; }
        if(numero == 2){Numero_Fila=4; nc =4; }
        if(numero == 3){Numero_Fila=5; nc =5; }
        
    }
    
}
