class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<asteroids.length;i++){
            int curr = asteroids[i];
            while(!st.isEmpty() && st.peek()>0 && curr<0){
                if(Math.abs(st.peek())<Math.abs(curr)){
                    st.pop();
                }else if(Math.abs(st.peek()) == Math.abs(curr)){
                    st.pop();
                    curr = 0;
                    break;
                }else{
                    curr = 0;
                    break;
                }
            }
            if(curr!=0){
                st.push(curr);
            }
        }

        int []ans = new int[st.size()];
        int idx = st.size()-1;
        while(!st.isEmpty()){
            ans[idx--] = st.pop();
        }
        return ans;
    }
}