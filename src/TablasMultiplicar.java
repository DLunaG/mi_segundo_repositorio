import java.util.Scanner;

public class TablasMultiplicar {
    public static void main(String[] args) {
        int num;
        int cont = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el nº para hayar su tabla de multiplicar: ");
        num = s.nextInt();
        while(cont <= 10){
            System.out.println(num+" * "+cont+" = "+(num*cont));
            cont++;
        }
    }
}
