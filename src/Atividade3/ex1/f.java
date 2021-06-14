import java.util.Scanner;

public class f {




        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            String n="";
            System.out.printf("Digite os caracteres: ");
            n = ler.nextLine();
            n = n.toLowerCase();
            int contd=0;



            for(int i = 0; i < n.length(); i++){

                if(Character.isDigit(n.charAt(i))) {
                    contd++;

                }
            }
            System.out.printf("Numero de digitos +"+contd);

        }


    }








