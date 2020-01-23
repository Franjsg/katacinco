package katacinco;

import java.util.HashMap;

public class Histogram<T> extends HashMap<T, Integer>{
    
    @Override
    public Integer get(Object key) {
        if (!containsKey((T)key))
            return 0;
        return super.get(key);
    }
}
