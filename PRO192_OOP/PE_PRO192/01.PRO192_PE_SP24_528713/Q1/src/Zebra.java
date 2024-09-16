public class Zebra {
    private String owner;
    private int weight;

    public Zebra() {
    }

    public Zebra(String owner, int weight) {
        this.owner = owner;
        this.weight = weight;
    }

    public String getOwner() {
        String rs = "";
        for (char c:owner.toCharArray()){
            if (Character.isDigit(c) && Character.getNumericValue(c) %2 != 0)
                rs += c;
            else if (!Character.isDigit(c))
                rs += c;
        }
        return rs;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight - this.owner.length();
    }
}
