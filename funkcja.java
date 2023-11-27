import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class funkcja {

    public static void sprawdz(double input, double output) {
        if (input == output) {
            System.out.println("Poprawne");
        } else {
            System.out.println("Błąd");
        }
    }

    public static void main(String[] args) {
        int wynik;
        Random rand = new Random();
        int a = rand.nextInt(10) + 1;
        int b = rand.nextInt(10);
        int c = rand.nextInt(10);
        int option = rand.nextInt(2);

        double delta, x1, x2, x;
        delta = Math.pow(b, 2) - 4 * a * c;
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        x = -b / a;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w quizie o funkcji liniowej/kwadratowej");
        System.out.println("<===========================================>");
        
        if (option == 0) 
        {
            System.out.println("Punkcja kwadratowa= "+a+"x^2"+b+"x+"+c);
            System.out.println("<======================================>");    

        }
        for (int i = 1; i <=3; i++) 
        {
            int pytanie  = losowanie.nextInt(3)+1;   
            if(pytanie == 1)
            {
                system.out.println("Pytanie "+i+"--");
                system.out.println("delta= "+delta+":");
                wynik = scanner.nextInt();
                check(wynik, delta);
            } 
            else if(pytanie == 2)
            {
                system.out.println("Pytanie "+i+"--");
                system.out.println("a= "+a+":");
                wynik = scanner.nextInt();
                check(wynik, a);
            } 
            else if(pytanie == 3)
            {
                system.out.println("Pytanie "+i+"--");
                system.out.println("b= "+b+":");
                wynik = scanner.nextInt();
                check(wynik, b);
            } 
            else
            {
                System.out.println("Funkcja Liniowa= "+a+"x+"+b);
                System.out.println("<===========================>");
            }
            for (int j = 1; j <=3; j++) 
            {
                int pytanie = losowanie()
                
            }
        }




    }
}