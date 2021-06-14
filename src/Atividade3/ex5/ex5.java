package Atividade3.ex5;
import java.util.Scanner;
public class ex5 {

    public static void main(String[] args) {

        Scanner ler= new Scanner(System.in);





        int posicao=0;

        StringBuilder texto = new StringBuilder();
        while(posicao<texto.length()){
            System.out.println("Digite as palavras");
            texto=ler.nextLine();
            posicao=texto.indexOf(" ", posicao);

        if(posicao==-1){
            posicao=texto.length();

        }else{
            Character espaco = texto.charAt(posicao-1);
            if(espaco.equals(' ')){
                texto.deleteCharAt(posicao);
            }else{
                    posicao++;
            }

        }





        }

        System.out.println(texto);




    }




}
