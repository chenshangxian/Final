package Java.Countword;

import java.util.Scanner;
public class Countword {
    
 public static void main(String[] args)
 {
Scanner scan = new Scanner(System.in);
System.out.println("Enter a string:");
String sentence = scan.nextLine(); 

int wordCount = 0;
boolean isWord = false;
for (int i = 0; i < sentence.length(); i++) {
String string = sentence.substring(i, i + 1);
if (string.equals(" ") || string.equals(".") || string.equals(",") || 
string.equals(";") || string.equals("?") || string.equals("!") || string.equals("-")) {
isWord = false;
} 
else {
if (!isWord) {
isWord = true;
 wordCount++;
}
}
}

System.out.println("The number of words in the string is: " + wordCount);
}
}
