

class ArrayIns{
	private long [] theArray;
	private int nElems;
	private int counter=0;
	
	public ArrayIns(int max){
		theArray = new long [max];
		nElems = 0;
				
	}
	public void insert(long value){
		theArray[nElems] = value;
		nElems++;
	}
	public void display(){
		System.out.print ("A=");
		for(int j=0; j<nElems; j++)
			System.out.print(theArray[j]+ " ");
		System.out.println("");
	}
	public void quickSort() {
		counter++;
		recQuickSort(0, nElems-1);
	}
	public void recQuickSort(int left, int right){
		int size = right-left+1;
		if(size <=3)
			manualSort(left,right);
		else{
			long median = medianOf3(left,right);
			int partition = partitionIt(left,right, median);
			recQuickSort(left, partition -1);
			recQuickSort(partition+1, right);
		}
	}
		public long medianOf3(int left, int right){
			int center = (left +right)/2;
			
			if( theArray[left] > theArray[center] )
				swap(left,center);
			if( theArray[left] > theArray[right] )
				swap(left, right);
			if( theArray[center] > theArray[right] )
				swap(center, right);
			
			swap(center, right-1);
			return theArray[right-1];
		}
		public void swap(int dex1, int dex2){
			long temp = theArray[dex1];
			theArray[dex1] = theArray[dex2];
			theArray[dex2] = temp;
			counter=counter+3;
			
		}
		public int partitionIt(int left, int right, long pivot){
			int leftPtr = left;
			int rightPtr = right - 1;
			
			while(true)
			{
				while( theArray[++leftPtr] < pivot )
					;
				while( theArray[--rightPtr] > pivot)
					;
				if(leftPtr >= rightPtr)
					break;
				else
					swap(leftPtr, rightPtr);
				
			}
			swap(leftPtr, right-1);
			counter++;
			return leftPtr;
		}//end partitionIt()
		public void manualSort(int left, int right){
			int size = right- left+1;
			if(size <= 1)
				return;
			if(size == 2)
			{
				if( theArray[left] > theArray[right] )
					swap(left, right);
				return;
				
			}
			else 
			{
				if( theArray[left] > theArray[right -1] )
					swap(left,right -1);
				if( theArray[left] > theArray[right] )
					swap(left, right);
				if( theArray[right-1] > theArray[right] )
					swap(right-1, right);
			}
		}//end manual
		public void counter(){
			System.out.print(counter);
		}

}//end ArrayIns
public class QuickSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxSize = 16;
		ArrayIns arr;
		arr = new ArrayIns(maxSize);
		
		for (int j=0; j<maxSize; j++){
			long n = (int)(java.lang.Math.random()*99);
			arr.insert(n);
		}
		
	
		System.out.println("Before any sort");
		arr.display();
		arr.quickSort();
		System.out.println("The count is: ");
		arr.counter();
		System.out.println("");
		System.out.println("After sort");
		arr.display();
	}// main

}//class
