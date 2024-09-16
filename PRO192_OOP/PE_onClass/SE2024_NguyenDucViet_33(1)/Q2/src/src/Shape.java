public class Shape {
    protected String name;
    protected String fillColor;

    public Shape() {
        name = "no name";
        fillColor = "white";
    }

    public Shape(String name, String fillColor) {
        this.name = name;
        this.fillColor = fillColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", name, fillColor);
    }
    
    
}
