package pl.infoshare;

public class Main {
    public static String word = "1 dfer ";

    public static void main(String[] args) {
	// write your code here
        System.out.println(word +  " - " + firstLetter());
    }
    public static char firstLetter() {
        return word.charAt(0);
    }
}
