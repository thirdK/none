package level01;

//스택을 연결 자료구조로 구현해본다.
interface Stack{
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();
}

class StackNode{
	char data;		//요소
	StackNode link;	//참조값
}

class LinkedStack implements Stack{	//인터페이스 구현
	private StackNode top;	//참조변수 (스택은 LIFO구조이기 때문에 top은 항상 가장 나중에 들어온 노드를 가리켜야 한다.)
	
	public boolean isEmpty() {	//isEmpty()메소드는 top에 저장된 값이 비었는지(null) 아닌지를 판단하여 boolean형태로 리턴
		return (top == null);	//비었다면 true 아니라면 false를 리턴
	}
	
	public void push(char item) {	//push()메소드는 매개변수로 받은 값을 요소로 저장시켜준다
		StackNode newNode = new StackNode();	//객체선언(참조값을 저장할 공간할당)과 생성(실제값이 저장될 공간 할당)
		newNode.data = item;		//newNode의 data에는 매개변수로 가져온 요소를 넣고
		newNode.link = top;			//link에는 top이 저장하고 있는 주소값을 넣는다.(리스트가 비어있어서 첫 노드라면 top이 가진 null)
		top = newNode;				//top에는 새로만든 newNode의 주소값
		System.out.println("Inserted Item : " + item);
	}
	
	public char pop() {	//pop()메소드는 마지막 요소를 return하고 삭제한다.
		if(isEmpty()) {	//isEmpty()메소드 사용 비었다면 아래와 같이 출력
			System.out.println("Deleting fail! Linked Stack is Empty!!");
			return 0;	//반환할 값이 없으므로 0;
		}else {
			char item = top.data;	//char형 item 변수를 만들어 top이 가리키는 노드의 요소를 넣고(반환을 위해)
			top = top.link;			
			//top이 가리키고 있는 노드의 link에 저장된 참조값을 가져와 top에 참조값으로 넣는다. 
			//(결과는 마지막 노드의 삭제이다. 기존의 마지막 노드는 더이상 리스트에 포함되지 않음) 
			return item;			//삭제된 요소를 반환
		}
	}
	
	public void delete() {	//delete()메소드는 return없이 삭제한다.
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
		}else {
			top = top.link;	//pop의 삭제하는 방법과 동일
		}
	}
	
	public char peek() {	//peek() 메소드는 제일 마지막 노드를 반환한다.
		if(isEmpty()) {
			System.out.println("Peeking fail! Linked Stack is empty!!");
			return 0;
		}else {
			return top.data;	//참조변수 top이 가리키는 노드의 data를 반환(top은 항상 마지막에 저장된 노드를 가리킨다.)
		}
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.printf("Linked Stack is empty!! %n %n");
		}else {
			StackNode temp = top;	//temp에 top의 참조값을 넣음 -> 리스트의 시작주소(마지막으로 입력된 노드의 주소) 
			System.out.println("Linked Stack >> ");
			while(temp != null) {	//temp가 null이 아니면 반복 -> null이라면 정지(리스트의 처음부터 마지막까지 반복)
				System.out.printf("\t %c \n", temp.data);
				temp = temp.link;	//다음 노드의 주소를 temp에 넣음
			}
			System.out.println();
		}
	}

}
public class StackLinked {
	public static void main(String[] args) {
		char deletedItem;
		LinkedStack LS = new LinkedStack();
		
		LS.push('A');
		LS.printStack();
		
		LS.push('B');
		LS.printStack();
		
		LS.push('C');
		LS.printStack();
		
		System.out.println("\tpeek >> " + LS.peek());
		System.out.println();
		
		deletedItem = LS.pop();
		if(deletedItem != 0) {
			System.out.println("deleted Item : " + deletedItem);
			LS.printStack();
		}
		
		LS.delete();
		if(deletedItem != 0) {
			System.out.println("deleted Item");
			LS.printStack();
		}
		
	}
}


















