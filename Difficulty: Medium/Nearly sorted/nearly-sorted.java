// class Solution {
//     public void nearlySorted(int[] arr, int k) {
//         // code here
//         int n= arr.length;
//       for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - 1 - i; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
        
//     }
// }


class Solution {
    public void nearlySorted(int[] arr, int K) {
        quickSort(arr, 0, arr.length-1);
    }
    private void quickSort(int[]arr, int low, int high) {
        if (low<high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi + 1, high);
        }
    }
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  
        int i = low-1;      
        for (int j = low;j<high;j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i +1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}
