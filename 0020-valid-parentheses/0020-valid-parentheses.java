class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>() ;
        
        for(int j=0;j<s.length();j++){

            if((s.charAt(j)=='}' || s. charAt(j)==')' || s. charAt(j)==']') && st.empty()){
            return false;
        }
            
            else if(s.charAt(j)=='(' || s. charAt(j)=='[' || s. charAt(j)=='{'){
st. push(s.charAt(j)) ;
        }
            
            else if(s.charAt(j)==')' && st.peek()=='('){
                st. pop() ;
            }
            
            else if(s.charAt(j)==']' && st.peek()=='['){
                st. pop() ;
            }
            
            else if(s.charAt(j)=='}' && st.peek()=='{'){
                st. pop() ;
            }
            else{
                return false;
            }
        }
        
        if(st.size() >0) {
            return false;
        }
        return true;
    }
}