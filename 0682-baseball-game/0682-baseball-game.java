class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                arr.remove(arr.get(arr.size()-1));
            }else if(operations[i].equals("D")){
                arr.add(2*arr.get(arr.size()-1));
            }else if(operations[i].equals("+")){
                arr.add(arr.get(arr.size()-1)+arr.get(arr.size()-2));
            }else{
                int n = Integer.parseInt(operations[i]);
                arr.add(n);
            }
        }
        int sum = 0;
        for(int i=0;i<arr.size();i++){
            sum+= arr.get(i);
        }
        return sum;
    }
}