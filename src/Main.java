import java.time.LocalDateTime;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       /** Scanner iScanner = new Scanner(System.in);
        System.out.printf("name ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s\n",name);
        iScanner.close();
        /**String s = "qwer";
        char f = s.charAt(1);
        System.out.println(f);
        System.out.println("Hello world!");
        System.out.println(LocalDateTime.now());*/
        Scanner in = new Scanner(System.in);
        System.out.print("Entr size array: ");
        int size = in.nextInt();
        int[] arrayNum = new int[size]; // { 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1 };
        int count = 0;
        int max = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print("Enter number: ");
            arrayNum[i] = in.nextInt();
            if (arrayNum[i] == 1) {
                count++;
                if (max < count)
                    max = count;
            } else
                count = 0;
        }
        System.out.printf("Максиальное кол-во единиц подряд = %d", max);
    }
}