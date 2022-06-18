package Tugas1;

import java.util.Scanner;

public class SuratKaisar {
    public static String enkripsi (String Text, int Key) {
        String Hasil = "";
        for (int i = 0; i < Text.length(); i++) {
            int HasilGeser = Text.charAt(i);
            if (Character.isUpperCase(HasilGeser)) {
                HasilGeser = HasilGeser + (Key % 26);
                if (HasilGeser > 'Z')
                    HasilGeser = HasilGeser - 26;
            } else if (Character.isLowerCase(HasilGeser)) {
                HasilGeser = HasilGeser + (Key % 26);
                if (HasilGeser > 'z')
                    HasilGeser = HasilGeser - 26;
            }
            Hasil += (char) HasilGeser;
        }
        return Hasil;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Text = sc.nextLine();
        int Key = sc.nextInt();

        String cipherText = enkripsi(Text, Key);
        System.out.println(""+ cipherText);
    }
}