package Atividade3.ex3;

import java.util.Scanner;

public class d {


        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            String n ="";
            String[]nomes= new String[10];
            System.out.println("Digite os caracteres: ");
            n = ler.nextLine();
            int inicio=0;
            int fim=0;
            int cont=0;
            char nome;
            char abreviatura;

            while(fim<n.length()) {
                fim = n.indexOf('',inicio);
                if (fim == -1) {
                    fim = n.length();
                }

                nomes[cont] = n.substring(inicio, fim);
                inicio = fim + 1;
                cont = cont + 1;
            }
            StringBuilder abreviatura= new StringBuilder();
                    for(int i=0; i<cont;i++) {
                        if (!nomes[i].equals("e")
                                && !nomes[i].equals("do")
                                && !nomes[i].equals("da")
                                && nomes[i].equals("dos")
                                && !nomes[i].equals("das")
                                && !nomes[i].equals("de")
                                && !nomes[i].equals("di")
                                && !nomes[i].equals("du")){
                            abreviatura.append(nomes[i].charAt(0));
                        }


                    }
                    System.out.println("Nome original"+n);
                System.out.println("Nome original"+abreviatura);





        }


    }









