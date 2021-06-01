package atividade2.ex9;

import java.util.Scanner;
public class ex9 {
    char nome[];
    double nd=0;
    double sb=0;
    double sl=0;
    double hrtrabalhadas=0;
    double desconto=0;

    do  {
        System.out.println("Digite seu nome(ou enter para parar:");
        Scanner in = new Scanner( System.in );
        System.out.println(in.nextLine());

        System.out.println("Digite dependentes:");
        Scanner nd = new Scanner( System.in );
        System.out.println(nd.nextLine());
        System.out.println("Digite horas trabalhadas:");
        Scanner hrtrabalhadas = new Scanner( System.in );
        System.out.println(hrtrabalhadas.nextLine());

        sb=hrtrabalhadas*100+nd*125.55;
        desconto=sb*0.12;
        sl=sb-(sb*0.12);

        System.out.println("Nome do Funcionario:" +nome);
        System.out.println("Salario bruto: "+sb);
        System.out.println("Salario Liquido:"+sl);
        System.out.println("Valor Descontado: "+sb-sl);

    }





}











