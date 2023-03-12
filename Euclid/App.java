import java.util.Scanner;
public class euclid {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the First Number to find GCD: ");
        int num1=sc.nextInt();
        System.out.print("Enter the Second Number to find GCD: ");
        int num2=sc.nextInt();
        
        System.out.print("The GCD of "+num1+" and "+num2+" is: "+euclids(num1, num2));
    }
    public static int euclids(int num1,int num2) {

        if (num2==0) {
            return num1;
        }
        return euclids(num2, num1%num2);
    }
}
