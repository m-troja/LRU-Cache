import java.util.LinkedHashMap;

public class DefaultLruCache extends LinkedHashMap<Integer, Integer>
							implements LruCache {

    private Map<Integer, Integer> map = new LinkedHashMap<>();



    int get(int key) {
        for (Integer mapKey : map.setKeys()) {
            if (key == mapKey ) {
                return mapKey.valueOf();
            }
        }


    }


}
