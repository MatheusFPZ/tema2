package Atividade8;


public class Funcionario {
    public String nome;
    double salario;
    String departamento;
    Data dataentrada;
    String rg;


    public void recebeAumento(double percentualaumento) {
        this.salario = this.salario + (this.salario * percentualaumento / 100);


    }

    public double calculaGanhoAnual() {
        return salario * 12;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        System.out.println("nome setado");
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        System.out.println("salario setado");
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        System.out.println("departamento setado");
        this.departamento = departamento;
    }

    public Data getDataentrada() {
        return dataentrada;
    }

    public void setDataentrada(Data dataentrada) {
        System.out.println("data da entrada setado");
        this.dataentrada = dataentrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        System.out.println("rg setado");
        this.rg = rg;}



    public void mostra(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Departamento: "+ this.departamento);
        System.out.println("Data de entrada: "+this.dataentrada);
        System.out.println("Rg: "+ this.rg);
        System.out.println("Salário: "+this.salario);
        System.out.println("Ganho anual: "+ this.calculaGanhoAnual());

        }
    }


