import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year;
        int salary=scanner.nextInt();
        System.out.println("薪水:");
        year=scanner.nextInt();
        System.out.println("年份:");
        System.out.println("今天是我工作的第一:"+year+"年，"+"薪水为:"+salary);
    }
}
