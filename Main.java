import java.util.Scanner;

public class Main {
    static void Loginn() {
        Scanner login1 = new Scanner(System.in);
        System.out.println("Entre com o Usuário:");
        String user = login1.nextLine();
        System.out.println("Entre com a Senha:");
        int senha = login1.nextInt();
        if ((user.contains("carlinda")) && (senha == 3456)) {
            System.out.println("Logado!");
        } else {
            System.out.println("Usuário não autorizado.");
        }
        login1.close();
    }

    static void Mediat() {
        Scanner media4 = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        Float nota1 = (media4.nextFloat());
        System.out.println("Digite a segunda nota:");
        Float nota2 = (media4.nextFloat());
        System.out.println("Digite a terceira nota:");
        Float nota3 = (media4.nextFloat());
        System.out.println("Digite a quarta nota:");
        Float nota4 = (media4.nextFloat());
        Float mediafinal = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média final das quatro notas é: " + mediafinal);
        media4.close();
    }

    static void Bemvindo() {
        System.out.println("Seja bem-vindo!");
    }

    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("1 - Login");
        System.out.println("2 - Média de 4 notas");
        System.out.println("3 - Seja bem-vindo");
        System.out.println("4 - Velocidade média");
        System.out.println("Escolha o que deseja fazer: ");
        int escolher = usuario.nextInt();
        switch (escolher) {
            case 1:
                Loginn();
                break;
            case 2:
                Mediat();
                break;
            case 3:
                Bemvindo();
                break;
            case 4:
        }

        usuario.close();
    }
}
