package Atividade9.ex6;

import java.util.ArrayList;

public class curso {
    private int codigo;
    private int quantidade;
    private int valor;
    ArrayList<aluno> listaaluno = new ArrayList<>();


    public curso(int codigo, int quantidade, int valor) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }


    public void addaluno(aluno a) {
        this.listaaluno.add(a);
    }

    public int qaprovados() {
        int quantidade = 0;
        for (aluno a : listaaluno) {
            if (a.getNotafinal() >= 7) {
                quantidade++;
            }
        }

        return quantidade;

    }

    public int qreprovados() {
        int quantidade = 0;
        for (aluno a : listaaluno) {
            if (a.getNotafinal() < 7) {
                quantidade++;
            }
        }

        return quantidade;

    }

    public float receita() {
        return (float) (listaaluno.size() * this.valor);


    }

    @Override
    public String toString() {
        String s = "Curso" + this.getCodigo();
        s = s + "\nReceita total: " + this.receita();
        s = s + "\nNotas:\n";
        for (aluno a : listaaluno) {
            s = s + a.toString() + ";\n";
        }
    return s;
    }
}

