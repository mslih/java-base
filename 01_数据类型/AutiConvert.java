// 自动数控类型转换
public class AutiConvert {
    public static void main(String[] args) {
        /**
         * 有多种类型的数据混合运算时，系统会首先自动将所有的数据转换成容量最大的那种数据类型，然后在进行计算
         */
        int n1 = 10;
        float d1 = n1 + 1.1; // 报错：1.1默认是double类型，所以运算结果为double类型，double类型不能自动转换成float类型

        // 当把一个具体的值赋值给byte时，先判断该数是否在byte范围内，然后赋值
        byte b1 = 10; // 成功
        int i2 = 1;
        byte b2 = i2; // 错误：如果时变量赋值，则会判断类型
    }
}
