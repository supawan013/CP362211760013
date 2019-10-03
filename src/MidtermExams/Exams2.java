package MidtermExams;

import java.util.Scanner;

public class Exams2 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            final double PI = 3.14;
            System.out.println("กรุณากรอกตัวเลขของรัศมี: ");
            double r = sc.nextDouble();

            double Area = PI * r * r;
            System.out.println("พื้นที่ฐานของกระบอก: " + Area);

            double c = 2 * PI * r;
            System.out.println("ความสูง: " + c);

            double v = (4 / 3) * r * r;
            System.out.println("ปริมาตรของทรงกระบอก: " + v);
    }
}
