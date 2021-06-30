package Atividade5;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ex3 {
    public static void main(String[]args){
        String site = "Aa@bB#124324234";

        String verificacao = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$*&@#])[0-9a-zA-Z$*&@#]{8,}$";


        Pattern padrao1 = Pattern.compile(verificacao);



        Matcher match = padrao1.matcher(site);


        if(match.find()==true){
            System.out.println("senha forte");
            System.out.println("site "+site.substring(match.start(),match.end()));

        }else{
            System.out.println("senha fraca");
        }
    }

}
