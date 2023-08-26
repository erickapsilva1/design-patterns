package bridge_adapter;

import java.util.Calendar;

public class SystemClock implements GenericClock {

    public Calendar today(){
        return Calendar.getInstance();
    }

}
