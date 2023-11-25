import java.util.ArrayList;
import java.util.List;

public class GroceryBasket {

    private final int[] numbering = {1, 2, 3};
    private final String[] products = {"Молоко", "Хлеб", "Гречневая крупа"};
    private final int[] prices = {50, 14, 80};
    private int productNumber;
    private int productAmount;
    private int[] storage = new int[products.length];
    private int totalCost = 0;

    public void printInfo() {
        System.out.println("Список возможных товаров для покупки:");
        System.out.printf("|%-2s|%s|%-5s|%s|\n", "№", "Наименование продукта", "Цена", "Единица измерения");
        for(int i = 0; i < numbering.length; i++) {
            System.out.printf("|%-2s|%-21s|%-5d|%-17s|\n", numbering[i], products[i], prices[i], "руб/шт");
        }
    }

    public void setProducts(int productNumber, int productAmount) {
        this.productNumber = productNumber;
        this.productAmount = productAmount;
        doStorage();
    }

    public void doStorage() {
        if (productNumber >= 0 && productNumber < products.length) {
            storage[productNumber] += productAmount;
            totalCost += productAmount * prices[productNumber];
        } else {
            System.out.println("Ошибка: Некорректный номер продукта.");
        }
    }

    public String basket() {
        List<String> buyingList = new ArrayList<>();
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] > 0) {
                buyingList.add("Куплен продукт " + products[i] + " на сумму " + storage[i] * prices[i] + " руб.");
            }
        }
        return String.join("\n", buyingList) + " Общая сумма: " + totalCost;
    }

}
