import java.util.Scanner;

public class Exercicio1for {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Digite o valor inicial: ");
        int inicial = usuario.nextInt();
        int fim = inicial + 200;
        System.out.println("");
        for (; inicial <= fim; inicial = inicial + 2) {
            System.out.println(inicial);
            usuario.close();
        } 
    } 
}
