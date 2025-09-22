package sortingAlgo;

public class selectionSort {

	public static void main(String[] args) {
		
		int a[] = {13,46,24,52,20,9};
		//int min=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			int mini=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[mini])
				{
					mini=j;
				}
			}
			int temp=a[i];
			a[i]=a[mini];
			a[mini]=temp;
			
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
