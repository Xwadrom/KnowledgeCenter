class DiscountService {
    public double calculateDiscountPrice(Client client, double price) {
        if(client.isPremium())
            return calculatePremiumDiscount(price);
        else
            return calculateStandardDiscount(price);
    }

    private double calculateStandardDiscount(double price) {
        if(price > 1000)
            return applyDiscount(price, 0.1);
        else
            return price;
    }

    private double calculatePremiumDiscount(double price) {
        if(price > 1000)
            return applyDiscount(price, 0.15);
        else
            return applyDiscount(price, 0.05);
    }

    private double applyDiscount(double price, double discount) {
        return price * (1 - discount);
    }
}

//Klasa DiscountService wygląda na pierwszy rzut oka na trochę skomplikowaną, jednak jeśli zaczniemy czytać kod od góry do dołu to okaże się, że dzięki odpowiedniemu nazewnictwu metod wszystko jest bardzo przejrzyste. Zwróć uwagę, że tylko metoda calculateDiscountPrice() jest publiczna, a to oznacza, że chcemy, żeby w innych klasach wywoływano tylko i wyłącznie tę metodę. Po co więc stworzyliśmy dodatkowe metody prywatne? Przede wszystkim dla czytelności. Zauważ, że dzięki odpowiedniemu nazewnictwu metod jesteśmy w stanie zrozumieć kod po prostu go czytając:
//
//double calculateDiscountPrice(Client client, double price) - zwróć cenę po rabacie dla wskazanego klienta i podanej ceny wyjściowej,
//if(client.isPremium()) - jeżeli klient jest premium,
//return calculatePremiumDiscount(price); - to nalicz mu zniżkę premium
//W tym momencie przechodzimy do metody obliczającej rabat premium.
//
//double calculatePremiumDiscount(double price) - oblicz rabat premium dla wskazanej ceny,
//if(price > 1000) - jeżeli cena jest powyżej 1000zł,
//return applyDiscount(price, 0.15); - to zaaplikuj zniżkę w wysokości 15%
//itd.