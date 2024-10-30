import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r;
        double π = 3;
        double alan, hacim;
        Scanner input = new Scanner(System.in);
        System.out.printf("Lütfen dairenin yarıçapını giriniz > ");
        r = input.nextInt();

        alan = π * (r * r) ;
        hacim = π * (4.0/3) * (r * r * r) ;
        // Bölme işleminin sonucu 4/3 = 1 olarak alıyor.
        // Bunu düzeltmek için herhangi bir tanesini ondaklı yapmamız yeterli.

        System.out.println(alan);
        System.out.println(hacim);



    }
}