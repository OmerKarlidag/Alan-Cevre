import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin Yarı Çapını Giriniz : ");
        r = inp.nextInt();

        double alan = pi * r * r;
        double cevre = r * pi * r;

        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);

        System.out.print("Merkez Açısının Ölçüsünü Giriniz : ");
        int a = inp.nextInt();

        double dilimA = (pi * (r * r) * a) / 360;
        System.out.println("Daire Diliminin Alanı : " + dilimA);
    }
}
