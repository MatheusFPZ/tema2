package atividade2.ex8;

public class ex8 {
    public static void main(String[] args){
        int []vt= new int[]{5,4,3,9,6,8,10,13,1,3};
        int maior, qt, tmp;
        qt=-1;

                do{
                    qt++;

                    maior=qt;

                    for(int i=qt+1; i<10; i++){
                        if(vt[i]>vt[maior])
                        maior=i;

                    }

                    tmp=vt[qt];
                    vt[qt]=vt[maior];
                    vt[maior]=tmp;

                }while (qt<10);

                System.out.println("vetor ordenado:");
                for(int i=0; i<10 ; i++){
                System.out.println(+vt[i]);


}







    }

}
