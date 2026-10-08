// clase
public class MainBasic {
    //metodo main
    public static void main(String[] args){
        // Strings, mensajes/caracteres
        String msgFinal = "Bye";
        String msgSaludo = "Hola mundo!";
        String msgFor = "Me repito?";
        String msgWhile = "Dando vueltas...!";
        // boolean, verdadero o falso
        boolean print = false;
        // int, numeros enteros
        int contador;
        int repeticionFor = 10;
        int repeticionWhile = 7;
        //double, incluye decimales

        // if revisa condiciones, sino cumple va a else
        if (print) {
            System.out.println(msgFinal);
        }else{
            System.out.println(msgSaludo);
        }
        System.out.println(msgFinal);

        // for, segun las condiciones, repite la acion varias veces, asigna un contador y lo va modificando
        for (int i = 0; i < repeticionFor; i++) {
            System.out.println(msgFor);
        }

        // while, repite ciclos x veces
        contador = 0;
        while (repeticionWhile != 0) { 
            System.out.println(msgWhile);
            // contador = contador + 1; es lo mismo
            contador++;
            repeticionWhile--;
        }
        System.out.println("Contador vale: " + contador);
    }
}
