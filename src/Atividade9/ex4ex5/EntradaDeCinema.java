package Atividade9.ex4ex5;

public class EntradaDeCinema {
    private horario horario;
    private int sala;
    private float valor;
    private Data data;

    public EntradaDeCinema(Data data, horario horario, int sala, float valor){
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
        this.data= data;



    }
    public void CalculaDesconto(Data nascimento){

        int idade= this.data.ano - nascimento.ano;
        System.out.println("O clinte tem: "+ idade + "anos de idade");

        if(idade<12){
            valor= ((float) (valor*0.5));
            System.out.println("O valor com o desconto será: "+ valor);
        }else {
            System.out.println("Maior de 12 anos, não haverá desconto");
        }


    }

    public void CalculaDesconto(Data nascimento, int cartaoid) {
        int idade = this.data.ano - nascimento.ano;
        System.out.println("O clinte tem: " + idade + "anos de idade");

        if (idade >= 12 && idade <= 15) {
            valor = (float) (valor * 0.4);
            System.out.println("O cliente possui idade entre 12 a 15 anos");
            System.out.println("O valor com o desconto será de" + valor);

        }
        if (idade >= 16 && idade <= 20) {
            valor = (float) (valor * 0.3);
            System.out.println("O cliente possui idade entre 16 a 20 anos");
            System.out.println("O valor com o desconto será de" + valor);

        }
        if (idade > 20) {
            valor = (float) (valor * 0.2);
            System.out.println("O cliente possui idade maior 20 anos");
            System.out.println("O valor com o desconto será de" + valor);

        }
    }
        public void CalculaDescontohorario(){
            if(this.horario.hora<16){
            System.out.println("horario<16 hrs aplicando desconto");
            this.valor = (float)(this.valor*0.9);
            }
        }

        public String toString(){
            return "EntradaDeCinema{"+ "data do filme= "+ data+ ", horario= "+horario+ ", sala=" + sala+" valor="+valor+'}';


        }





    }









