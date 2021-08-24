package Atividade9.ex6;

import javax.net.ssl.SSLContext;

public class execucao {

    public static void main(String[]args) {
        curso c1 = new curso(01,5, 600);
        curso c2 = new curso(02,5, 800);
        curso c3 = new curso(03,5, 400);

    escola e = new escola();
    e.listacurso.add(c1);
    e.listacurso.add(c2);
    e.listacurso.add(c3);

    for(curso c : e.listacurso){
        for(int i =0; i<5; i++){
            c.addaluno(new aluno(   Math.random()*10));
        }


    }
    System.out.println("quantidade de alunos aprovados ");
    for(curso c : e.listacurso){
        System.out.println("Curso"+ c.getCodigo()+ c.qaprovados());

    }
        System.out.println("Quantidade de reprovados "+ e.reprovados());
        System.out.println("Maior receita "+ e.maiorreceita());




    }
}
