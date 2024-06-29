package practise;

public class Ichat4 {
    public static void main(String[] args) {
        int number = 38154;

        while (number > 9) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }

        System.out.println(number);
    }
}

