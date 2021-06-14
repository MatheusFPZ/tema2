package Atividade3.ex1;

import java.util.Scanner;

public class g {





        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            String n="";
            System.out.printf("Digite os caracteres: ");
            n = ler.nextLine();
            n = n.toLowerCase();

            StringBuilder sb =new StringBuilder();
            for(int i=n.length()-1;i>=0;i--){
                sb.append(n.charAt(i));
            }
            if(n.equals(sb.toString())){
                System.out.println("É palindromo");
            }else
                System.out.println("N é um palindromo");

        }
}
