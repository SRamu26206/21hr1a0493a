//Java program to check wether the charecter is an special char or not
import java.util,*;
public class Program205e{
    public static viod main(String[] args)

}char ch;{
System.out.print("Enter a charecter:");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
System.out.print();
if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))||
(ch>='0'&& ch<='9')
System.out.println(ch+" is an special charecter");
else
System.out.println(ch+" is not special charecter");
}