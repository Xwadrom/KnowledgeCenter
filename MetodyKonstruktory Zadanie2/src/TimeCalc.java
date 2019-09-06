public class TimeCalc {

   int hoursMinutes(int x) {
       int hm = x * 60;
       System.out.println(x + " godzin to " + hm + " minut.");
       return hm;
   }

    int minutesSeconds(int x) {
        int hm = x * 60;
        System.out.println(x + " minut to " + hm + " sekund.");
        return hm;
    }

    int secondsMiliseconds(int x) {
        int sm = x * 100;
        System.out.println(x + " sekund to " + sm + " milisekund.");
        return sm;
    }

    }