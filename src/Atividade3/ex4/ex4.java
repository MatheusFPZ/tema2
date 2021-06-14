
package Atividade3.ex4;
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        String n= "";
        int caracterest=0;
        int npalavras=0;
        int inicio=0;

        System.out.printf("Digite as palavras: ");
        n=ler.nextLine();
        while(inicio<n.length()) {

            inicio = n.indexOf(" ", inicio);

            if (inicio == -1) {
                npalavras++;
                inicio = n.length();


            } else {
                npalavras++;
                inicio = inicio + 1;
            }
        }
        caracterest=n.length();



        System.out.println("numero de palavras:"+npalavras);
        System.out.println("numero de caracteres:"+caracterest);




    }





}
