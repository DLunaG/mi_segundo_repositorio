import java.util.Scanner;

public class Factorial {

        public static void main(String[] args) {
            int contador = 1;
            int resultado = 1;
            int valor;

            Scanner s = new Scanner(System.in);
            System.out.println("Introduce el nº del factorial que quieras hayar: ");
            valor = s.nextInt();

            while(contador<=valor){
                resultado = resultado * contador;
                contador++; //contador = contador + 1;
            }

            System.out.println("El factorial de "+valor+" es: "+resultado);


        }
}

