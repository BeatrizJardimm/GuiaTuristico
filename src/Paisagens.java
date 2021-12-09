import java.util.Scanner;

public class Paisagens extends Main{

    Scanner ler = new Scanner(System.in);

    public void urbano(){

        int tipoUrbano;

        System.out.println();
        System.out.println("Você prefere áreas mais agitadas ou mais tranquilas?");
        System.out.println("1- Agitadas.");
        System.out.println("2- Tranquilas.");
        System.out.print("Entre com um número: ");
        tipoUrbano = ler.nextInt();

        if (tipoUrbano == 1){
            System.out.println();
            System.out.println("No Paraná, temos muitas cidades de grande porte como Curitiba, Londrina e Maringá " + '\n' +
                                "que contam com vários shoppings, bares, clubes, parques aquáticos e estádios.");
        } else if(tipoUrbano == 2){
            System.out.println();
            System.out.println("Em Foz do Iguaçu, temos o Parque das Aves, a Mesquita Omar Ibn Al-Khatab e o Templo Budista Chen Tien." + '\n' +
                                "Em Cutitiba temos vários parques e o Zológico Municipal, além de museus como o Oscar Niemeyer e o Museu Egípcio e Rosacruz -Tutankhamon." + '\n' +
                                "Além disso em Paranaguá temos o Aquário Marinho e em Guaratuba o Morro do Cristo.");
        } else {
            System.out.println();
            System.out.println("Entre com um número válido");
        }

    }

    public void natural(){

        int tipoNatural;

        System.out.println();
        System.out.println("Você prefere áreas litorâneas ou interiores?");
        System.out.println("1- Litoral.");
        System.out.println("2- Interior.");
        System.out.print("Entre com um número: ");
        tipoNatural = ler.nextInt();

        if (tipoNatural == 1){
            System.out.println();
            System.out.println("No Paraná, temos cidades litorâneas mais agitadas, como Guaratuba, Matinhos, Caiobá e Paranaguá," + '\n' +
                                " e áreas mais pacatas, como Shangri-lá e a famosa Ilha do Mel.");
        } else if(tipoNatural == 2){
            System.out.println();
            System.out.println("Em Foz do Iguaçu temos as Cataratas do Iguaçu, em Ponta Grossa temos o Buraco do Padre e o Parque Vila Velha." + '\n' +
                                "Além disso em Tibagi existe o belo Canion Guartela e em Prudentópolis existem várias cachoeiras." + '\n' +
                                "Já, se você procura belas paisagens durante sua viagem, recomendamos a Estrada da Graciosa que liga Curitiba às cidades de Morretes e Antonina.");
        } else {
            System.out.println();
            System.out.println("Entre com um número válido");
        }

    }

}
