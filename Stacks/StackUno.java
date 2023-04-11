package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class StackUno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilaUno = new Stack<>();
        Stack<Integer> pilaDos = new Stack<>();
        Stack<Integer> pilaTres = new Stack<>();

        System.out.println("Introduce cuantos datos quieres en la pila 1 y pila 2: ");
        int cantidad = scanner.nextInt();
        System.out.println("Pila 1");
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Introduce el valor "+i);
            int numero = scanner.nextInt();
            pilaUno.push(numero);
        }

        System.out.println("Pila 2");
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Introduce el valor "+i);
            int numero = scanner.nextInt();
            pilaDos.push(numero);
        }

        for (int i = 0; i < cantidad; i++) {
            int topPilaUno = pilaUno.peek();
            int topPilaDos = pilaDos.peek();
            int total = topPilaUno + topPilaDos;

            pilaTres.push(total);
            pilaUno.pop();
            pilaDos.pop();
        }

        for (Integer pilaTre : pilaTres) {
            System.out.println(pilaTre);
        }
    }
}