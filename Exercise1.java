import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {

        int mat, fizik = 0, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz:");
        mat = input.nextInt();

        System.out.print("Fizik notunuz:");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz:");
        kimya= input.nextInt();

        System.out.print("Türkçe notunuz:");
        turkce= input.nextInt();

        System.out.print("Tarih notunuz:");
        tarih= input.nextInt();

        System.out.print("Müzik notunuz:");
        muzik= input.nextInt();

        int toplam = mat+fizik+kimya+turkce+tarih+muzik;
        double ortalama = toplam/6.0;

        boolean kosul = ortalama > 60;

        String str = kosul ? "Sınıfı geçti" : "Sınıfta kaldı";
        System.out.println("Öğrencinin Durumu: "  + str);

    }
}