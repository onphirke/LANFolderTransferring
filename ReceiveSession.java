
public class ReceiveSession {

	String ipAddress;
	int port;
	String path;

	public ReceiveSession(String ipAddress, int port, String path) {
		super();
		this.ipAddress = ipAddress;
		this.port = port;
		this.path = path;
	}
	
	@Override
	public String toString() {

		return "Host - " + ipAddress + "       |       Port - " + port + "       |         Path - " + path;
		
	}
	
}
