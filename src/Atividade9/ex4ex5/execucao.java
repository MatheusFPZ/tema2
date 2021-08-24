package Atividade9.ex4ex5;

public class execucao {

    public static void main(String[]args){

        Data pfilme1 = new Data(24, 06, 2022);
        horario phora1 = new horario(14, 06,00);

        Data pfilme2 = new Data(26, 05, 2022);
        horario phora2 = new horario(12, 04,05);

        Data nasc1= new Data(30,10,2015);
        Data nasc2= new Data(01,05,2012);
        Data nasc3= new Data(23,07,2010);
        Data nasc4= new Data(14,12,2005);

        float valordaentrada = (float) 20.00;

        EntradaDeCinema ent1 = new EntradaDeCinema(pfilme1, phora1, 1, 20);
        ent1.CalculaDesconto(nasc1);
        ent1.CalculaDescontohorario();
        System.out.println(ent1);

        EntradaDeCinema ent2 = new EntradaDeCinema(pfilme2, phora2, 2, 20);
        ent2.CalculaDesconto(nasc2, 123);
        ent2.CalculaDescontohorario();
        System.out.println(ent2);






    }

}
