package com.dio.br.CopaDoMundo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numTotal = scan.nextInt();
        int numCompradas = scan.nextInt();

        int contador = 1;

        Set<Integer> setFig = new HashSet<>(Arrays.asList());

        while (contador <= numCompradas){
            setFig.add(scan.nextInt());

            contador ++;
        }
        System.out.println(numTotal - setFig.size());
    }
}
