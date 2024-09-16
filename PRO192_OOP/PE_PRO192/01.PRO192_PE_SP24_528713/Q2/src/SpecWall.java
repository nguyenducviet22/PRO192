
public class SpecWall extends Wall {

    private String color;

    public SpecWall() {
    }

    public SpecWall(String place, int area, String color) {
        super(place, area);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.getPlace() + ", " + color + ", " + super.getArea();
    }

    public void setData() {
        String rs = "";
        for (char c : this.getPlace().toCharArray()) {
            if (Character.isLetter(c)) {
                rs += c;
            }
        }
        setPlace(rs);
    }

    public String getValue() {
        int placeLength = this.getPlace().length();
        int area = super.getArea();
        if (area % placeLength != 0) {
            return color;
        } else {
            int rs = area / placeLength;
            return color + rs;
        }
    }
}
