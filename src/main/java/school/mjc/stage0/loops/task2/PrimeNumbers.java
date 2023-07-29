package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 0;
        while (i <= printToInclusive) {
            if ((i % 2 == 0 || i % 3 == 0 || i % 5 == 0) &&  (i != 2 && i != 3 && i != 5)) {
                i++;
                continue;
            } else if (i == 1) {
                i++;
            } else {
                System.out.println(i);
                i++;
            }


        }
    }


}
