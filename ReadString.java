import java.io.*;
class ReadString{
	public static void main(String[]args)throws IOException{
		String s;
		FileReader fr=new FileReader("Myfile.txt");
		BufferedReader br=new BufferedReader(fr);
		
		while((s=br.readLine())!=null){
			System.out.println(s);
		}
		fr.close();
	}
}