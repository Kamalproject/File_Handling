import java.io.*;

class ReadText{
	public static void main(String[]args)throws IOException{
		FileInputStream fin=new FileInputStream("Myfile.txt");
		
		int ch;
		System.out.println("File contents ");
		while((ch=fin.read())!=-1){
			System.out.print((char)ch);
		}
		fin.close();
	}
}