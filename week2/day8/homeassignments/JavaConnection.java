package week2.day8.homeassignments;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connect -- implemented");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect -- implemented");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("executeUpdate -- implemented");
		
	}
	
	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
	}
	

}
