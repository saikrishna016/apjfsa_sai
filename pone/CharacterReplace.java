package pone;

public class CharacterReplace {
    public static void main(String[] args) {
        System.out.println(replaceWithX("12345678")); 
    }

    public static String replaceWithX(String input) {
        int length = input.length();
        if (length <= 4) {
            return input; 
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length - 4; i++) {
            result.append('X');
        }
        result.append(input.substring(length - 4));
        return result.toString();
    }
}


