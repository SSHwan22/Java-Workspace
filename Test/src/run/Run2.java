package run;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Run2 {

	public static void main(String[] args) {
		try( DataInputStream in = new DataInputStream(new FileInputStream("test.txt"));){
			
			String name = in.readUTF();
			int kor = in.readInt();
			int eng = in.readInt();
			int math = in.readInt();
			
			System.out.println(name);
			System.out.println(kor);
			System.out.println(eng);
			System.out.println(math);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
