class Test 
{
	Node head;
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.addAtBegining(1);
		t.addAtGivenPosition(2, 2);
		t.addAtGivenPosition(3, 3);
		t.addAtBegining(6);

		/*Node n1 = new Node(10);		//making a llist
		Node n2 = new Node(5);				// making new list
		
		n1.next = n2;				// merging newly created lists
		n2.next = t.head.next;					// merged all threee lists
		
		System.out.println("First list");
		t.printElements(t.head);
		
		System.out.println("Second list");
		t.printElements(n1);
		t.findMergePoint(t.head, n2);*/
		
		/*t.printElements(t.head);
		t.head.next.next.next = t.head.next.next.next;
		//t.printElements(t.head);
		t.detectLoop(t.head);
		*/
		
		t.printElements(t.head);
		
		t.positionFromEnd(4);
	}
	void addAtEnd(int data)
	{
		Node newNode  = new Node(data);
		if(head==null)					// check if no list
		{								// make a new node and assign as head
			head = newNode;
		}
		else
		{
			Node temp = head;					// if not
			while(temp.next != null)			// go till end of the list
			{
				temp = temp.next;
			}
			temp.next = newNode;			//add a node at ,last
		}
	}
	void printElements(Node temp)
	{
		if(temp==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			while(temp != null)
			{
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}
	void addAtBegining(int data)
	{
		Node newNode = new Node(data);
		if(head==null){
			head = newNode;
		}
		else{
			newNode.next = head;				// make a new node and link with head and make new node as a head node
			head = newNode;
		}
	}
	void addAtGivenPosition(int position, int data)
	{
		Node previous , current;
		Node newNode = new Node(data);
		int count = 0 ;
		if(position == 1)						//position =1 means user want to add at head node so call function addAtBegining
		{			
			addAtBegining(data);
		}
		else{
			previous = null;
			current = head;
			count = 1;
			while(count < position && current != null ){				// go till that position then condition will false at that condition
				previous = current;
				current = current.next;
				++count;
			}
			previous.next = newNode;								//create a new node and link with the next node
			newNode.next = current;
		}
	}
	void deleteFirstNode()
	{
		if(head == null)
		{
			System.out.println("list doesnt exist");
		}
		else{
			head = head.next;						
		}
	}
	void deleteLastNode()
	{
		Node previous , current;
		if(head == null)
		{
			System.out.println("list cant be deleted");
		}
		else{
			previous = null;
			current = head;
			while(current.next != null){
				previous = current;
				current = current.next;			// go till last and delete that node 
			}
			if(previous == null){
				head = null;	//if only one node is exist
			}
			else{
				previous.next = null;
			}
		}
		
	}
	void deleteGivenPositionNode(int position)
	{
		Node current , previous;
		if(position==1)
		{
			deleteFirstNode();						// if one delete head node
				// OR
			//head = head.next;
		}
		else
		{
			 previous = null;
			 current = head;
			 int count = 1;
			 while(count < position && current.next != null )			// go till that position
			 {
				 count++;
				 previous = current;
				 current = current.next;
			 }
			 if(current == null)				//if that will be last then directlt make it's next null
			 {
				 previous.next = null;
			 }
			 else									//if not then skip that node
			 {
				 previous.next = previous.next.next;
			 }
		}
	}
	void deleteMatchingValueFirstOccurence(int value)
	{
		if(head==null)
		{
			System.out.println("nothing to search");
		}
		
		if(head.data == value)						// if the value at the head node then delete the first node
		{
			head = head.next;
		}
		else
		{
			
			Node previous = null;
			Node current = head;
			 while(value != current.data && current.next != null )					// if not then o till the value u find and delete
			 {
				
				 previous = current;
				 current = current.next;
			 }
			 if(current.data == value)
			 {
				 previous.next = previous.next.next;
			 }
		}
	}
	void deleteMatchingValueAllOccurence(int value)
	{
		if(head==null)
		{
			System.out.println("nothing to search");
		}
		
		while(head.data == value)
		{
			head = head.next;						// if u r getting that value at n no of  times at head 
		}											// then it will delete all matching values at the head
			Node previous = null;			//b
			Node current = head;
			 while( current != null )
			 {
				 if(current.data == value)				// if not then delete
				 {
					 previous.next = current.next;
					 current = current.next;
				 }
				 else
				 {
					 previous = current;						// if u dont find that value again then just move ahead
					 current = current.next;
				 }
				
			 }
		}
	void reverseLinkedList()				// store next node address & make every node'next null 
	{
		Node previous = null;			//b
		Node current = head;
		Node currentNewNode = current.next;
		while(current != null)
		{
			current.next = previous;
			
			previous = current;
			current = currentNewNode;
			if(currentNewNode!= null){
				currentNewNode = currentNewNode.next;
			}
		}
		head = previous;
	}
	void reverseListRecursion(Node node)
	{
		if(node.next == null)
		{
			head = node;
			return ;
		}
		reverseListRecursion(node.next);
		Node currentNext = node.next;
		currentNext.next = node;
		node.next = null;
	}
	void printForwordRecursion(Node current)
	{
		if(current == null)
		{
			return ;
		}
		System.out.println(current.data);
		printForwordRecursion(current.next);
	}
	void printReverseRecursion(Node current)
	{
		if(current == null)
		{
			return ;
		}
		printReverseRecursion(current.next);
		System.out.println(current.data);
	}
	void findMiddlePoint()			//one traversal + half traversal
	{
		Node temp = head;
		
		if(temp==null)
		{
			System.out.println("list doesnt exist");
		}
		else
		{
			int count=0;
			int mid;
			while(temp != null)
			{
				temp = temp.next;
				count++;
			}
			mid = (count/2)+1;
			System.out.println("mid size "+ mid);
			count = 1;
			temp=head;
			while(mid > count)
			{
				temp = temp.next;
				count++;
			}
			System.out.println(temp.data);
		}
	}
	void findMidPoint()		//one traversal
	{
		Node slow = head, fast = head;
		if(head==null)
		{
			System.out.println("list not exist");
		}
		else
		{
			while( fast != null && fast.next != null)
			{
				slow = slow.next;
				fast = fast.next.next;
			}
			System.out.println(slow.data);
		}
	}
	int findLength(Node node)
	{
		int count = 0;
		while(node != null)
		{
			count++;
			node = node.next;
		}
		return count;
	}
	void findMergePoint(Node node1 , Node node2)
	{
		int node1Length = findLength(node1);
		int node2Length = findLength(node2);
		int difference;
		if(node1Length > node2Length)
		{
			difference = node1Length - node2Length;
		}
		else
		{
			difference = node2Length - node1Length;
			Node temp = node1;
			node1 = node2;
			node2 = temp;
		}
		while(difference != 0)
		{
			node1 = node1.next;
			difference--;			
		}
		while(node1 != null && node2 != null)
		{
			if(node1 == node2)
			{
				System.out.println("merge point "+node1.data);
				break;
			}
			node1 = node1.next;
			node2 = node2.next;
		}
	}
	void detectLoop(Node node)
	{
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if( slow == fast)
			{
				System.out.println("loop exist in list "+slow.data);
				break;
			}
		}
	}
	void positionFromEnd(int position)
	{
		Node previous = head;
		Node current = head;
		int count = 0;
		while(current != null && count < position)
		{
			count++;
			current = current.next;
		}
		while(current != null)
		{
			previous = previous.next;
			current = current.next;
		}
		System.out.println("position "+previous.data);
	}
	

}
