class Solution {
    public int romanToInt(String s) {
       int count = 0;
       Map<Character,Integer> map = new HashMap<>();
       map.put('I',1);
       map.put('V',5);
       map.put('X',10);
       map.put('L',50);
       map.put('C',100);
       map.put('D',500);
       map.put('M',1000);
       int i= 1;
       while(i<s.length()){
        int prev = map.get(s.charAt(i-1));
        int curr = map.get(s.charAt(i));
        if(prev>=curr){
            count+=prev;
            i++;
        }else{
            count+=curr-prev;
            i+=2;
        }
       }
       if(i==s.length()){
        count+=map.get(s.charAt(i-1));
       }
       return count;
    }
}