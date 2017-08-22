package webservice;

/*public class Abc {
	static float t,s,max;
	public static void main(String[] args) {
		 	int nspeed = 6;
		 	int [] nspeeds = {250 ,240, 230, 220, 210, 211};
		 	int [] nliter = {5000, 4500, 4000, 3500, 3000, 3000};
		 	int liter = 50000;
			float maxDistance =  calDiastance( nspeed,  nspeeds,  nliter,  liter);
			System.out.println("MAX DISTANCE = "+maxDistance);
	}
	
	public static float calDiastance( int nspeed , int [] nspeeds , int[] nliter , int liter){
		for(int i=0;i<nspeed;i++){
			t=liter/nliter[i];
			s=nspeeds[i]*t;
			if(max<s){
				max=s;
			}
		}
		return max;
	}
}
*/

public class Abc {
	/*
	 * 
	 * 
	 * this is branch test
	 */
	public static void insertionSort(int arr[], int n) {
	   int i, key, j;
	   for (i = 1; i < n; i++)
	   {
	       /*key = arr[i];
	       j = i-1;
	 
	       while (j >= 0 && arr[j] > key)
	       {
	           arr[j+1] = arr[j];
	           j = j-1;
	       }
	       arr[j+1] = key;*/
	       
	       for (j = i-1; j >=0; j--) {
	    	   if(arr[j]>arr[i]){
	    		   key = arr[j];
	    		   arr[j] = arr[i];
	    		   arr[i] = key;
	    	   }
		   }
	       //arr[j+1] = arr[i];
	   }
	}
	
	public static void printArray(int arr[], int n) {
	   int i;
	   for (i=0; i < n; i++)
		   System.out.println("array is"+ arr[i]);
	}
	
	public static void main(String[] args)
	{
	    int arr [] = {12, 11, 13, 5, 6};
	    int n = arr.length;
	 
	    insertionSort(arr, n);
	    printArray(arr, n);
	 
	}
}