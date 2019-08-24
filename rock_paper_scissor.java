/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		System.out.println("GfG!");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s1=sc.next();
		String s2=sc.next();
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		char[] c3=new char[n];
		char[] c4=new char[n];
		for(int i=0;i<n;i++){
		    c3[i]=c1[i%(c1.length)];
		}
		for(int i=0;i<n;i++){
		    c4[i]=c2[i%(c2.length)];
		}
		int count1=0,count2=0;
		for(int i=0;i<n;i++){
		    if(c3[i]=='r' && c4[i]=='p'){
		        count1++;
		    }
		    else if(c3[i]=='s' && c4[i]=='p'){
		        count1++;
		    }
		    else if(c3[i]=='p' && c4[i]=='r'){
		        count2++;
		    }
		    else if(c3[i]=='p' && c4[i]=='s'){
		        count2++;
		    }
		    else if(c3[i]=='r' && c4[i]=='s'){
		        count1++;
		    }
		    else if(c3[i]=='s' && c4[i]=='r'){
		        count2++;
		    }
		}
		System.out.println(count1+" "+count2);
	}
}
