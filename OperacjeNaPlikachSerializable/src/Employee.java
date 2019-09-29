import java.io.Serializable;

public class Employee extends Person implements Serializable {

}
//Weź pod uwagę, że mechanizm serializacji wymaga, aby w klasie nadrzędnej, która nie implementuje interfejsu Serializable był zdefiniowany konstruktor bez argumentów. W naszym przypadku jeżeli klasa Person nie implementowałaby interfejsu Serializable i próbowalibyśmy zdefiniować klasę Employee (pracownik) dziedziczącą po niej, to w poniższej sytuacji otrzymamy błąd:
//
//import java.io.Serializable;
//
//class Employee extends Person implements Serializable {

//ponieważ klasa Person nie posiada konstruktora bez parametrów (ani domyślnego, bo zdefiniowany jest konstruktor z 2 parametrami). W celu jego wyeliminowania w klasie Person należałoby zdefiniować konstruktor, który nie musi nic robić:
//
//public Person(){}