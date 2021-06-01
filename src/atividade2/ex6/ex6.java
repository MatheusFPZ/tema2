package atividade2.ex6;

public class ex6 {
    public static void main(String[] args){
        int []X= new int[]{10,1,2,3,4,5,6,2,1,2};
        int []Y= new int[]{2,6,5,4,3,7,8,3,2,16};

        System.out.println("Uniao dos vetores ");
        for(int i=0; i<10; i++){
            System.out.println(X[i]);
        }
        for(int j=0; j<10; j++){
            System.out.println(Y[j]);


        }

        System.out.println("\nDiferenca dos vetores ");
        for(int i=0; i<10; i++){
            System.out.println(X[i]-Y[i]);

        }


        System.out.println("\nSoma dos vetores ");
        for(int i=0; i<10; i++){
            System.out.println(X[i]+Y[i]);

        }

        System.out.println("\nproduto dos vetores ");
        for(int i=0; i<10; i++){
            System.out.println(X[i]*Y[i]);

        }

        System.out.println("\nInterseccao dos vetores ");
        for(int i=0; i<10; i++){
            int elem=X[i];
            for(int j=0; j<10; j++){
                if(elem == Y[j]){
                    System.out.println(elem);
                    break;
                }




            }
        }






    }







}
