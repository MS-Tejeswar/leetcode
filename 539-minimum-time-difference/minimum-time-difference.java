class Solution {
        public int findMinDifference(List<String> timePoints) {
        int[] arr=new int[timePoints.size()+1];
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<timePoints.size();i++){
            String temp=timePoints.get(i);
            int hr=Integer.parseInt(temp.substring(0,2));
            int min=Integer.parseInt(temp.substring(3,5));
            arr[i]=hr*60+min;
            mini=Math.min(mini,arr[i]);
            
        }
        arr[timePoints.size()]=mini+1440;
        Arrays.sort(arr);
        mini=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
           // System.out.println(arr[i]+" "+arr[i-1]);
        mini=Math.min(mini,arr[i]-arr[i-1]);
        }
        return mini;
    }
}