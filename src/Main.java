import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Paisagens paisagens = new Paisagens();

        int tipoPaisagem;

        System.out.println("Seja bem-vindo ao nosso Guia Turístico do Estado do Paraná!");

        System.out.println();

        System.out.println("Primeiramente, precisamos saber se você prefere paisagens urbanas ou naturais.");
        System.out.println("1- Urbanas.");
        System.out.println("2- Naturais.");
        System.out.print("Entre com um número: ");
        tipoPaisagem = ler.nextInt();

        if (tipoPaisagem== 1){
            paisagens.urbano();
        } else if (tipoPaisagem== 2){
            paisagens.natural();
        } else {
            System.out.println();
            System.out.println("Entre com um número válido");
        }

    }

}
