package searching.common;

public class Algorithm {
    public int linearSearch(int [] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int [] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while( left <= right){
            int mid = left +( right - left) / 2;
            if(arr[mid] < target){
                left = mid + 1;
            }else if( arr[mid] < target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
