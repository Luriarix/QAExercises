package exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MorseTranslator {
	private final Map<String, String> morseCode;

	public MorseTranslator() {
		this.morseCode = new HashMap<>();
		
		this.morseCode.put(".-", "a");
		this.morseCode.put("-...", "b");
		this.morseCode.put("-.-.", "c");
		this.morseCode.put("-..", "d");
		this.morseCode.put(".", "e");
		this.morseCode.put("..-.", "f");
		this.morseCode.put("--.", "g");
		this.morseCode.put("....", "h");
		this.morseCode.put("..", "i");
		this.morseCode.put(".---", "j");
		this.morseCode.put("-.-", "k");
		this.morseCode.put(".-..", "l");
		this.morseCode.put("--", "m");
		this.morseCode.put("-.", "n");
		this.morseCode.put("---", "o");
		this.morseCode.put(".--.", "p");
		this.morseCode.put("--.-", "q");
		this.morseCode.put(".-.", "r");
		this.morseCode.put("...", "s");
		this.morseCode.put("-", "t");
		this.morseCode.put("..-", "u");
		this.morseCode.put("...-", "v");
		this.morseCode.put(".--", "w");
		this.morseCode.put("-..-", "x");
		this.morseCode.put("-.--", "y");
		this.morseCode.put("--..", "z");
		this.morseCode.put(".----", "1");
		this.morseCode.put("..---", "2");
		this.morseCode.put("...--", "3");
		this.morseCode.put("....-", "4");
		this.morseCode.put(".....", "5");
		this.morseCode.put("-....", "6");
		this.morseCode.put("--...", "7");
		this.morseCode.put("---..", "8");
		this.morseCode.put("----.", "9");
		this.morseCode.put("-----", "0");
		this.morseCode.put("/", " ");
	}
	
	public String translate(String input) {
		return Arrays.stream(input.split(" "))
	            .map(n -> this.morseCode.get(n))
	            .collect(Collectors.joining(""));
	}
}
