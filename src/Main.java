import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stopwatch watch=new Stopwatch();
        System.out.println(watch.getStartTime());
        Scanner s=new Scanner(System.in);
        s.nextLine();
        watch.end();
        System.out.println(watch.getEndTime());
        System.out.println(watch.getElapsedTime());
    }
}