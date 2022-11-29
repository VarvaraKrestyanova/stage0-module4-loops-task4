package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {

        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else {
            int sum = 0;
            for (int i = 1; i < lastInRow; i++) {
                if (i == numberToSkip) {continue;}
                sum += i;
            }
            System.out.println("skipped sum is " + numberToSkip);
            System.out.println("counted sum is " + sum);
        }

    }
}
