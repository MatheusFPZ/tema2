package Atividade7.ex1;


import java.util.ArrayList;



public class ex2 {
    public static void main(String[] args) {




        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(-1);
        lista.add(4);
        lista.add(6);

        System.out.println("digite as coisas");
        for (Integer s: lista) {
            System.out.println("os elementos são" + s);
            if(s<0) {
                break;
            }
        }

    }}
