package com.vibol.corepattern.singletone;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DateUtilTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		String url = "C:\\Users\\GE66\\Desktop\\Udemy-Course\\Udemy-Design Patterns\\1- Singleton\\file\\dateUtil.ser";

		DateUtil dateUtil1 = DateUtil.getInstance();
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(url));
		oos.writeObject(dateUtil1);
		
		DateUtil dateUtil2 = null;
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(url));
		dateUtil2 = (DateUtil) ois.readObject();
		
		oos.close();
		ois.close();

		System.out.println(dateUtil1 == dateUtil2);

	}

}
