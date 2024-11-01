package week2.day7.homeassignments;

public class APIClient {
	public void sendRequest(String endpoint)
	{
		System.out.println("End point : " + endpoint);
	}
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus)
	{
		System.out.println("End point : " + endpoint);
		System.out.println("'Request body : " + requestBody );
		System.out.println("Request status : "+ requestStatus);
	}
	public static void main(String[] args) {
		
		APIClient ap =new APIClient();
		ap.sendRequest("https://api.spotify.com/v1/albums/123");
		ap.sendRequest("https://api.spotify.com/v1/albums/45678", "description: Optional description in *Markdown*", false);

	
}
}
