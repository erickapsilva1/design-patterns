package bridge_adapter;

import java.util.Calendar;

public class Program {

    public static void main(String[] args) throws Exception {

        Map map = new GoogleMaps();
        map.returnMap("jd. jacira");

        Map map1 = new MapLink();
        map1.returnMap("itapecerica da serra");

        // ...

        SystemClock clock = new SystemClock();
        Calendar currentDate = clock.today();



    }

}
