# SinglyLinkedList


#include<stdio.h>
#include<malloc.h>
#include<conio.h>

void display();

typedef struct node{
	int data;
	struct node *next;
	
}node;

node *head=NULL,*newn,*temp,*t;

int main(){
	
	int no , op;
	
	printf("Linked List");
//	newn = (node*)malloc(sizeof(struct node));
	
	
//	printf("enter the elements to insert");
//	scanf("%d",&newn->data);
while(1){

	
	printf("\n1.insert at first \n2.insert at middle\n3.insert at last \n4.display\n5.deletion at first\n6.deletion at middle\n7.deleteion at last\n8.exit");
	
	scanf("%d",&op);
	
	switch(op){

//insertion at first

		case 1:
			newn = (node*)malloc(sizeof(struct node));
				printf("enter the elements to insert");
				scanf("%d",&newn->data);

			if(head == NULL){
				head = newn;
				head->next = NULL;
						}
			else{
				newn->next = head;
				head = newn;
			}
			break;

// insertion at middle

		case 2:
			{
			newn = (node*)malloc(sizeof(struct node));
				printf("enter the elements to insert");
				scanf("%d",&newn->data);

//			if(head==NULL){
//				printf("single entry is not possible");
//			}
			
				int n;
				printf("enter the data after which element to insert ");
				scanf("%d",&n);
				
				temp = head;
				//it checks the data numbers alredy inserted in list 
				// temp->data = 11,n=12 ,,then 11!=12 so it goes into loop until the condition becomes false
				while(temp->data!=n){
					temp = temp->next;
					
				}
				// it assign the value in middle
				newn->next=temp->next;
				temp->next = newn;
				
			}break;
		
		case 3:
			newn = (node*)malloc(sizeof(struct node));
				printf("enter the elements to insert");
				scanf("%d",&newn->data);

			temp = head;
			
				while(temp->next!=NULL){
					temp = temp->next;
					
				}
				
				temp->next= newn;
				newn->next = NULL;
			
			break;
		case 4:
				printf("display the elements");
		    temp=head;
		    if(head == NULL){
		    	printf(" \nno elements");
			}
			while(temp!= NULL){
			
		    printf("%d\n",temp->data);
		    temp = temp->next;
			}
		break;
			
//deletion head
		case 5:
			if(head->next==NULL){
				printf("the deleted element is %d",temp->data);
				head = NULL;
			}
			else{
				temp = head;
				head = head->next;
				printf("deleted :: %d",head->data);
				 
			}
		   		free(temp);
				break;
		case 6:
			temp = head;
			if(head->next==NULL){
				printf("no entries");
				
			}	
			else{
				int n;
				printf("enter the element to be deleted");
				scanf("%d",&n);
				
				while(temp->data!=n){
					t = temp;
					temp = temp->next;
					
			}
		
					printf("the deleted element is %d", temp->data);
					t->next=temp->next;
					free(temp);
					break;
			case 7:
			temp = head;
			if(head->next == NULL){
				head = NULL;
				printf("the delted element is %d",head->data);
			}
			else{
				while(temp->next!=NULL){
					t = temp;
					temp = temp->next;
					
				}
				t->next = NULL;
				temp = t;
			}
			free(temp);
			break;
			case 8:
				return(0);
	}
	
	
	
}
		
		
}

}


