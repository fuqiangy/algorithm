package cn.yfq.source;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        String hello ="hello";
        String world ="world";
        Map<String,String> map = new HashMap<>();
        map.put(hello,world);
        Set set = map.keySet();

        map.entrySet();

        HashMapDome[]  hashMapDomes =  new HashMapDome[10];
        HashMapDome a = hashMapDomes[9];
        System.out.println(a);
    }
}
