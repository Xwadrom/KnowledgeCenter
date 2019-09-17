public class Computer {
    private double cpuTempereture;
    private int ramMemory;

    public Computer(double cpuTempereture, int ramMemory) {//Kazda klasa ma swoją nadrzędna klase, nawet klasa computer ma nadrzedna domyslna klase o nazwie object ktora wywolywana jest z instrukcja super()
        this.cpuTempereture = cpuTempereture;
        this.ramMemory = ramMemory;
    }

    public double getCpuTempereture() {
        return cpuTempereture;
    }

    public void setCpuTempereture(double cpuTempereture) {
        this.cpuTempereture = cpuTempereture;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }
    public void coolDown(){
        cpuTempereture=cpuTempereture-1;
    }
}
