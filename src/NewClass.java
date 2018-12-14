import java.io.*;

class NewClass {
		public static void main(String[] args) throws IOException {
System.out.print("Введи текст: \n");
    BufferedReader Reader = new BufferedReader (new InputStreamReader(System.in));
String Str = Reader.readLine();
System.out.println(Str.replaceAll("\\w","")+ "ваши пробелы");
}
}			
