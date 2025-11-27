package vaje08;

public class Fibonacci {
    private int n = 1;
    private int n1 = 1;

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci(); // prva dva člena sta 5 in 2
        System.out.println(fib.naslednji()); // izpiše 7 (tretji člen zaporedja)
        System.out.println(fib.naslednji()); // izpiše 9 (četrti člen zaporedja)
        System.out.println(fib.naslednji()); // izpiše 16 (peti člen zaporedja)
        System.out.println(fib.naslednji());
    }

    public Fibonacci() {}

    public Fibonacci(int n, int n1) {
        this.n = n;
        this.n1 = n1;
    }

    public int naslednji() {
        int n_new = n + n1;
        n = n1;
        n1 = n_new;
        return n_new;
    }
}
