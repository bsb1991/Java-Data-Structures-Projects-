package sortedList;

class Link{
	public long dData;
	public Link next;
	
	public Link(long dd)
	{ dData = dd;}
	
	public void displayLink(){
		System.out.print(dData + " ");
	}
}
class SortedList{
	private Link first;

	public SortedList(){
		first = null;
	}
	public boolean isEmpty(){
		return (first==null);
	}
	
	public void insert(long key){
		Link newLink = new Link(key);
		Link previous = null;
		Link current = first;
		
		while(current != null && key > current.dData){
			previous = current;
			current = current.next;
		}
		if (previous == null)
			first = newLink;
		else 
			previous.next = newLink;
		newLink.next = current;
	}//end
	public Link remove(){
		Link temp = first;
		first = first.next;
		return temp;
		
		}
	public void displayList(){
		System.out.println("List (first -->last): ");
		Link current = first;
		
		while(current != null)
		{
			current.displayLink();
			current = current.next;
		}
		System.out.println(" ");
	}//end class
}
class pQueue{
	private SortedList list;
	
	public pQueue(){
		list = new SortedList();
	}
	public void remove(){
		 list.remove();
		 return;
	}
	public void displayList(){
		list.displayList();
		return;
}
	public void insert(int i){
		list.insert(i);
		return;
		}
	public void isEmpty(){
		list.isEmpty();
		return;
	}
}

public class SortedListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		pQueue theSortedList = new pQueue();
		theSortedList.insert(20);
		theSortedList.insert(40);
		
		theSortedList.displayList();
		
		theSortedList.insert(10);
		theSortedList.insert(91);
		theSortedList.insert(30);
		theSortedList.insert(50);
		theSortedList.insert(70);
		theSortedList.insert(90);
		
		theSortedList.displayList();
		
		theSortedList.remove();
		System.out.println("Largest number removed is: ");	
		theSortedList.displayList();
		

	}//end main

}
