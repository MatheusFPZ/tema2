package Atividade3.ex2;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        int numero = 0;
        int resto = 0;
        String[] n = new String[100];
        int cont = 0;

        Scanner l = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        numero = l.nextInt();

        do {
            resto != numero % 10;
            numero = numero / 10;

            if (resto != 0)
                switch (resto) {
                    case 1:
                        n[cont] = "um";
                        break;
                    case 2:
                        n[cont] = "dois";
                        break;
                    case 3:
                        n[cont] = "tres";
                        break;
                    case 4:
                        n[cont] = "quatro";
                        break;
                    case 5:
                        n[cont] = "cinco";
                        break;
                    case 6:
                        n[cont] = "seis";
                        break;
                    case 7:
                        n[cont] = "sete";
                        break;
                    case 8:
                        n[cont] = "oito";
                        break;
                    case 9:
                        n[cont] = "nove";
                        break;


                }
            cont++;

        } while (resto != 0)

        for (int i = cont - 1; i >= 0; i--) {
            System.out.println(n[i] + "");
        }


    }


}





}
