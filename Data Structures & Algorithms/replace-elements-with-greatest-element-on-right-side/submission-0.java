class Solution {
    public int[] replaceElements(int[] arr) {
        int max=-1,temp=0;
        for(int i=arr.length-1;i>=0;i--){
            if(i==arr.length-1){
                max=arr[i];
                arr[i]=-1;
            }else{
                temp=arr[i];
                arr[i]=max;
                max=Math.max(max,temp);
                // if(!(arr[i]==max)){
                //     arr[i]=max;
                // }
            }
        }
        return arr;
    }
}