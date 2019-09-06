public class Computer {

    String processor;
    int memory;

    void printinfo(){
        System.out.println(processor+ " "+ memory);
    }
    String getInfo(){
        return processor + " " +memory;
    }
}
