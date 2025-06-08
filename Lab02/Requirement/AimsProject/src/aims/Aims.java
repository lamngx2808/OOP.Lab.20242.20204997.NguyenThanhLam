package aims;

public class Aims {
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();

        // Create new DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);

        // Test adding DVDs
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        // Test method overloading
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Harry Potter");
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Inception",
                "Sci-Fi", "Christopher Nolan", 148, 22.99f);

        DigitalVideoDisc[] dvdList = {dvd4, dvd5};
        cart.addDigitalVideoDisc(dvdList);

        // Display cart
        cart.displayCart();

        // Test removing a DVD
        cart.removeDigitalVideoDisc(dvd3);
        cart.displayCart();

        // Test total cost
        System.out.println("Total cost is: $" + cart.totalCost());

        // Print number of DVDs created
        System.out.println("Total DVDs created: " +
                DigitalVideoDisc.getNbDigitalVideoDiscs());
    }
}