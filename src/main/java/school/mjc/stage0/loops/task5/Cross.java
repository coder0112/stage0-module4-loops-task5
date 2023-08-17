package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int n) {

        for (int i = 0; i < n; i++) {
            if (i != n / 2) {
                for (int j = 0; j < n; j++) {
                    System.out.print(j == n / 2 ? "8" : " ");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    System.out.print("8");
                }
            }
            System.out.println();
        }
    }
}
