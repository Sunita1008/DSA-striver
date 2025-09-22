package sortingAlgo;

public class mergeSort2 {
	static int tempArr[];
    static void MergeSortHelper(int a[],int low,int high)
    {
    	tempArr=new int[a.length];
    	divide(a,low,high);
    }
    static void divide(int[] a, int low, int high)
    {
    	if(low<high)
    	{
    		int mid=low+(high-low)/2;
    		divide(a,low,mid);
    		divide(a,mid+1,high);
    		conquer(a,low,mid,high);
    	}
    }
    static void conquer(int[] a, int low, int mid, int high)
    {
    	for(int i=0;i<=high;i++)
    	{
    		tempArr[i]=a[i];
    	}
    	int i=low;
    	int j=mid+1;
    	int k=low;
    	
    	while(i<=mid && j<=high)
    	{
    		if(tempArr[i]<tempArr[j])
    		{
    			a[k]=tempArr[i];
    			i++;
    		}
    		else
    		{
    			a[k]=tempArr[j];
    			j++;
    		}
    		k++;
    	}
    	while(i<=mid)
    	{
    		a[k]=tempArr[i];
    		i++;
    		k++;
    	}
    }
	public static void main(String[] args) {
		int a[] = {13,46,24,52,20,9};
          MergeSortHelper(a,0,a.length-1) ;
          
          for(int num:a)
          {
        	  System.out.print(num+" ");
          }
	}

}
