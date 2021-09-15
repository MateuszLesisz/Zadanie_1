package pl.infoshare;

public class Main {
    public String word = "Agnieszka";

    public static void main(String[] args) {
	// write your code here
        System.out.println(word + " - " + firstLetter());
    }
    public static char firstLetter() {
        return word.charAt(0);
    }
}
