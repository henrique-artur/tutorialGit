package br.com.abc.introducao.uri;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1002 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.0000");

        final double n = 3.14159;
        double area, raio;

        raio = leitor.nextDouble();

        area = n * (raio*raio);

        String str = fmt.format(area);

        System.out.println("A="+str);
    }
}
