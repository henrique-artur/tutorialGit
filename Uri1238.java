package br.com.abc.introducao.uri;

import java.util.Scanner;

public class Uri1238 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while(leitor.hasNext()) {

            long ano = leitor.nextLong();

            if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
                System.out.println("This is leap year.");
                if (ano % 15 == 0) {
                    System.out.println("This is huluculu festival year.");
                }
                if (ano % 55 == 0) {
                    System.out.println("This is bulukulu festival year.");
                }
            }
            else if (ano % 15 == 0) {
                System.out.println("This is huluculu festival year.");
            }
            else {
                System.out.println("This is ordinary year.");
            }
            System.out.println();
        }
    }
}
