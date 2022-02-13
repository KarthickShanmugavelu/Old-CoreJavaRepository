package iteratorsPkg;

import java.util.Iterator;

public class CustomIteratorMain {
	
	public static void main(String[] args) {
		UrlLibrary urlLibrary = new UrlLibrary();
		
		Iterator<String> ref = urlLibrary.iterator();
		while(ref.hasNext()) {
			String html=ref.next();
			System.out.println("======================================");
			System.out.println("HTML Length:"+html.length());
			System.out.println(html);
			System.out.println("======================================");
			
		}
	}

}
