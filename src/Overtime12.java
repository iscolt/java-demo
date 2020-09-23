import java.util.Scanner;

/**
 * 加班
 * <p>
 * Description: 某公司每月标准上班时间是160小时，每小时工资是30元。
 * 如果上班时间超出了160小时，超出部分每小时按1.5倍工资发放。请编写程序计算员工月工资。
 * </p>
 *
 * @author: https://github.com/isColt
 * @date: 2020/9/23
 * @see: PACKAGE_NAME
 * @version: v1.0.0
 */
public class Overtime12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入您的上班时间");
        double time = scanner.nextDouble();
        double money = 0;
        if (time > 160) {
            money = 160 * 30 + (time - 160) * 30 * 1.5;
        } else {
            money = time * 30;
        }
        System.out.println("您的工资是：" + money);
    }
}
