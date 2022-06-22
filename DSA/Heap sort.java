class Solution
{
    //Function to build a Heap from array.
    void buildHeap(int arr[], int n)
    {
        // Your code here
        
    }
 
    //Heapify function to maintain heap property.
    void heapify(int arr[], int n, int i)
    {
        // Your code here
        int largest = i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && arr[l]>arr[largest])
        largest = l;
        if(r<n && arr[r]>arr[largest])
        largest =r;
        if(largest!= i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest]=swap;
            heapify(arr,n,largest);
        }
        
    }
    
    //Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n)
    {
        //code here
        for(int i=n/2-1;i>=0;i--)
        heapify(arr,n,i);
        for(int i=n-1; i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
        }
        
    }
 }
 
 
