package Atividade6.ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collections;
public class ex4 {
    public static void main(String[] args) {


            ArrayList<String> nomes = new ArrayList<String>();



            nomes.add("Carlos");
            nomes.add("Joana");
            nomes.add("Tamila");
            nomes.add("Tamila");
            nomes.add("Ana");


            Collections.sort(nomes);
            for (String nome : nomes) {
                System.out.println(nome);

            }
        }
    }


