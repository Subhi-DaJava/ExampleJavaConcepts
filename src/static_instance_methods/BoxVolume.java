package static_instance_methods;

public class BoxVolume {
    double height;
    double width;
    double length;

    public BoxVolume(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double getVolume() {
        return this.height * this.width * this.length;
    }
}
