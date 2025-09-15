public class DataTypes {
    public static void main(String[] args) {
        sum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    public static long sum(int[] numbers) {
        long s = 0; // variable to accumulate the sum in!
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        System.out.println(s);
        return s;
    }
}
