package Atividade041122;

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        ICalcGeometria l = new ICalcGeometria();
    
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Raio do Circulo: ");
            int raiodocirculo = scan.nextInt();

            final int perimetro = 2 * 3 * (2 * raiodocirculo);
            l.getPerimetro();
            int area = 3 * (raiodocirculo * raiodocirculo);
            l.getArea();
            
            System.out.println("Perimetro " + perimetro);
            System.out.println("Área: " + area);
        }
}
}