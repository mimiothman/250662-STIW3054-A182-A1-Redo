package redo_A1;
import java.util.Scanner;

import redo_A1_2.manager_expert;
import redo_A1_2.manager_technical;
import redo_A1_2.total_efactor;
import redo_A1_2.total_tfactor;
import redo_A1_3.manager_man;
import redo_A1_3.manager_report;
import redo_A1_3.total_mhours;
import redo_A1_3.total_report;

public class Main {
	public static void main(String[] args) {
		
		manager_weight manager = new manager_weight();
		manager.setStrategy(new project_size());
		
		 Scanner myObj = new Scanner(System.in);
		    System.out.println("Calculation For Man-Hours");  
		    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
		   
		    System.out.println("Enter weight actor and weight use case"); 
		    int t1 = myObj.nextInt();
		    int t2 = myObj.nextInt();
		   // int totaluucp = t1 + t2;					//total uucp    
		    int totaluucp = manager.operation(t1, t2);
		    System.out.println("Total UUCP: " + totaluucp); 
		    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
		  
		    
		    manager_technical managerTech = new manager_technical();
			managerTech.setStrategy(new total_tfactor()); 
			
			Scanner myObj1 = new Scanner(System.in);
		    System.out.println("Enter Technical Factor");	    
		    int tfactor = myObj1.nextInt(); 
		    double totaltcf = managerTech.operation(tfactor);	
		    double totalszuc = totaluucp * totaltcf;      //total szuc
		    System.out.println("Total SzUC: " + totalszuc); 
		    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
		    
		    manager_expert managerExpert = new manager_expert();
		    managerExpert.setStrategy(new total_efactor()); 
			
		    Scanner myObj2 = new Scanner(System.in);
		    System.out.println("Enter Experience Factor");
		    int efactor = myObj2.nextInt(); 	         
		    double totalefac = 	managerExpert.operation(efactor); //total efactor
		    double totalucp = totalszuc * totalefac;
		    System.out.println("Total UCP: " + totalucp); 
		    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
		    
		    manager_man managerMH = new manager_man();
		    managerMH.setStrategy(new total_mhours());
		    
		    Scanner myObj3 = new Scanner(System.in);
		    System.out.println("Enter Man-Hours "); 
		    int er = myObj3.nextInt();    				//total man hour ucp
		    double totalman = managerMH.operation(er) * totalucp;
		    System.out.println("Total Man Hours: " + totalman);  
		    double totalrisk = (1.0 + 0.05) * totalman;	//total man hour risk
		    System.out.println("Total Adjusted Man Hours: " + totalrisk); 
		    
		    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
		    
		    manager_report managerReport = new manager_report();
		    managerReport.setStrategy(new total_report());
		    
		    Scanner myObj4 = new Scanner(System.in);
		    System.out.println("Enter Estimate Report ");    
		    int report = myObj4.nextInt();       //total man hour report	
		    double totalreport = totalrisk + managerReport.operation(report);
		    System.out.println("Total Estimate Report: " + totalreport); 
		    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
		    System.out.println("Done Calculation.");
		    //int result = manager.operation(5, 4);
		//System.out.print(result);
		    
	}
}
