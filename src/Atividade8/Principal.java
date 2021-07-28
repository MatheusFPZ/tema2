package Atividade8;

public class Principal {
    public static void main(String[] args){
        Funcionario f1 = new Funcionario();
        Funcionario f2= new Funcionario();
        f1.setNome("Hugo");
        f1.setSalario(100);
        f1.setRg("5132769432");
        f1.setDepartamento("tecnico");
        Data d1=new Data();
        d1.dia = 10;
        d1.mes=6;
        d1.ano=2020;
        f1.setDataentrada(d1);

        f2.setNome("Hugo");
        f2.setSalario(100);
        f2.setRg("5132769432");
        f2.setDepartamento("tecnico");
        Data d2=new Data();

        d2.dia = 25;
        d2.mes=8;
        d2.ano=2021;
        f2.setDataentrada(d2);

        Funcionario f3=f1;

        if(f1==f3){
            System.out.println("objetos iguais");
        }else{
            System.out.println("objetos diferentes");
        }




        f1.mostra();

        f1.recebeAumento(20);

        System.out.println("Novo salário");
        f1.mostra();

    }
}














