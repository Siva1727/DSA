import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Siva",21);
        map.put("Saran",20);
        map.put("Sanjai",19);
        System.out.println(map.keySet());
        System.out.println(map.values());
        // for(String str : map.keySet()){
        //     System.out.println(str);
        // }
        System.out.println( map.containsKey("Siva"));

        // for(Map.Entry<String,Integer> entry : map.entrySet()){
        //     System.out.println(entry.getKey()+" -->"+entry.getValue());
        // }
    }
}
