package day6;
import java.util.Scanner;
public class Program5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				String data =sc.nextline();
				String words[] = data.split(" ");
				int max =0;
				String maxStr = "";
				for(int i=0;i<words.length;i++) {
					if(words[i].contains(".")) {
						words[i] = words[i].substring(0,words[i].length()-1 );
						System.out.println(words[i]);
					}
					if(words[i].length() > max) {
						max = words[i].length();
						maxStr = words[i];
					}
				}
				System.out.println("Max char in a Given Line--->"+max);
				System.out.println("Max Word in a Given Line--->"+maxStr);
					}
		}


