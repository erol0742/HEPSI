package EROL.Gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.println(" sayı 1 " );

        int sayı1 = oku.nextInt();

        System.out.println(" sayı2 " );

        int sayı2 = oku.nextInt();

        int toplam=sayı2+sayı1;

        System.out.println("toplam = " + toplam);
    }
}
