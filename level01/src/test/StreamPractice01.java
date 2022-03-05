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
		int[] arr = {1,1,10,2,5,30,4,2};	//stream ?—†?´ ë°°ì—´?˜ ì¤‘ë³µ ê°’ì„ ?—†?—ê³? ?‚´ë¦¼ì°¨?ˆœ?œ¼ë¡? ? •? ¬?•´ë³´ì
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		
		list.sort(Comparator.reverseOrder());
		
		System.out.println("stream()?„ ?‚¬?š©?•˜ì§? ?•Šê³? ì¶œë ¥ : " + list.toString());
//		=======================================================================================================
		//stream() ?„ ?‚¬?š©?•´ë³´ì
		
		System.out.println("Stream()?„ ?‚¬?š©?•œ ì¶œë ¥ " + 
				Arrays.stream(arr).boxed()			//Stream ?ƒ?„±
				.distinct()							//ì¤‘ë³µ? œê±?
				.sorted(Comparator.reverseOrder())	//?—­? •? ¬
				.collect(Collectors.toList()) );	//Listë¡? ë°˜í™˜
		
//		Stream?? ?„ ?–¸ -> ê°?ê³? -> ë°˜í™˜?˜ ?ˆœ?„œë¡? ?´ë£¨ì–´ì§„ë‹¤.
		
//		Stream?„ ?„ ?–¸?•˜?Š” ë°©ë²•?“¤
//		Stream<?°?´?„°???…> streamëª? = Arrays.stream(ë°°ì—´ëª?);		//ë°°ì—´?„ ?Š¤?Š¸ë¦¼ìœ¼ë¡?
//		Stream<?°?´?„°???…> streamëª? = ë¦¬ìŠ¤?Š¸ëª?.stream();			//collection?„ ?Š¤?Š¸ë¦¼ìœ¼ë¡?
//		Stream<?°?´?„°???…> streamëª? = Stream.of('ê°?', 'ê°?'....);//ì§ì ‘ ê°’ì„ ?„£?–´ ?Š¤?Š¸ë¦¼ìœ¼ë¡?
//		ê¼? stream?„ ?„ ?–¸?•œ ?›„ ê°’ì„ ?„£ê³? ?‚¬?š©?•˜?Š” ê²ƒì´ ?•„?‹ˆ?¼
//		Arrays.stream(ë°°ì—´ëª?).ê°?ê³µë©”?†Œ?“œ...
//		ë¦¬ìŠ¤?Š¸ëª?.stream.ê°?ê³µë©”?†Œ?“œ...
//		?´?Ÿ° ?‹?œ¼ë¡? ë°”ë¡œ ?‚¬?š©?•´?„ ?œ?‹¤
		
		
		
	}
}











































