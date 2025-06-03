package Atividade041122;

import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        ICalcGeometria l = new ICalcGeometria();
    
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Base: ");
            int base = scan.nextInt();
            System.out.println("Altura: ");
            int altura = scan.nextInt();

            int perimetro = (2 * base) + (2 * altura);
            final int area = base * altura;
            l.getArea();
            
            System.out.println("Perimetro: " + perimetro);
            System.out.println("Area " + area);
        }   
}
}
