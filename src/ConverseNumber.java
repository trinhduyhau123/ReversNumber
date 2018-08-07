import java.util.Scanner;

public class ConverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter mount of number: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number: ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.printf(array[i] + "\t");
        }
        System.out.println();
        for(int j=0;j<size/2;j++){
            int temp = array[j];
            array[j] = array[size-j-1];
            array[size-j-1]  = temp;
        }
        for (int j = 0; j < size ; j++) {
            System.out.printf(array[j] +"\t");
        }
    }
}
