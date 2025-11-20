import java.util.Scanner;
public class Problem3{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the number till which the odd series has to be printed: ");
        int a = scan.nextInt();
        for(int i = 1;i<=a;i=i+2){
            System.out.print(i);
            if(i+2<=a){
                System.out.print(",");
            }
            
        }
    }
}
