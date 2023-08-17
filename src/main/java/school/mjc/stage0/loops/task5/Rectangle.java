package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int m, int n){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i != 0 && i != n - 1) {
                    System.out.print(j == 0 || j == m - 1 ? "8" : " ");
                } else {
                    System.out.print("8");
                }
            }
            System.out.println();
        }
    }
}
