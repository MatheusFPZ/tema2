package atividade2.ex5;

public class ex5 {
    public static void main(String[] args){
        int[][] sorteio = new int[][]{
        {1000,1,2,4,5,7,8,0},
        {2000,2,3,4,7,8,9,0},
        {3000,4,5,6,7,8,9,0},
        {4000,3,4,5,7,8,9,0},
        {5000,1,2,3,4,5,6,0}
};
        int resultados[]= new int[]{1,2,3,4,5,6};
        int ganhador=0;
        int maioracertos=0;

        for(int i=0;i<5;i++){
            System.out.println("Cartela n "+sorteio[i][0]);

            for(int j=1; j<7; j++){
                int foisorteado=0;
                int numcompara=sorteio[i][j];
                for(int k=0; k<6; k++) {
                    if (numcompara == resultados[k]){
                        foisorteado=1;
                            break;
                    }

                }
                if(foisorteado==1){
                    sorteio[i][7]++;
                }


        }
            System.out.println("Acertos: "+sorteio[i][7]);
        }
        for(int i=0; i<5;i++){
            if(sorteio[i][7]>maioracertos){
                maioracertos=sorteio[i][7];
                ganhador=sorteio[i][0];
            }
        }
        System.out.println("O maior ganhador foi o da cartela:"+ganhador);

    }



}
