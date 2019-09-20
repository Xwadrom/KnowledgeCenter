public enum Type {
    MARGHERITA(true, true, false, false),
    CAPRICIOSA(true, true, false, true ),
    PROSCIUTTO(true, true, true, false);

    Pizza pizza1 = new Pizza();

    Type(boolean tomato, boolean cheese, boolean ham, boolean mushroom) {
        pizza1.setTomatoSauce(tomato);
        pizza1.setCheese(cheese);
        pizza1.setHam(ham);
        pizza1.setMushroom(mushroom);
    }


    public String toString1() {
        return pizza1+"";
    }

    public Pizza getPizza1() {
        return pizza1;
    }

    public void setPizza1(Pizza pizza1) {
        this.pizza1 = pizza1;
    }
}
