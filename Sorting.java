class Test {

	public static void main(String[] args) {
		Test t = new Test();
		int ar[] = {11,6,5,7,9,8,10,3,1,2};
		/*t.selectionSort(ar);
		t.bubbleSort(ar);
		t.insertionSort(ar);
		t.mergeSort(ar);*/
		t.quickSort(ar, 0, ar.length-1);
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		 }
	}
	void selectionSort(int ar[])
	{									// select min 
		int temp,i,j,minIndex;
		for(i=0;i<ar.length-1;i++)
		{
			minIndex = i;
			for(j=i+1;j<ar.length;j++)
			{
				if(ar[minIndex]>ar[j])		//compare that index
					minIndex = j;
			}
			temp = ar[i];					// swap
			ar[i] = ar[minIndex];
			ar[minIndex] = temp;	
		}
	}
	void bubbleSort(int ar[])
	{
		int temp;
		for (int i = 0; i < ar.length-1; i++) 
		{
			boolean flag = false;					//if we get sorted list(line no 48)
			for(int j=0;j<(ar.length-i-1);j++)			//every iteration we r putting the large elemnt at last ie the correct position
			{											//so need to traverse till end
				if(ar[j]>ar[j+1])						//if i already traversed 2 times then we will run loop j till (-i) times bcoz i times already traversed
				{
					temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
				flag =true;
			}
			if(flag=false)							// then no need to traverse
			{
				break;
			}
		}
	}
	void insertionSort(int []ar)
	{
		for (int i = 0; i < ar.length; i++) {
			int index = i;								//every itration we r putting the smallest element at the right position
			int value = ar[i];
			while( index > 0 && ar[index-1] > value )
			{
				ar[index] = ar[index-1];
				index--;
			}
			ar[index] = value;
		}
	}
	void merge(int left[], int right[], int ar[])
	{
		int l=0, r=0, k=0;								// this is the merge function
		for (int i = 0; i < ar.length; i++) {
			while(l<left.length && r<right.length)
			{
				if(left[l]<right[r])					//if left array elementis smaller then put that element in main array (ar[])
				{
					ar[k] = left[l];
					l++;
				}
				else
				{
					ar[k] = right[r];					//if right array elementis smaller then put that element in main array (ar[])
					r++;
				}
				k++;
			}
			while(l<left.length)					// if the left array is larger then right then remaining element must put into the main array
			{
				ar[k] = left[l];
				l++;
				k++;
			}
			while(r<right.length)					//// if the right array is larger then left then remaining element must put into the main array
			{
				ar[k] = right[r];
				r++;
				k++;
			}
			
		}
	}
	void mergeSort(int ar[])
	{
		int size = (ar.length);
		if(size<2)								// for stopping the recursion
			return ;
		int mid = size/2;
		int left[] = new int[mid];				
		int right[] = new int[size-mid];		
		for (int i = 0; i < mid; i++) {
			left[i] = ar[i];					// putting values in left array from main array
		}
		for (int i = mid; i < (size); i++) {	 
			right [i-mid] = ar[i];				// same as left but in right
		}
		mergeSort(left);				
		mergeSort(right);
		merge(left, right, ar);					// merging sorted sub array
		
	}
	int partition(int ar[],int startIndex,int endindex)
	{
		int pivot = ar[endindex];						// we take last elementa pivot 
		int partitionIndex= startIndex;
		for (int i = startIndex; i < endindex; i++) {
			if(ar[i]<=pivot)							//putting smaller value in the left of pivot and larger right side
			{
				int temp = ar[i];
				ar[i] = ar[partitionIndex];
				ar[partitionIndex] = temp;
				partitionIndex++;
			}			
		}
		ar[endindex] = ar[partitionIndex];				// now our pivot is last element so must relocate the pivot to the center
		ar[partitionIndex] = pivot;						//so swap pivot from where partitionIndex is pointing 
		return partitionIndex;							// partitionIndex definitely larger 
	}
	void quickSort(int ar[], int startIndex, int endIndex)
	{
		if(startIndex < endIndex)							// recursion condition
		{
			int partitionIndex = partition(ar, startIndex, endIndex);			
			quickSort(ar, startIndex, partitionIndex-1);				// sorting pivot left's side array
			quickSort(ar, partitionIndex+1, endIndex);					// sorting pivot right's side array
		}
	}
	
}