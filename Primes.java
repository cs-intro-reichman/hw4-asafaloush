public class Primes {
    public static void main(String[] args) {
        final int n = Integer.parseInt(args[0]);
        boolean[] prime = new boolean[n+1];
        for (int i = 0; i < prime.length; i ++){
            if (i <=1){
                prime[i] = false;
            }
            else{
                prime[i] = true;
            }
        }
        for (int i = 0; i < prime.length; i ++){
            if (prime[i] == true){
                for (int c = i+1; c < prime.length; c++){
                    if (c%i == 0){
                        prime[c] = false;
                    }
                }
            }
        }
        System.out.println("Prime numbers up to " + n + ":");
        int counter = 0;
        for (int p = 0; p < prime.length; p ++){
            if (prime[p] == true){
                System.out.println(p);
                counter ++;
            }
        }
        double rat = n;
        double ratio = counter/rat*100;
        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + (int) ratio + "% are primes)");
    }
}