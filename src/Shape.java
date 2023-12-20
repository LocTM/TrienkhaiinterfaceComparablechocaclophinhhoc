public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
    public int compareTo(Shape other) {
        // Compare shapes based on their areas
        // Note: You might want to throw an exception if the subclass doesn't override getArea()
        double thisArea = this instanceof Circle ? ((Circle) this).getArea() : 0;
        double otherArea = other instanceof Circle ? ((Circle) other).getArea() : 0;

        if (thisArea < otherArea) {
            return -1; // "this" shape is smaller
        } else if (thisArea > otherArea) {
            return 1;  // "this" shape is larger
        } else {
            return 0;  // Shapes are equal in area
        }
    }
}