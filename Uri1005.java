package br.com.abc.introducao.uri;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1005 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.0");

        double media1, media2, media3;

        media1 = leitor.nextDouble();
        media2 = leitor.nextDouble();
        media3 = leitor.nextDouble();

        String str = fmt.format(((media1 * 2) + (media2 * 3) + (media3 * 5)) / 10);

        System.out.println("MEDIA = "+str);
    }
}
