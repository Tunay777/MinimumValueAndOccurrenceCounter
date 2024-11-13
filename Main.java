import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1;
        int count = 0;
        int min = num;
        while (num!=0) {
            System.out.print("Enter a sequence of integers (0 to end): ");
            int newNum = in.nextInt();
            if (newNum < num && newNum != 0) {
                min = newNum;
                count =1;
            } else if (newNum==num)
                    count+=1;
            num=newNum;
        }
            System.out.println("Min is " + min + " with " + count + " occurences.");
    }}