public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int[] sequence = new int[n];

        for (int i = 0; i < n; i++) {
            sequence[i] = Integer.bitCount(i) % 2;
        }

        char[][] pattern = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sequence[i] == sequence[j]) {
                    pattern[i][j] = '+';
                } else {
                    pattern[i][j] = '-';
                }

                System.out.print(pattern[i][j] + "  ");
            }

            System.out.println();
        }
    }
}
