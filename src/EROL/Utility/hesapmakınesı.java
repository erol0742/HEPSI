package EROL.Utility;

import java.util.Scanner;

public class hesapmakınesı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, sonuc;
        char operator;

        System.out.print("İlk sayıyı girin: ");
        num1 = input.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        num2 = input.nextDouble();

        System.out.print("İşlem türünü girin (+, -, *, /): ");
        operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                sonuc = num1 + num2;
                break;

            case '-':
                sonuc = num1 - num2;
                break;

            case '*':
                sonuc = num1 * num2;
                break;

            case '/':
                sonuc = num1 / num2;
                break;

            default:
                System.out.println("Geçersiz işlem türü.");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + sonuc);
    }
}

