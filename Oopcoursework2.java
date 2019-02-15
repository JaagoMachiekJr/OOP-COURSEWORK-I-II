package machiek.machiek.akuocpiir.org;

import java.util.ArrayList;

import java.util.Scanner;


public class Oopcoursework2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		

Scanner reader=new Scanner(System.in);
				
/* System.out.print("Enter Student:"); */
				
int[] Marks;
				

Marks=new int [7];
				
int COMPUTERAPPLICATION=Marks[0];
				
int OBJECTORIENTEDPROGRAMMING=Marks[1];
				
int WEBDESIGN=Marks[2];
				
int RESEARCHMETHODOLOGY=Marks[3];
				
int CALCULUS=Marks[4];
				
int COMPUTERNETWORKING=Marks[5];

int SYSTEMANALYSIS=Marks[6];
				
				
ArrayList<String> names= new ArrayList();

int n=1;
			
while(true) {
					
System.out.print("Enter student"+n+" ");
					

String name=new Scanner(System.in).nextLine();
					
					
if (name.toLowerCase().equals("exit"))
						
break;
					
else 
						

names.add(name);
					
for (int i=0;i<7;i++) {
						
if (Marks[i]>=0 && Marks[i]<100) {
						
System.out.print("  "+"COMPUTERAPPLICATION  :"+"    ");
							
							
Marks[0]=reader.nextInt();
							
							
System.out.print("  "+"OBJECTORIENTEDPROGRAMMING  :"+"   ");
							

Marks[1]=reader.nextInt();
						
							
System.out.print("  "+"WEBDESIGN:"+"   ");
							
Marks[2]=reader.nextInt();		
							
							
System.out.print("  "+"RESEARCHMETHOD:"+"   ");
				            
Marks[3]=reader.nextInt();
				            
				            
System.out.print("  "+"CALCULUS:"+"   ");
				            
Marks[4]=reader.nextInt();
				            
				            
System.out.print("  "+"COMPUTERNETWORKING:"+"    ");
				            
Marks[5]=reader.nextInt();
				            
System.out.print("  "+"SYSTEMANALYSIS:"+"    ");

Marks[6]=reader.nextInt();
				           
int Sum=Marks[0]+Marks[1]+Marks[2]+Marks[3]+Marks[4]+Marks[5]+Marks[6];
				            
				            
				            
System.out.println();
				            
				           
System.out.print(" "+"Sum="+Sum);
				            
				           
System.out.println();
				          
				            
				            
System.out.println();
				            
				            
int Average=Sum/7;
				            
				           
System.out.print("   "+"Average="+ Average);
				            
				           
System.out.println();
				            
						    
break;
						    
						
}
						
						
else 
							

System.out.print("error");
							
							
						
}
					
n++;
					
}
				     
				   
					
				
}
			
			
		  
}


