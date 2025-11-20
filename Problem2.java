import java.util.Scanner;
public class Problem2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of odd series required: ");
        int a = scan.nextInt();        
        int x = 1;
        for (int i= 1;i<=a;i++){
            System.out.print(x);
            if(i<a){
                System.out.print(" ");

            }
            x=x+2;
        }
    }
}