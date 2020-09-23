package com.iscolt.java.demo.homework01;

import java.util.Scanner;

/**
 * 判断闰年
 * <p>
 * Description: 编写一个Java程序，输入一个年份，判断是否是闰年
 * 闰年的条件是符合下面二者之一：①能被4整除，但不能被100整除;②能被400整除
 * </p>
 *
 * @author: https://github.com/isColt
 * @date: 2020/9/23
 * @see: PACKAGE_NAME
 * @version: v1.0.0
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        // 1900 2000
        if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
            System.out.println("闰年");
        } else {
            System.out.println("不是闰年");
        }
    }
}
