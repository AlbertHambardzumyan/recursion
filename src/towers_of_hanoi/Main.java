package towers_of_hanoi;

public class Main {
    public static void main(String[] args) {
        int totalDisks = 3;
        int startPeg = 1;
        int endPeg = 3;
        int tempPeg = 2;

        TowerOfHanoi.solveTowers(totalDisks, startPeg, endPeg, tempPeg);
    }
}
