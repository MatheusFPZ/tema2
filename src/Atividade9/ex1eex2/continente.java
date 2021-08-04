package Atividade9.ex1eex2;

import java.util.ArrayList;

public class continente {
    public String nome;
    public ArrayList<pais>listapais = new ArrayList<>();

    public continente(String nome){
        this.nome = nome;
    }

    public void addpais(pais p){
        this.listapais.add(p);
    }
      public float dimensaocontinente(){
        float soma=0;
        for(pais p : this.listapais){
            soma= (float)(soma+ p.getDimensao());

        }
        return soma;
      }
    public int popcontinente() {
        int soma = 0;
        for (pais p : this.listapais) {
            soma = (int) (soma + p.getPopulacao());

        }
        return soma;
    }
    public float denspop(){
        return (float) this.popcontinente() / this.dimensaocontinente();

    }
    public pais maiorpop() {
    pais paismaiorpop= this.listapais.get(0);
    int maiorpop=0;

    for(int i=0; i<this.listapais.size(); i++){
        pais p = this.listapais.get(i);
        if(p.getPopulacao()> paismaiorpop.getPopulacao());
            paismaiorpop = p;

    }return paismaiorpop;
    }
    public pais menorpop() {
        pais paismenorpop= this.listapais.get(0);
        int menorpop=0;

        for(int i=0; i<this.listapais.size(); i++){
            pais p = this.listapais.get(i);
            if(p.getPopulacao()< paismenorpop.getPopulacao());
            paismenorpop = p;

        }return paismenorpop;
    }

    public pais maiordimen() {
        pais paismaiordimen= this.listapais.get(0);
        int maiordimen=0;

        for(int i=0; i<this.listapais.size(); i++){
            pais p = this.listapais.get(i);
            if(p.getPopulacao()>paismaiordimen.getPopulacao());
            paismaiordimen = p;

        }return paismaiordimen;
    }

    public pais menordimen() {
        pais paismenordimen= this.listapais.get(0);
        int menordimen=0;

        for(int i=0; i<this.listapais.size(); i++){
            pais p = this.listapais.get(i);
            if(p.getPopulacao()< paismenordimen.getPopulacao());
            paismenordimen = p;

        }return paismenordimen;
    }

    public float razao(){
        pais paismaior = this.maiordimen();
        pais paismenor = this.menordimen();

        return (float) (paismaior.getDimensao()/paismenor.getDimensao());
    }


}
