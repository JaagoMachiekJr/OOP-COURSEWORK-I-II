package machiek.machiek.akuocpiir.org;

import java.util.Scanner;

public class Oopcoursework {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	
		Scanner scn = new Scanner(System.in);
				
double TWS = 0;
				

double TotalTWS=0;
				

double GPA=0;
				
int []CreditUnit= {4,3,3,3,3,3,4,4};
				
double[] Totalweigh;
				
Totalweigh=new double[8];
				 
double GP = 0;
				
int COMPUTERAPPLICATION=0;
				
int PROBLEMSOLVING=0;
				

int DISCRETEMATHEMATICS=0;
				

int COMPUTERSYSTEMS=0;
				

int ENTREPRENEURSHIP=0;
				

int COMMUNICATIONSKILLS=0;
				

int WEBDESIGN=0;
				

int OBJECTORIENTEDPROGRAMMING=0;

				
				
int[] Marks=new int[8];
				
				
Marks[0]=COMPUTERAPPLICATION;
				
Marks[1]=PROBLEMSOLVING;
				

Marks[2]=DISCRETEMATHEMATICS;
				

Marks[3]=COMPUTERSYSTEMS;
				

Marks[4]=ENTREPRENEURSHIP;
				

Marks[5]=COMMUNICATIONSKILLS;
				

Marks[6]=WEBDESIGN;
				

Marks[7]=OBJECTORIENTEDPROGRAMMING;
				
				

System.out.println("Enter Marks for");
				

System.out.println("==");
				

System.out.print("COMPUTERAPPLICATION" + " ");
				

Marks[0]=scn.nextInt();
				

System.out.println("==");

				

System.out.print("PROBLEMSOLVING" + " ");
				

Marks[1]=scn.nextInt();
				

System.out.println("==");
				


System.out.print("DISCRETEMATHEMATICS" + " ");
				

Marks[2]=scn.nextInt();
				

System.out.println("==");
				

System.out.print("COMPUTERSYSTEMS" + " ");
				

Marks[3]=scn.nextInt();
				

System.out.println("==");
				

System.out.print("ENTREPRENEURSHIP" + " ");
				

Marks[4]=scn.nextInt();
				

System.out.println("==");
				

System.out.print("COMMUNICATIONSKILLS" + " ");
				


Marks[5]=scn.nextInt();
				

System.out.println("==");
				

System.out.print("WEBDESIGN" + " ");
				

Marks[6]=scn.nextInt();
				

System.out.println("==");
				

System.out.print("OBJECTORIENTDPROGRAMMING" + " ");
				

Marks[7]=scn.nextInt();

for (int i=0;i<8;i++) {
		        	
if (Marks[i]<=100 && Marks[i]>=80) {
		        			
GP=5.0;
		        			
TWS=GP*CreditUnit[i];
		        		
		    }
		        	
if (Marks[i]<=79 && Marks[i]>=75) {
		        		
GP=4.5;
		        		
		        		
TWS=GP*CreditUnit[i];
		        	
}
		          
if(Marks[i]<=74 && Marks[i]>=70) 
	
{
	
GP=4.0;
		        	 
TWS=GP*CreditUnit[i];

}

if(Marks[i]<=69 && Marks[i]>=65) {
		            	
GP=3.5;
		            	

TWS=GP*CreditUnit[i];
		           
}
		           
		            
if(Marks[i]<=64 && Marks[i]>=60){
		            	
GP=3.0;
		            	
TWS=GP*CreditUnit[i];
		           
}
		            
		            
if(Marks[i]<=59 && Marks[i]>=55) {
		            	
GP=2.5;
		            	
TWS=GP*CreditUnit[i];
		            
}
		           
if (Marks[i]<=54 && Marks[i]>=50) {
				        
GP=2.0;
				       
TWS=GP*CreditUnit[i];
			        
}
			       
if (Marks[i]<=49 && Marks[i]>=45) {
			        	
GP=1.5;
			        
}
			        
			       
if(Marks [i]<=44 && Marks[i]>=40)

{
			    	  
GP=1.0;
			    	   
TWS=GP*CreditUnit[i];
			       
}
			       
if(Marks[i]<=39 && Marks[i]>=35) {
			        	
			        	
	
GP=0.5;
			        	

TWS=GP*CreditUnit[i];
			        
}
			        
if (Marks[i]<=34 && Marks[i]>=30) {
			        	
	
GP=0;
			        	

TWS=GP*CreditUnit[i];
			        
}
			        
if(Marks[i]==0) {
			        	
GP=0;
			        	
TWS=GP*CreditUnit[i];
			       
			        
}
					
			         
Totalweigh[i]=TWS;
			          
			          
TotalTWS

=Totalweigh[0]+

Totalweigh[1]+

Totalweigh[2]+
			        		 
Totalweigh[3]+

Totalweigh[4]+

Totalweigh[5]+

Totalweigh[6]+

Totalweigh[7];
			          
			          
GPA=TotalTWS/27;
			         
		        
}
		        
System.out.print("TotalTWS= "+TotalTWS);
		         
System.out.println();
		          
System.out.print("GPA= "+GPA);
		          
	
}
			  
			

}




