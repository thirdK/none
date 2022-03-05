package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_Matcher {
//	^	λ¬Έμ?΄ ??
//	$	λ¬Έμ?΄ μ’λ£
//	.	??? ? λ¬Έμ(?¨ \?? ?£? ? ??)
//	*	? λ¬Έμκ°? ?? ?? λ¬΄ν?  λ§μ ?? ??
//	+	? λ¬Έμκ°? ?? ?΄?
//	?	? λ¬Έμκ°? ?κ±°λ ?? ??
//	[ ] 	λ¬Έμ? μ§ν©?΄? λ²μλ₯? ????΄λ©? ? λ¬Έμ ?¬?΄? - κΈ°νΈλ‘? λ²μλ₯? ??????€. [] ?΄?? ^ κ°? ? ???¬ μ‘΄μ¬?λ©? not? ????Έ?€.
//	{ } 	?? ?? λ²μλ₯? ??????€.
//	( )	?κ΄νΈ ?? λ¬Έμλ₯? ??? λ¬Έμλ‘? ?Έ?
//	|	?¨?΄ ??? or ?°?°? ???  ? ?¬?©
//	\	? κ·? ??? ?­?¬??(\)? ??₯λ¬Έμ (?­?¬?? ?€?? ?Όλ°? λ¬Έμκ°? ?€λ©? ?Ή?λ¬Έμλ‘? μ·¨κΈ?κ³? ?­?¬?? ?€?? ?Ή?λ¬Έμκ°? ?€λ©? κ·? λ¬Έμ ?μ²΄λ?? ?λ―?)
//	\b	?¨?΄? κ²½κ³
//	\B	?¨?΄κ°? ??κ²μ ??? κ²½κ³
//	\A	?? ₯? ?? λΆ?λΆ?
//	\G	?΄?  λ§€μΉ? ?
//	\Z	?? ₯? ??΄μ§?λ§? μ’κ²°?κ°? ?? κ²½μ°
//	\z	?? ₯? ?
//	\s	κ³΅λ°± λ¬Έμ
//	\S	κ³΅λ°± λ¬Έμκ°? ?? ?λ¨Έμ? λ¬Έμ
//	\w	??λ²³μ΄? ?«?
//	\W	??λ²³μ΄? ?«?λ₯? ? ?Έ? λ¬Έμ
//	\d	?«? [0-9]?? ??Ό
//	\D	?«?λ₯? ? ?Έ? λͺ¨λ  λ¬Έμ
//	(?i)	? λΆ?λΆμ (?!)?Ό? ?΅?? ?£?΄μ£Όκ² ?λ©? ???λ¬Έμ? κ΅¬λΆ?μ§? ??΅??€.
	
	
	
//	? κ·μ
//	^[0-9]*$	?«?
//	^[a-zA-Z]*$	?λ¬Έμ
//	^[κ°?-?£]*$	?κΈ?
//	\\w+@\\w+\\.\\w+(\\.\\w+)?	E-Mail
//	^\d{2,3}-\d{3,4}-\d{4}$	? ?λ²νΈ
//	^01(?:0|1|[6-9])-(?:\d{3}|\d{4})-\d{4}$	?΄??? ?λ²νΈ
//	\d{6} \- [1-4]\d{6}	μ£Όλ?Όλ±λ‘λ²?Έ
//	^\d{3}-\d{2}$	?°?Έλ²νΈ
	
	public static void main(String[] args) {
		String str = "123452143214";
		String pattern = "^[0-9]*$";
		
		boolean res = Pattern.matches(pattern, str);	// ?¨?΄ , λΉκ΅???
		System.out.println(res);
		
		System.out.println(str.matches(pattern));	//?΄ λ°©μ?Όλ‘λ κ°??₯

		System.out.println("========================================================================");
		
		Pattern pattern2 = Pattern.compile("^[a-zA-Z]*$"); //?λ¬Έμλ§?
        String val = "abcdef"; //???λ¬Έμ?΄

        Matcher matcher = pattern2.matcher(val);
        System.out.println(matcher.find());
	}
}

//		.			?΄?€ λ¬Έμ 1κ°λ?? ?λ―?
//		^regex		^ ?€? regexλ‘? line? ????μ§?
//		regex$		$ ?? regexκ°? line? λ§μ?λ§μΌλ‘? ???μ§?
//		[abc]		a, b, c μ€μ λ¬Έμ 1κ°?
//		[abc][vz]	a, b, c μ€μ λ¬Έμ 1κ°μ? v, z μ€μ λ¬Έμ 1κ°μ μ‘°ν©
//		[^abc]		a, b, cλ₯? ? ?Έ? λ¬Έμ 1κ°?
//		[a-d1-7]	ad, 17 ?¬?΄? λ¬Έμ 1κ°?
//		X|Z			X ?? Z
//		\d			0~9 ?¬?΄? ?«?, [0-9]?? ??Ό
//		\D			?«?κ°? ?? ?΄?€ λ¬Έμ, [^0-9]?? ??Ό
//		\s			whitespace 1κ°?, [\t\n\x0b\r\f]?? ??Ό
//		\S			whitespaceλ₯? ? ?Έ? λ¬Έμ
//		\w			Alphanumeric(alphabet, ?«?) λ¬Έμ, [a-zA-Z_0-9]?? ??Ό
//		\W			Alphanumeric? ? ?Έ? λ¬Έμ(whitespace ?±)
//		\S+			whitespaceλ₯? ? ?Έ? ?¬?¬ λ¬Έμ
//		\b			?¨?΄? κ²½κ³(κ³΅λ°±)λ₯? μ°Ύμ΅??€
