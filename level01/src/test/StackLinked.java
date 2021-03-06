package test;

//?€?? ?°κ²? ?λ£κ΅¬μ‘°λ‘ κ΅¬ν?΄λ³Έλ€.
interface Stack{
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();
}

class StackNode{
	char data;		//??
	StackNode link;	//μ°Έμ‘°κ°?
}

class LinkedStack implements Stack{	//?Έ?°??΄?€ κ΅¬ν
	private StackNode top;	//μ°Έμ‘°λ³?? (?€??? LIFOκ΅¬μ‘°?΄κΈ? ?λ¬Έμ top?? ?­? κ°??₯ ?μ€μ ?€?΄?¨ ?Έ?λ₯? κ°?λ¦¬μΌ?Ό ??€.)
	
	public boolean isEmpty() {	//isEmpty()λ©μ?? top? ???₯? κ°μ΄ λΉμ?μ§?(null) ??μ§?λ₯? ??¨??¬ boolean??λ‘? λ¦¬ν΄
		return (top == null);	//λΉμ?€λ©? true ???Όλ©? falseλ₯? λ¦¬ν΄
	}
	
	public void push(char item) {	//push()λ©μ?? λ§€κ°λ³??λ‘? λ°μ? κ°μ ??λ‘? ???₯?μΌμ??€
		StackNode newNode = new StackNode();	//κ°μ²΄? ?Έ(μ°Έμ‘°κ°μ ???₯?  κ³΅κ°? ?Ή)κ³? ??±(?€? κ°μ΄ ???₯?  κ³΅κ° ? ?Ή)
		newNode.data = item;		//newNode? data?? λ§€κ°λ³??λ‘? κ°?? Έ?¨ ??λ₯? ?£κ³?
		newNode.link = top;			//link?? top?΄ ???₯?κ³? ?? μ£Όμκ°μ ?£??€.(λ¦¬μ€?Έκ°? λΉμ΄??΄? μ²? ?Έ??Όλ©? top?΄ κ°?μ§? null)
		top = newNode;				//top?? ?λ‘λ§?  newNode? μ£Όμκ°?
		System.out.println("Inserted Item : " + item);
	}
	
	public char pop() {	//pop()λ©μ?? λ§μ?λ§? ??λ₯? return?κ³? ?­? ??€.
		if(isEmpty()) {	//isEmpty()λ©μ? ?¬?© λΉμ?€λ©? ???? κ°μ΄ μΆλ ₯
			System.out.println("Deleting fail! Linked Stack is Empty!!");
			return 0;	//λ°ν?  κ°μ΄ ??Όλ―?λ‘? 0;
		}else {
			char item = top.data;	//char? item λ³??λ₯? λ§λ€?΄ top?΄ κ°?λ¦¬ν€? ?Έ?? ??λ₯? ?£κ³?(λ°ν? ??΄)
			top = top.link;			
			//top?΄ κ°?λ¦¬ν€κ³? ?? ?Έ?? link? ???₯? μ°Έμ‘°κ°μ κ°?? Έ?? top? μ°Έμ‘°κ°μΌλ‘? ?£??€. 
			//(κ²°κ³Ό? λ§μ?λ§? ?Έ?? ?­? ?΄?€. κΈ°μ‘΄? λ§μ?λ§? ?Έ?? ??΄? λ¦¬μ€?Έ? ?¬?¨?μ§? ??) 
			return item;			//?­? ? ??λ₯? λ°ν
		}
	}
	
	public void delete() {	//delete()λ©μ?? return??΄ ?­? ??€.
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
		}else {
			top = top.link;	//pop? ?­? ?? λ°©λ²κ³? ??Ό
		}
	}
	
	public char peek() {	//peek() λ©μ?? ? ?Ό λ§μ?λ§? ?Έ?λ₯? λ°ν??€.
		if(isEmpty()) {
			System.out.println("Peeking fail! Linked Stack is empty!!");
			return 0;
		}else {
			return top.data;	//μ°Έμ‘°λ³?? top?΄ κ°?λ¦¬ν€? ?Έ?? dataλ₯? λ°ν(top?? ?­? λ§μ?λ§μ ???₯? ?Έ?λ₯? κ°?λ¦¬ν¨?€.)
		}
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.printf("Linked Stack is empty!! %n %n");
		}else {
			StackNode temp = top;	//temp? top? μ°Έμ‘°κ°μ ?£? -> λ¦¬μ€?Έ? ??μ£Όμ(λ§μ?λ§μΌλ‘? ?? ₯? ?Έ?? μ£Όμ) 
			System.out.println("Linked Stack >> ");
			while(temp != null) {	//tempκ°? null?΄ ??λ©? λ°λ³΅ -> null?΄?Όλ©? ? μ§?(λ¦¬μ€?Έ? μ²μλΆ??° λ§μ?λ§κΉμ§? λ°λ³΅)
				System.out.printf("\t %c \n", temp.data);
				temp = temp.link;	//?€? ?Έ?? μ£Όμλ₯? temp? ?£?
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


















