import java.util.HashMap;
public class RomanToInteger {
    public static int romanToInt(String s){
        HashMap < Character,Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;

        for(int i = 0; i<s.length(); i++){
            int currcoin = map.get(s.charAt(i));

            if(i + 1 < s.length()){
                int nextcoin = map.get(s.charAt(i));
            if(currcoin < nextcoin){
                result -= currcoin;
            }
            else{
                result += currcoin;
            }
            }
            else{
                result += currcoin;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        
        System.out.println(romanToInt("III"));     // 3
        System.out.println(romanToInt("IV"));      // 4
        System.out.println(romanToInt("IX"));      // 9
        System.out.println(romanToInt("XXIV"));     // 14
        System.out.println(romanToInt("MCMXCIV")); // 1994
    }
}
