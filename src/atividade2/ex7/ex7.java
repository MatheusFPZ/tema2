package atividade2.ex7;

import java.util.Scanner;
class ClasseScanner {
    public class ex7 {
        public static void main(String[] args) {
            int []vt1=new int[10];

            Scanner scan = new Scanner(System.in);

            int num=0;
            int posicao = -1;

            do {
                System.out.println("digite os numero");
                num= scan.nextInt();

                posicao = -1;

                if (num > 0) {
                    for (int i = 0; i < 10; i++) {
                        if (num == vt1[i]) {
                            posicao = i;
                            break;
                        }
                    }

                    if (posicao >= 0) {
                        System.out.println("esta na posicao:%d\n" +posicao);
                    } else {
                        System.out.println("O número fornecido não existe no vetor!");
                    }
                }
            } while (num >= 0);


        }
    }


}








