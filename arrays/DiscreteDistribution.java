import java.util.Arrays;

public class DiscreteDistribution {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int[] a = new int[args.length - 1];
        int n = a.length;

        // Parse command-line arguments as array elements
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
        }

        int[] cumulativeSums = new int[n];
        cumulativeSums[0] = a[0];

        // Calculate cumulative sums
        for (int i = 1; i < n; i++) {
            cumulativeSums[i] = cumulativeSums[i - 1] + a[i];
        }

        // Generate random indices
        for (int i = 0; i < m; i++) {
            int r = (int) (Math.random() * cumulativeSums[n - 1]);

            // Find the unique index i based on cumulative sums
            int index = 0;
            while (cumulativeSums[index] <= r) {
                index++;
            }

            System.out.print((index + 1));

            if (i < m - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
