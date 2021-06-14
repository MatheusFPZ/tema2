package Atividade3.ex1;

import java.util.Scanner;




    public class d {


        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            String n = "";
            System.out.printf("Digite os caracteres: ");
            n = ler.nextLine();




            if(n.toLowerCase().startsWith("uni")){
                System.out.println("Inicia com Uni");
            }else
                System.out.println("Não inicia com uni");
        }


        }



