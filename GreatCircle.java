public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        double r = 6371.0; // Mean radius of the Earth in kilometers

        double sinSquaredX = Math.sin((x2 - x1) / 2) * Math.sin((x2 - x1) / 2);
        double sinSquaredY = Math.sin((y2 - y1) / 2) * Math.sin((y2 - y1) / 2);

        double a = sinSquaredX + Math.cos(x1) * Math.cos(x2) * sinSquaredY;
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        double distance = r * c;

        System.out.println(distance + " kilometers");
    }
}
