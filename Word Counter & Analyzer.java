import java.util.Scanner;
public class WordCounter {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a paragraph:");
String text = sc.nextLine();
System.out.print("Enter word to search: ");
String find = sc.next();
String words[] = text.split(" ");
int wordCount = 0;
int freq = 0;
for (int i = 0; i < words.length; i++) {
if (!words[i].equals("")) {  
wordCount++;
if (words[i].equalsIgnoreCase(find)) {
freq++;
}
}
}
System.out.println("Total words: " + wordCount);
System.out.println("Total characters: " + text.length());
System.out.println("Frequency of word: " + freq);
sc.close();
}
}
