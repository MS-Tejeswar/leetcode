class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int m=0;
        for(int num: candies)
        m=Math.max(num,m);

        List<Boolean> arr=new ArrayList<>();
        for(int num: candies){
            if(num+extraCandies>=m)
            arr.add(true);
            else
            arr.add(false);
        }
        return arr;
    }
}