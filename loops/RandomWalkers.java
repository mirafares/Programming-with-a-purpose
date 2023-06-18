public class RandomWalkers {
    public static void main(String[] args) {
        int distance = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int totalSteps = 0;

        for (int i = 0; i < trials; i++) {
            int x = 0, y = 0; // Starting position at (0, 0)
            int steps = 0;

            while (Math.abs(x) + Math.abs(y) < distance) {
                int direction = (int) (Math.random() * 4); // 0: North, 1: East, 2: South, 3: West

                switch (direction) {
                    case 0:
                        y++;
                        break;
                    case 1:
                        x++;
                        break;
                    case 2:
                        y--;
                        break;
                    case 3:
                        x--;
                        break;
                }

                steps++;
            }

            totalSteps += steps;
        }

        double averageSteps = (double) totalSteps / trials;
        System.out.println("average number of steps = " + averageSteps);
    }
}
