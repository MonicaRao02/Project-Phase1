package fileManipulator;

public class WelcomeScreen {
	
	public void DisplayWelcomeText() {
		
		displayApplicationName();
		
		displayDeveloperDetails();
		
		displayApplicationOperationalCommands();
		
	}

	private void displayApplicationName() {
		//Application Name
		System.out.println("File Manager");
	}
	
	private void displayDeveloperDetails() {
		//Developer Details
		System.out.println("\n\n\nDeveloper Details :");
		System.out.println("\nName        : N Monica");
		System.out.println("\nCompany     : Lockers Pvt. Ltd");
		System.out.println("\nDesignation : Full Stack Developer");
		System.out.println("\nEmail ID    : monicarao02@gmail.com");
		
	}
	
	private void displayApplicationOperationalCommands() {
		//The details of the user interface such as options displaying the user interaction information 
		System.out.println("\n\n\nDetails of the User Interface Options are as Follows : ");
		System.out.println("\nfile information of a file    : FileInfo[filepath with extension]");
		System.out.println("\ndisplays all the files        : MyFiles");
		System.out.println("\nAdd a file                    : Add[filepath with extension]");
		System.out.println("\nDelete a file                 : Delete[Full filepath with extension]");
		System.out.println("\nSearch a file                 : Search[keywords of the filename]");
		System.out.println("\nRename a file                 : Rename[Oldfilepath with extension,NewfilePath with Extension]");
		System.out.println("\nSort filed in a directory     : SortA[Directory Path] for Ascending and SortD[Directory Path] for Descending Sort");
		System.out.println("\nHistory of the commands       : History");
		System.out.println("\nBack to Main Menu             : Main");
		System.out.println("\nClose the Application         : Close");
		System.out.println("\nReset the Application         : Reset");
		
	}
	
}
