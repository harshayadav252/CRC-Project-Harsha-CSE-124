import java.util.Scanner;
public class ATM {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int pins[] = {1111, 2222};
double balance[] = {5000, 8000};
System.out.print("Enter PIN: ");
int pin = sc.nextInt();
int index = -1;
for (int i = 0; i < pins.length; i++) {
if (pins[i] == pin) {
index = i;
break;
}
}
if (index == -1) {
System.out.println("Invalid PIN");
return;
}
int choice;
do {
System.out.println("\n1. Balance\n2. Deposit\n3. Withdraw\n4. Exit");
System.out.print("Enter choice: ");
choice = sc.nextInt();
switch (choice) {
case 1:
System.out.println("Balance: " + balance[index]);
break;
case 2:
System.out.print("Enter amount: ");
balance[index] += sc.nextDouble();
break;
case 3:
System.out.print("Enter amount: ");
double amt = sc.nextDouble();
if (amt <= balance[index])
balance[index] -= amt;
else
System.out.println("Insufficient balance");
break;
case 4:
System.out.println("Thank you");
break;
default:
System.out.println("Invalid choice");
}
} while (choice != 4);
sc.close();
}
}