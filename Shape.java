public abstract class Shape {
    public abstract double surface_area();
    public abstract double volume();
}


class Sphere extends Shape {
    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }

    // surface_area() method
    @Override
    public double surface_area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // volume() method
    @Override
    public double volume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    // display surface_area() and volume()
    public String toString() {
        return "Sphere [Surface Area: " + surface_area() + ", Volume: " + volume() + "]";
    }
}


class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // surface_area() method
    @Override
    public double surface_area() {
        double baseArea = Math.PI * Math.pow(radius, 2);
        double lateralSurface = 2 * Math.PI * radius * height;
        return 2 * baseArea + lateralSurface;
    }

    // volume() method
    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // display surface_area() and volume()
    @Override
    public String toString() {
        return "Cylinder [Surface Area: " + surface_area() + ", Volume: " + volume() + "]";
    }
}


class Cone extends Shape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // surface_area() method
    @Override
    public double surface_area() {
        double baseArea = Math.PI * Math.pow(radius, 2);
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        double lateralSurface = Math.PI * radius * slantHeight;
        return baseArea + lateralSurface;
    }

    // volume() method
    @Override
    public double volume() {
        return (1.0 / 3) * Math.PI * Math.pow(radius, 2) * height;
    }

    // display surface_area() and volume()
    @Override
    public String toString() {
        return "Cone [Surface Area: " + surface_area() + ", Volume: " + volume() + "]";
    }
}