import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
//        练习题4：接收用户输入的3个整数,并将它们的最大值作为结果输出（输入输出，条件判断）
        //1.提示并接收用户输入的三个整数,并交由变量a b c来保存
        System.out.println("请输入第一个整数:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入第二个整数:");
        int b = new Scanner(System.in).nextInt();
        System.out.println("请输入第三个整数:");
        int c = new Scanner(System.in).nextInt();

        //2.对接收到的三个值进行比较
        //2.1定义变量max来保存a和b中的最大值
//        int max = a>b ? a : b;
        int max = 0;
        if(a>b){
            max = a;
            System.out.println("max="+a);
        }else {
            System.out.println("max="+b);
        }
        //2.2比较max与c谁最大,并将最大值交由max来保存
        max = max>c ? max : c;
        /**解决方案二:*/
        //int max = a>b?(a>c?a:c):(b>c?b:c);
        //3.输出结果
        System.out.println("三个数的最大值是:"+max);
    }
}
