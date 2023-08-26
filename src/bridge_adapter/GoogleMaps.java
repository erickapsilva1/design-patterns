package bridge_adapter;

import java.io.InputStream;
import java.net.URL;

public class GoogleMaps implements Map{
    @Override
    public String returnMap(String address) {

        try {
            String googleMaps = "https://maps.google.com/maps?itapecerica+da+serra";
            URL url = new URL(googleMaps);
            InputStream openStream = url.openStream();

            //...

            return "My Map...";

        } catch (Exception exception){
            throw new RuntimeException(exception);
        }


    }
}
