import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter expression (like 2+3 or 4*5): ");
String exp = sc.next();
int result = 0;
if (exp.contains("+")) {
String parts[] = exp.split("\\+");
result = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
}
else if (exp.contains("-")) {
String parts[] = exp.split("-");
result = Integer.parseInt(parts[0]) - Integer.parseInt(parts[1]);
}
else if (exp.contains("*")) {
String parts[] = exp.split("\\*");
result = Integer.parseInt(parts[0]) * Integer.parseInt(parts[1]);
}
else if (exp.contains("/")) {
String parts[] = exp.split("/");
result = Integer.parseInt(parts[0]) / Integer.parseInt(parts[1]);
}
else {
System.out.println("Invalid expression");
return;
}
System.out.println("Result = " + result);
sc.close();
}
}