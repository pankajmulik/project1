import java.util.Scanner;
public class RecursionExample{
static void examp(String str,int i,int s,int flag,int j)  {
	char ch=str.charAt(i);
	char lh=str.charAt(j);
	if(i<=(s/2)) {
		if(ch==lh) {
			flag=1;
			i++;
			j--;
			examp(str,i,s,flag,j);
		
	}else {
		flag=0;
		System.out.println("not palindrome");
	}
	}else {
		if(flag==1) {
			System.out.println("palindrome");
		}
	}
	 
	}
public static void main(String[] xx){
Scanner sx= new Scanner(System.in); ;{
			String str=sx.next();
			int s=str.length();
			int i=0;
int flag=0;
int j=s-1;
examp(str, i,s,flag,j);
		}
}
}
