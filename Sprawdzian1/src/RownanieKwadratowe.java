/**
 Klasa króra oblicza i zwraca delte za pomocą podanego wzoru
 a,b,c: double, argument do obliczania delty
 kolekcja: ArrayList<>, kolekcja obliczonych delt (dodawanie do niej winik delty)
 @author: Marcel Mikulski
 **/

import java.util.ArrayList;

public class RownanieKwadratowe {
    private final double a,b,c;

    public ArrayList<Double> obliczPierwiastki(){
        ArrayList<Double> kolekcja = new ArrayList<Double>();
        double delta = Math.pow(b , 2) - 4 * a * c;
        if (delta == 0) {
            kolekcja.add(-b / 2 * a);
        }
        if (delta > 0){
                kolekcja.add((-b+Math.sqrt(delta))/2*a);
                kolekcja.add((-b-Math.sqrt(delta))/2*a);
        }
        return kolekcja;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public RownanieKwadratowe(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public RownanieKwadratowe copy(){
        return new RownanieKwadratowe(this.getA(),this.getB(), this.getC());
    }
    public String toString(){
        return a+"x^2 + "+b+"x + "+c;
    }
}
