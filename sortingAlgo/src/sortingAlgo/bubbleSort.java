package sortingAlgo;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {13,46,24,52,20,9};
		for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a.length-i-1;j++)
		{
	       if(a[j]>a[j+1])
	       {
	    	  int temp=a[j];
	    	  a[j]=a[j+1];
	    	  a[j+1]=temp;
	       }
		}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
