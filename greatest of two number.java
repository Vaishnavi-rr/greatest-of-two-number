import java.util.*;
public class Main{
public static void main (String arg[]){
Scanner sc = new Scanner (System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int largest =0;
if(num1==num2){
System.out.println("Both the number are equals");
}else{
largest=(num1>num2)?num1:num2;
System.out.println(largest+"is the largest");
}
}
}


