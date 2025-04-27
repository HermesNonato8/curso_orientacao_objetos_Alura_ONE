//?

public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Essse é o Screan Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de laçamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //Média
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galão dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        //casting
        int classificacao = (int) (media / 2);
        System.out.println(classificacao);



        /*
        String saudacao = "Olá, meu nome é ";
        String nome = "Alice ";
        String continuacao = "e minha idade é ";
        int idade = 17;
        System.out.println(saudacao + nome + continuacao + idade);
        */

        //exemplo de casting
        double num1 = 10.2;
        int num2 = 10;

        int resultadoSoma = (int) (num1 + num2);

        System.out.println(resultadoSoma);

        int numTeste = (int) 3.9;
        System.out.println(numTeste);

        System.out.println(resultadoSoma + 2 + 0.2);


    }
}