import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class clases {

    public static void main(String[] args) {
        System.out.println("Digite el tamaño de la lista : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        List<Integer> obras = new ArrayList<>(x);

        
        //Ingresamos los elementos de la lista
        for (int i = 0; i <= x; i++) {
            System.out.print("Ingreses un valor a la lista : ");
            int obra = sc.nextInt();
            obras.add(obra);
            
        }
        
        Set<Integer> hashSet = new HashSet<Integer>(obras);
        obras.clear();
        obras.addAll(hashSet);
 
        System.out.printf("obras sin repetición");
        for (Integer s : obras) {
            System.out.println(s);
        }
        

        System.out.println(obras);

    }

}