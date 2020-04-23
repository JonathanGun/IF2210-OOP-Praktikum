import java.lang.reflect.Field;
import java.util.Map;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.stream.Collectors;

class JSONWriter {
    private Object o;

    public JSONWriter(Object o) {
        this.o = o;
    }

    public String mapToJSON(Map<String, String> jsonFieldMap) {
        String jsonString = jsonFieldMap
            .entrySet()
            .stream()
            .map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"")
            .collect(Collectors.joining(","));

        return "{" + jsonString + "}";
    }

    public String toString() {
        Map<String, String> jsonFieldMap = new TreeMap<>();
        // TODO:
        // Untuk setiap field di kelas o, periksa apakah memiliki anotasi dengan
        Arrays.asList(o.getClass().getDeclaredFields()).forEach(field -> {
            field.setAccessible(true);
            if(field.isAnnotationPresent(JSONField.class)){
                try{
                    jsonFieldMap.put(field.getName(), String.valueOf(field.get(o)));
                } catch (Exception e){

                }
            }
        });
        // field.isAnnotationPresent(JSONField.class).
        // Jika ada, tambahkan entry ke jsonFieldMap dengan <key,value> =
        //   key = nama field
        //   value = nilai dari field
        // ...lengkapi di sini
        return mapToJSON(jsonFieldMap);
    }
}
