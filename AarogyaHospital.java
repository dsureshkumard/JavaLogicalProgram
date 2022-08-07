import java.util.*;
import java.io.*;
        // class for storing the patient information
	class AarogyaMember{
          // declare all the details for the patient including name, age, gender, Aadhar Card number, contact number, city, address, date of admission, guardian name, guardian address, guardian contact number
		static int counter=2499;
		int age,id;
		long AadharCard,contactNumber,gContact;
		String name,city,address,doa;
		String gName,gAddress,gender;
		String recovery = "NONE";
	    // make constructor for the class and assign it a unique Id
	    public AarogyaMember(){
	    	counter++;
	    	id=counter+1;
	    }
    	    // for taking patient information
	    public void input()throws IOException{
	    	//BufferedReader Class Object
	    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    	//Taking details of patient
	    	System.out.println("Enter Patient full name : ");
	    	name = br.readLine();
	    	System.out.println("Enter Patient Age: ");
	    	age = Integer.parseInt(br.readLine());
	    	System.out.println("Gender (M/F/O): ");
	    	String g = br.readLine();
	    	checkGender(g);
	    	System.out.println("Aadhar Number : ");
	    	Long Ac = Long.parseLong(br.readLine());
	    	checkAadhar(Ac);
	    	System.out.println("Contact Number : ");
	    	long cNumber = Long.parseLong(br.readLine());
	    	checkContact(cNumber);
	    	System.out.println("Enter Address : ");
	    	address = br.readLine();
	    	System.out.println("Enter City: ");
	    	String c = br.readLine();
	    	city = c.toUpperCase();
	    	System.out.println("Enter Date of Admission in (DD/MM/YYYY) Format");
	    	doa= br.readLine();
	    	System.out.println("Enter Gaurdian name: ");
	    	gName = br.readLine();
	    	System.out.println("Enter Gaurdian Address: ");
	    	gAddress =	br.readLine();
	    	System.out.println("Enter Gaurdian Contact Number: ");
	    	long gNumber = Long.parseLong(br.readLine());
	    	checkGcontact(gNumber);
	    	System.out.println("Registered Successfully with ID : "+id);
	    }
	    //checking given gender is valid or not
	    void checkGender(String g)throws IOException{
	    		String g1 = g.toUpperCase();
	    		if(g1.equals("M") || g1.equals("F") || g1.equals("O")){
	    			gender = g1;
	    		}
	    		else{
	    			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    			System.out.println("Invalid input Enter M=Male F=Female O=Others (M/F/O): ");
	    			g = br.readLine();
	    			checkGender(g);
	    		}
	    }
	    //checking if given aadhar number is valid or not
	    void checkAadhar(Long Ac)throws IOException{
	    	String s = Long.toString(Ac);
	    	if(s.length()==12)
	    		AadharCard = Ac;
	    	else{
	    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    		System.out.println("Invalid Input Aadhar number should be 12 digits please Enter valid Aadhar Number: ");
	    		Ac = Long.parseLong(br.readLine());
	    		checkAadhar(Ac);
	    	}
	    }
	    //checking if the given contact number is valid or not
	    void checkContact(Long cNumber)throws IOException{
	    	String s = Long.toString(cNumber);
	    	if(s.length()>=6 && s.length()<=10)
	    		contactNumber = cNumber;
	    	else{
	    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    		System.out.println("Invalid Input Contact number should have minimum of 6 digits and maximum of 10 digits please Enter valid Contact Number: ");
	    		cNumber = Long.parseLong(br.readLine());
	    		checkContact(cNumber);
	    	}
	    }
	    //checking if the given Gaurdian contact number is valid or not
	    void checkGcontact(Long gNumber)throws IOException{
	    	String s = Long.toString(gNumber);
	    	//checking length
	    	if(s.length()>=6 && s.length()<=10)
	    		gContact = gNumber;
	    	else{
	    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    		System.out.println("Invalid Input Contact number should have minimum of 6 digits and maximum of 10 digits please Enter valid Contact Number: ");
	    		gNumber = Long.parseLong(br.readLine());
	    		checkGcontact(gNumber);
	    	}
	    }
	    //after all checkings done then only we will assign the values to the original variables
	    public void print(String s)
	    {
	    	System.out.println(s);
	    	
	    }  
	}
// the main class
public class AarogyaHospital{
	// pick the choice of task to be performed
	static long choices(){
		Scanner sn = new Scanner(System.in);
		System.out.println();
		System.out.println("Press 1 for adding new member");
		System.out.println("Press 2 to view list of all available members");
		System.out.println("Press 3 to search member by ID");
		System.out.println("Press 4 to search member from a particular city");
		System.out.println("Press 5 to search member from a particular age group");
		System.out.println("Press 6 to mark recovery of a member");
		System.out.println("Press 7 to delete data of a member");
		System.out.println("Press 0 to exit");
		
            // create scanner class to take input
	    long option=sn.nextLong();
	    return option;
	}

	public static void main(String args[])throws IOException{
		
		// initialise array list to store list of patients information
		Scanner sn =new Scanner(System.in);
		ArrayList<AarogyaMember> patients = new ArrayList<>();
		HashMap<Integer,AarogyaMember> hm= new HashMap<>();
		//for adding aarogya member information
		while(true){

			//take choice
			long option=choices();
			
			//invalid choice
			if(option<0||option>7){
				System.out.println("Invalid Choice,Select right option : ");
			}
			// take the input and add in the arrayList
			else if(option==1){
	        	AarogyaMember m = new AarogyaMember();
	        	m.input();
	        	patients.add(m);
	        	hm.put(m.id,m);
        	}
			 //iterate and print all the patients information
	       		 else if(option==2){
	       		 	//checking if the list is empty
	       		 	if(patients.isEmpty())
	       		 		System.out.println("There are no patients ");
	       		 	//Iterating through the ArrayList using Iterator
	    			Iterator itr = patients.iterator();
	    			int i=1;
	    			while(itr.hasNext()){
	    				AarogyaMember mem = (AarogyaMember)itr.next();
	    				//printing patient details
	    				System.out.println("*****Patient "+i+" Details*****");
	    				System.out.println("ID:"+mem.id+"\nName:"+mem.name+"\nAge:"+mem.age+"\nGender:"+mem.gender+"\nAaadhar Number:"+mem.AadharCard+"\nAddress:"+mem.address+"\nCity:"+mem.city+"\nDate of Admission:"+mem.doa+"\nGaurdian Name:"
	    										+mem.gName+"\nGuardian Address:"+mem.gAddress+"\nGaurdian Contact Number:"+mem.gContact);
	    				i++;
	    			}
	       		 }
			// print details of the patient with a particular id (take id as input)
	                else if(option==3){
	            		System.out.println("Enter ID to Search: ");
	            		int id = sn.nextInt();
	            		if(hm.containsKey(id)){
	            			AarogyaMember mm = (AarogyaMember)hm.get(id);
	            			System.out.println("*****Patient Details*****");
	            			System.out.println("ID:"+mm.id+"\nName:"+mm.name+"\nAge:"+mm.age+"\nGender:"+mm.gender+"\nAaadhar Number:"+mm.AadharCard+"\nAddress:"+mm.address+"\nCity:"+mm.city+"\nDate of Admission:"+mm.doa+"\nGaurdian Name:"
	    										+mm.gName+"\nGuardian Address:"+mm.gAddress+"\nGaurdian Contact Number:"+mm.gContact);
	            		}
	            		else
	            			System.out.println("Patient Does not Exists ");
	                }
			
			// to print all the patients from a particular city (take city as input)
	                else if(option==4){
	        			System.out.println("Enter city to Search: ");
	        			String c = sn.next();
	        			String city = c.toUpperCase();
	        			Iterator itr2 = patients.iterator();
	        			int count = 0;
	        			int i =1;
	        			System.out.println("*****Patients from "+city+"*****");
	        			while(itr2.hasNext()){
	        				AarogyaMember mm2 = (AarogyaMember)itr2.next();
	        				if(mm2.city.equals(city)){
	        					System.out.println(i+". ID:"+mm2.id+"\nName:"+mm2.name+"\nAge:"+mm2.age+"\nGender:"+mm2.gender+"\nAaadhar Number:"+mm2.AadharCard+"\nAddress:"+mm2.address+"\nCity:"+mm2.city+"\nDate of Admission:"+mm2.doa+"\nGaurdian Name:"
	    										+mm2.gName+"\nGuardian Address:"+mm2.gAddress+"\nGaurdian Contact Number:"+mm2.gContact);
	    						count++;
	    						i++;
	        				}
	        			}
	        			if(count == 0)
	        				System.out.println("No patient is from "+city+" city");
	        			else
	        				System.out.println("Total "+count+" patients are from "+city+" city");
	               }
			// to print details of all the patients in a particular age group (take age limits as input)
	               else if(option==5){
	               		int min=1;
	            		System.out.println("Enter Minimum Age : ");
	            		int m = sn.nextInt();
	            		if(m<=0)
	            			System.out.println("Given Age is invalid!");
	            		else
	            			min = m;
	            			
	            		System.out.println("Enter Maximum Age : ");
	            		int max = sn.nextInt();
	            		System.out.println("*****Patients from Age Limit "+min+"-"+max+"*****");
	            		Iterator itr3 = patients.iterator();
	            		int count = 0;
	            		int i=1;
	            		while(itr3.hasNext()){
	            			AarogyaMember mm3 = (AarogyaMember)itr3.next();
	            			if(mm3.age>=min && mm3.age<=max){
	            				System.out.println(i+". ID:"+mm3.id+"\nName:"+mm3.name+"\nAge:"+mm3.age+"\nGender:"+mm3.gender+"\nAaadhar Number:"+mm3.AadharCard+"\nAddress:"+mm3.address+"\nCity:"+mm3.city+"\nDate of Admission:"+mm3.doa+"\nGaurdian Name:"
	    										+mm3.gName+"\nGuardian Address:"+mm3.gAddress+"\nGaurdian Contact Number:"+mm3.gContact);
	    						count++;
	    						i++;
	            			}
	            		}
	            		if(count == 0)
	            			System.out.println("No patient was from this Age Group.");
	            		else
	            			System.out.println("Total "+count+" Patients are Aged between "+min+"-"+max);
	              }
	              // take member id as input to maintain recovered information of patient
	               else if(option==6){
	            		System.out.println("Enter ID to mark Revovery Status: ");
	            		int id = sn.nextInt();
	            		if(hm.containsKey(id)){
	            			AarogyaMember mm4 = (AarogyaMember)hm.get(id);
	            			String recovery = status();
	            			if(recovery.equals("Y")){
	            				mm4.recovery = "RECOVERED";
	            				System.out.println("Patient with ID : "+id+" is Marked as Recovered");
	            			}
	            			else{
	            				mm4.recovery = "NOT RECOVERED";
	            				System.out.println("Patient with ID : "+id+" is Marked as Not Recovered");
	            			}
	            		}
	            		else
	            			System.out.println("Patient Does Not Exists");
	            	
	              }
	              //take member id as input to delete patient information
	              else if(option==7){
			    		System.out.println("Enter ID to Delete a Patient : ");
			    		int id = sn.nextInt();
			    		if(hm.containsKey(id)){
			    			System.out.println("*****Patient with Details*****");
			    			AarogyaMember mm5 = (AarogyaMember)hm.get(id);
			    			System.out.println("ID:"+mm5.id+"\nName:"+mm5.name+"\nAge:"+mm5.age+"\nGender:"+mm5.gender+"\nAaadhar Number:"+mm5.AadharCard+"\nAddress:"+mm5.address+"\nCity:"+mm5.city+"\nDate of Admission:"+mm5.doa+"\nGaurdian Name:"
	    										+mm5.gName+"\nGuardian Address:"+mm5.gAddress+"\nGaurdian Contact Number:"+mm5.gContact);
	    					print("Has Deleted");
	    					hm.remove(id);
	    					patients.remove(mm5);
			    		}
			    		else
			    			print("Patient Does not Exists");
	              }
	             
			
	              else{
	            	break;
	             }
		}
	}
	public static String status(){
		Scanner sn = new Scanner(System.in);
		print("Enter Revovery Status (Y/N) : ");
	    String s = sn.next();
	    String s1 = s.toUpperCase();
	    String result = "";
	    if(s1.equals("Y")||s1.equals("N")){
	    	result = s1;
	    }
	    else{
	        print("Invalid input Enter Y/N : ");
	        status();
	    }
	    return result;
	}
	public static void print(String str)
	{
		System.out.println(str);
		
	}
}
