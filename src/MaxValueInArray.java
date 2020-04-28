import java.util.Scanner;
public class MaxValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của  mảng: ");
        int num = scanner.nextInt();
        int[] arrA = new int[num];
        int i = 0;
        //Nhap mang
        System.out.println("Nhập phần tử của mảng: ");
        while (i < arrA.length) {
            arrA[i] = scanner.nextInt();
            i++;
        }
        //In mang
        System.out.println("Mảng đã nhập là: ");
        for (int j = 0; j < arrA.length; j++) {
            System.out.print(arrA[j] + "\t");
        }
        //check max value
        int maxValue=arrA[0];
        for (int j = 1; j < arrA.length; j++) {
            if (arrA[j]>maxValue){
                maxValue=arrA[j];
            }
        }
        System.out.print("\nGiá trị lớn nhất là: "+maxValue);
    }
}
