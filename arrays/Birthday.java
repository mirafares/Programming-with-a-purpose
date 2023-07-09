public class Birthday {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int[] count = new int[n + 1];
        int total = 0;

        for (int t = 0; t < trials; t++) {
            boolean[] birthdays = new boolean[n];
            int people = 0;

            while (true) {
                int day = (int) (Math.random() * n);

                if (birthdays[day]) {
                    break;
                }

                birthdays[day] = true;
                people++;
            }

            count[people]++;
            total += people;

            if (total >= trials / 2.0) {
                break;
            }
        }

        double fraction = 0.0;


        for (int i = 1; i <= n; i++) {
            fraction += (double) count[i] / trials;
            System.out.printf("%d\t%d\t%.6f\n", i, count[i], fraction);

            if (fraction >= 0.5) {
                break;
            }
        }
    }
}
