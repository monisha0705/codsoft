 import java.util.Scanner;

public class studentcalc {
    public static void main(String [] args){
        //Input: Take marks obtained (out of 100) in each subject.
        Scanner input = new Scanner(System.in);
        //subject 1
        float sub1 = input.nextFloat();
        //subject 2
        float sub2 = input.nextFloat();
        //subject 3
        float sub3 = input.nextFloat();
        //subject 4
        float sub4 = input.nextFloat();
        //Calculate Total Marks
        float totalmarks = sub1+sub2+sub3+sub4;
        System.out.println("The Total Marks Are: "+totalmarks );
        //Calculate Average Percentage
        float Average_percentage = totalmarks/4;
        System.out.println("The Average Percentage: "+Average_percentage);
        //Grade Calculation: Assign grades based on the average percentage achieved.
        if(Average_percentage>=91){
            System.out.println("O");
        } else if (Average_percentage>=81&& Average_percentage<=90) {
            System.out.println("A+");
        } else if (Average_percentage>=71&& Average_percentage<=80) {
            System.out.println("A");
        } else if (Average_percentage>=61&& Average_percentage<=70){
            System.out.println("B+");
        }else if (Average_percentage>=56&& Average_percentage<=60){
            System.out.println("B");
        }else if (Average_percentage>=50&& Average_percentage<=55){
            System.out.println("C");
        }else{
            System.out.println("F:Fail");
        }
    }
}
