import java.io.*;
class Create2{
	public static void main(String[]args)throws IOException{
		String str="My name is Kamallochan Panigrahi \n I am a MCA student in KIIT Bhubaneswar";
		FileWriter fw=new FileWriter("Myfile.txt");
		for(int i=0;i<str.length();i++){
			fw.write(str.charAt(i));
		}
		fw.close();
		System.out.println("Data Enter Successfully");
	}
}