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
		int[] arr = {1,1,10,2,5,30,4,2};	//stream ?��?�� 배열?�� 중복 값을 ?��?���? ?��림차?��?���? ?��?��?��보자
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		
		list.sort(Comparator.reverseOrder());
		
		System.out.println("stream()?�� ?��?��?���? ?���? 출력 : " + list.toString());
//		=======================================================================================================
		//stream() ?�� ?��?��?��보자
		
		System.out.println("Stream()?�� ?��?��?�� 출력 " + 
				Arrays.stream(arr).boxed()			//Stream ?��?��
				.distinct()							//중복?���?
				.sorted(Comparator.reverseOrder())	//?��?��?��
				.collect(Collectors.toList()) );	//List�? 반환
		
//		Stream?? ?��?�� -> �?�? -> 반환?�� ?��?���? ?��루어진다.
		
//		Stream?�� ?��?��?��?�� 방법?��
//		Stream<?��?��?��???��> stream�? = Arrays.stream(배열�?);		//배열?�� ?��?��림으�?
//		Stream<?��?��?��???��> stream�? = 리스?���?.stream();			//collection?�� ?��?��림으�?
//		Stream<?��?��?��???��> stream�? = Stream.of('�?', '�?'....);//직접 값을 ?��?�� ?��?��림으�?
//		�? stream?�� ?��?��?�� ?�� 값을 ?���? ?��?��?��?�� 것이 ?��?��?��
//		Arrays.stream(배열�?).�?공메?��?��...
//		리스?���?.stream.�?공메?��?��...
//		?��?�� ?��?���? 바로 ?��?��?��?�� ?��?��
		
		
		
	}
}











































