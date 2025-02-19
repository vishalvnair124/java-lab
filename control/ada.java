package control;

public class ada {

    public static void main(String[] args) {
        int num = 4;
        boolean isprime = true;

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }

        }

        if (isprime) {

            System.out.println(num + " is a prime");
        } else {

            System.out.println(num + "is not prime");
        }
    }

}