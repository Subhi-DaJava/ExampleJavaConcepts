package class_path_example.class_path;

/**
 * Pythagoras' famous theorem of a²+b²=c².
 */
public class PythagoreTheory {
    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x1 - x2;
        double dy = y1 - y2;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
