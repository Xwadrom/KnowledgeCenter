public class Computer {

    String processor;
    int memory;

    void compInfo() //w nawiasach nic nie piszemy bo bedziemy korzystac z pól obiektów processor i memory
    {
        System.out.println(processor +" "+ memory);//odwołanie do procesor i memory ktore sa na górze
    }

    String getInfo(){
        String description = processor + " " + memory;
        return description;
        //return = processor + " " + memory;  skrócna wersja bardziej popularna

    }
}


