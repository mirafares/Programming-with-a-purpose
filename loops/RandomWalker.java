public class RandomWalker {
    public static void main(String[] args) {
        int distance = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = 0;

        System.out.println("(" + x + ", " + y + ")");

        while (Math.abs(x) + Math.abs(y) < distance) {
            int direction = (int) (Math.random() * 4);
            switch (direction) {
                case 0:  // North
                    y++;
                    break;
                case 1:  // East
                    x++;
                    break;
                case 2:  // South
                    y--;
                    break;
                case 3:  // West
                    x--;
                    break;
            }
            steps++;
            System.out.println("(" + x + ", " + y + ")");
        }

        System.out.println("steps = " + steps);
    }
}
