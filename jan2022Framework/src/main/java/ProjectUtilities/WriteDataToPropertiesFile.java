package ProjectUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataToPropertiesFile {

	public void writeData(String filePathUnderProject, String key, String Value, String comment) throws IOException {
		// identify a file using the filePath
		String ProjectDir = System.getProperty("user.dir");
		System.out.println(ProjectDir);

		String filePath = ProjectDir + filePathUnderProject;
		System.out.println(filePath);
		File f = new File(filePath);

		// open the file for read or write purpose
		FileInputStream fis = new FileInputStream(f);

		// convert the file to property type
		Properties prop = new Properties();
		prop.load(fis);

		prop.setProperty(key, Value);

		// save to file
		FileOutputStream fos = new FileOutputStream(f);
		prop.store(fos, comment);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WriteDataToPropertiesFile write = new WriteDataToPropertiesFile();
		write.writeData("\\ProjectConfigProperties\\configurations.properties", "Env", "TestEnv",
				"added test env property");
	}

}
