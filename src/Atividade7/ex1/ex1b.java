package Atividade7.ex1;
import java.util.ArrayList;
import java.util.Iterator;


public class ex1b {
    public static void main(String[] args) {




        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(-1);
        lista.add(3);
        lista.add(3);

        System.out.println("digite as coisas");


            Iterator it = lista.iterator();
            while (it.hasNext()){
                Integer s = (Integer) it.next();
                System.out.println("os elementos são" + s);
                if(s<0) {
                    break;
                }
            }




    }}