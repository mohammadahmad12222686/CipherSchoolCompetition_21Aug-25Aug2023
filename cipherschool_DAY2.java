// SOLVED IT ON OTHER PLATFORM AND HERE THE CODE 

class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        boolean ans=false;
        int count=0;
        
        if(n<3){
            ans=false;
        }
        else{
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    
                    if(arr[i]+arr[j]+arr[k]==0){
                        count++;
                    }
                    
                    
                }
            }
            
        }
        
        for(int)
        }
        
        if(count >0){
            ans=true;
        }
        
        return ans;
        
    }
}