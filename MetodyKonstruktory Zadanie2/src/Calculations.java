public class Calculations {
    public static void main(String[] args) {

        double x=12;

        RangeCalc meterCentimeter = new RangeCalc();
        meterCentimeter.metersForCentimeters(x);

        RangeCalc meterMilimeter = new RangeCalc();
        meterMilimeter.metersForMilimeters(10);

        RangeCalc centimeterMeter = new RangeCalc();
        centimeterMeter.centimetersForMeters(10);

        RangeCalc milimeterMeter = new RangeCalc();
        milimeterMeter.milimetersForMeters(10);

        TimeCalc hm = new TimeCalc();
        hm.hoursMinutes(24);

        TimeCalc ms = new TimeCalc();
        ms.minutesSeconds(2);

        TimeCalc sm = new TimeCalc();
        sm.secondsMiliseconds(1);
    }
}
