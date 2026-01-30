public class Rectangle implements Shape {
    
    private long width;
    private long height;

    public Rectangle (long width, long height) throws Exception {
        setWidth(width);
        setHeight(height);
    }

    public Rectangle(){};

    public long getWidth() {
        return width;
    }

    public long getHeight() {
        return height;
    }

    public void setWidth(long width) throws Exception {
        if (width <= 0) {
            throw new Exception ("Width must be a positive value!");
        } 
        this.width = width;
    }

    public void setHeight(long height) throws Exception {
        if (height <= 0) {
            throw new Exception ("Height must be a positive value!");
        } 
        this.height = height;
    }

    public String toString() {
        return "Rectangle with height: " + height + " and width: " + width;
    }

    public long getArea() {
        return height * width;
    }

    public long getPerimeter() {
        return 2 * (height + width);
    }

}
