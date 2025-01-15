import java.util.Scanner;
public class Ejercicio02_FigurasGeometricas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner (System.in);
        int h = 0, i =0, opcionarea, base, altura;
        do {            
            do {            
                System.out.println("SELECCIONE UNA OPCION: ");
                System.out.println("1. Area de un cuadrado");
                System.out.println("2. Area de un triangulo");
                System.out.println("3. Area de un rectangulo");
                opcionarea = tcl.nextInt();
                switch (opcionarea)  {
                    case 1:
                        System.out.println("Ingrese la base: ");
                        base = tcl.nextInt();
                        System.out.println("Area de el cuadrado: " + obtenerAreaCuadrado(base));
                        h = 1;
                        break;
                    case 2:
                        System.out.println("Ingrese la base y la altura: ");
                        base = tcl.nextInt();
                        altura = tcl.nextInt();
                        System.out.println("Area de un triangulo: " + obtenerAreaTriangulo(base, altura));                    
                        h = 1;
                        break;
                    case 3:
                        System.out.println("Ingrese la base y la altura: ");
                        base = tcl.nextInt();
                        altura = tcl.nextInt();
                        System.out.println("Area de un rectangulo: " + obtenerAreaRectangulo(base, altura));                    
                        h = 1;
                        break;
                    default:
                        System.out.println("____________________________");
                        System.out.println("Ingrese la opcioon correcta");
                        System.out.println("----------------------------");
                        System.out.println("");
                }
            }  while (h == 0);
            System.out.println("Quieres intentar de nuevo");
            System.out.println("1. SI / 2. NO");
            i = tcl.nextInt();
            System.out.println("------------------");
        } while (i == 0);
    }
    public static int obtenerAreaCuadrado(int base) {
        return (base * base);
    }
    public static int obtenerAreaTriangulo(int base, int altura) {
        return ((base * altura) / 2);
    }
    public static int obtenerAreaRectangulo(int base, int altura) {
        return (base * altura);
    }
}

