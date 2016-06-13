import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

//class TestAutomation which performs the Test Automation
public class TestAutomation {
	//main function of the class
	public static void main(String[] args) throws FindFailed 
	{

		try{
			//to get the current directory
			String currDir = System.getProperty("user.dir");
			//directory to where sikuli images are obtained
			String imagesDir = currDir + "\\sikuliimages";
			
			//screen object
			Screen screen = new Screen();
			
			//click start menu of Windows 
			screen.click(imagesDir+"\\Start.PNG");
			
			Thread.sleep(3500);
			
			//launch Chrome browser
			screen.type("chrome.exe");
			Thread.sleep(1500);
			screen.type(Key.ENTER);
			
			
			Thread.sleep(3500);
			
			//load Spotify website
			screen.type("https://play.spotify.com/");
			screen.type(Key.ENTER);

			
			Thread.sleep(4500);
			Match waits = screen.wait(imagesDir+"\\LogIn.PNG");
			if (waits == null) {
				throw new Exception("Spotify Web player did not open within 5 seconds");
				}
			//to click LogIn for users who already have an account
			screen.click(imagesDir+"\\LogIn.PNG");
			
			Thread.sleep(3500);
			//to type the username
			screen.type(imagesDir+"\\Username.PNG", "kankut");
			
			Thread.sleep(3500);
			//to type the password
			screen.type(imagesDir+"\\Password.PNG", "Test@666");
			screen.type(Key.ENTER);
			
			Thread.sleep(3500);
			waits = screen.wait(imagesDir+"\\Search.PNG");
			if (waits == null) {
				throw new Exception("LogIn did not happen within 5 seconds");
				}
			//Search button for searching songs
			screen.click(imagesDir+"\\Search.PNG");
			
			Thread.sleep(3500);
			//Search for Animals Maroon 5 album
			screen.type("animals maroon 5");
			screen.type(Key.ENTER);
			
			Thread.sleep(5500);
			//Search button for searching songs
			screen.click(imagesDir+"\\Search.PNG");
			
			Thread.sleep(3500);
			//Search for Uptown Funk album
			screen.type("uptown funk");
			screen.type(Key.ENTER);
			
			Thread.sleep(5500);
			//Play Uptown Funk song 
			waits = screen.wait(imagesDir+"\\UptownFunk.PNG");
			if (waits == null) {
				throw new Exception("Song search result did not happen within 5 seconds");
				}
			screen.doubleClick(imagesDir+"\\UptownFunk.PNG");
			
			Thread.sleep(3500);
			//Search button for searching songs
			screen.click(imagesDir+"\\Search.PNG");
			
			Thread.sleep(3500);
			//Search for Maruthu album - an Indian movie song
			screen.type("maruthu");
			screen.type(Key.ENTER);
			
			Thread.sleep(5500);
			waits = screen.wait(imagesDir+"\\PlaySong.PNG");
			if (waits == null) {
				throw new Exception("Song search result did not happen within 5 seconds");
				}
			//Play the song
			screen.doubleClick(imagesDir+"\\PlaySong.PNG");
			
			//Right click to Save the song
			screen.rightClick();
			
			//Click to Save the song
			screen.click(imagesDir+"\\Save.PNG");
			
			
			Thread.sleep(4000);
			//Goto Your Music
			screen.click(imagesDir+"\\YourMusic.PNG");
			
			Thread.sleep(4000);
			//Select Songs tab
			screen.click(imagesDir+"\\Songs.PNG");

			//Hover to show that song is saved
			screen.hover(imagesDir+"\\SongHighlight.PNG");
			
			Thread.sleep(5000);
			//Click on Settings button on bottom of the screen
			screen.click(imagesDir+"\\Settings.PNG");
			
			Thread.sleep(5000);
			//Click log out
			screen.click(imagesDir+"\\Logout.PNG");
			
			//To show login failed with an incorrect username and password
			Thread.sleep(4500);
			screen.click(imagesDir+"\\LogIn.PNG");
			
			Thread.sleep(4500);
			screen.type(imagesDir+"\\Username.PNG", "InvalidUser");
			
			Thread.sleep(4500);
			screen.type(imagesDir+"\\Password.PNG", "xyzxyz");
			screen.type(Key.ENTER);

		}
		
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		finally {
			
		}
			
			
	  }
}
