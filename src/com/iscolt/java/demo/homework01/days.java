package com.iscolt.java.demo.homework01;

import java.util.Scanner;

/**
 * xx
 * <p>
 * Description: 编写一个Java程序实现输入一个年分一个月，请输出这个月共有多少天。
 * </p>
 *
 * @author: https://github.com/isColt
 * @date: 2020/9/23
 * @see: PACKAGE_NAME
 * @version: v1.0.0
 */
public class days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入年份");
        int year = scanner.nextInt();
        System.out.println("输入月份");
        int month = scanner.nextInt();
        while (month > 12) {
            System.out.println("月份错误，请重新输入");
            month = scanner.nextInt();
        }
        int days = 0;
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
        }
        System.out.println(year+"年"+month+"月一共"+days+"天");
    }
}
