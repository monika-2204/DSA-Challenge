class Solution {
    private void fun(String digits,int n,int idx,StringBuilder diary,List<String> list,HashMap<Character,String> map){
        if(idx==n){
            list.add(diary.toString());
            return;
        }
        String choice = map.get(digits.charAt(idx));
        for(int i=0;i<choice.length();i++){
            diary.append(choice.charAt(i));
            fun(digits,n,idx+1,diary,list,map);
            diary.deleteCharAt(diary.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        int n = digits.length();
        List<String> list = new ArrayList<>();
        if(n==0) return list;
        fun(digits,n,0,new StringBuilder(),list,map);
        return list;
    }
}