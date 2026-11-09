class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        int max = salary[0];
        int min = salary[0];
        double avg = 0;

        for(int i=0;i<n;i++){
            max = Math.max(salary[i],max);
            min = Math.min(salary[i],min);
            avg = salary[i] + avg;
        }
        avg = avg - (max+min);
        return avg/(n-2);
    }
}