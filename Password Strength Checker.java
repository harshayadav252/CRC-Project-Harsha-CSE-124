import java.util.Scanner;
public class PasswordCheck {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter password: ");
String pass = sc.nextLine();
boolean upper = false, lower = false, digit = false, symbol = false;
for (int i = 0; i < pass.length(); i++) {
char ch = pass.charAt(i);
if (Character.isUpperCase(ch))
upper = true;
else if (Character.isLowerCase(ch))
lower = true;
else if (Character.isDigit(ch))
digit = true;
else
symbol = true;
}
if (upper && lower && digit && symbol)
System.out.println("Strong password");
else
System.out.println("Weak password");
sc.close();
}
}