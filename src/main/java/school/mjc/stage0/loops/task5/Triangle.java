package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int n) {
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < n; j++) {
                System.out.print(j <= i ? "8" : " ");
            }
            System.out.println();
        }
    }


}
