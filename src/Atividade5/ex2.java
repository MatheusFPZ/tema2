package Atividade5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex2 {
    public static void main(String[]args){
        String site = "http://www.asd.com.br";

        String verificacao = "[htp]{4}+://[a-z]{3}.+[a-z].+[a-z].+[a-z]$";


        Pattern padrao1 = Pattern.compile(verificacao);



        Matcher match = padrao1.matcher(site);


        if(match.find()==true){
            System.out.println("padrao encontrado");
            System.out.println("site "+site.substring(match.start(),match.end()));

        }else{
            System.out.println("padrao nao encontrado");
        }
    }
}

