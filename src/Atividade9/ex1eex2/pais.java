package Atividade9.ex1eex2;
import java.util.ArrayList;

public class pais {
    private String codigoiso;
    private String nome;
    private Integer populacao;
    private Double dimensao;

    public ArrayList<pais> paisfronteira = new ArrayList();

    public pais(String codigoiso, String nome, double dimensao, Integer populacao) {
        this.codigoiso = codigoiso;
        this.nome = nome;
        this.dimensao = dimensao;

    }

    public String getCodigoiso() {
        return codigoiso;
    }

    public void setCodigoiso(String codigoiso) {
        this.codigoiso = codigoiso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Integer populacao) {
        this.populacao = populacao;
    }

    public Double getDimensao() {
        return dimensao;
    }

    public void setDimensao(Double dimensao) {
        this.dimensao = dimensao;
    }



    public boolean msmpais(pais outropais) {
        if(this.codigoiso.equals(outropais.getCodigoiso())){
        return true;
    }else{
            return false;
        }
    }
    public boolean limita(pais outropais) {
        if (this.paisfronteira.contains(outropais)) {
            return true;
        } else {
            return false;
        }}

        public float densidadepop () {
            return (float) (this.populacao / this.dimensao);

        }
        public ArrayList<pais>vizinhos(pais outropais){
        ArrayList<pais>comuns = new ArrayList<>();
        for(pais p : this.paisfronteira){
            if(outropais.limita(p)){
                comuns.add(p);
            }
        }
        return comuns;
        }
            

}
