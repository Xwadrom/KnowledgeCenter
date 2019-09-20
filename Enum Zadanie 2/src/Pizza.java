public enum Pizza {

    MARGHERITA(true, true, false, false),
    CAPRICIOSA(true, true, true, false),
    PROSCIUTTO(true, true, false, true);

    private boolean tomatoSauce;
    private boolean cheese;
    private boolean mushrooms;
    private boolean ham;

    private Pizza(boolean tomatoSauce, boolean cheese, boolean mushrooms, boolean ham) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.mushrooms = mushrooms;
        this.ham = ham;
    }

    public boolean getTomatoSauce() {
        return tomatoSauce;
    }

    public boolean getCheese() {
        return cheese;
    }

    public boolean getMushrooms() {
        return mushrooms;
    }

    public boolean getHam() {
        return ham;
    }

    @Override
    public String toString() {
        // przypisanie nazwy pizzy
        String result = this.name() + "(";
        // informacja o składnikach
        if (tomatoSauce) {
            result = result + "sos pomidorowy";
        }
        if (cheese) {
            result = result + ", ser";
        }
        if (mushrooms) {
            result = result + ", pieczarki";
        }
        if (ham) {
            result = result + ", szynka";
        }
        result = result + ")";

        return result;
    }
}
