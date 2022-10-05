import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejemplo {

    public static void main(String[] args) {
        
        System.out.print("Digite el tamaño de la lista : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        List<Integer> obras = new ArrayList<>(x); //Creamos la lista de enteros

        
        //Ingresamos los elementos de la lista
        for (int i = 0; i <= x; i++) {
            System.out.print("Ingreses un valor a la lista : ");
            int obra = sc.nextInt();
            obras.add(obra);
            
        }

        List<Integer> obras2 = new ArrayList<>();

        for (int i = 0; i<obras.size(); i++) {
            int element = obras.get(i); // crea una variable para obtener cada elemento y luego lo imprime
            

        }
        System.out.println(obras);
        System.out.println(obras2);

        // for (int i=0 ; i<=x-1; i++){
        //     if (obras.get(i) != obras.get(i+1)){
        //         obras2.add(obras.get(i));
        //     }
        // }

        // System.out.println(obras2);

        // System.out.println(obras);
    }
    
}
