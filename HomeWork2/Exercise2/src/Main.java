public class Main {
    public static void main(String[] args) {
    Product ProductPC1 = new Product("MacBook-10",50000,4.6);
    Product ProductPS1 = new Product("XBox",20000,4.1);
    String next = "||";

    Category category1 = new Category("PC");
    category1.products = new Product[]{ProductPC1};
    Category category2 = new Category("PS");
    category2.products = new Product[]{ProductPS1};

    User user1 = new User("user1","user1", new Basket());
    user1.basket.boughtProduct = new Product[]{ProductPC1};
        System.out.printf(" Имя: %s ", user1.basket.boughtProduct[0].name);
        System.out.printf(" Цена: %s ", user1.basket.boughtProduct[0].price);
        System.out.printf(" Рейтинг: %s %s", user1.basket.boughtProduct[0].rating, next);

        User user2 = new User("user2","user2", new Basket());
        user2.basket.boughtProduct = new Product[]{ProductPS1};
        System.out.printf(" Имя: %s ", user2.basket.boughtProduct[0].name);
        System.out.printf(" Цена: %s ", user2.basket.boughtProduct[0].price);
        System.out.printf(" Рейтинг: %s ", user2.basket.boughtProduct[0].rating);
    }
    }

