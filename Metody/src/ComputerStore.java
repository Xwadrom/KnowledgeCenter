public class ComputerStore {
    public static void main(String[] args) {

        ComputerFactory factory = new ComputerFactory();
        Computer comp1 = factory.create("Intel I5", 8192);
        Computer comp2 = factory.create("AMD Ryzen", 16194);

//        Computer comp1= new Computer();
//        comp1.processor="Intel I7";
//        comp1.memory=8;

//        Computer comp2= new Computer();
//        comp2.processor="AMD Ryzen";
//        comp2.memory=16;

        System.out.println(comp1.processor+ " "+ comp1.memory);
        System.out.println(comp2.processor+ " "+ comp2.memory);

        comp1.compInfo();
        System.out.println(comp1.getInfo());// najbardziej przyjazna i zrozumiała dla mnie forma wyświetlania

        ComputerUpgrade compUpgrade1 = new ComputerUpgrade();
        compUpgrade1.addMemory(comp1, 8);
        comp1.compInfo();
    }
}
