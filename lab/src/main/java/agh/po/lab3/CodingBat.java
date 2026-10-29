package agh.po.lab3;

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

    public static void main(String[] args) {
        CodingBat test = new CodingBat();
        System.out.println(test.nearHundred(93));
        System.out.println(test.startOz("ozymandias"));
        System.out.println(test.countEvens(new int[]{1,2,3,6,8}));
        System.out.println(test.helloName("Janusz"));

    }
}



