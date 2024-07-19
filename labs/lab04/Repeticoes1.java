package lab04;
import java.util.Scanner;

public class Repeticoes1 {
    // java lab04/Repeticoes1.java
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        var contador = 1;
        var numero = input.nextInt();
        while (contador < 10) {
            System.out.println(numero);
            contador += 1;
        }
    }
}
