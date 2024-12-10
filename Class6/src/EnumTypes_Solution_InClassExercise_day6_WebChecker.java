import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

enum PageStatus {

	LOADING, LOADED, NOT_FOUND, ERROR

}

public class EnumTypes_Solution_InClassExercise_day6_WebChecker {

	public static PageStatus checkWebsiteStatus(String site) {

		try {
			URI uri = new URI(site); // site address will be of type String
			URL url = uri.toURL(); // Convert the URI to URL object

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			if (connection.getResponseCode() == 404) {
				return PageStatus.NOT_FOUND;
			}

			if (connection.getResponseCode() == 200) {
				return PageStatus.LOADED;
			}
			return PageStatus.ERROR;

		} catch (Exception e) {
			return PageStatus.ERROR;
		}
	}

	public static void printPageStatus(PageStatus status) {

		switch (status) {

		case LOADING:
			System.out.println("The page is currently loading");
			break;

		case LOADED:
			System.out.println("The page is loaded");
			break;

		case ERROR:
			System.out.println("There was an error loading this page");
			break;

		case NOT_FOUND:
			System.out.println("The page was not found");
			break;

		}

	}

	public static void main(String[] args) {

		PageStatus status;

		// Scenario 1: Valid page webload
		System.out.println("Scenario 1: checking the status of google.com");
		status = checkWebsiteStatus("https://www.google.com/");
		printPageStatus(status);
		System.out.println("-----------------------------");

		// Scenario 2: Page not Found
		System.out.println("Scenario 2: check a noun-existing page");
		status = checkWebsiteStatus("https://www.google.com/thispagedoesnotexist");
		printPageStatus(status);
		System.out.println("-----------------------------");

		// Scenario 3: Invalid URL
		System.out.println("Scenario 3: Invalid URL");
		status = checkWebsiteStatus("invalidurl");
		printPageStatus(status);
		System.out.println("-----------------------------");
		
		// Scenario 4: webpage with loading state
		System.out.println("Scenario 4: Simulating a page in the loading state....");
		status = checkWebsiteStatus("invalidurl");
		printPageStatus(status);
		System.out.println("-----------------------------");

	}

}
