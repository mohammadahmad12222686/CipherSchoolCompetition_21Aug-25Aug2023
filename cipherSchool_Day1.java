class Solution {
    public int maxArea(int[] height) {

        //THIS CODE IS RUNNING BUT TIME LIMIT IS EXCEEDING
        // int area;
        // int maxarea=0;
        // for(int i=0;i<height.length-1;i++){
        //     for(int j=i+1;j<height.length;j++){
        //         if(height[i]<height[j]){
        //             area=(height[i])*(j-i);
        //             {
        //                 if(area>maxarea){
        //                     maxarea=area;
        //                 }
        //             }
        //         }
        //         else{
        //             area=(height[j])*(j-i);
        //             if(area>maxarea){
        //                     maxarea=area;
        //                 }
        //         }
        //     }

        // }
        // return maxarea;



        //YE CODE MAST HAIN....TIME COMPLEXITY ISKA O(n) hi hai. 

        int start=0;
        int end=height.length-1;
        int area;
        int maxarea=0;
        while(start<end){
            area= ((Math.min(height[start],height[end]))*(end-start));
            if(area>maxarea) {
                maxarea=area;
            }

            if((Math.min(height[start],height[end]))==height[start]){
                start++;

            }
            else{
                end--;
            }
        }
    return maxarea;
    }

}