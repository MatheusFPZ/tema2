package Atividade9.ex6;

import java.util.ArrayList;

public class escola {
    ArrayList<curso>listacurso = new ArrayList<>();

    public int reprovados(){
        int quantidade = 0;
            for(curso c : listacurso){

                    quantidade= quantidade+ c.qreprovados();
                }
        return quantidade;
            }

            public int maiorreceita(){
        float maior = 0;
        curso cmaior = null;
        for(curso c : listacurso){
            if(c.receita()>maior){
                maior=c.receita();
                cmaior = c;
            }
        }
        return cmaior.getCodigo();

        }
    @Override
    public String toString() {
        String s = "";
        for (curso c : listacurso) {
            s = s + c.toString() + "\n";

        }
        return s;
    }


}





