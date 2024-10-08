/* 暗黙の型変換・キャストによる型変換 */

public class Practice33 {
    public static void main(String[] args) {
        byte a = 10;
        int b = a;   // 暗黙の型変換

        System.out.println("aの値は：" + a);
        System.out.println("bの値は：" + b);

        double num = 10.99;
        int i = (int)num;    // キャストによる型変換

        System.out.println("numの値は：" + num);
        System.out.println("iの値は：" + i);
    }
}
