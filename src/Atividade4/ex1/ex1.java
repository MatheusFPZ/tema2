package Atividade4.ex1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String b;

        System.out.println("Digite uma frase");
        b=ler.nextLine();

        String[] a= b.split(" ");


        for( int i=a.length -1; i>=0; i--) {

            System.out.println(a[i]);
            System.out.println("");
        }







}}