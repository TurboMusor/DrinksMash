
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Order order = new Order();

                while (true) {
                    System.out.println("Меню напоїв:");
                    for (DrinksMachine drink : DrinksMachine.values()) {
                        System.out.println(drink.ordinal() + 1 + ". " + drink.getName());
                    }
                    System.out.println("0. Завершити замовлення");

                    System.out.print("Виберіть номер напою: ");
                    int choice = scanner.nextInt();

                    if (choice == 0) {
                        break;
                    }

                    if (choice >= 1 && choice <= DrinksMachine.values().length) {
                        DrinksMachine selectedDrink = DrinksMachine.values()[choice - 1];
                        System.out.print("Введіть кількість порцій: ");
                        int quantity = scanner.nextInt();
                        order.addDrink(selectedDrink, quantity);
                    } else {
                        System.out.println("Некоректний вибір, спробуйте ще раз.");
                    }
                }

                scanner.close();

                // Виведення замовлення
                order.printOrderSummary();

                // Обчислення та виведення загальної вартості
                System.out.println("Загальна вартість: " + order.calculateTotalCost() + " грн");
            }
        }


