import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckMangoTree {
    public static void main(String[] args) {
        List<Integer> mangoTreeNumbers = new ArrayList<>();
        int rows, columns , givenMangoTreeNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows:");
        rows = scanner.nextInt();
        System.out.println("Enter columns:");
        columns = scanner.nextInt();
        System.out.println("Enter mango tree number :");
        givenMangoTreeNumber = scanner.nextInt();

        //adding 1st row
        for(int i=1 ; i <= rows ; i++){
            mangoTreeNumbers.add(i);
        }

        //adding 1st column
        for(int i=0 ; i < columns ; i++){
            mangoTreeNumbers.add(i*rows + 1);
        }

        //adding last column
        for(int i=1 ;i <= columns ;i++){
            mangoTreeNumbers.add(i*rows);
        }

        if(mangoTreeNumbers.contains(givenMangoTreeNumber))
            System.out.println("Yes");
        else System.out.println("No");
    }
}