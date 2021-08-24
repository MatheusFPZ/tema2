package Atividade9.ex6;

public class aluno {

    private double notafinal;

    public aluno(double notafinal){
        this.notafinal = Math.ceil(notafinal);

    }

    public double getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(double notafinal) {
        this.notafinal = notafinal;
    }

    @Override
    public String toString(){
        return this.getNotafinal()+ "";





    }


}
