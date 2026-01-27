
import Java.util.Scanner;
class Harry
{
   public static void main(String args[])
   {
   Scanner input = new Scanner(System.in);
   
   System.out.println("enter birth Year number");
   int birthyear = input.nextint();
   
   System.out.println("enter current Year:");
   int currentYear = input.nextInt();
   
   int age = currentyear - birthYear;
  System.out.println("Age of Harry:" + age);
   }
 }