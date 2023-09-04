enum DrinksMachine {
    COFFEE("Кава"),
    TEA("Чай"),
    LEMONADE("Лимонад"),
    MOJITO("Мохіто"),
    MINERAL_WATER("Мінеральна вода"),
    COCA_COLA("Кока-Кола");

    private final String name;

    DrinksMachine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


