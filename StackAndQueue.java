//StackQueue


import java.util.Scanner;

public class Stack {

	
static Scanner io = new Scanner(System.in);

static int as =io.nextInt();
static int top = -1,i ,item, arr[]= new int[as],arr2[] = new int[as];

static int front = -1,rear =-1;

	public static void main(String [] args) {
		
		Stack obj = new Stack();
	
		int op1;
			
		System.out.println("\t\t~Stack & Queue Opertions:~\n");
		while(true) {
			
		System.out.println("STACK\n\n1.PUSH\n2.POP\n3.DISPLAYSTACK\n4.EXIT\n\nQUEUE\n5.PUSH\n6.POP\n7.DISPALYQUEUE\n8.EXIT\n");
		System.out.println("enter the choice to perform the following stack & queue opertions:");		
		op1 = io.nextInt();
	
		
		if( op1 > 8) {
			System.out.println("enter a valid option");
		}
		
		switch(op1) {
		case 1:
			obj.push();break;
		case 2:
			obj.pop();break;
		case 3: 
			obj.stackdisplay();break;
		case 4:
			System.exit(0);break;
		case 5:
			obj.enqueue();break;
		case 6:
			obj.dequeue();break;
		case 7:
			obj.queuedisplay();break;
		case 8:
			System.exit(0);break;}
		
		}
		}
		
	
	
	
	void push() {
		
		
		if(top == as-1) {
			System.out.println("stack is full or underflow");
		}
		else {
			System.out.println(" enter the element to be pushed");
			item = io.nextInt();
			
		top = top + 1;
		arr[top] = item;
		}
	}
	 void pop() {
		
		if(top == -1) {
			System.out.println("stack is empty or under flow");
		}
		else {
			System.out.println(arr[top]);
			top = top-1;
		}
	}
	
	 void stackdisplay() {
		
		if(top == -1) {
			System.out.println("stack is empty or underflow");
		}
		else {
			System.out.println("content of the stack :");
			
			for(i= top;i>=0;i--) {
				System.out.println(arr[i]);
			}
		}
	}
	
	
	// queue
	
	 void enqueue() {
		
		if(rear == as-1) {
			System.out.println("queue is empty or underflow");
		}
		else {
			if(front == -1) {
				front = 0;
			}
			System.out.println("enter the element to be inserted");
			item = io.nextInt();
			
			rear =rear +1;
			
			arr2[rear] = item;
			}
	}
	
	 void dequeue() {
		if(front == -1 || front > rear) {
			System.out.println("queue is empty or underflow");
		}
		else {
			System.out.println("the deleted element is"+arr2[front]);
			front = front +1;
		}
	}
	
	 void queuedisplay() {
		if(front == -1 || front >rear ) {
			System.out.println("stack is empty or underflow");
		}
		else {
			System.out.println("content of queue is ");
			
			for(i=front;i<=rear;i++) {
				System.out.println(arr2[i]);
			}
		}
	}

	
}
