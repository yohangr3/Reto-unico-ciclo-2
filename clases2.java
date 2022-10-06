import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class clases2 {


    public static void main(String[] args) {
        
        
        System.out.print("Digite el número de obras del museo 1 : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        List<Integer> obrasMuseo1 = new ArrayList<>(x); //Creamos la lista de enteros museo 1
        System.out.print("Digite el número de obras del museo 2 : ");
        int y = sc.nextInt();
        List<Integer> obrasMuseo2 = new ArrayList<>(y); //Creamos la lista de enteros museo 2

        
        //Ingreso de los datos a la lista museo 1
        for (int i = 1; i <= x; i++) {
            System.out.print("Ingreses un valor a la lista del museo 1 : ");
            int obraMuseo1 = sc.nextInt();
            obrasMuseo1.add(obraMuseo1);
            
        }

        System.out.println();

        for (int i = 1; i <= y; i++) {
            System.out.print("Ingreses un valor a la lista del museo 2 : ");
            int obraMuseo2 = sc.nextInt();
            obrasMuseo2.add(obraMuseo2);
            
        }

        List<Integer> obrasInteresMuseo2 = new ArrayList<>();

        //for (int i = 0; i<obrasMuseo1.size(); i++) {
        for(Integer element:obrasMuseo1){
            boolean found = false;
            for(Integer element2:obrasMuseo2){
                if(element == element2){
                    found = true;
                    break;
                }
            }
            if(!found){
                obrasInteresMuseo2.add(element);
            }
        }

        System.out.println(obrasInteresMuseo2);





    }
    
}
