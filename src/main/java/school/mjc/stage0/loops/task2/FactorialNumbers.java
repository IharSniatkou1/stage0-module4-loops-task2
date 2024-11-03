package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        int factorial = 1;

        while (i <= printToInclusive) {
            if (i == 0) {
                factorial = 1; // 0! is 1
            } else {
                factorial *= i; // Calculate i! based on (i-1)! * i
            }
            System.out.println(factorial);
            i++;
        }
    }
}
