package sortingAlgo;

public class QuickSortLow {
static void quickSort(int[] a, int low, int high)
{
	if(low<high)
	{
		int pivot=partition(a,low,high);
		quickSort(a,low,pivot-1);
		quickSort(a,pivot+1,high);
		
	}
}
static int partition(int[] a, int low, int high)
{
	int pivot=a[low];
	int i=low;
	int j=high;
	
	while(i<j)
	{
		while(a[i]<=pivot && i<=high-1)
		{
			i++;
		}
		
		while(a[j]>pivot && j>=low+1)
		{
			j--;
		}
		if(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	int temp=a[j];
	a[j]=a[low];
	a[low]=temp;
	
	
	
	
	
	return j;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {13,46,24,52,20,9};
		quickSort(a,0,a.length-1);
		for(int nums:a)
		{
			System.out.print(nums+" ");
		}
		
	}

}
