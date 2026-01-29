/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		int key = sc.nextInt();
		System.out.println(Cipher.keyedEncode(input, key));
		String decoded1 = Cipher.encode("6v lvp u5vuy5 y1z5 qpsqy5r");
		String decoded2 = Cipher.encode("sv8vq17r 1r q25 85rq");
		String decoded3 = Cipher.encode("q25 z5l qv wpx85s f 1r gg");
		String decoded4 = Cipher.keyedEncode("z8r8v 6yzzc 64r8 oys sx z8r8v 6y4z6 ty 18t oys 9yqz", 33);
		String decoded5 = Cipher.encode("29y4 v4 v2q9w1r 05sr5l wpx85s 1r z5l qv d");
		String decoded6 = Cipher.keyedEncode("a8 1oy 92 1kx rxdj in 4", 8);
		String decoded7 = Cipher.keyedEncode("549q94u8 q3t sxys0u3 q7u 2e vqb47y9u bq7yqr1u 3q2u8", 13);
		String decoded75 = Cipher.keyedEncode(decoded7, 29);
		String decoded8 = Cipher.encode("lvpo5 rp775rr4pyyl 7vxuy5q56 q25 41srq r57q1vw");
		//
		String decoded9 = Cipher.keyedEncode("u4y i1e i5 i6ita5c 314c1i66e1 i5f by6i5 hea5c zbi58 u4y", 27);
		String decoded10 = Cipher.keyedEncode("amlb mfhp7fcj jlgq fo tap s9a bjlslql aflipa lb hlg9b 210z t9ct", 16);
		
	
		
		System.out.println(decoded1);
		System.out.println(decoded2);
		System.out.println(decoded3);
		System.out.println(decoded4);
		System.out.println(decoded5);
		System.out.println(decoded6);
		// System.out.println(decoded7);
		System.out.println(decoded75);
		System.out.println(decoded8);
		System.out.println(decoded9);
		System.out.println(decoded10);


	}
}
