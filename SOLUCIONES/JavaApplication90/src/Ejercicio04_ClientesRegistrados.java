import java.util.Scanner;
public class Ejercicio04_ClientesRegistrados {
    public static void main(String[] args) {
        Scanner tcl = new Scanner (System.in);
        String clientenom, clienteap, cedula;
        int valorkw, kw, k =0, opcion;
        double valorinm;
        System.out.println("Ingrese su nombre y apellido: ");
        clientenom = tcl.next();
        clienteap = tcl.next();
        System.out.println("Ingrese la cedula: ");
        cedula = tcl.next();
        System.out.println("Seleccione una opcion : ");
        System.out.println("1. Calcular el valor de luz");
        System.out.println("2. Calcular el valor de el inmueble");
        opcion = tcl.nextInt();
        while (k == 0) {            
            if (opcion == 1) {
                System.out.println("Ingrese el valor por KW: ");
                valorkw = tcl.nextInt();
                System.out.println("Ingrese los KW consumidos: ");
                kw = tcl.nextInt();
                System.out.println("Cliente " + clientenom + clienteap + " con cédula " + cedula + " debe cancelar el valor de $" + calcularValorLuz(valorkw, kw));
                k = 1;
            }
            else if (opcion == 2){
                System.out.println("Ingrese el valor de el inmueble: ");
                valorinm = tcl.nextDouble();
                System.out.println("Cliente " + clientenom + clienteap + " con cédula " + cedula + " tiene un bien inmueble valorado en $" + valorinm + " y tiene que pagar de predio $" + calcularPredio(valorinm));
                k = 1;
            }
            else
                System.out.println("Sselecione una opcion");
        }
    }
    public static int calcularValorLuz (int valorkw, int kw){
        return (valorkw*kw);
    }
    public static int calcularPredio (double valorinm){
        return (int) (valorinm * 0.2);
    }
}

