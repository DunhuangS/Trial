import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        Customer cust = new Customer("Joe", "Biden", new Address(), new Phone());
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        System.out.println("Enter width");
        r.setWidth(sc.nextLong());
        System.out.println("Enter height");
        r.setHeight(sc.nextLong());
        System.out.println(r.getPerimeter());
        System.out.println(r.getArea());
        System.out.println(r);

        int[] bruh = {10, 11, 12, 13, 14, 15};
        shootMyArray(bruh);
        printArray(bruh);
        
    }

    static void printArray (int[] array) {
        System.out.print("[ ");
        for (int e : array) {
            System.out.print(e + " ");
        }
        System.out.print("]");
    }

    static void shootMyArray (int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] -= 10;
        }
    }
}