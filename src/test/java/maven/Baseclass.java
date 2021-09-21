package maven;

import com.utils.LibGlobal;

public class Baseclass extends LibGlobal {

	public static void main(String[] args) {
		
		//Initialize the driver from LibGlobal
		getDriver();
		
		//URL
		getUrl("https://google.com/");
		
		//Get Title
		System.out.println(getTitle());
		
		//close the site
		closeBrowser();
	}
}
