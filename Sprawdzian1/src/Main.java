/**
 Główny kod projektu
 a,b,c: double, argument do obliczania delty
 input: Scanner, przyjmuje liczby wipsane przez urzytkownika
 licznikDelty: RownanieKwadratowe, jest to obliczania delty
 rownania: ArrayList<>, przechowuje równiania w postaci stringa z licznikDelty.toString()
 @author: Marcel Mikulski
 **/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> rownania = new ArrayList<String>();

        Scanner input = new Scanner(System.in);
        System.out.println("wybierz");
        while (true){
            System.out.println("1 - wyslietl ostatnie rownanie");
            System.out.println("2 - oblicz delte");
            int wybor = input.nextInt();
            if(wybor == 1){
                System.out.println(rownania.get(rownania.size() - 1));
            }
            if(wybor == 2) {
                System.out.println("wprowadz a,b,c dla obliczenia delty");
                double a, b, c;
                System.out.print("a: ");
                a = input.nextDouble();
                System.out.print("b: ");
                b = input.nextDouble();
                System.out.print("c: ");
                c = input.nextDouble();

                RownanieKwadratowe licznikDelty = new RownanieKwadratowe(a, b, c);

                rownania.add(licznikDelty.toString());
                System.out.println(licznikDelty.obliczPierwiastki());
            }
        }
    }
}