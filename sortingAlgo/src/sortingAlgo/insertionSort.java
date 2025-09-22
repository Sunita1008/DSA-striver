package sortingAlgo;

public class insertionSort {

	public static void main(String[] args) {
		// choose a key and compare it with its left element
		int a[] = {13,46,24,52,20,9};
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ->");
		}
	}

}
