import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p14_LettersChangeNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        String[] line = reader.readLine().split("\\s+");
        for (int i = 0; i < line.length; i++) {
            String input = line[i];
            String firstLetter = input.substring(0, 1);
            String endLetter = input.substring(input.length() - 1, input.length());
            double number = Double.parseDouble(input.substring(1, input.length() - 1));
            int fletterPos = firstLetter.charAt(0) >= 'A' && firstLetter.charAt(0) <= 'Z' ?
                    firstLetter.charAt(0) - 64 : firstLetter.charAt(0) - 96;
            int sletterPos = endLetter.charAt(0) >= 'A' && endLetter.charAt(0) <= 'Z' ?
                    endLetter.charAt(0) - 64 : endLetter.charAt(0) - 96;
            if (!Character.isLowerCase(firstLetter.charAt(0))){
                number /= fletterPos;
            } else {
                number *= fletterPos;
            }
            if (!Character.isLowerCase(endLetter.charAt(0))){
                number -= sletterPos;
            } else {
                number += sletterPos;
            }
            sum += number;
        }
        System.out.printf("%.2f", sum);
    }
}
