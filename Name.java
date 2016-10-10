import java.util.Arrays;
import java.util.Scanner;

public class Name {

	public static void main(String[] args){
	
	//Introduction
	System.out.println ("Hello! Before we begin can you give me your first name?");

	//Variable Declaration
	String firstname;
	String[] lastname;
		lastname = new String[50];
	String stringlastname;
	int letters;
	int i=0;
	
	char letter;
	String stringletter;
	
	double[] listofnum;
		listofnum = new double[7];

	double num1,num2,num3,num4,num5,num6;
	int num7;
	double[] numlist2;
		numlist2 = new double [2];
	double[] numlist3;
		numlist3 = new double [2];
	double[] numlist4;
		numlist4 = new double [2];
	double[] numlist5;
		numlist5 = new double [2];
	double[] numlist6;
		numlist6 = new double [2];
	
	//First Name Retrieval
	Scanner names = new Scanner(System.in);
	
	firstname = names.next();
	firstname = firstname.replaceAll("[^a-z,A-Z]","");
	
	while (true) {
		if (firstname.isEmpty()) {
			System.out.println ("There was an error in retieving your first name, please try again");
			firstname = names.next();
			firstname = firstname.replaceAll("[^a-z,A-Z]","");
				continue;		
		}
		else if (!firstname.isEmpty()) {
			break;
		}
	}

	//Last Name Retrieval
	System.out.println ("Thanks " +firstname+ ", now that we have gotten your first name, I need to get your last name");
	System.out.println ("How many letters are in your last name?");
	letters = names.nextInt();
	System.out.println ("Thanks, can you please give me your last name one letter at a time?");
	
	do {
		letter = names.next().charAt(0);
		stringletter = Character.toString(letter);
		lastname[i] = stringletter;
		i++;
    }
	while (letters>i);
	
	//Trim Lastname
	stringlastname=Arrays.toString(lastname).replace(",","").replace("null","");
	stringlastname = stringlastname.replaceAll("[^a-z,A-Z]","");
	System.out.println("Great! So your name is " +firstname+" "+stringlastname);

	//Number Retrieval
	System.out.println("Okay , now that we have your name I need you to provide me with 7 positive numbers");
	
	while (!names.hasNextDouble()) names.next();
	
		num1 = names.nextDouble();
		if (num1<0){
			System.exit(0);
		}
		listofnum[0] = num1;
		Arrays.sort(listofnum);
		System.out.println("Sum: "+num1);
		System.out.println("Highest Number: "+num1);
		System.out.println("Lowest Number Number: "+num1);
		System.out.println("Average: "+num1);
		
		num2 = names.nextDouble();
		if (num2<0){
			System.exit(0);
		}
		listofnum[1] = num2;
		Arrays.sort(listofnum);
		numlist2[1] = listofnum[6];
		numlist2[0] = listofnum[5];
		System.out.println("Sum: "+(num1+num2));
		System.out.println("Highest Number: "+listofnum[6]);
		System.out.println("Lowest Number Number: "+listofnum[5]);
		System.out.println("Average: "+((num1+num2)/2));
		
		num3 = names.nextDouble();
		if (num3<0){
			System.exit(0);
		}
		listofnum[2] = num3;
		Arrays.sort(listofnum);
		numlist3[1] = listofnum[6];
		numlist3[0] = listofnum[4];
		System.out.println("Sum: "+(num1+num2+num3));
		System.out.println("Highest Number: "+listofnum[6]);
		System.out.println("Lowest Number Number: "+listofnum[4]);
		System.out.println("Average: "+((num1+num2+num3)/3));
		
		num4 = names.nextDouble();
		if (num4<0){
			System.exit(0);
		}
		listofnum[3] = num4;
		Arrays.sort(listofnum);
		numlist4[1] = listofnum[6];
		numlist4[0] = listofnum[3];
		System.out.println("Sum: "+(num1+num2+num3+num4));
		System.out.println("Highest Number: "+listofnum[6]);
		System.out.println("Lowest Number Number: "+listofnum[3]);
		System.out.println("Average: "+((num1+num2+num3+num4)/4));
		
		num5 = names.nextDouble();
		if (num5<0){
			System.exit(0);
		}
		listofnum[1] = num5;
		Arrays.sort(listofnum);
		numlist5[1] = listofnum[6];
		numlist5[0] = listofnum[2];
		System.out.println("Sum: "+(num1+num2+num3+num4+num5));
		System.out.println("Highest Number: "+listofnum[6]);
		System.out.println("Lowest Number Number: "+listofnum[2]);
		System.out.println("Average: "+((num1+num2+num3+num4+num5)/5));
		
		num6 = names.nextDouble();
		if (num6<0){
			System.exit(0);
		}
		listofnum[1] = num6;
		Arrays.sort(listofnum);
		numlist6[1] = listofnum[6];
		numlist6[0] = listofnum[1];
		System.out.println("Sum: "+(num1+num2+num3+num4+num5+num6));
		System.out.println("Highest Number: "+listofnum[6]);
		System.out.println("Lowest Number Number: "+listofnum[1]);
		System.out.println("Average: "+((num1+num2+num3+num4+num5+num6)/6));
		
		num7 = (int) names.nextDouble();
		if (num7<0){
			System.exit(0);
		}
		listofnum[0] = num7;
		Arrays.sort(listofnum);
		System.out.println("Sum: "+(num1+num2+num3+num4+num5+num6+num7));
		System.out.println("Highest Number: "+listofnum[6]);
		System.out.println("Lowest Number Number: "+listofnum[0]);
		System.out.println("Average: "+((num1+num2+num3+num4+num5+num6+num7)/7)); 
	
		DataReport Report = new DataReport();
		Report.Data(listofnum,numlist2,numlist3,numlist4,numlist5,numlist6, num1, num2, num3, num4, num5, num6, num7);
		
	}	
}
	
	
	

