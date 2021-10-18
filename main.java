import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,resultado = 0;

        System.out.println("Escriba un numero");
        a = sc.nextInt();

        System.out.println("Ingresa otro numero");
        b = sc.nextInt();

        resultado = a+b;
        System.out.println("El resultado es "+ resultado);
    }
}