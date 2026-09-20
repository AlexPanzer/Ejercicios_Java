import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double suma = 0;
        double promedio = 0;
        int cantidad = 0;
        double numero = 0;
        int contador = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese cantidad de numeros");
        cantidad = teclado.nextInt();

        while (cantidad<=0) { 
            System.out.println("No sea pollo");
            System.out.println("Ingrese cantidad de numeros");
            cantidad = teclado.nextInt();
        }

        for (int i=0 ; cantidad>i ; i++) {
            System.out.println("Ingrese un numero: ");
            numero = teclado.nextDouble();
            suma = suma + numero;
            contador++;
        }
 
        promedio = suma / contador;
        System.out.println("El contador es: "+ contador + ", Promedio: "+ promedio);

    }    
}
