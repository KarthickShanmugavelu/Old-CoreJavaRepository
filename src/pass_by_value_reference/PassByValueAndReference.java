package pass_by_value_reference;

class TestClass{
	public String content;
}

public class PassByValueAndReference {
	
	
	
	public static void main(String args[]){
        int foo = 13;
        System.out.println(foo); // this will print "1"

        setFoo(foo);
        System.out.println(foo); // this will still print "1"
        
        TestClass myObj = new TestClass();
        myObj.content="testString";
        System.out.println("Before changing "+myObj.content);
        changeContentVal(myObj);
        System.out.println("After changing "+myObj.content);
    }

    public static void setFoo(int foo){
        foo = 2;
    }
    
    public static void changeContentVal(TestClass obj) {
    	obj.content="changedString";
    }

}
