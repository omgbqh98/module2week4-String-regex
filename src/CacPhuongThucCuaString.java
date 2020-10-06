public class CacPhuongThucCuaString {
    public static void main(String[] args) {
        //length: lấy dộ dài chuỗi
        //charAt : lấy 1 kí tự tại vị trị nào đó:

        String string = "huynh98";
//            System.out.println(string.charAt(1));

        //concat:nối chuỗi
        String s = "ok";
        String d = string.concat(s);
//        System.out.println(d);

        //toUpperCase : chuyển thành chữ hoa
//        System.out.println(string.toUpperCase());


        //trim() :  loại bỏ ký tự trắng trong chuỗi như ‘ ’, \t, \f, \r, \n
//        System.out.println(string.trim());


        //compareTo: so sanh chuỗi:
        String s1 = "New york";
        String s2 = "Boston";
        if (s1.compareTo(s2) < 0) {
//            System.out.println(s1 + " " + s2);
        } else {
//            System.out.println(s2+ " " +s1);
        }


        //Integer.parerInt : chuyển chuỗi sang int
        //Double.parerDouble
        String number = "1234";
        int number1 = Integer.parseInt(number);
//        System.out.println(number1 +2);


        String st1 = "toJavaJ";
        String st2 = "toHuynh bui";
        String st3 = "welcome toJava";

        System.out.println(st1.equals(st3));
        System.out.println(st1.compareTo(st2));
        System.out.println(st1.compareTo(st3));
        System.out.println(st2.compareTo(st2));
      //trả về vị trí đầu
        System.out.println(st1.indexOf("Ja"));
        //trả về vị trí cuối khi có kí tự trùng nhau
        System.out.println(st1.lastIndexOf('J'));
        //trả về vị trí tới fromIndex trở về
        System.out.println(st1.lastIndexOf('J',7));
        //lấy kí tự từ vị trí thứ 5 trở đi
        System.out.println(st1.substring(5));
        //lay từ vị trí 2 tới 5
        System.out.println(st1.substring(2,5));
        //kiểm tra xem phải bắt đầu từ chữ "t" không
        System.out.println(st1.startsWith("t"));
        //kiểm tra xem trong chuỗi có to ko:
        System.out.println(st1.contains("to"));



        //chuyển kí tự trong mảng thành chuỗi
        String srt1 = "java";//Tạo chuỗi bằng string literal
        char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
        String srt2 = new String(ch);//convert mảng char thành chuỗi
        String srt3 = new String("example");//Tạo chuỗi bằng từ khóa new
        System.out.println(srt1);
        System.out.println(srt2);
        System.out.println(srt3);
    }
}



