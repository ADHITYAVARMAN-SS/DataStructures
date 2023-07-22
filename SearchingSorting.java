# SearchingSorting

vimport java.util.Scanner;
public class Hello {
	
static Scanner io = new Scanner(System.in);


	static void Linearsearch() {
		int arr1[] = {1,2,3,4,5,6,7,8,9,0};
			System.out.println("enter the key to search");
			int key = io.nextInt();
			
			for(int i=0;i<arr1.length;i++) {
				if(key == arr1[i]) {
					System.out.println(key +"is found at index"+(i+1));
				}
			}
			
	}
	
	static 	void Binarysearch() {
		int b[] = {10,20,30,40,50};
		System.out.println("enter the key to search");
		int key2 = io.nextInt();
		int end  = b.length;
		int first = 0;
		
		
		while(first <= end) {
			int mid = (first+end)/2;
			
			if(b[mid]<key2) {
			first = mid+1;
				
			}
			else if (b[mid]==key2) {
				System.out.println(key2+ " is found at "+mid);
				break;
			}
			else  {
				end = mid - 1;
			}
			if (first>end) {
				System.out.println("entered number is not present");
			}
			
		}
	}
	static void Insertionsort() {
		int arr2[] = {4,51,45,87,68,6,1,54};
		for(int i = 1;i<arr2.length;i++) {
			int temp = arr2[i];
			int j = i-1;
			
			while(j>=0 && arr2[j]>temp) {
				arr2[j+1]=arr2[j];
				j= j-1;
			}
			arr2[j+1]=temp;
			
		}
			
		for(int j =0;j<arr2.length;j++) {
			System.out.println(arr2[j]);
		}
		
	}
	static void Selectionsort() {
		System.out.println("seleciton sort");
		int [] c = {44,56,88,14,32,22,3};
		
		for(int i =0 ;i<c.length;i++) {
			int temp = i;
			for (int j = i+1;j<c.length;j++) {
				if(c[j]<c[temp]) {
					temp=j;
				}
			}
			int min = c[temp];
			c[temp] = c[i];
			c[i] = min;
		}
		
		for(int i =0 ;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
	}

	public static void main(String [] args) {
			System.out.println("1.Linearsearch \n 2.binary search \n 3.insersion sort \n 4.selection sort");
			int a = io.nextInt();
			switch(a) {
			
			case 1:
			Linearsearch();break;
			case 2:
				Binarysearch();break;
			case 3:
				Insertionsort();break;
			case 4:
				Selectionsort();break;
			}
		}
	}
