import java.util.ArrayList;

public class MapSetInterview {
    static class Test {
        public ArrayList<Integer> data;

        public Test() {
            data = new ArrayList<>();
        }
    }


    public static void main(String[] args) {
        Test t = new Test();
        t.data.add(1);
        t.data.add(2);
        t.data.add(3);

        Test t2 = copy(t);
    }

    private static Test copy(Test t) {
        //浅拷贝
        Test t2 = new Test();
        t2.data = t.data;
        return t2;
    }
}
