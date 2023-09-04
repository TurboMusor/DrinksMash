public class DrinksMaker {
    private static int quantity;

    public static void makeCoffee(int quantity) {
        DrinksMaker.quantity = quantity;
        System.out.println("Приготовлено " + quantity + " порцій кави");
    }

    public static void makeTea(int quantity) {
        System.out.println("Приготовлено " + quantity + " порцій чаю");
    }

    public static void makeLemonade(int quantity) {
        System.out.println("Приготовлено " + quantity + " порцій лимонаду");
    }

    public static void makeMojito(int quantity) {
        System.out.println("Приготовлено " + quantity + " порцій мохіто");
    }

    public static void makeMineralWater(int quantity) {
        System.out.println("Приготовлено " + quantity + " порцій мінеральної води");
    }

    public static void makeCocaCola(int quantity) {
        System.out.println("Приготовлено " + quantity + " порцій Кока-Коли");
    }
}

