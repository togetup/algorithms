public class Main {

    public static void main(String[] args) {

        // 1. 声明固定长度，并循环赋值
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        // 2. 声明即赋值
        int[] scores = new int[]{100, 99, 88};
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        // 3. 修改数组元素，并使用for-in遍历输出
        // 能使用 for-in 这种方式是因为arry是可迭代的，涉及到偏底层，后面研究
        scores[0] = 98;
        for (int score : scores) {
            System.out.println(score);
        }

    }
}
