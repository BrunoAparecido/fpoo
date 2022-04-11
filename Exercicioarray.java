import java.util.Scanner;

 public class Exercicioarray {
     public static void main(String[] args) {
         Scanner usuario = new Scanner(System.in);
         int quantNotas;
         System.out.println("Entre com a quantidade de notas:");
         quantNotas = usuario.nextInt();
         double[] notas = new double[quantNotas];
         for (int i = 0; i < quantNotas; i++) {
             System.out.println("Entre com a nota:");
             notas[i] = usuario.nextDouble();
         }
         double total = 0;
         for (int j = 0; j < notas.length; j++) {
             total = total + notas[j];
         }
         total = total/quantNotas;
         System.out.println("A média será:" + total);
         usuario.close();
     }
 }