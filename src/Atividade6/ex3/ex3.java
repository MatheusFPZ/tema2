package Atividade6.ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {


        ArrayList<String> nomes = new ArrayList<String>();
        Scanner ler = new Scanner(System.in);
        StringBuilder str=new StringBuilder();
        String n;
        for(nomes!= 3) {
            System.out.println("Digite os nomes:");
            n = ler.next();
            for (n:nomes) {
                str.append(n);
            }
            System.out.println(str);
        }

        //remover nome
        //if(n==nomes);
            //nomes.remove();
           // System.out.println("O nome foi removido");

            //limpar lista
           // if(n==("Clear"));
          //  nomes.clear();




        nomes.add("Carlos");
        nomes.add("Joana");
        nomes.add("Camila");
        nomes.add("Tamila");
        nomes.add("Ana");
        nomes.add("Lucas");
        nomes.add("Paula");
        nomes.add("Vanessa");
        nomes.add("Joao");






        }

}
