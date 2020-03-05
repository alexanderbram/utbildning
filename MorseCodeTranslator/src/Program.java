import java.awt.ActiveEvent;
import java.awt.Choice;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String newText = "";
		char[] letters = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
				'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
				'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0','.',',','?'};
		
		String[] morseLetters = {"   ", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
				 "....", "..", ".---", "-.-", ".-..", "--", "-.",
				 "---", ".--.", "--.-", ".-.", "...", "-", "..-",
				 "...-", ".--", "-..-", "-.--", "--..",
				 ".----", "..---", "...--", "....-",
				 ".....", "-....", "--...", "---..", "----.",
				 "-----",".-.-.-","--..--","..--.."};
		
		System.out.println("Text to translate to morse: ");
		String textConvert = input.nextLine();
		char[] ch = new char[textConvert.length()];
		for (int x = 0; x < textConvert.length(); x++) {
			ch[x] = textConvert.charAt(x);
		}
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < 40; j++) {
				if (ch[i] == letters[j]) {
					newText += morseLetters[j];
					newText += "  ";
					break;
				}
			}
		}
		System.out.println("Text in morse: ");
		System.out.println(newText);
		
		System.out.println("Text to split: ");
		String test = input.nextLine();
		String[] testArray = test.split(" ");
		String newMorseString = "";
		for (String object : testArray) {
			System.out.println(object);
			for (int i = 0; i < 40; i++) {
				if (object == morseLetters[i]) {
					newMorseString += letters[i];
				}
			}
		}
		System.out.println("Morse in text: ");
		System.out.println(newMorseString);
	}

}
