public class Main {

    public static void main(String[] args) {

        int number = -5;
        int remainder = number % 2;
        System.out.println(remainder);
        // prime: asal
        boolean isPrime = true;

        if(number==1){
            System.out.println(number +" asal sayı değildir.");
            return;
        }

        if(number<1){
            System.out.println("Geçersiz sayı.");
            return;
        }

        for(int i = 2; i<number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println(number + " asal sayıdır.");
        }
        else
            System.out.println(number + " asal sayı değildir.");


    }
}
