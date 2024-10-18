public class Menultem extends MenuComponent {
    String name;
    String description;
    double price;

    public Menultem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println(getName() + ", " + getPrice() + " -- " + getDescription());
    }
}
