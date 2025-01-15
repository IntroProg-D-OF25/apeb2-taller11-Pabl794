public class Ejercicio05_Calculadora_Matriz {
     public static void main(String[] args) {
        int matriz [][]= new int [3][3];
        genmatriz(matriz);
        System.out.println("Matriz: ");
        System.out.println("");
        presentarmatriz(matriz);
        System.out.println("");
        System.out.println("Suma de valores: ");
        System.out.println("");
        System.out.println(sumaMatriz(matriz));
        System.out.println("");
        System.out.println("Resta de valores: ");
        System.out.println("");      
        System.out.println(restaMatriz(matriz));
        System.out.println("");
        System.out.println("Multiplicacion de valores: ");
        System.out.println("");
        System.out.println(multiplicacionMatriz(matriz));
    }
    public static void genmatriz (int matriz [][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz [i][j] = (int)((Math.random()*10) + 1 );
            }
        }  
    }
    public static void presentarmatriz (int matriz [][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }  
    }    
    public static int sumaMatriz (int matriz [][]){
        int sumaTM = 0; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaTM += matriz [i][j];
            }
        }        
        return sumaTM;
   }
    public static int restaMatriz (int matriz [][]){
        int restaTM = 0; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                restaTM -= matriz [i][j];
            }
        }        
        return restaTM;
   }
    public static int multiplicacionMatriz (int matriz [][]){
        int multTM = 1; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                multTM *= matriz [i][j];
            }
        }        
        return multTM;
   }
}

