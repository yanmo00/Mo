import java.util.Scanner;

public class Mai {
    public static void main(String[] args) {
//        练习题3：最优选择（三元表达式，条件判断）
        /*某小伙想定一份外卖，商家的优惠方式如下：鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。订单满30元8折优惠。
        鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。那么这个小伙要点这三样东西，最少要花多少钱？*/
        double money1=(24+8+3);
        if(money1<=30){
            System.out.println(money1);
            System.out.println("money1小于30");
        }else{
            System.out.println(money1*0.8);
            System.out.println("money1大于30");
        }
        double money2=(16+8+3);
        if(money1<=money2){
            System.out.println(money1+"所以选择方案一");
        }else{
            System.out.println(money2+"所以选择方案二");
        }
    }
}
