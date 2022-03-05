package test;

//?Š¤?ƒ?„ ?—°ê²? ?žë£Œêµ¬ì¡°ë¡œ êµ¬í˜„?•´ë³¸ë‹¤.
interface Stack{
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();
}

class StackNode{
	char data;		//?š”?†Œ
	StackNode link;	//ì°¸ì¡°ê°?
}

class LinkedStack implements Stack{	//?¸?„°?Ž˜?´?Š¤ êµ¬í˜„
	private StackNode top;	//ì°¸ì¡°ë³??ˆ˜ (?Š¤?ƒ?? LIFOêµ¬ì¡°?´ê¸? ?•Œë¬¸ì— top?? ?•­?ƒ ê°??ž¥ ?‚˜ì¤‘ì— ?“¤?–´?˜¨ ?…¸?“œë¥? ê°?ë¦¬ì¼œ?•¼ ?•œ?‹¤.)
	
	public boolean isEmpty() {	//isEmpty()ë©”ì†Œ?“œ?Š” top?— ???ž¥?œ ê°’ì´ ë¹„ì—ˆ?Š”ì§?(null) ?•„?‹Œì§?ë¥? ?Œ?‹¨?•˜?—¬ boolean?˜•?ƒœë¡? ë¦¬í„´
		return (top == null);	//ë¹„ì—ˆ?‹¤ë©? true ?•„?‹ˆ?¼ë©? falseë¥? ë¦¬í„´
	}
	
	public void push(char item) {	//push()ë©”ì†Œ?“œ?Š” ë§¤ê°œë³??ˆ˜ë¡? ë°›ì? ê°’ì„ ?š”?†Œë¡? ???ž¥?‹œì¼œì??‹¤
		StackNode newNode = new StackNode();	//ê°ì²´?„ ?–¸(ì°¸ì¡°ê°’ì„ ???ž¥?•  ê³µê°„?• ?‹¹)ê³? ?ƒ?„±(?‹¤? œê°’ì´ ???ž¥?  ê³µê°„ ?• ?‹¹)
		newNode.data = item;		//newNode?˜ data?—?Š” ë§¤ê°œë³??ˆ˜ë¡? ê°?? ¸?˜¨ ?š”?†Œë¥? ?„£ê³?
		newNode.link = top;			//link?—?Š” top?´ ???ž¥?•˜ê³? ?žˆ?Š” ì£¼ì†Œê°’ì„ ?„£?Š”?‹¤.(ë¦¬ìŠ¤?Š¸ê°? ë¹„ì–´?žˆ?–´?„œ ì²? ?…¸?“œ?¼ë©? top?´ ê°?ì§? null)
		top = newNode;				//top?—?Š” ?ƒˆë¡œë§Œ?“  newNode?˜ ì£¼ì†Œê°?
		System.out.println("Inserted Item : " + item);
	}
	
	public char pop() {	//pop()ë©”ì†Œ?“œ?Š” ë§ˆì?ë§? ?š”?†Œë¥? return?•˜ê³? ?‚­? œ?•œ?‹¤.
		if(isEmpty()) {	//isEmpty()ë©”ì†Œ?“œ ?‚¬?š© ë¹„ì—ˆ?‹¤ë©? ?•„?ž˜?? ê°™ì´ ì¶œë ¥
			System.out.println("Deleting fail! Linked Stack is Empty!!");
			return 0;	//ë°˜í™˜?•  ê°’ì´ ?—†?œ¼ë¯?ë¡? 0;
		}else {
			char item = top.data;	//char?˜• item ë³??ˆ˜ë¥? ë§Œë“¤?–´ top?´ ê°?ë¦¬í‚¤?Š” ?…¸?“œ?˜ ?š”?†Œë¥? ?„£ê³?(ë°˜í™˜?„ ?œ„?•´)
			top = top.link;			
			//top?´ ê°?ë¦¬í‚¤ê³? ?žˆ?Š” ?…¸?“œ?˜ link?— ???ž¥?œ ì°¸ì¡°ê°’ì„ ê°?? ¸?? top?— ì°¸ì¡°ê°’ìœ¼ë¡? ?„£?Š”?‹¤. 
			//(ê²°ê³¼?Š” ë§ˆì?ë§? ?…¸?“œ?˜ ?‚­? œ?´?‹¤. ê¸°ì¡´?˜ ë§ˆì?ë§? ?…¸?“œ?Š” ?”?´?ƒ ë¦¬ìŠ¤?Š¸?— ?¬?•¨?˜ì§? ?•Š?Œ) 
			return item;			//?‚­? œ?œ ?š”?†Œë¥? ë°˜í™˜
		}
	}
	
	public void delete() {	//delete()ë©”ì†Œ?“œ?Š” return?—†?´ ?‚­? œ?•œ?‹¤.
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
		}else {
			top = top.link;	//pop?˜ ?‚­? œ?•˜?Š” ë°©ë²•ê³? ?™?¼
		}
	}
	
	public char peek() {	//peek() ë©”ì†Œ?“œ?Š” ? œ?¼ ë§ˆì?ë§? ?…¸?“œë¥? ë°˜í™˜?•œ?‹¤.
		if(isEmpty()) {
			System.out.println("Peeking fail! Linked Stack is empty!!");
			return 0;
		}else {
			return top.data;	//ì°¸ì¡°ë³??ˆ˜ top?´ ê°?ë¦¬í‚¤?Š” ?…¸?“œ?˜ dataë¥? ë°˜í™˜(top?? ?•­?ƒ ë§ˆì?ë§‰ì— ???ž¥?œ ?…¸?“œë¥? ê°?ë¦¬í‚¨?‹¤.)
		}
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.printf("Linked Stack is empty!! %n %n");
		}else {
			StackNode temp = top;	//temp?— top?˜ ì°¸ì¡°ê°’ì„ ?„£?Œ -> ë¦¬ìŠ¤?Š¸?˜ ?‹œ?ž‘ì£¼ì†Œ(ë§ˆì?ë§‰ìœ¼ë¡? ?ž…? ¥?œ ?…¸?“œ?˜ ì£¼ì†Œ) 
			System.out.println("Linked Stack >> ");
			while(temp != null) {	//tempê°? null?´ ?•„?‹ˆë©? ë°˜ë³µ -> null?´?¼ë©? ? •ì§?(ë¦¬ìŠ¤?Š¸?˜ ì²˜ìŒë¶??„° ë§ˆì?ë§‰ê¹Œì§? ë°˜ë³µ)
				System.out.printf("\t %c \n", temp.data);
				temp = temp.link;	//?‹¤?Œ ?…¸?“œ?˜ ì£¼ì†Œë¥? temp?— ?„£?Œ
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


















