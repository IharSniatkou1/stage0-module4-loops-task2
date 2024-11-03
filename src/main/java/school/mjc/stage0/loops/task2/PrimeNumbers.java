package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 2;

        while (number <= printToInclusive) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            number++;
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        int i = 2;

        while (i <= Math.sqrt(num)) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
