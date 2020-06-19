public class UnusualAdd {
    public int addAB(int a, int b) {
        if (b == 0) {
            return a;
        }
        int sum = a ^ b;
        int add = (a & b) << 1;
        return addAB(sum, add);
    }
}
