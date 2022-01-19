package ProjectUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {
	
	private String ReadData(String filePathUnderProject, String key) throws IOException {
		
		//identify a file using the filePath
		String ProjectDir = System.getProperty("user.dir");
		System.out.println(ProjectDir);
		
		String filePath = ProjectDir+filePathUnderProject;
		System.out.println(filePath);
		File f = new File(filePath);
		
		//open the file for read or write purpose
		FileInputStream fis = new FileInputStream(f);
		
		//convert the file to property type
		Properties prop = new Properties();
		prop.load(fis);
		
		String data = prop.getProperty(key);
		return data;
	}

	
	public static void main(String[] args) throws IOException {
		ReadDataFromPropertyFile read = new ReadDataFromPropertyFile();
		System.out.println(read.ReadData("\\ProjectConfigProperties\\configurations.properties","browser"));
		
	}
}
