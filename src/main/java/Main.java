public class Main {
    public static void main(String[] args) {

        GroceryBasket groceryBasket = new GroceryBasket();
        groceryBasket.printInfo();

        groceryBasket.setProducts(1, 3);


        String basketInfo = groceryBasket.basket();
        System.out.println(basketInfo);
    }
}
