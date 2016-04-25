class Queue{
	private int maxSize;
	private long [] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Queue (int s){
		maxSize = s;
		queArray = new long [maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert (long j){
		if (rear == maxSize -1)
			rear = -1;
		queArray[++rear] = j;
		nItems ++;
	}
	
	public long remove ()
	{
		long temp = queArray[front++];
		if(front == maxSize)
			front = 0;
		nItems--;
		return temp;
	}
	
	public long peekFront()
	{
		return queArray[front];
	}
	
	public boolean isEmpty()
	{
		return (nItems==0);
	}
	
	public boolean isFull()
	{
		return (nItems==maxSize);
	}
	
	public int size()
	{
		return nItems;
	}
	
	public void display()
	{
		if (isEmpty())
			System.out.println("Queue is empty: ");
		else 
		for(int j=0; j<nItems; j++)//for each item
			System.out.println("All insert items before remove:  "+ (queArray[front+j ]+" "));
		//System.out.println("");
	}
}// end class
public class QueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue theQueue = new Queue(10);
		//theQueue.display();
		
		theQueue.insert(10);
		theQueue.insert(20);
		theQueue.insert(30);
		theQueue.insert(40);
		theQueue.display();
		
		theQueue.remove();
		theQueue.remove();
		theQueue.remove();
		
		theQueue.insert(50);
		theQueue.insert(60);
		theQueue.insert(70);
		theQueue.insert(80);
		
		theQueue.display();
		
		while(!theQueue.isEmpty())
		{
			long n = theQueue.remove();
			System.out.print(n);
			System.out.print(" ");
		}
		
		
		System.out.println("all items after remove ");
		
	}//end mian

}//EndCLassQueApp
