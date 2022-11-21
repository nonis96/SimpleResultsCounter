import java.util.*;
class test03
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			System.out.print(" Do You Want Enter Student Details (Y/N) ? ");
			String letter = input.next();
			
			System.out.println();
			
			switch(letter)
			{
				case "Y" :
					System.out.print(" Enter Student Name : ");
					String name = input.next();
					
					System.out.print(" Enter Student Address : ");
					String address = input.next();
					
					System.out.print(" Enter Number Of Subjects : ");
					int number_of_subject = input.nextInt();
					
					System.out.println();
					
					int[] marks = new int[number_of_subject];
					
					for(int i=1; i<=number_of_subject; i++)
					{
						System.out.print(" Enter Subject "+i +" " +"Marks : ");
						marks[i-1] = input.nextInt();
					}
					
					System.out.println();
					
					boolean flag = true;
					while(flag)
					{
						System.out.println(" A.Show Student Details : ");
						System.out.println(" B.Show Maximun Marks : ");
						System.out.println(" C.Show Average : ");
						System.out.println(" D.Show All Marks : ");
						System.out.println(" X.Exit : ");
					
						System.out.println("  ");
					
						System.out.print(" --> ");
						letter=input.next();
						System.out.println();
					
						switch(letter)
						{
							case "A" :
								System.out.println(" Student Name Is : "+name);
								System.out.println(" Student Adderss Is : "+address);
								break;
							
							case "B" :
								int max = 0;
							
								for(int i = 0; i<marks.length; i++)
								{
									if(max<marks[i])
									{
										max=marks[i];
									}
								}
								System.out.print(" Maximum Marks Is : "+max);
								break;
							
							case "C" :
								int total = 0;
							 
								for(int i = 0; i<marks.length; i++)
								{
									total = total + marks[i];
								}
								double average = (double)total /number_of_subject;
								System.out.print("Average Is : "+average);
								break;
							
							case "D" :
								for(int i = 0 ; i<marks.length; i++)
								{
									System.out.println("Subject "+(i+1) + " "  +"Mark Is : "+marks[i]);
								}
								break;
							
							case "X" :
								flag = false;
								break;
							
							default :
								System.out.print(" Invalid Entry..... ");
						}
						
						System.out.println();
					
					}
					break;
					
				case "N" :
					System.out.println(" Bye...");
					return;
					
				default :
					System.out.println(" Invalid Entry ....");
			}
			
			
		}
	}
}