//W Javie 8 istnieje także możliwość zdefiniowania samodzielnie dowolnego interfejsu funkcyjnego. Zgodnie z definicją jest to interfejs posiadający tylko jedną abstrakcyjną metodę, czyli np:
@FunctionalInterface
interface IncrementalPrinter<T> {
    public T doSomething(T t);
}
//Interfejs IncrementalPrinter ma zdefiniowaną jedną metodę abstrakcyjną doSomething(). Metoda ta zwraca typ zgodny z parametrem interfejsu oraz przyjmuje argument tego samego typu. Opcjonalnie można wykorzystać adnotację @FunctionalInterface. Nie jest ona wymagana, jednak pozwoli nam od razu zweryfikować, czy nasz interfejs faktycznie jest funkcyjny. Przy użyciu adnotacji, próba dodania kolejnej metody abstrakcyjnej sprawi, że otrzymamy błąd kompilacji.