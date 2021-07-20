package Atividade7.ex1;
import java.util.ArrayList;



public class ex1 {
    public static void main(String[] args) {




        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(-1);
        lista.add(3);
        lista.add(3);

        System.out.println("digite as coisas");
        for (int i = 0; i < lista.size(); i++) {

            Integer s= lista.get(i);

            System.out.println("os elementos são" + s);
        if(s<0) {
            break;
        }
        }

    }}