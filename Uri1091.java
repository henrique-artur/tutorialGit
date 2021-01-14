package br.com.abc.introducao.uri;

import java.util.Scanner;

public class Uri1091 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int casosTeste, xZero, yZero;

        while (true){
            casosTeste = leitor.nextInt();
            if(casosTeste == 0) break;

            xZero = leitor.nextInt();
            yZero = leitor.nextInt();

            while (casosTeste > 0){
                int x, y;

                x = leitor.nextInt();
                y = leitor.nextInt();

                quadra(x, y, xZero, yZero);

                casosTeste--;
            }
        }
    }
    public static void quadra(int x, int y, int xZero, int yZero){
        if (x == xZero || y == yZero) {
            System.out.println("divisa");
        }
        else if (x > xZero){
            if(y > yZero){
                System.out.println("NE");
            }
            else {
                System.out.println("SE");
            }
        }
        else if (x < xZero){
            if(y > yZero){
                System.out.println("NO");
            }
            else {
                System.out.println("SO");
            }
        }
    }
}
