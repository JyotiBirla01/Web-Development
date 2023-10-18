case 1:
                double initialBalance=0;
                try{
                    Random random = new Random();
                    int accountNumber  = random.nextInt(1000);
                    String newUsername=String.valueOf(accountNumber);  
                  System.out
                            .println(YELLOW + "\t\t\t\t-----------------------------------------------------" + RESET);
                    System.out.println(BLUE+"\t\t\t\tOpening balance is 5000"+RESET);
                   System.out
                            .println(YELLOW + "\t\t\t\t-----------------------------------------------------" + RESET);
                  System.out.println("\t\t\t\tEnter new Account Number: "+newUsername);
                  
                    
                    System.out
                            .println(YELLOW + "\t\t\t\t-----------------------------------------------------" + RESET);
                    System.out.print("\t\t\t\tEnter new customer's password: ");
                     scanner.nextLine();
                    String newPassword = scanner.nextLine();
                    System.out
                            .println(YELLOW + "\t\t\t\t-----------------------------------------------------" + RESET);
                    String newName = null;
		  char ch= '\u0000';
		  boolean flag=false;
          while(true) {
            
			System.out.print("\t\t\t\tEnter customer's name: ");
		  newName = scanner.nextLine();
		  for(int i=0; i<newName.length(); i++){
         ch = newName.charAt(i);
        if(!Character.isLetter(ch)){
			System.out.println(RED+"\t\t\t\tenter correct name"+RESET);
            flag=true;
           
        } 
         
    }
    if(flag){
        flag=false;
        continue;
    }else{
        break;
    }
 }
                    System.out
                            .println(YELLOW + "\t\t\t\t-----------------------------------------------------" + RESET);
                    System.out.print("\t\t\t\tEnter customer's contact: ");
                    String newContact = scanner.nextLine();
                    System.out
                            .println(YELLOW + "\t\t\t\t-----------------------------------------------------" + RESET);
                           
                           while(true) {
		  
		  try{
            Scanner input1 = new Scanner(System.in);
          System.out.print("\t\t\t\tEnter initial balance for the new customer: ");
		   initialBalance = input1.nextDouble();
		  if(initialBalance<5000) {
			  System.out.println(RED+"\t\t\t\tenter the correct amount"+RESET);
			  continue;
		  }
          else {
                        
                        admin.createNewAccount(customerManager, newUsername, newPassword, newName, newContact,
                                initialBalance);
                    }
        }
         catch (Exception e) {
            		  System.out.println(RED+"\t\t\t\twrong"+RESET);
                      continue;
		   }
        break;
        }


                     

                }catch (Exception e) {
		           e.printStackTrace();
		           System.out.println("\t\t\t\tsomething went wrong");
		        }
                    
         break;