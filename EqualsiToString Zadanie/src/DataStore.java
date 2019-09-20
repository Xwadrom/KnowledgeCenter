public class DataStore extends Computer {


    final static int MAX_COMPUTERS = 100;
    private Computer[] notebook = new Computer[MAX_COMPUTERS];
    private int computernumber;
    private boolean samecomputerask;
    private int samecomputercount;

    //metody

    public void add(Computer computer) {
        if (computernumber < MAX_COMPUTERS)
            notebook[computernumber] = computer;
        computernumber++;
    }

    public void getinfo() {
        for (int i = 0; i < computernumber; i++) {
            System.out.println(notebook[i].toString());
        }

    }

    public int checkAvailability(Computer find) {
        if (find == null)
            return 0;

        int count = 0;
        for (int i = 0; i < computernumber; i++) {
            if (find.equals(notebook[i])) {
                count++;
            }
        }
        return count;



//    public int checkAvailability() {
//        for (int i = 0; i < computernumber; i++) {
//            for(int k =i+1; k < computernumber; k++){
//                if (notebook[i].equals(notebook[k])){
//                    samecomputercount++;
//                }
//            }
//        }
//        return samecomputercount;

//    public int checkAvailability() {
//
//        for (int i = 0; i < computernumber; i++) {
//            samecomputerask = (notebook[i].equals(notebook[i+1]));
//            if (samecomputerask==true){
//                samecomputercount+=samecomputercount+1;
//            }
//
//
//        }
//        return samecomputercount;

    }

    //gettery settery

    public static int getMaxComputers() {
        return MAX_COMPUTERS;
    }

    public Computer[] getNotebook() {
        return notebook;
    }

    public void setNotebook(Computer[] notebook) {
        this.notebook = notebook;
    }

    public int getComputernumber() {
        return computernumber;
    }

    public void setComputernumber(int computernumber) {
        this.computernumber = computernumber;
    }

}
