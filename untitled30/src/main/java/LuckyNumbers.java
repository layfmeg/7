public class LuckyNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String number = String.valueOf(i);
            if (!number.contains("4") && !number.contains("9")) {
                System.out.print(i + " ");
            }
        }
    }