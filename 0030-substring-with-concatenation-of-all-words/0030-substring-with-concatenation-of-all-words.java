class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        HashMap<String ,Integer> wordCount = new HashMap<>();
        for(String w : words){
            wordCount.put(w,wordCount.getOrDefault(w,0)+1);
        }
        List<Integer> result = new ArrayList<>();
        if(s==null || s.length()==0 || words==null || words.length==0){
            return result;
        }
        int wordLen = words[0].length();
        int totalLen = wordLen*words.length;
        
        for(int i = 0;i<wordLen;i++){
            int left = i ;
            int right = i;
            Map<String,Integer> seen = new HashMap<>();
            int count = 0;
            
            while(right+wordLen<=s.length()){
                String word = s.substring(right,right+wordLen);
                right +=wordLen;
                
                if(wordCount.containsKey(word)){
                    seen.put(word,seen.getOrDefault(word,0)+1);
                    count++;
                    while(seen.get(word)>wordCount.get(word)){
                        String leftword = s.substring(left,left+wordLen);
                        seen.put(leftword,seen.get(leftword)-1);
                        left += wordLen;
                        count--;
                    }
                    if(count == words.length){
                        result.add(left);
                    }
                }else{
                    seen.clear();
                    count=0;
                    left = right;
                }
            }
        }
        return result;
    }
}