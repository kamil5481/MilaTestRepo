import java.util.HashSet;
import java.util.Scanner;

public class MyTask {

    public int result;
    public HashSet<Integer> haszSet = new HashSet<>();

    public int solution(int[] A) {
        for (int x = 0; x < A.length; x++) {
            haszSet.add(A[x]);
        }
        for (int x = 1; x <= haszSet.size(); x++) {
            if (haszSet.contains(x)) {
            } else {
                result = (x);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MyTask newTask = new MyTask();
        Scanner skaner = new Scanner(System.in);
        String[] B = skaner.next().split(",");
        int[] A = new int[B.length];
        for (int x = 0; x < B.length; x++) {
            if (B[x].equals("0")) {
                break;
            } else {
                A[x] = Integer.parseInt(B[x]);
            }


        }
        System.out.println(newTask.solution(A));
    }
}