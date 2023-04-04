package genaricliberies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * this class contains reusable method
 * the actions performed on properties file
 * @author SATURN 
 *
 */


public class propertyFileYtility {
	
	 private Properties property;
	 /**
	  * this method is used to intialize properties file
	  * @paramfilepath
	  * @paramFilepath
	  */
	 public void propertyConfig(String Filepath){
	
		FileInputStream fis =null;
		try {
		 fis = new FileInputStream(Filepath) ;
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		  property = new Properties();
		 try{
			 property.load(fis);
		 }catch(IOException e) {
			 e.printStackTrace();
		}
	} 
	/**
	 * this method is used to fetch the values
	 * properties file based on key
	 * @param keys
	 * @return
	 */
		public String fectchproperty(String key) {
		return property.getProperty(key);
	
		}
		
/**
 * this method is used to write data int0 properties file
 * @param Key
 * @param values
 * @param Filepath
 * @param message
 */
public void setDataToProperties(String Key,String values, String Filepath ,String message) {
 property.put(Key, values);
 
 
 try {
	property.store(new FileOutputStream(Filepath),message);
 }catch (IOException e) {
	 e.fillInStackTrace();
 }
	
}	
}

