public class RangeCalc {

    double metersForCentimeters(double x){
        double mc= x*100;
        System.out.println(x+ " metrów " + "= " +mc+" centymetórw");
        return mc;
    }

    double metersForMilimeters(double x){
        double mc= x*1000;
        System.out.println(x+ " metrów " + "= " +mc+" milimetórw");
        return mc;
    }

    double centimetersForMeters(double x) {
        double mc = x / 100;
        System.out.println(x + " centymetrów " + "= " + mc + " metórw");
        return mc;
    }


    double milimetersForMeters(double x) {
        double mc = x / 1000;
        System.out.println(x + " milimetrów " + "= " + mc + " metrów");
        return mc;
    }
}
