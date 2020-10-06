package cac_thao_tao_vs_String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CuPhap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //chỉ được nhập 1 số từ 0 tới 9
        Pattern pattern = Pattern.compile("^[0-9]$");
        //dc nhập tất cả các số:
        Pattern pattern1 = Pattern.compile("^[0-9]+$");
        //chi nhap dc 6 số
        Pattern pattern2 = Pattern.compile("^[0-9]{6}$");
        //nhap dc 6 so trở lên
        Pattern pattern3 = Pattern.compile("^[0-9]{6,}$");
        //nhap chữ
        Pattern pattern4 = Pattern.compile("^[a-zA-Z]{6,}$");
//        nhap ca chữ cả số
        Pattern pattern5 = Pattern.compile("^[a-zA-Z0-9]+$");
        //3 chữ đầu tiên phải là "abc":
        Pattern pattern6 = Pattern.compile("^abc");
        //3 chữ cuối phải là "abc"
        Pattern pattern7 = Pattern.compile("abc$");
        //tất cả kí tự đều dc
        Pattern pattern8 = Pattern.compile(".");

        while (true) {
            System.out.println("input :");
            String str = scanner.nextLine();
            if (pattern8.matcher(str).find()) {
                System.out.println("ok");
            } else {
                System.out.println("ko thanh cong");
            }
        }
    }
    }

