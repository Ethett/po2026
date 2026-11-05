package agh.po.lab3;
import java.util.HashMap;
import java.util.Map;


public class CodingBat {
    public boolean nearHundred(int n) {
        return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
    }

    public String startOz(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result += "o";
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result += "z";
        }
        return result;
    }
    public int countEvens(int[] nums) {
        int even_number = 0;
        for(int i=0; i< nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                even_number++;
            }
        }
        return even_number;
    }

    public String helloName(String name) {
        return "Hello "+name+"!";
    }

    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            if (map.containsKey(s)) {
                int obecnaIlosc = map.get(s);
                map.put(s, obecnaIlosc + 1);
            }
            else {
                map.put(s, 1);
            }
        }
        return map;

    }



    public static void main(String[] args) {
        CodingBat test = new CodingBat();
        Map<String, String> mapka = new HashMap<>();
        mapka.put("a", "aaa");
        mapka.put("b", "aaa");
        mapka.put("c", "cake");

        System.out.println(test.nearHundred(93));
        System.out.println(test.startOz("ozymandias"));
        System.out.println(test.countEvens(new int[]{1,2,3,6,8}));
        System.out.println(test.helloName("Janusz"));
        System.out.println(test.mapAB2(mapka));


    }
}



