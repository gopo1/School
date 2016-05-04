package masello;
import javax.swing.*;
public class School {

		public static void main(String[] args) {
			String LearnerName, grade10_stream = null;
		    JFrame frame = new JFrame("INPUT DIALOG");
			
			
			try {
		     LearnerName = JOptionPane.showInputDialog(frame, "please enter the learner name");
		    
		     String prev_maths1 = JOptionPane.showInputDialog(frame, "please enter your grade 9 maths marks");
		     Integer prev_maths = new Integer(prev_maths1);
		  
		     String prev_english1 = JOptionPane.showInputDialog(frame, "please enter your grade 9 english marks");
		     Integer prev_english = new Integer(prev_english1);
		  
		  
		    grade10_stream = JOptionPane.showInputDialog(frame, LearnerName +  " please enter your grade 10 stream");
			    
		    
		    if ((prev_maths >= 50) && prev_english >= 50 ) {
		    
		    switch(grade10_stream){
			
		    
			case "physics":
				JOptionPane.showMessageDialog(frame, prev_maths>= 70 ?  LearnerName + "\nwelcome to maths and science stream here are your new subjects: "
						+ "\nMathematics" + "\nPhysical Sciences" + "\nLife Sciences" + "\nGeography": "consider other streams because your marks are low" );  
				break;
			case "Accounting":
				JOptionPane.showMessageDialog(frame, prev_maths>= 60 && prev_maths <= 100 ?  LearnerName +  "\nwelcome to Accounting and Business management stream here are your new subjects: " 
							+ "\nMathematics" + "\nAccounting" + "\nEconomics" + "\nBusiness " : "consider other streams because your marks are low" );  
				
				break;
			case "agriculture ":
				JOptionPane.showMessageDialog(frame, prev_maths>= 51 && prev_maths <= 59 ?  LearnerName +  "\nwelcome to Agricultural and History stream here are your new subjects: "
						+ "\nMaths Literacy" + "\nAgricultural Sciences" + "\nGeography" + "\nGeography": "consider other streams because your marks are low" );  
				break;
				
			}
		    
		    }
		    
		    
		    else {
		    	JOptionPane.showMessageDialog(frame,"we sorry to inform you " + LearnerName + "\n you did not pass your previous grade");
		    }
		 
			}
			catch(RuntimeException e) {
				
				JOptionPane.showMessageDialog(frame,"please enter correct learner details");
						}
		
		}
		

	}


