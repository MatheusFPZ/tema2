package atividade2.ex4;

public class ex4 {
    public static void main(String[] args){
        int []vt= new int[]{3,3,56,6,3,4,5,8,5,2,1,23,65,78,96,34,76,12,34,10};
        int temp=0;
        int i=0;


        for( i=0; i<20;i++){
            System.out.println("valores vetor original: "+vt[i]);

        }
        for( i=0; i<10;i++){
            temp= vt[i];
            vt[i]=vt[19-i];
            vt[19-i]=temp;

                }
        for( i=0; i<20;i++){
            System.out.println("valores vetor modificados: "+vt[i]);


        }


    }










}
