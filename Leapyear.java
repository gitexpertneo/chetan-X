import java.util.Scanner;

public class Leapyear{
public static void main (String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the year of 4 digit:");
int year = input.nextInt();
Leapyear obj = new Leapyear();
obj.test(year);
}

public void test (int year){
if(year % 4 ==0){
System.out.println("Theyear "+ year+" is a leap year");
}else{
System.out.println("Theyear "+ year+" is a not leap year");
}
}
}