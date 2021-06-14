package Atividade3.ex1;
import java.util.Scanner;
public class e {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String n = "";
        System.out.printf("Digite os caracteres: ");
        n = ler.nextLine();




        if(n.toLowerCase().endsWith("rio")){
            System.out.println("Termina com rio");
        }else
            System.out.println("Não termina com rio");
    }



}
