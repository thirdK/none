package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface testIf{
	public String call(String str);
}


public class LambdaPractice02 {
	
	public String call(String str) {
		return str;
	}
	
	public static void main(String[] args) {
		LambdaPractice02 test = new LambdaPractice02();
		System.out.println(test.call("?¼ë°? ë©”ì†Œ?“œ ?‚¬?š©"));
		
		testIf lambdaTest = (s) -> {return s;};
		System.out.println(lambdaTest.call("?¸?„°?˜?´?Š¤ ë©”ì†Œ?“œ ?‚¬?š©")); 
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.forEach((i) -> {System.out.print(i + " ");});	//?Œ?‹¤ë¥? ?´?š©?•œ list ì¶œë ¥?´?‹¤.
		System.out.println();
		
		
		Map<String, Integer> mapTest = new HashMap<String, Integer>();
		mapTest.put("A", 30);
		mapTest.put("B", 10);
		mapTest.put("C", 20);
		
		mapTest.forEach((name, num) ->{			//?Œ?‹¤ë¥? ?‚¬?š©?•˜?—¬ map?„ ì¶œë ¥?•´ë³´ì
			if(num > 20) {
				System.out.println(name + " is 20 over!!");
			}else {
				System.out.println(name + " number : " + num);
			}
		});
	}
}
































