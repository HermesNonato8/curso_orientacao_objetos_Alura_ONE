package Exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR"));

        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int anoDeLançamento = leitura.nextInt();
        System.out.println("Digite sua avaliação para o filme:");

        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLançamento);
        System.out.println(avaliacao);

        leitura.close();

    }
}
