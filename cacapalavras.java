import java.util.Random;
import java.util.Scanner;

public class cacapalavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int linha = 0;
        int coluna = 0;
        int npalavras = 0;
        int i;
        int j;

        System.out.println("|====================================================================================|");
        System.out.println("|==>                                CAÇA-PALAVRAS                                 <==|");
        System.out.println("|====================================================================================|");
        System.out.println("|====================================================================================|");
        System.out.println("|REGRAS  1: O Maxímo de Letras por Palavras é 10                                     |");
        System.out.println("|        2: O Tamanho do Caça-Palavras tem que ser MAIOR que 10x10                   |");
        System.out.println("|====================================================================================|");

        while (npalavras < 1) {

            System.out.println("\nQuantas palavras quer encontrar? ");
            npalavras = sc.nextInt();

            if (npalavras < 1) {
                System.out.println("\n|=================================|");
                System.out.println("|Tem que ter no minimo UMA PALAVRA|");
                System.out.println("|=================================|");
            }
        }

        String[] palavras;
        palavras = new String[npalavras];

        for (i = 0; i < npalavras; i++) {
            System.out.println("Escreve a palavra " + (i + 1));
            palavras[i] = sc.next();
        }

        while (linha < 10) {

            System.out.println("\nEscreva a quantidades de linhas: ");
            linha = sc.nextInt();

            if (linha < 10) {
                System.out.println("\n|==============================|");
                System.out.println("|Linha tem que ser MAIOR que 10|");
                System.out.println("|==============================|");
            }
        }

        while (coluna < 10) {

            System.out.println("\nEscreva a quantidades de colunas: ");
            coluna = sc.nextInt();

            if (coluna < 10) {
                System.out.println("\n|================================|");
                System.out.println("|Coluna tem que ser MAIOR que 10|");
                System.out.println("|===============================|");
            }
        }

        char[][] matriz = new char[linha][coluna];
        char[] alfa = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S','T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (i = 0; i < linha; i++) {
            for (j = 0; j < coluna; j++)
                matriz[i][j] = alfa[(char) (Math.random() * 26)];
        }

        for(i = 0; i < linha; i++){
            int x = rd.nextInt(linha);
        }
            for(i = 0; i < coluna; i++){
            int y = rd.nextInt(coluna);
        }

        System.out.println("\nCAÇA PALAVRAS");

        for (i = 0; i < linha; i++) {
            System.out.print("\n");

            for (j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j]);
            }
        }
    }
}
// precisa incluir palavra na matriza 
