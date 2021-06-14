package Atividade3.ex1;

import java.util.Scanner;

public class c {


    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String n = "";
    System.out.printf("Digite os caracteres: ");
    n = ler.nextLine();
    n = n.toLowerCase();

    int contador=0;

    for(int i=0; i<n.length();i++){
    char c =n.charAt(i);

        if(c== 'a' || c== 'e'|| c== 'o'|| c== 'u'|| c== 'a'){
            contador++;
        }
    }
        System.out.printf("O numero de vogais é: "+contador);




}

