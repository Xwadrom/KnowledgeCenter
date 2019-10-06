//Zgodnie z lekcją wprowadzającą, gdzie pokazywaliśmy hierarchię dziedziczenia, kolejki reprezentowane są przez interfejs Queue (czytaj "kju"). Istnieją dwie podstawowe implementacje tego interfejsu. Pierwszą już poznaliśmy i jest nią LinkedList. Druga to PriorityQueue.
//
//Kolejka priorytetowa pozwala dodatkowo określić priorytet i jeżeli jest on wyższy od elementów, które są już w kolejce, to element ten zostanie przesunięty "wyżej" w kolejce (analogicznie, gdy w sklepie przepuszczamy matkę z dzieckiem lub osobę niepełnosprawną). Kolejność ta ustalana jest przez naturalny porządek elementów wyznaczany przez interfejs Comparable lub odpowiedni komparator przekazany w konstruktorze kolejki.
//
//Trzy najważniejsze metody, które należy zapamiętać to:
//
//offer(E e) - dodaje do kolejki element zgodny z zadeklarowanym typem generycznym (można też wywołać metodę add()),
//peek() - pobiera element z kolejki, ale go nie usuwa,
//poll() - pobiera element z kolejki i go z niej usuwa. Zwraca null, gdy kolejka jest pusta.
//Dobrym zastosowaniem kolejki mogłaby być np. lista Todo (rzeczy do zrobienia), gdzie ustalamy sobie plan dnia i dodajemy zadania z konkretnymi priorytetami. Inne dobre zastosowanie to np. panel helpdesk. Jeżeli ktoś zgłasza się do nas o pomoc dodawany jest do kolejki i obsługiwany w pierwszej kolejności, przed osobami, które zgłaszają się później, chyba, że mamy klientów premium, wtedy oni będą obsługiwani w pierwszej kolejności.
//Definicja metod hashCode(), czy implementowanie interfejsu Comparable jest zbędne, ponieważ kolejki nie dbają w żaden sposób o unikalność obiektów.
//Definicja kolejki wygląda następująco:

class Client {
    private String nickname;

    public Client(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return nickname;
    }
}