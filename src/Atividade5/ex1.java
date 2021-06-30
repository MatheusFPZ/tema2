package Atividade5;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex1 {
    public static void main(String[]args){
        String telefonec = "(12)99999-9999";
        String telefone = "(12)9999-9999";

        String tel1 = "[()0-9]{4}+[0-9]{5}+[-]+[0-9]{4}$";
        String tel2 = "[()0-9]{4}+[0-9]{4}+[-]+[0-9]{4}$";

        Pattern padrao1 = Pattern.compile(tel1);
        Pattern padrao2 = Pattern.compile(tel2);


        Matcher match = padrao1.matcher(telefonec);
        Matcher match2 = padrao2.matcher(telefone);

        if(match.find()==true){
            System.out.println("padrao encontrado");
            System.out.println("telefone_celular"+telefonec.substring(match.start(),match.end()));

        }else{
            System.out.println("padrao nao encontrado");
        }



        if(match2.find()==true){
            System.out.println("padrao encontrado");
            System.out.println("telefone"+telefone.substring(match.start(),match.end()));
        }else{
            System.out.println("padrao nao encontrado");


        }


    }

}

