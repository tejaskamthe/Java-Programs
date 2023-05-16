package CollectionFrameWork;

import java.util.Iterator;
import java.util.Stack;

public class StcakExample {

	public static void main(String[] args) {
		Stack<String>stack=new Stack<String>();
		stack.push("Welcome");
        stack.push("To");
        stack.push("Home");
        stack.push("In");
        stack.push("Home");
        //stack.pop();
		Iterator<String> itr=stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			}
	}

