class Client {
    private String firstName;
    private String lastName;
    private boolean premium;

    public Client(String firstName, String lastName, boolean premium) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.premium = premium;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
}

//Klasa Client jest zgodna z konwencją JavaBeans i przechowuje informacje o imieniu, nazwisku oraz to, czy klient jest klientem premium. Konstruktory, gettery oraz settery generujemy z pomocą środowiska, korzystając ze skrótu Alt + Insert lub ⌘ + N na MacOS.