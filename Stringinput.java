import java.io.*;
class Stringinput{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw=new FileWriter("Myfile.txt");
		String s;
		System.out.println("Enter your message and Write 'Exit' to end of the message");
		while(!(s=br.readLine()).equals("Exit")){
			fw.write(s);
		}
		fw.close();
	}
}