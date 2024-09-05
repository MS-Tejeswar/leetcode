class Solution {
    public int jump(int[] nums) {
    List<Integer> dist=new ArrayList<>();
    for(int i=0;i<nums.length-1;i++)
    dist.add(99999);
    dist.add(0);
    System.out.println(nums.length);
    for(int i=nums.length-2;i>=0;i--){
        int f=(Math.min(i+nums[i],nums.length));
       // System.out.println(i+" "+f);
        dist.set(i,1+Collections.min(dist.subList(i,Math.min(f+1,nums.length))));
        //if(i==4752)
        //dist.set(i,dist.get(i)+1);
        System.out.println(i+" "+f+" "+dist.get(i));
    }
    return dist.get(0);

    }
    
}