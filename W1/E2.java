package W1;
public class E2 {
    public Integer square(int value) {
        return value * value;
    }

    public Integer timesTwo(int value) {
        return value * 2;
    }

    public Integer half(int value) {
        return value / 2;
    }

    public double degreesToRadians(int value) {
        return value * (Math.PI / 180);
    }

    public Boolean isOdd(int value) {
        return (value % 2 != 0);
    }

    public Boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        
        for (int i = 2;i<Math.sqrt(value);i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
