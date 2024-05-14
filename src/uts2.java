
public class uts2 {
    public static void main(String[] args) {
        int length = 5;
        int width = 3;
        int height = 2;
        int[] result = calculateBoxProperties(length, width, height);
        System.out.println("Total surface area: " + result[0]);
        System.out.println("Volume: " + result[1]);
    }

    public static int[] calculateBoxProperties(int length, int width, int height) {
        int area = 2 * (length * width + length * height + width * height);
        int volume = length * width * height;
        int[] result = {area, volume};
        return result;
    }
}