import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        // name va name2 se tạo vung nho tại String pool và tham chiếu tới cùng giá trị
        String name = "ok";
        String name2 = "ok";
    //name3 và name 4 sẽ tạo giá trị ở heap và chúng ko tham chiếu tới nhau
        String name3 = new String("ok");
        String name4 = new String("ok");
        // dùng == để so sánh cả giá trị và vùng nhớ
        //dùng equals để so sánh giá trị
//        if (name4.equals(name) ) {
//            System.out.println("dc");
//        }

        StringBuffer stringBuffer = new StringBuffer("ok ");
        stringBuffer.append("dc cua no ");
        stringBuffer.append("hay qua");
        System.out.println(stringBuffer.toString());

        StringBuilder stringBuilder = new StringBuilder("dfg ");
        stringBuilder.append(" huynh");
        stringBuilder.append("  dc luon");
        System.out.println(stringBuilder.toString());



    }


}
