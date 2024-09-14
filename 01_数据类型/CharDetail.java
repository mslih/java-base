public class CharDetail {
    public static void main(String[] args) {
        char c = 97; // 字符类型可以直接存放一个数字，当输出时，会输出数字表示的字符
        System.out.println(c);
        int i = (int) c; // char 可以和int 互相转换
        System.out.println(i);
        // 在java中,char本质是一个整数，在默认输出时，是输出整数对应的字符,如果要输出对应的数字，可以使用（int）进行转换
        // char 可以参与数学运算
        System.out.println('a' + 100);
    }
}
