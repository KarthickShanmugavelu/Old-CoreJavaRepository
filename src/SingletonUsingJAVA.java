

class DBConnection{
	String connection;
	public String getConnection() {
		return connection;
	}
	public void setConnection(String connection) {
		this.connection = connection;
	}
	private DBConnection(){
		
	}
private DBConnection(String connection){
		this.connection=connection;
	}
	private static DBConnection obj = new DBConnection();
	public static DBConnection getDBConnection() {
		return obj;
	}
	
	public static DBConnection getDBConnectionWithParam(String connection) {
		DBConnection obj2 = new DBConnection(connection);
		return obj2;
	}
	
}

public class SingletonUsingJAVA {
	
	public static void main(String[] args) {
		DBConnection obj = DBConnection.getDBConnection();
		obj.setConnection("Connection 1");
		System.out.println(obj);
		System.out.println(obj.getConnection());
		System.out.println("=======================");
		DBConnection obj2 = DBConnection.getDBConnection();
		obj2.setConnection("Connection 2");
		System.out.println(obj2);
		System.out.println(obj2.getConnection());
		System.out.println("=======================");
		DBConnection obj3 = DBConnection.getDBConnectionWithParam("Connection 3");
		System.out.println(obj3);
		System.out.println(obj3.getConnection());
	}

}
