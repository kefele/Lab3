import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i = 0;
        int userNum = 0;
        int cube = userNum * userNum;
        int sqr = userNum * userNum * userNum;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number greater than 0: ");

        userNum = scan.nextInt();

        System.out.println("Number\t Squared\t Cubed\t ");
        System.out.println("======\t =======\t ======= ");


            for (i = 1;i <= userNum; ++i) {


                System.out.println(i + "\t\t " + (i*i) + "\t\t\t " + (i*i*i));
            }


    }
}
