public class Doctor extends Person {

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Doctor(String firstName, String lastName, double salary, double bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }
    public String getinfo(){
        return super.getInfo() + ", Premia: "+ bonus;//Rozszerzenie klasy Person o dodatkowe pole z premią. Zwróć także uwagę, że w metodzie getInfo() w wygodny sposób posłużyliśmy się konstrukcją super.getInfo() dodając tylko informację o wysokości premii.
    }
}
