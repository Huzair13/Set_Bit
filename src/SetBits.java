import java.util.Scanner;

public class SetBits{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number 1 !!! ");
        int number1=scanner.nextInt();

        System.out.println("Enter the Number 2 !!! ");
        int number2=scanner.nextInt();

        int result=setBits(number1,number2);
        System.out.println(result);
    }

    private static int setBits(int number1, int number2) {
        int N=0;
        N=N|(1<<number1);
        N=N|(1<<number2);

        return N;
    }
}