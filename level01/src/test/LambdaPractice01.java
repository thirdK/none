package test;

import java.util.ArrayList;
import java.util.List;

interface methodIf {				//?Έ?°??΄?€λ₯? λ§λ€?΄? ??€λ₯? ?¬?©?΄λ³Έλ€.
	public String call(String str);
}


public class LambdaPractice01 {
	
	
	public String call(String str) {	//?Όλ°μ ?Έ λ©μ? ??±
		return str;
	}
	
	
	public static void main(String[] args) {

		methodIf Lambda = (str) -> {return str;};			//?Έ?°??΄?€λ₯? ?΄?©??¬ ??€λ₯? ?¬?©
		System.out.println(Lambda.call("??€λ₯? ?΄?©? λ©μ? ?ΈμΆ?"));
		
		
		LambdaPractice01 test = new LambdaPractice01();			//?Όλ°? λ©μ?λ₯? ?΄?©??¬ ?¬?©
		System.out.println(test.call("?Όλ°? λ©μ?λ₯? ? ???¬ μΆλ ₯"));
		
		//?΄μ²λΌ ??€? κΈ°μ‘΄? ?΄??€? λ©μ?λ₯? λ§λ€κ³? κ°μ²΄? ? ?€? ?¬?©?? λ°©μ?΄ ???Ό
		//κ·Έλ κ·Έλ λ°λ‘ λ§λ€?΄? ?¬?©?? ??΄?€. ?Έ?°??΄?€λ₯? ?΅?΄ λ©μ?λ₯? λ§λ€ ? ??λ‘? ?΄?κ³?
		
		//?Έ?°??΄?€λͺ? κ°μ²΄λͺ? = (??Όλ―Έν°) -> {??? μ½λ;};
		//??? κ°μ΄ ?Έ?°??΄?€ κ°μ²΄?? ??€ λ©μ?λ₯? ??±?κ³?
		//κ°μ²΄λͺ?.λ©μ?λͺ?() ?Όλ‘? ?¬?©??€.
		
		//κ²°κ΅­ ?Έ?°??΄?€λ‘? μΆμλ©μ??Έ κ»λ°κΈ°λ§ λ§λ€?΄?κ³? ???  ?, ??? λ©μ?λ‘? κ΅¬μ²΄???¬ ?¬?©??€?κ±? κ°λ€ 
		//μ¦? 1??±?Όλ‘? ?¬?©?? λ©μ?λ₯? λ§λ? κ±? κ°λ€.
		
//		*??€? ?΅?¬??*
//		(??Όλ―Έν°) -> {???  μ½λ}λ₯? ?΅?΄ λ©μ?λ₯? ? ??μ§? ?κ³ λ	λ©μ?μ²λΌ ?¬?©?  ? ??€? κ²?
//===========================================================================================
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);		
		
		list.forEach(val -> System.out.println(val));	//??€λ₯? ?΄?©? λ¦¬μ€?Έ μΆλ ₯
		list.forEach(System.out::println);
		
	}
	
}




























