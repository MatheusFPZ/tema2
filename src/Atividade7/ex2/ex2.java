package Atividade7.ex2;
import java.util.ArrayList;



public class ex2 {
    public static void main(String[] args) {




        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(1);
        lista.add(3);
        lista.add(4);
        lista.add(4);
        lista.add(4);
        lista.add(7);
        lista.add(3);





        for (int i = 0; i < lista.size(); i++) {

            Integer s= lista.get(i);

            System.out.println("os elementos são" + s);


            if(s%2==0){
                lista.clear();
                System.out.println("os elementos são" + s);
            }


        }}}