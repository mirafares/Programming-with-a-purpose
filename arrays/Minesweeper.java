public class Minesweeper {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        char[][] grid = new char[m][n];

        // Initialize the grid with empty cells
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '0';
            }
        }

        // Place mines randomly
        int count = 0;
        while (count < k) {
            int row = (int) (Math.random() * m);
            int col = (int) (Math.random() * n);

            if (grid[row][col] != '*') {
                grid[row][col] = '*';
                count++;
            }
        }

        // Calculate neighboring mine counts
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != '*') {
                    int mines = 0;

                    // Check all neighboring cells
                    for (int x = -1; x <= 1; x++) {
                        for (int y = -1; y <= 1; y++) {
                            int newRow = i + x;
                            int newCol = j + y;

                            if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && grid[newRow][newCol] == '*') {
                                mines++;
                            }
                        }
                    }

                    grid[i][j] = (char) (mines + '0');
                }
            }
        }

        // Print the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
