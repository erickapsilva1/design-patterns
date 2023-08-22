package flyweight;

import java.util.HashMap;
import java.util.Map;

public class MusicalNotes {

    private static Map<String, Note> notes =
            new HashMap<String, Note>();

    static{
        notes.put("C", new C());
        notes.put("D", new D());
        notes.put("E", new E());
        notes.put("F", new F());
        notes.put("G", new G());
        notes.put("A", new A());
        notes.put("B", new B());
    }

    public Note capture(String name){
        return notes.get(name);
    }

}
