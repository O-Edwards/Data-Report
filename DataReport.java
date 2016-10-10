import java.util.Scanner;

class DataReport{
	public void Data(double[] listofnum, double[]numlist2,double[]numlist3,double[]numlist4,double[]numlist5,double[]numlist6,double num1, double num2,double num3,double num4,double num5,double num6, int num7) {

String response;
boolean ans = true;
Scanner names = new Scanner(System.in); 
String reportname;

System.out.println("Would you like a report of the data provided, please type 'Yes' or 'No'");
response = names.next();
		switch(response) 
		{
		case "Yes":
			ans= true;
			System.out.println("What would you like your report name to be?");
			reportname = names.next();
			System.out.println(reportname);
			System.out.println("Input Number\tHighest Number\tLowest Number\tRow Total\tAverage Number");
			System.out.println("_______________________________________________________________________________________");
			System.out.println(num1+"\t\t   "+num1+"\t\t   "+num1+"\t\t"+(num1*3)+"\t\t"+num1);
			System.out.println(num2+"\t\t   "+numlist2[1]+"\t\t   "+numlist2[0]+"\t\t"+(num1+(num2*2))+"\t\t"+((num1+num2)/2));
			System.out.println(num3+"\t\t   "+numlist3[1]+"\t\t   "+numlist3[0]+"\t\t"+(num3+numlist3[1]+numlist3[0])+"\t\t"+((num1+num2+num3)/3));
			System.out.println(num4+"\t\t   "+numlist4[1]+"\t\t   "+numlist4[0]+"\t\t"+(num4+numlist4[1]+numlist4[0])+"\t\t"+((num1+num2+num3+num4)/4));
			System.out.println(num5+"\t\t   "+numlist5[1]+"\t\t   "+numlist5[0]+"\t\t"+(num5+numlist5[1]+numlist5[0])+"\t\t"+((num1+num2+num3+num4+num5)/5));
			System.out.println(num6+"\t\t   "+numlist6[1]+"\t\t   "+numlist6[0]+"\t\t"+(num6+numlist6[1]+numlist6[0])+"\t\t"+((num1+num2+num3+num4+num5+num6)/6));
			System.out.println(num7+"\t\t   "+listofnum[6]+"\t\t   "+listofnum[0]+"\t\t"+(num7+listofnum[0]+listofnum[6])+"\t\t"+((num1+num2+num3+num4+num5+num6+num7)/7));
			System.out.println("Rows Grand Total: "+((num1*3)+(num1+(num2*2))+(num3+numlist3[1]+numlist3[0])+(num4+numlist4[1]+numlist4[0])+(num5+numlist5[1]+numlist5[0])+(num6+numlist6[0]+numlist6[1])+(num7+listofnum[0]+listofnum[6])));
			break;
		
		case "yes":
			ans= true;
			System.out.println("What would you like your report name to be?");
			reportname = names.next();
			System.out.println(reportname);
			System.out.println("Input Number\tHighest Number\tLowest Number\tRow Total\tAverage Number");
			System.out.println("_______________________________________________________________________________________");
			System.out.println(num1+"\t\t   "+num1+"\t\t   "+num1+"\t\t"+(num1*3)+"\t\t"+num1);
			System.out.println(num2+"\t\t   "+numlist2[1]+"\t\t   "+numlist2[0]+"\t\t"+(num1+(num2*2))+"\t\t"+((num1+num2)/2));
			System.out.println(num3+"\t\t   "+numlist3[1]+"\t\t   "+numlist3[0]+"\t\t"+(num3+numlist3[1]+numlist3[0])+"\t\t"+((num1+num2+num3)/3));
			System.out.println(num4+"\t\t   "+numlist4[1]+"\t\t   "+numlist4[0]+"\t\t"+(num4+numlist4[1]+numlist4[0])+"\t\t"+((num1+num2+num3+num4)/4));
			System.out.println(num5+"\t\t   "+numlist5[1]+"\t\t   "+numlist5[0]+"\t\t"+(num5+numlist5[1]+numlist5[0])+"\t\t"+((num1+num2+num3+num4+num5)/5));
			System.out.println(num6+"\t\t   "+numlist6[1]+"\t\t   "+numlist6[0]+"\t\t"+(num6+numlist6[1]+numlist6[0])+"\t\t"+((num1+num2+num3+num4+num5+num6)/6));
			System.out.println(num7+"\t\t   "+listofnum[6]+"\t\t   "+listofnum[0]+"\t\t"+(num7+listofnum[0]+listofnum[6])+"\t\t"+((num1+num2+num3+num4+num5+num6+num7)/7));
			System.out.println("Rows Grand Total: "+((num1*3)+(num1+(num2*2))+(num3+numlist3[1]+numlist3[0])+(num4+numlist4[1]+numlist4[0])+(num5+numlist5[1]+numlist5[0])+(num6+numlist6[0]+numlist6[1])+(num7+listofnum[0]+listofnum[6])));
			break;
		
		case "No":
			ans = false;
			System.out.println("Okay, the program will now exit");
			System.exit(0);
			break;
		case "no":
			ans = false;
			System.out.println("Okay, the program will now exit");
			System.exit(0);
			break;
		
		default:
			System.out.println("Please try again");
			boolean repeat = true;
			
			while (repeat)
			{
				
				response = names.nextLine();
				
				switch(response) 
				{
				case "Yes":
					ans= true;
					System.out.println("What would you like your report name to be?");
					reportname = names.next();
					System.out.println(reportname);
					System.out.println("Input Number\tHighest Number\tLowest Number\tRow Total\tAverage Number");
					System.out.println("_______________________________________________________________________________________");
					System.out.println(num1+"\t\t   "+num1+"\t\t   "+num1+"\t\t"+(num1*3)+"\t\t"+num1);
					System.out.println(num2+"\t\t   "+numlist2[1]+"\t\t   "+numlist2[0]+"\t\t"+(num1+(num2*2))+"\t\t"+((num1+num2)/2));
					System.out.println(num3+"\t\t   "+numlist3[1]+"\t\t   "+numlist3[0]+"\t\t"+(num3+numlist3[1]+numlist3[0])+"\t\t"+((num1+num2+num3)/3));
					System.out.println(num4+"\t\t   "+numlist4[1]+"\t\t   "+numlist4[0]+"\t\t"+(num4+numlist4[1]+numlist4[0])+"\t\t"+((num1+num2+num3+num4)/4));
					System.out.println(num5+"\t\t   "+numlist5[1]+"\t\t   "+numlist5[0]+"\t\t"+(num5+numlist5[1]+numlist5[0])+"\t\t"+((num1+num2+num3+num4+num5)/5));
					System.out.println(num6+"\t\t   "+numlist6[1]+"\t\t   "+numlist6[0]+"\t\t"+(num6+numlist6[1]+numlist6[0])+"\t\t"+((num1+num2+num3+num4+num5+num6)/6));
					System.out.println(num7+"\t\t   "+listofnum[6]+"\t\t   "+listofnum[0]+"\t\t"+(num7+listofnum[0]+listofnum[6])+"\t\t"+((num1+num2+num3+num4+num5+num6+num7)/7));
					System.out.println("Rows Grand Total: "+((num1*3)+(num1+(num2*2))+(num3+numlist3[1]+numlist3[0])+(num4+numlist4[1]+numlist4[0])+(num5+numlist5[1]+numlist5[0])+(num6+numlist6[0]+numlist6[1])+(num7+listofnum[0]+listofnum[6])));
					break;
				case "yes":
					ans= true;
					System.out.println("What would you like your report name to be?");
					reportname = names.next();
					System.out.println(reportname);
					System.out.println("Input Number\tHighest Number\tLowest Number\tRow Total\tAverage Number");
					System.out.println("_______________________________________________________________________________________");
					System.out.println(num1+"\t\t   "+num1+"\t\t   "+num1+"\t\t"+(num1*3)+"\t\t"+num1);
					System.out.println(num2+"\t\t   "+numlist2[1]+"\t\t   "+numlist2[0]+"\t\t"+(num1+(num2*2))+"\t\t"+((num1+num2)/2));
					System.out.println(num3+"\t\t   "+numlist3[1]+"\t\t   "+numlist3[0]+"\t\t"+(num3+numlist3[1]+numlist3[0])+"\t\t"+((num1+num2+num3)/3));
					System.out.println(num4+"\t\t   "+numlist4[1]+"\t\t   "+numlist4[0]+"\t\t"+(num4+numlist4[1]+numlist4[0])+"\t\t"+((num1+num2+num3+num4)/4));
					System.out.println(num5+"\t\t   "+numlist5[1]+"\t\t   "+numlist5[0]+"\t\t"+(num5+numlist5[1]+numlist5[0])+"\t\t"+((num1+num2+num3+num4+num5)/5));
					System.out.println(num6+"\t\t   "+numlist6[1]+"\t\t   "+numlist6[0]+"\t\t"+(num6+numlist6[1]+numlist6[0])+"\t\t"+((num1+num2+num3+num4+num5+num6)/6));
					System.out.println(num7+"\t\t   "+listofnum[6]+"\t\t   "+listofnum[0]+"\t\t"+(num7+listofnum[0]+listofnum[6])+"\t\t"+((num1+num2+num3+num4+num5+num6+num7)/7));
					System.out.println("Rows Grand Total: "+((num1*3)+(num1+(num2*2))+(num3+numlist3[1]+numlist3[0])+(num4+numlist4[1]+numlist4[0])+(num5+numlist5[1]+numlist5[0])+(num6+numlist6[0]+numlist6[1])+(num7+listofnum[0]+listofnum[6])));
					break;
				
				case "No":
					ans = false;
					System.out.println("Okay, the program will now exit");
					System.exit(0);
					break;
				case "no":
					ans = false;
					System.out.println("Okay, the program will now exit");
					System.exit(0);
					break;
			}
		}


	}

	}
	}

