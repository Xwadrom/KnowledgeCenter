public class Pizza {

    private boolean tomatoSauce;
    private boolean cheese;
    private boolean ham;
    private boolean mushroom;
    private Type type;

    public Type getType() {
        return type;
    }
    public Type setType(Type type) {
        return this.type;
    }

    String ingredients;

    @Override
    public String toString() {
        if (tomatoSauce) {
            System.out.print("Sos pomidorowy, ");
        }
        if (cheese) {
            System.out.print("Ser, ");
        }
        if (ham) {
            System.out.print("Szynka, ");
        }
        if(mushroom) {
            System.out.print("Pieczarki, ");
        }
        return  ingredients;
    }

    public boolean isTomatoSauce() {
        return tomatoSauce;
    }

    public void setTomatoSauce(boolean tomatoSauce) {
        this.tomatoSauce = tomatoSauce;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isHam() {
        return ham;
    }

    public void setHam(boolean ham) {
        this.ham = ham;
    }

    public boolean isMushroom() {
        return mushroom;
    }

    public void setMushroom(boolean mushroom) {
        this.mushroom = mushroom;
    }
}
