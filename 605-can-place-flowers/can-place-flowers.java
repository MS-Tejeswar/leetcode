class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                if(i==0){
                    if((flowerbed.length>1 && flowerbed[1]==0) || flowerbed.length==1){
                    c++;
                    flowerbed[i]=1;
                    }

                }
                else if(i==flowerbed.length-1){
                    if(flowerbed[i-1]==0){
                        c++;
                        flowerbed[i]=1;
                    }
                }
                else{
                    if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
                        c++;
                        flowerbed[i]=1;
                    }
                }
            }
        }
        if(c>=n)
        return true;
        return false;
    }
}