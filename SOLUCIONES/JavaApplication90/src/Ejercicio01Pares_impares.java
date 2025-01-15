import java.util.Scanner;
public class Ejercicio01Pares_impares {
    public static void main(String[] args) {
        int limFil = 0, limCol = 0;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Deme el limitr de las filas y el limite de las Columnas:");
        limFil = tcl.nextInt();
        limCol = tcl.nextInt();
        int Matriz [][] = new int [limFil][limCol];
        generarMatriz(Matriz);
        presentarMatriz(Matriz);
        System.out.println("Elementos pares e matriz");
        presentarParesMatriz(Matriz);
        System.out.println("Elementos inpares e matriz");
        presentarInparesMatriz(Matriz);
        System.out.println("promedio de la matriz : " + presentarPromedioMatriz(Matriz));
    }
    public static double presentarPromedioMatriz (int Matriz[][]) {
        int sumaMatriz = 0;
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                sumaMatriz = sumaMatriz + Matriz[i][j];
                
            }
            
        }
        return (sumaMatriz / (Matriz.length * Matriz[0].length));
    }
     public static void presentarInparesMatriz (int Matriz[][]) {
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                if(Matriz[i][j]%2 != 0)
                    System.out.print(Matriz[i][j]+ " ");
                
            }
            System.out.println("");
            
        }
    }
    public static void presentarParesMatriz (int Matriz[][]) {
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                if(Matriz[i][j]%2 == 0)
                    System.out.print(Matriz[i][j]+ " ");
                
            }
            System.out.println("");
            
        }
    }
    public static void generarMatriz (int Matriz[][]) {
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                Matriz[i][j]= (int) (Math.random() *10);
                
            }
            
        }
    }
    public static void presentarMatriz (int Matriz[][]) {
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                System.out.print(Matriz[i][j]+ " ");
                
            }
            System.out.println("");
        }
    }
    
}