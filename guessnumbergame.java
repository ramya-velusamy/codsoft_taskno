import java.util.*;
import java.io.*;
class Main {
    public int n;
    public int count=0;
    public int Main(){
        System.out.println("Enter an another guess:");
        count+=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rn=new Random();
        int random=rn.nextInt(100) +1;
        System.out.println("Enter the number to be guessed:");
        int num=sc.nextInt();
        Main o=new Main();
        while (num != random){
            if (num>random){
            System.out.println("Ur guess is high.Make an other guess.");
            }
            else{
                System.out.println("Ur guess is low.Make an other guess.");
            }
            num=o.Main();
        }
        System.out.println("Welldone You got your guess.");
        System.out.println("You have took around "+o.count+ " to complete you guess.");
    }
}
