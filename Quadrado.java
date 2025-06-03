package Atividade041122;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        ICalcGeometria l = new ICalcGeometria();
    
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Lado: ");
            int lado = scan.nextInt();
            
            int perimetro = 4 * lado;
            l.getPerimetro();

            int area = lado * lado;
            l.getArea();

            
            System.out.println("Perimetro: " + perimetro);
            System.out.println("Area: " + area);
        }
    }
}
