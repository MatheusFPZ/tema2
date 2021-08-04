package Atividade9.ex1eex2;

import java.util.ArrayList;
public class execucao {
    public static void main (String[] args){
        pais p1 = new pais("BRA", "BRASIL", 1000.1,101);
        pais p2 = new pais("ARG", "ARGENTINA", 1000.2,102);
        pais p3 = new pais("URU", "URUGUAI", 1000.3,103);
        pais p4 = new pais("EQU", "EQUADOR", 1000.4,104);
        pais p5 = new pais("BOL", "BOLIVIA", 1000.5,105);

        p1.paisfronteira.add(p2);
        p1.paisfronteira.add(p3);
        p1.paisfronteira.add(p5);
        p2.paisfronteira.add(p1);
        p2.paisfronteira.add(p3);
        p2.paisfronteira.add(p5);
        p3.paisfronteira.add(p1);
        p3.paisfronteira.add(p2);
        p5.paisfronteira.add(p1);
        p5.paisfronteira.add(p2);

        System.out.println("p1 é igual ao p2?");
        boolean resposta= p1.msmpais(p2);
        System.out.println(resposta);

        System.out.println("Argentina faz fronteira com o Brasil?");
        resposta= p2.limita(p1);
        System.out.println(resposta);

        System.out.println("Paises que fazem fronteira com o Brasil e com a Argentina:");
        ArrayList<pais> comuns = p1.vizinhos(p2);
        for(pais p : comuns){
            System.out.println(p.getNome());
        }
        continente america = new continente("america");
        america.addpais(p1);
        america.addpais(p2);
        america.addpais(p3);
        america.addpais(p4);
        america.addpais(p5);

        System.out.println("população total do continente:" + america.popcontinente());
        System.out.println("Dimensão total do continente:" + america.dimensaocontinente());
        System.out.println("menor pais em dimensão do continente:" + america.menordimen().getNome());
        System.out.println("maior pais em dimensão do continente:" + america.maiordimen().getNome());
        System.out.println("Densidade populacional do continente:" + america.denspop());

    }



}
