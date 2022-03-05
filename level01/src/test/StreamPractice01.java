package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamPractice01 {
	public static void main(String[] args) {
		int[] arr = {1,1,10,2,5,30,4,2};	//stream ??΄ λ°°μ΄? μ€λ³΅ κ°μ ??κ³? ?΄λ¦Όμ°¨??Όλ‘? ? ? ¬?΄λ³΄μ
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		
		list.sort(Comparator.reverseOrder());
		
		System.out.println("stream()? ?¬?©?μ§? ?κ³? μΆλ ₯ : " + list.toString());
//		=======================================================================================================
		//stream() ? ?¬?©?΄λ³΄μ
		
		System.out.println("Stream()? ?¬?©? μΆλ ₯ " + 
				Arrays.stream(arr).boxed()			//Stream ??±
				.distinct()							//μ€λ³΅? κ±?
				.sorted(Comparator.reverseOrder())	//?­? ? ¬
				.collect(Collectors.toList()) );	//Listλ‘? λ°ν
		
//		Stream?? ? ?Έ -> κ°?κ³? -> λ°ν? ??λ‘? ?΄λ£¨μ΄μ§λ€.
		
//		Stream? ? ?Έ?? λ°©λ²?€
//		Stream<?°?΄?°???> streamλͺ? = Arrays.stream(λ°°μ΄λͺ?);		//λ°°μ΄? ?€?Έλ¦ΌμΌλ‘?
//		Stream<?°?΄?°???> streamλͺ? = λ¦¬μ€?Έλͺ?.stream();			//collection? ?€?Έλ¦ΌμΌλ‘?
//		Stream<?°?΄?°???> streamλͺ? = Stream.of('κ°?', 'κ°?'....);//μ§μ  κ°μ ?£?΄ ?€?Έλ¦ΌμΌλ‘?
//		κΌ? stream? ? ?Έ? ? κ°μ ?£κ³? ?¬?©?? κ²μ΄ ???Ό
//		Arrays.stream(λ°°μ΄λͺ?).κ°?κ³΅λ©??...
//		λ¦¬μ€?Έλͺ?.stream.κ°?κ³΅λ©??...
//		?΄?° ??Όλ‘? λ°λ‘ ?¬?©?΄? ??€
		
		
		
	}
}











































