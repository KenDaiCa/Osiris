import java.util.Scanner;

public class ArrayListInJava {
    public void printArrayList() {
        int arrInt[];
        int n;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number n: ");
        n = input.nextInt();

        arrInt = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap a[" + i + "] = ");
            arrInt[i] = input.nextInt();

        }
        System.out.println("==========DONE===========");

        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = " + arrInt[i] + "");

        }
        System.out.println("===========DONE==========");
    }

    public void findMinMax() {

        //Khai bao Mang voi khong phan tu
        int arrInt[];
        byte[] arrByte;
        float arrFloat[];
        boolean[] arrBoolean;
        char arrChar[];
        String[] arrString;

        //Cap phat vung nho cho mang
        arrInt = new int[5];

        //Khoi tao gia tri phan tu sau khi cap phat vung nho cho mang
        arrInt[0] = 11;
        arrInt[1] = 22;
        arrInt[2] = 33;
        arrInt[3] = 44;
        arrInt[4] = 55;

        //Dung vong lap for de xu li mang
        for (int n = 0; n < arrInt.length; n++) {
            System.out.println(arrInt[n]);

        }
        System.out.println("==========DONE===========");
        for (int i : arrInt) {
            System.out.println(i);

        }
        System.out.println("===========DONE==========");
    }

    public static void main(String[] args) {
        ArrayListInJava arrayListInJava = new ArrayListInJava();
        arrayListInJava.printArrayList();
        arrayListInJava.findMinMax();
    }


}
