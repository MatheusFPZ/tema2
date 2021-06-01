package atividade2.ex3;

public class ex3 {
        public static void main(String [] args){
            int []vt= new int[]{2,5,23,12,44,76,54,43,55,22};
            int menor=100000;
            int posicao=100000;

            for(int i=0;i<10;i++){
            if(vt[i]<menor){
                menor=vt[i];
                posicao=i;
            }


        }
        System.out.println("o menor elemento é "+menor+" e a posicao é "+posicao);



        }






}
