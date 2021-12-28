import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        boolean[] b1 = new boolean[34];
        int[] red = new int[6];
        int used = 0;
        int i = 0;
        // 随机生成红球
        for (i = 0; i < red.length; i++) {
            do {
                used = (int) (Math.random() * 33 + 1);
                if (b1[used] == false) {
                    red[i] = used;
                    b1[used] = true;
                    break;
                }
            } while (b1[used]);
        }
        System.out.println("红球编号：" + Arrays.toString(red) + "");
        // 随机生成蓝球
        int blue = (int) (Math.random() * 16 + 1);
        System.out.println("蓝球编号：" + blue);
    }
}