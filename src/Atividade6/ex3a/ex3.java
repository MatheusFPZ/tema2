package Atividade6.ex3a;
import java.util.ArrayList;
import java.util.List;
public class ex3 {


    public class SimpleTesting {
        public static void main(String[] args) {
            // ArrayList
            List<String> fruits = new ArrayList<>();
            fruits.add("Apple");
            fruits.add("Orange");
            fruits.add("Mango");
            System.out.println(fruits);
            StringBuilder str = new StringBuilder();
            for (String fruit : fruits) {
                str.append(fruit);
                str.append(" ");
            }
            System.out.println(str);
        }
    }
}
