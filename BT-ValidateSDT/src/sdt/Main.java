package sdt;

import sdt.CheckSoDT;

public class Main {
    public static void main(String[] args) {
        CheckSoDT checkSoDT = new CheckSoDT();
        String checkSDT = "8a-0978489648";
        System.out.println(checkSoDT.validate(checkSDT));
    }
}
