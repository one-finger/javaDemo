package qtech.sqn.guava;

import com.google.common.base.Splitter;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by qiningshi on 16-4-23.
 */
public class GuavaDemo {
    public static void main(String[] args) {
        String str = "a:b,c:d";
        Map<String, String> map = Splitter.on(",").omitEmptyStrings().trimResults().withKeyValueSeparator(":").split(str);
        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}
