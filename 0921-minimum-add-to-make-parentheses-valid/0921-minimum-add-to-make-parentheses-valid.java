class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int move = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            }else if(st.isEmpty() && s.charAt(i)==')'){
                move++;
                continue;
            }else if(!st.isEmpty() && s.charAt(i) == ')'){
                st.pop();
            }
        }
        return st.size()+move;
    }
}