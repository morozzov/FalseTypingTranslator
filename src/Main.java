import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<Character, Character> letters = new HashMap<Character, Character>();
        letters.put('q', 'й');
        letters.put('w', 'ц');
        letters.put('e', 'у');
        letters.put('r', 'к');
        letters.put('t', 'е');
        letters.put('y', 'н');
        letters.put('u', 'г');
        letters.put('i', 'ш');
        letters.put('o', 'щ');
        letters.put('p', 'з');
        letters.put('[', 'х');
        letters.put('{', 'Х');
        letters.put(']', 'ъ');
        letters.put('}', 'Ъ');
        letters.put('a', 'ф');
        letters.put('s', 'ы');
        letters.put('d', 'в');
        letters.put('f', 'а');
        letters.put('g', 'п');
        letters.put('h', 'р');
        letters.put('j', 'о');
        letters.put('k', 'л');
        letters.put('l', 'д');
        letters.put(';', 'ж');
        letters.put(':', 'Ж');
        letters.put('\'', 'э');
        letters.put('\"', 'Э');
        letters.put('\\', 'ё');
        letters.put('|', 'Ё');
        letters.put('z', 'я');
        letters.put('x', 'ч');
        letters.put('c', 'с');
        letters.put('v', 'м');
        letters.put('b', 'и');
        letters.put('n', 'т');
        letters.put('m', 'ь');
        letters.put(',', 'б');
        letters.put('<', 'Б');
        letters.put('.', 'ю');
        letters.put('>', 'Ю');

        System.out.println("Enter text:");

        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        System.out.println();

        StringBuilder outputString = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            if (letters.containsKey(inputString.charAt(i))) outputString.append(letters.get(inputString.charAt(i)));
            else if (letters.containsKey(inputString.toLowerCase().charAt(i)))
                outputString.append(Character.toUpperCase(letters.get(Character.toLowerCase(inputString.charAt(i)))));
            else outputString.append(inputString.charAt(i));
        }

        System.out.println("Translated text:");
        System.out.println(outputString);
    }
}