package Assignment4;

import java.util.StringJoiner;

public class Program3 {

	public static void main(String[] args)  {

				String s1=new String("java");	
				char ch[]= {'t','e','j','a','s'};
		String s4=new String("Programing");
		String s2=new String(ch);
		String s3=" Progrmaing";
		System.out.println(s1);
		System.out.println(ch);
		System.out.println("Program");
		String k="My Name IS TEJAS KAMTHE";
		s1=s1.concat(s3);
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println("1"+s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1==s3);
		System.out.println(s3.compareTo(s4));
		System.out.println(s1=s1.concat(s3));
		System.out.println(s1.toString());
		String s=String.join("",s1,s4);
		System.out.println(s.toString());
		StringJoiner t=new StringJoiner(" ");
		t.add("Hello");
		t.add("Tejas");
		System.out.println(t.toString());
		System.out.println(k.substring(0,5));
		System.out.println(k.charAt(3));
		System.out.println(k.length()); 
		String tk=k.replace("IS", "was");	
		System.out.println(tk);
			}

	}

