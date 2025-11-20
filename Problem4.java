
import java.util.Scanner;

public class Problem4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers in format [1,2,8,9,...] :");
        String input = scan.nextLine();
        input = input.replace("[", "").replace("]", "");
        String [] parts =input.split(",");
        int [] arr =new int[parts.length];
        for(int i=0;i<parts.length;i++){
            arr[i]=Integer.parseInt(parts[i].trim());
        }
        int[] count = new int[10];
        for(int num :arr){
            for(int i=1;i<=9;i++){
                if(num%i==0){
                    count[i]++;
                }
            }
        }
        System.out.print("{");
        for (int i =1;i<=9;i++){
            System.out.print(i +":"+count[i]);
            if(i<9)
            System.out.print(",");
        }
        System.out.print("}");
    }
}