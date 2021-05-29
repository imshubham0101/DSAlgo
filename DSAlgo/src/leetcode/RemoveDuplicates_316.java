package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class RemoveDuplicates_316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbacdcbc";
		//char a = 1 + 'a';
		//System.out.println(a);
		System.out.println(removeDuplicateLetters(s));
		//removeDuplicateLetters(s);
	}

	private static String removeDuplicateLetters(String s) {
		
		int[] lastOccurance = new int[26];
		//lastOccurance Array
		for (int i = 0; i < s.length(); i++) {
			lastOccurance[s.charAt(i)-'a'] = i ;
		}
		
		boolean[] seen = new boolean[26] ;
		Stack<Integer> st = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			int c = s.charAt(i) - 'a' ;
			if(seen[c]) continue;
			while(!st.isEmpty() && st.peek() > c && lastOccurance[st.peek()] > i) {
				seen[st.peek()] = false ;
				st.pop() ;
			}
			st.push(c);
			seen[c] = true ;
		}
		StringBuilder result = new  StringBuilder();
		while(!st.isEmpty()) {
			result.append((char)(st.pop()+'a'));
	
			
		}
		return result.reverse().toString();
	}

}
