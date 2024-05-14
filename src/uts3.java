public class uts3 {
    public static void main(String[] args) {
        String digitizedText = "Th15 15 4 t35t 54mpl3 0f d161t1z3d t3xt.";

        // Koreksi kesalahan dalam teks terdigitisasi
        String correctedText = correctErrors(digitizedText);

        // Output teks yang sudah dikoreksi
        System.out.println("Teks yang sudah dikoreksi: " + correctedText);
    }

    public static String correctErrors(String text) {
        // Mengganti karakter yang salah teridentifikasi
        text = text.replace('5', 'S');
        text = text.replace('0', 'O');
        text = text.replace('1', 'I');

        return text;
    }
} 

