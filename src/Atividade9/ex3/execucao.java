package Atividade9.ex3;

public class execucao {
    public static void main(String[]args) {
        pessoa p1 = new pessoa("Marcia", null, null);
        pessoa p2 = new pessoa("Taina",null, null);
        pessoa p3 = new pessoa("Marcos", null, null);
        pessoa p4 = new pessoa("Cristian",null, null);


        pessoa p5 = new pessoa("Tereza", p1, null);
        pessoa p6 = new pessoa("Carla",p1, p2);
        pessoa p7 = new pessoa("Brendo", p3,p4);
        pessoa p8 = new pessoa("Lucas",p3,p4);


        System.out.println ("p1 é igual a p3?");
        boolean resposta = p1.ehamsmpessoa(p3);
        System.out.println(resposta);


        System.out.println ("p1 é irma(o) de p3?");
        boolean resposta2 = p1.ehirma(p3);
        System.out.println(resposta2);


    }
}
