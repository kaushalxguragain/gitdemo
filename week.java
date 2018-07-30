import java.util.*;
import java.lang.*;
public class week{
	
		public static void main(String[] args){
			
			System.out.println("enter  which day of the week? use a,b...");
			Scanner sc = new Scanner(System.in);
			switch(sc.nextLine()){
				
				case ("u") :{System.out.println("Sunday"); break;}
				case ("m") :{System.out.println("Monday");break;}
				case ("t") :{System.out.println("Tuesday");break;}
				case ("w") :{System.out.println("Wednesday");break;}
				case ("t") :{System.out.println("Thursday");break;}
				case ("f") :{System.out.println("Friday");break;}
				case ("sa") :{System.out.println("Saturday");break;}
				
				default : {System.out.println("error");break;}
				
			}
		}
	
	
}