import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Dizinin Boyutu: ");
        Scanner gir = new Scanner(System.in);
        int size = gir.nextInt();
        int[] dizi = new int[size];

        for(int i = 0; i < size; i++){

            System.out.print("Deger Giriniz: ");
            int deger = gir.nextInt();
            dizi[i]+=deger;
            System.out.println((i+1)+ ". deger: "+dizi[i]);

        }

        Arrays.sort(dizi);

        System.out.println("Siralama: "+Arrays.toString(dizi));

    }
}