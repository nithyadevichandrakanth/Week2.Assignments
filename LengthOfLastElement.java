package week1.day2;

import java.util.Arrays;

public class LengthOfLastElement {

	public static int length_Of_last_word(String str) {
		
		String[] split = str.split(" ");
		int length = 0;
		
			if (split.length > 0) {

				length = split[split.length - 1].length();
				System.out.println("The length of the last word is: "+length);
			} else {
				length = 0;
			}
return length;
		}
	public static void main(String[] args) {
		System.out.println(length_Of_last_word("Hello World"));
		System.out.println(length_Of_last_word("  fly me   to   the moon  "));
		System.out.println(length_Of_last_word("luffy is still joyboy"));
		
	}
	}

