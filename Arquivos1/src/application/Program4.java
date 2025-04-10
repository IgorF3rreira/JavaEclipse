package application;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Program4 {
public static void main(String[] args) {
String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
String path = "C:\\temp\\out.txt";
try (BufferedWriter bw = new BufferedWriter(new FileWriter(path  ))) {
	//SE EU QUISER ACRECENTAR AS MESMAS FRASES NOVAMENTE NO ARQUIVO SEM CRIAR OUTRO IGUAL POR CIMA EU APENAS COLOCO (,TRUE)// 
for (String line : lines) {
bw.write(line);
bw.newLine();
}
} catch (IOException e) {
e.printStackTrace();
}
}
}