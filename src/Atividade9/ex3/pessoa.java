package Atividade9.ex3;

import java.util.ArrayList;

public class pessoa {
    private String nome;
    private pessoa pai;
    private pessoa mae;

    public pessoa(String nome, pessoa pai, pessoa mae){
        this.nome=nome;
        this.pai=pai;
        this.mae=mae;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public pessoa getPai() {
        return pai;
    }

    public void setPai(pessoa pai) {
        this.pai = pai;
    }

    public pessoa getMae() {
        return mae;
    }

    public void setMae(pessoa mae) {
        this.mae = mae;
    }

    public boolean ehamsmpessoa(pessoa outrapessoa) {
        if (this.nome.equals(outrapessoa.getNome()) && this.mae.equals(outrapessoa.getMae())) {
            return true;
        } else {
            return false;
        }
    }
        public boolean ehirma(pessoa outrapessoa){
            if(this.mae.equals(outrapessoa.getMae())&&this.pai.equals(outrapessoa.getPai())){
                return true;
            }else{
                return false;
            }



    }

        public boolean antecessor(pessoa outrapessoa){
        boolean status=false;

        if(outrapessoa== this.mae ||
                outrapessoa==this.pai){
            return  true;
        }else{
        status = this.mae.antecessor(outrapessoa);
        if(status ==false){
            status= this.pai.antecessor(outrapessoa);
        }
        }


        return status;
        }



}
