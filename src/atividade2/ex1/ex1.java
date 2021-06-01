package atividade2.ex1;

public class ex1 {
    public static void main(String[] args) {
        int a[] = {16, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int par = 0;

        System.out.println("numeros involvidos:");
        for (int i = 0; i < 20; i++) {

            System.out.println(+a[i]);

            if(a[i]%2==0){
                par++;

            }
        }
        System.out.println("numeros pares:"+par);

    }
}