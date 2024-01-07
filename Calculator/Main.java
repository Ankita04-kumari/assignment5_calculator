package Calculator;

import Operations.Operation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        double result;
        System.out.println("enter first number:");
        a = sc.nextInt();
        System.out.println("enter second number:");
        b = sc.nextInt();
        System.out.println("enter the operation:");
        char ch = sc.next().charAt(0);
        Operation A = new Operation();
        switch (ch) {
            case '+':
                result = A.add(a, b);
                break;
            case '-':
                result = A.subtraction(a, b);
                break;
            case '*':
                result = A.multiplication(a, b);
                break;
            case '/':
                result = A.division(a, b);
                break;
            default: throw new RuntimeException("invalid operation");
        }
        System.out.println("result = " + result);
    }
}
