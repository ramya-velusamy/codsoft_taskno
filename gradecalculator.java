import java.io.*;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subject to be calculated:");
        int n=sc.nextInt();
        Double tot=0.00;
        for (int i=1;i<=n;i++){
            System.out.println("Enter the subject "+ i+":");
            Double sub=sc.nextDouble();
            tot=tot+sub;
        }
        System.out.println("Total Marks scored in all subjects: "+tot);
        double avg=tot/n;
        System.out.println("The average marks is : "+avg);
        double subtot=n*100;
        double avgper=(avg/subtot)*100;
        System.out.println("The average percentage is : "+avgper);
        if (avg >= 90) {
            System.out.println("Grade: 'O'");
        } else if (avg >= 80) {
            System.out.println("Grade: 'A'");
        } else if (avg >= 70) {
            System.out.println("Grade: 'B'");
        } else if (avg >= 60) {
            System.out.println("Grade: 'C'");
        } else if (avg >= 50) {
            System.out.println("Grade: 'D'");
        } else {
            System.out.println("Result: Reappear for exam");
        }
    }
}
