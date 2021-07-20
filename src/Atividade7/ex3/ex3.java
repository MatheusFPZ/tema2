package Atividade7.ex3;
import java.util.ArrayList;
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;
        Scanner lernomeetel = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>(String);

    System.out.println("Digite as seguintes opções: 1 – cadastrar; 2 – listar; 3 – remover");
        n=ler.nextInt();

        for (int i = 0; i < lista.size(); i++) {

            String s= lista.get(i);
        if(n==1) {
        System.out.println("Digite um nome e telefone");

        lista=lernomeetel.next();
        lista.toString();
        System.out.println("dada"+lista);
    }
        if(n==2) {

        }
        if(n==3) {

        }

}}
