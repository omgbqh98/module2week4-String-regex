package cac_thao_tao_vs_String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KiemTra {
    public static void main(String[] args) {
        //tìm trong chuỗi text1 :
        String text1 = "Hello java regex 2-12-2018, hello world 12/12/2018";

        //        \d{1,2}: nghĩa là một số có 1 hoặc 2 chữ số (ngày và tháng).
//         [-|/]: nghĩa là ký tự - hoặc /.
//         \d{4}: nghĩa là một số có 4 chữ số (năm)
        Pattern pattern9 = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");

        Matcher matcher = pattern9.matcher(text1);

        System.out.println("Ngày tháng trong chuỗi text1: " + text1);

        while (matcher.find()) {

            System.out.println(text1.substring(matcher.start(), matcher.end()));

        }



        //kiểm tra xem text2 và text3 có phải ngày tháng không
        String text2 = "2/12/2018";

        String text3 = "12/12/aaaa";

        pattern9 = Pattern.compile("^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$");

        System.out.println("\nChuỗi " + text2 + " có định dạng ngày tháng: "

                + pattern9.matcher(text2).matches());

        System.out.println("Chuỗi " + text3 + " có định dạng ngày tháng: "

                + pattern9.matcher(text3).matches());








        String str = "Welcome   to gpcoder";

// Ký tự bất kỳ xuất hiện nhiều lần lần và kết thúc là r
        String regex = ".*r$";

// Tạo đối tượng Pattern thông qua method tĩnh.
        Pattern pattern = Pattern.compile(regex);

// Lấy ra đối tượng Matcher
        Matcher matcher1 = pattern.matcher(str);

// Kiểm tra có khơp với regex không
        boolean match = matcher1.matches();
        System.out.println("Match = " + match); // Match = true
    }

}



