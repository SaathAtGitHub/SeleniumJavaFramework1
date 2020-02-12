package test;

public class PathOfCurrentProjectUsing_SystemGetPropertyNUserDotDir {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Path for your current project is: " + projectPath + "\\src\\test\\java\\test\\");

	}

}
