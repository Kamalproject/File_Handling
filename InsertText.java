import java.io.*;

class InsertText{
	public static void main(String[]args)throws IOException{
		DataInputStream dis=new DataInputStream(System.in);
		FileOutputStream fot=new FileOutputStream("Myfile.txt");
		System.out.println("Enter text( press @ for stop) ");
		char c;
		
		while((c=(char)dis.read())!='@'){
			fot.write(c);
		}
		fot.close();
	}
}