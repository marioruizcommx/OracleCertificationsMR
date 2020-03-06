package com.gym.oracleGym.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.gym.oracleGym.controller.JavaController;
import com.gym.oracleGym.model.ImgModel;
import com.gym.oracleGym.model.JavaModel;
import com.gym.oracleGym.service.JavaService;

@Service("JavaServiceImpl")
public class JavaServiceImpl implements JavaService {
	
	private static final Log LOG = LogFactory.getLog(JavaController.class);
	HashMap<String, ArrayList<String>> hashMap = new HashMap<String, ArrayList<String>>();

	ArrayList<Integer> fails = new ArrayList<Integer>();
	ArrayList<Integer> success = new ArrayList<Integer>();
	public int fail = 0;
	public int succes = 1;
	public int tier=1;

	@Override
	public ArrayList<String> getQuestion(String questionNumber) {
		
		hashMap.clear();
		ArrayList<String> nombreArrayList = new ArrayList<String>();
		ArrayList<String> nombreArrayList1 = new ArrayList<String>();
		ArrayList<String> nombreArrayList2 = new ArrayList<String>();
		ArrayList<String> nombreArrayList3 = new ArrayList<String>();
		ArrayList<String> nombreArrayList4 = new ArrayList<String>();
		ArrayList<String> nombreArrayList5 = new ArrayList<String>();
		ArrayList<String> nombreArrayList6 = new ArrayList<String>();
		ArrayList<String> nombreArrayList7 = new ArrayList<String>();
		ArrayList<String> nombreArrayList8 = new ArrayList<String>();
		ArrayList<String> nombreArrayList9 = new ArrayList<String>();
		ArrayList<String> nombreArrayList10 = new ArrayList<String>();
		ArrayList<String> nombreArrayList11 = new ArrayList<String>();
		ArrayList<String> nombreArrayList12 = new ArrayList<String>();
		ArrayList<String> nombreArrayList13 = new ArrayList<String>();
		ArrayList<String> nombreArrayList14 = new ArrayList<String>();
		ArrayList<String> nombreArrayList15 = new ArrayList<String>();
		ArrayList<String> nombreArrayList16 = new ArrayList<String>();
		ArrayList<String> nombreArrayList17 = new ArrayList<String>();
		ArrayList<String> nombreArrayList18 = new ArrayList<String>();
		ArrayList<String> nombreArrayList19 = new ArrayList<String>();
		ArrayList<String> nombreArrayList20 = new ArrayList<String>();
		ArrayList<String> nombreArrayList21 = new ArrayList<String>();
		ArrayList<String> nombreArrayList22 = new ArrayList<String>();
		ArrayList<String> nombreArrayList23 = new ArrayList<String>();
		ArrayList<String> nombreArrayList24 = new ArrayList<String>();
		ArrayList<String> nombreArrayList25 = new ArrayList<String>();
		ArrayList<String> nombreArrayList26 = new ArrayList<String>();
		ArrayList<String> nombreArrayList27 = new ArrayList<String>();
		ArrayList<String> nombreArrayList28 = new ArrayList<String>();
		ArrayList<String> nombreArrayList29 = new ArrayList<String>();
		ArrayList<String> nombreArrayList30 = new ArrayList<String>();
		ArrayList<String> nombreArrayList31 = new ArrayList<String>();
		ArrayList<String> nombreArrayList32 = new ArrayList<String>();
		ArrayList<String> nombreArrayList33 = new ArrayList<String>();
		ArrayList<String> nombreArrayList34 = new ArrayList<String>();
		ArrayList<String> nombreArrayList35 = new ArrayList<String>();
		ArrayList<String> nombreArrayList36 = new ArrayList<String>();
		ArrayList<String> nombreArrayList37 = new ArrayList<String>();
		ArrayList<String> nombreArrayList38 = new ArrayList<String>();
		ArrayList<String> nombreArrayList39 = new ArrayList<String>();
		ArrayList<String> nombreArrayList40 = new ArrayList<String>();
		ArrayList<String> nombreArrayList41 = new ArrayList<String>();
		ArrayList<String> nombreArrayList42 = new ArrayList<String>();
		ArrayList<String> nombreArrayList43 = new ArrayList<String>();
		ArrayList<String> nombreArrayList44 = new ArrayList<String>();
		ArrayList<String> nombreArrayList45 = new ArrayList<String>();
		ArrayList<String> nombreArrayList46 = new ArrayList<String>();
		ArrayList<String> nombreArrayList47 = new ArrayList<String>();
		ArrayList<String> nombreArrayList48 = new ArrayList<String>();
		ArrayList<String> nombreArrayList50 = new ArrayList<String>();
		ArrayList<String> nombreArrayList51 = new ArrayList<String>();
		ArrayList<String> nombreArrayList52 = new ArrayList<String>();
		ArrayList<String> nombreArrayList53 = new ArrayList<String>();
		ArrayList<String> nombreArrayList54 = new ArrayList<String>();
		ArrayList<String> nombreArrayList55 = new ArrayList<String>();
		ArrayList<String> nombreArrayList56 = new ArrayList<String>();
		ArrayList<String> nombreArrayList57 = new ArrayList<String>();
		ArrayList<String> nombreArrayList58 = new ArrayList<String>();
		ArrayList<String> nombreArrayList59 = new ArrayList<String>();
		ArrayList<String> nombreArrayList60 = new ArrayList<String>();
		ArrayList<String> nombreArrayList61 = new ArrayList<String>();
		ArrayList<String> nombreArrayList62 = new ArrayList<String>();
		ArrayList<String> nombreArrayList63 = new ArrayList<String>();
		ArrayList<String> nombreArrayList64 = new ArrayList<String>();
		ArrayList<String> nombreArrayList65 = new ArrayList<String>();
		ArrayList<String> nombreArrayList66 = new ArrayList<String>();
		ArrayList<String> nombreArrayList67 = new ArrayList<String>();
		ArrayList<String> nombreArrayList68 = new ArrayList<String>();
		ArrayList<String> nombreArrayList69 = new ArrayList<String>();
		ArrayList<String> nombreArrayList70 = new ArrayList<String>();
		ArrayList<String> nombreArrayList71 = new ArrayList<String>();
		ArrayList<String> nombreArrayList72 = new ArrayList<String>();
		ArrayList<String> nombreArrayList73 = new ArrayList<String>();
		ArrayList<String> nombreArrayList74 = new ArrayList<String>();
		ArrayList<String> nombreArrayList75 = new ArrayList<String>();
		ArrayList<String> nombreArrayList76 = new ArrayList<String>();
		ArrayList<String> nombreArrayList77 = new ArrayList<String>();
		
		nombreArrayList1.add("What is the result?");
		nombreArrayList1.add("Given: What is the result?");
		nombreArrayList1.add("A.\n" + "400.0 : 200.0");
		nombreArrayList1.add("B.\n" + "400.0 : 100.0 ");
		nombreArrayList1.add("C.\n" + "Compilation fails. ");
		nombreArrayList1.add("D.\n" + "200.0 : 100.0 ");
		nombreArrayList1.add("");
		nombreArrayList1.add("");
		hashMap.put("1", nombreArrayList1);
		//LOG.info("++++++++++++++++++++++++++++++++++++++++++++++++"+hashMap);

		nombreArrayList2.add("What is the result if the integer aVar is 9?");
		nombreArrayList2.add("Given the code fragment: What is the result if the integer aVar is 9?");
		nombreArrayList2.add("A.\n" + "Hello World!");
		nombreArrayList2.add("B.\n" + "Hello Universe! ");
		nombreArrayList2.add("C.\n" + "Hello World! ");
		nombreArrayList2.add("D.\n" + "Compilation fails. ");
		nombreArrayList2.add("");
		nombreArrayList2.add("");
		hashMap.put("2", nombreArrayList2);
		
		nombreArrayList3.add("What is the result?");
		nombreArrayList3.add("Given the code fragment: What is the result?");
		nombreArrayList3.add("A.\n" + "May 04, 2014T00:00:00.000");
		nombreArrayList3.add("B.\n" + "An exception is thrown at runtime. ");
		nombreArrayList3.add("C.\n" + "2014-05-04T00:00: 00. 000 ");
		nombreArrayList3.add("D.\n" + "5/4/14T00:00:00.000 ");
		nombreArrayList3.add("");
		nombreArrayList3.add("");
		hashMap.put("3", nombreArrayList3);
		
		
		nombreArrayList4.add("What is the result?");
		nombreArrayList4.add("Given the code fragment: What is the result?");
		nombreArrayList4.add("A.\n" + "Sum is 600");
		nombreArrayList4.add("B.\n" + "Compilation fails at line n1. ");
		nombreArrayList4.add("C.\n" + "Compilation fails at line n2.");
		nombreArrayList4.add("D.\n" + "A ClassCastException is thrown at line n1.");
		nombreArrayList4.add("E.\n" + "A ClassCastException is thrown at line n2.");
		nombreArrayList4.add("");
		hashMap.put("4", nombreArrayList4);
		
		nombreArrayList5.add("What is the name of the Java concept that uses access modifiers to protect variables and hide them within a cl");
		nombreArrayList5.add("What is the name of the Java concept that uses access modifiers to protect variables and\n"
				+ "hide them within a class?");
		nombreArrayList5.add("A.\n" + "Polymorphism");
		nombreArrayList5.add("B.\n" + "Instantiation");
		nombreArrayList5.add("C.\n" + "Encapsulation");
		nombreArrayList5.add("D.\n" + "Inheritance");
		nombreArrayList5.add("E.\n" + "Abstraction");
		hashMap.put("5", nombreArrayList5);
		
		
		nombreArrayList6.add("Which two modifications, made independently, enable the code to compile?");
		nombreArrayList6.add("Given the code fragment: Which two modifications, made independently, enable the code to\n"
				+ "compile?");
		nombreArrayList6.add("A.\n" + "Make the method at line n1 public.");
		nombreArrayList6.add("B.\n" + "Make the method at line n2 public. ");
		nombreArrayList6.add("C.\n" + "Make the method at line n3 public. ");
		nombreArrayList6.add("D.\n" + "Make the method at line n3 protected. ");
		nombreArrayList6.add("E.\n" + "Make the method at line n4 public. ");
		hashMap.put("6", nombreArrayList6);
		
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given: And given the code fragment: What is the result?");
		nombreArrayList.add("A.\n" + "Compilation fails only at line n2");
		nombreArrayList.add("B.\n" + "Compilation fails at both line n1 and line n2 ");
		nombreArrayList.add("C.\n" + "C Compilation fails only at line n1 ");
		nombreArrayList.add("D.\n" + "Null 0 Auto 4W 150 Manual");
		nombreArrayList.add("E.\n" + "4W 100 Auto 4W 150 Manual ");
		hashMap.put("7", nombreArrayList);

		nombreArrayList8.add("Which two modifications should you make so that the code compiles successfully?");
		nombreArrayList8.add("Given the code fragment: Which two modifications should you make so that the code\n"
				+ "compiles successfully?");
		nombreArrayList8.add("A.\n" + "Option B");
		nombreArrayList8.add("B.\n" + "Option C ");
		nombreArrayList8.add("C.\n" + "Option D ");
		nombreArrayList8.add("D.\n" + "Option E ");
		nombreArrayList8.add("D.\n" + "Option A ");
		nombreArrayList8.add("");
		nombreArrayList8.add("1.jpg");
		hashMap.put("8", nombreArrayList8);

		nombreArrayList9.add("How should you write methods in the ElectricAccount class at line n1 so that the member variable bill…?");
		nombreArrayList9.add("Given the following two classes: How should you write methods in the ElectricAccount class\n"
						+ "at line n1 so that the member variable bill is always equal to the value of the member\n"
						+ "variable kwh multiplied by the member variable rate? Any amount of electricity used by a\n"
						+ "customer (represented by an instance of the customer class) must contribute to the\n"
						+ "customer’s bill (represented by the member variable bill) through the method useElectricity\n"
						+ "method. An instance of the customer class should never be able to tamper with or decrease\n"
						+ "the value of the member variable bill.");
		nombreArrayList9.add("A.\n" + "Option A");
		nombreArrayList9.add("B.\n" + "Option B ");
		nombreArrayList9.add("C.\n" + "Option C ");
		nombreArrayList9.add("D.\n" + "Option D ");
		hashMap.put("9", nombreArrayList9);
		
		nombreArrayList10.add("What is the result?");
		nombreArrayList10.add("Given the code fragment: What is the result?");
		nombreArrayList10.add("A.\n" + "A NullPointerException is thrown at runtime.");
		nombreArrayList10.add("B.\n" + "No Match ");
		nombreArrayList10.add("C.\n" + "Match 2 ");
		nombreArrayList10.add("D.\n" + "Match 1 ");
		hashMap.put("10", nombreArrayList10);
		
		
		nombreArrayList11.add("Which option enables the code to compile?");
		nombreArrayList11.add("Given: Which option enables the code to compile?");
		nombreArrayList11.add("A.\n" + "Option B");
		nombreArrayList11.add("B.\n" + "Option C ");
		nombreArrayList11.add("C.\n" + "Option D ");
		nombreArrayList11.add("D.\n" + "Option A ");
		hashMap.put("11", nombreArrayList11);
		
		
		nombreArrayList12.add("What is the result?");
		nombreArrayList12.add("Given: What is the result?");
		nombreArrayList12.add("A.\n" + "A B C D");
		nombreArrayList12.add("B.\n" + "A C D ");
		nombreArrayList12.add("C.\n" + "A B C C ");
		nombreArrayList12.add("D.\n" + "A B D ");
		nombreArrayList12.add("E.\n" + "A B D C ");
		hashMap.put("12", nombreArrayList12);
		
		
		nombreArrayList13.add("Which code fragment should you use at line n1 to instantiate the dvd object successfully?");
		nombreArrayList13.add("Given: Which code fragment should you use at line n1 to instantiate the dvd object\n"
				+ "successfully?");
		nombreArrayList13.add("A.\n" + "Option A");
		nombreArrayList13.add("B.\n" + "Option D ");
		nombreArrayList13.add("C.\n" + "Option B ");
		nombreArrayList13.add("D.\n" + "Option C ");
		hashMap.put("13", nombreArrayList13);
		
		
		nombreArrayList14.add("Which option can replace xxx to enable the code to print 135?");
		nombreArrayList14.add("Given the code fragment: Which option can replace xxx to enable the code to print 135?");
		nombreArrayList14.add("A.\n" + "int e = 0; e < = 4; e++");
		nombreArrayList14.add("B.\n" + "int e = 0; e < 5; e + = 2 ");
		nombreArrayList14.add("C.\n" + "int e = 1; e < = 5; e + = 1 ");
		nombreArrayList14.add("D.\n" + "int e = 1; e < 5; e+ =2 ");
		hashMap.put("14", nombreArrayList14);
		
		nombreArrayList15.add("Which statement best describes encapsulation?");
		nombreArrayList15.add("Which statement best describes encapsulation?");
		nombreArrayList15.add("A.\n" + "Encapsulation ensures that classes can be designed so that if a method has an\n"
				+ "argument MyType x, any subclass of MyType can be passed to that method.");
		nombreArrayList15.add("B.\n" + "Encapsulation ensures that classes can be designed so that only certain fields and\n"
						+ "methods of an object are accessible from other objects. ");
		nombreArrayList15.add("C.\n" + "Encapsulation ensures that classes can be designed so that their methods are\n"
				+ "inheritable. ");
		nombreArrayList15.add("D.\n" + "Encapsulation ensures that classes can be designed with some fields and methods\n"
				+ "declared as abstract. ");
		hashMap.put("15", nombreArrayList15);
		
		
		nombreArrayList16.add("Which code fragment, when inserted at line 2, enables the code to compile?");
		nombreArrayList.add("Given the code fragment from three files: Which code fragment, when inserted at line 2,\n"
				+ "enables the code to compile?");
		nombreArrayList16.add("A.\n" + "Option E");
		nombreArrayList16.add("B.\n" + "Option D ");
		nombreArrayList16.add("C.\n" + "Option A ");
		nombreArrayList16.add("D.\n" + "Option C ");
		nombreArrayList16.add("D.\n" + "Option B ");
		hashMap.put("16", nombreArrayList16);
		
		
		nombreArrayList17.add("Which three lines, when inserted independently at line n1, cause the program to print a o balance?");
		nombreArrayList17.add("Given the following class: And given the following main method, located in another class:\n"
						+ "Which three lines, when inserted independently at line n1, cause the program to print a o\n"
						+ "balance?");
		nombreArrayList17.add("A.\n" + "acct.changeAmount(-acct.amount);");
		nombreArrayList17.add("B.\n" + "this.amount = 0; ");
		nombreArrayList17.add("C.\n" + "amount = 0; ");
		nombreArrayList17.add("D.\n" + "acct (0) ; ");
		nombreArrayList17.add("E.\n" + "acct.amount = 0; ");
		nombreArrayList17.add("F.\n" + "acct. getAmount () = 0; ");
		nombreArrayList17.add("G.\n" + "acct.changeAmount(0); ");
		hashMap.put("17", nombreArrayList17);
		
		
		nombreArrayList18.add("Which code fragment prints red: blue: small: medium?");
		nombreArrayList18.add("Given the code fragment: Which code fragment prints red: blue: small: medium?");
		nombreArrayList18.add("A.\n" + "Option D");
		nombreArrayList18.add("B.\n" + "Option C ");
		nombreArrayList18.add("C.\n" + "Option A ");
		nombreArrayList18.add("D.\n" + "Option B ");
		hashMap.put("18", nombreArrayList18);
		
		
		nombreArrayList19.add("What is the result?");
		nombreArrayList19.add("Given the code fragment: What is the result?");
		nombreArrayList19.add("A.\n" + "Compilation fails at both line n2 and line n3.");
		nombreArrayList19.add("B.\n" + "Reading Card Checking Card ");
		nombreArrayList19.add("C.\n" + "Compilation fails only at line n1. ");
		nombreArrayList19.add("D.\n" + "Compilation fails only at line n2. ");
		nombreArrayList19.add("D.\n" + "Compilation fails only at line n3. ");
		hashMap.put("19", nombreArrayList19);
		
		
		nombreArrayList20.add("Which modification enables the code to print 54321?");
		nombreArrayList.add("Given the code fragment: Which modification enables the code to print 54321?");
		nombreArrayList.add("A.\n" + "Replace line 12 With return (x > 0) ? false: true;");
		nombreArrayList.add("B.\n" + "Replace line 6 with –x; and, at line 7, insert system, out. print (x); ");
		nombreArrayList.add("C.\n" + "Replace line 6 with System, out. print (–x) ; ");
		nombreArrayList.add("D.\n" + "At line 1, insert x –; ");
		hashMap.put("20", nombreArrayList);
		
		nombreArrayList.add("Which modification enables the code fragment to print TrueDone?");
		nombreArrayList.add("Given the code fragment: Which modification enables the code fragment to print TrueDone?");
		nombreArrayList.add("A.\n" + "Replace line 5 With String result = “true”; Replace line 7 with case “true”:");
		nombreArrayList.add("B.\n" + "Replace line 5 with boolean opt = l; Replace line 7 with case 1= ");
		nombreArrayList.add("C.\n" + "At line 9, remove the break statement. ");
		nombreArrayList.add("D.\n" + "Remove the default section. ");
		hashMap.put("21", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given the following main method: What is the result?");
		nombreArrayList.add("A.\n" + "5 4 3 2 1 0");
		nombreArrayList.add("B.\n" + "5 4 3 2 1 ");
		nombreArrayList.add("C.\n" + "4 2 1 ");
		nombreArrayList.add("D.\n" + "5");
		nombreArrayList.add("D.\n" + "Nothing is printed ");
		hashMap.put("22", nombreArrayList);
		nombreArrayList.clear();

		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given the code fragment: What is the result?");
		nombreArrayList.add("A.\n" + "100");
		nombreArrayList.add("B.\n" + "Compilation fails ");
		nombreArrayList.add("C.\n" + "103");
		nombreArrayList.add("D.\n" + "101");
		nombreArrayList.add("D.\n" + "102 ");
		hashMap.put("23", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given: What is the result?");
		nombreArrayList.add("A.\n" + "91 98 99 100 null null null");
		nombreArrayList.add("B.\n" + "91 98 99 100 101 102 103 ");
		nombreArrayList.add("C.\n" + "Compilation rails. ");
		nombreArrayList.add("D.\n" + "A NullPointerException is thrown at runtime. ");
		nombreArrayList.add("D.\n" + "An ArraylndexOutOfBoundsException is thrown at runtime. ");
		hashMap.put("24", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList
				.add("Which two modifications, when made independently, enable the code to print joe:true: 100.0?");
		nombreArrayList.add("Given the code fragment: Which two modifications, when made independently, enable the\n"
				+ "code to print joe:true: 100.0?");
		nombreArrayList.add("A.\n" + "Option A");
		nombreArrayList.add("B.\n" + "Option E ");
		nombreArrayList.add("C.\n" + "Option D ");
		nombreArrayList.add("D.\n" + "Option B ");
		nombreArrayList.add("D.\n" + "Option C ");
		hashMap.put("25", nombreArrayList);
		
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given the code fragment: What is the result?");
		nombreArrayList.add("A.\n" + "[Robb, Rick, Bran]");
		nombreArrayList.add("B.\n" + "[Robb, Rick] ");
		nombreArrayList.add("C.\n" + "[Robb, Bran, Rick, Bran] ");
		nombreArrayList.add("D.\n" + "An exception is thrown at runtime. ");
		hashMap.put("26", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given: What is the result?");
		nombreArrayList.add("A.\n" + "Compilation fails at line n1 and line n2");
		nombreArrayList.add("B.\n" + "C B A ");
		nombreArrayList.add("C.\n" + "C ");
		nombreArrayList.add("D.\n" + "A B C");
		hashMap.put("27", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given: What is the result?");
		nombreArrayList.add("A.\n" + "3 6 4 6");
		nombreArrayList.add("B.\n" + "5 4 5 6 ");
		nombreArrayList.add("C.\n" + "3 4 5 6 ");
		nombreArrayList.add("D.\n" + "3 4 3 6 ");
		hashMap.put("28", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("Which code fragment, when inserted at line 3, enables the code to print 10:20?");
		nombreArrayList.add("Given the code fragment: Which code fragment, when inserted at line 3, enables the code\n"
				+ "to print 10:20?");
		nombreArrayList.add("A.\n" + "int array [2] ;");
		nombreArrayList.add("B.\n" + "int[] array n= new int[2]; ");
		nombreArrayList.add("C.\n" + "int[] array; array = int[2] ");
		nombreArrayList.add("D.\n" + "int array = new int[2]; ");
		hashMap.put("29", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given the code fragment: What is the result?");
		nombreArrayList.add("A.\n" + "Compilation fails");
		nombreArrayList.add("B.\n" + "A Work done ");
		nombreArrayList.add("C.\n" + "A B C Work done ");
		nombreArrayList.add("D.\n" + "A B C D Work done ");
		hashMap.put("30", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("Which three are advantages of the Java exception mechanism?");
		nombreArrayList.add("Which three are advantages of the Java exception mechanism?");
		nombreArrayList
				.add("A.\n" + "Improves the program structure because the error handling code is separated from the\n"
						+ "normal program function");
		nombreArrayList.add("B.\n" + "Provides a set of standard exceptions that covers all the possible errors ");
		nombreArrayList.add("C.\n"
				+ "Improves the program structure because the programmer can choose where to handle\n" + "exceptions ");
		nombreArrayList
				.add("D.\n" + "Improves the program structure because exceptions must be handled in the method in\n"
						+ "which they occurred");
		nombreArrayList.add(
				"E.\n" + "Allows the creation of new exceptions that are tailored to the particular program being\n"
						+ "created ");
		hashMap.put("31", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("Which set of commands prints Hello Duke in the console?");
		nombreArrayList
				.add("Given the code from the Greeting.Java file: Which set of commands prints Hello Duke in the\n"
						+ "console?");
		nombreArrayList.add("A.\n" + "Option C");
		nombreArrayList.add("B.\n" + "Option D ");
		nombreArrayList.add("C.\n" + "Option B ");
		nombreArrayList.add("D.\n" + "Option A ");
		hashMap.put("32", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given: What is the result?");
		nombreArrayList.add("A.\n" + "Option B");
		nombreArrayList.add("B.\n" + "Option C ");
		nombreArrayList.add("C.\n" + "Option D ");
		nombreArrayList.add("D.\n" + "Option A ");
		hashMap.put("33", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given the code fragment: What is the result?");
		nombreArrayList.add("A.\n" + "2 4");
		nombreArrayList.add("B.\n" + "0 2 4 6 ");
		nombreArrayList.add("C.\n" + "0 2 4");
		nombreArrayList.add("D.\n" + " Compilation fails ");
		hashMap.put("34", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add(
				"Given the code fragment: Assume that the system date is June 20, 2014. What is the\n" + "result?");
		nombreArrayList.add("A.\n" + "Option A");
		nombreArrayList.add("B.\n" + "Option D ");
		nombreArrayList.add("C.\n" + "Option B ");
		nombreArrayList.add("D.\n" + "Option C ");
		hashMap.put("35", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("Which code fragment, when inserted at line 9, enables the code to print true?");
		nombreArrayList.add("Given the code fragment: Which code fragment, when inserted at line 9, enables the code\n"
				+ "to print true?");
		nombreArrayList.add("A.\n" + "String str2 = str1; ");
		nombreArrayList.add("B.\n" + "String str2 = new String (str1); ");
		nombreArrayList.add("C.\n" + "String str2 = sb1. toString ();");
		nombreArrayList.add("D.\n" + "String str2 = “Duke”; ");
		hashMap.put("36", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given the code fragment: What is the result?");
		nombreArrayList.add("A.\n" + "Compilation fails");
		nombreArrayList.add("B.\n" + "10 : 10");
		nombreArrayList.add("C.\n" + "5 : 5 ");
		nombreArrayList.add("D.\n" + "5 : 10");
		hashMap.put("37", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList
				.add("Which two code fragments can be independently placed at line n1 to meet the requirements?");
		nombreArrayList
				.add("Given the code fragment: And given the requirements: * If the value of the qty variable is\n"
						+ "greater than or equal to 90, discount = 0.5. * If the value of the qty variable is between 80\n"
						+ "and 90, discount = 0.2. Which two code fragments can be independently placed at line n1 to\n"
						+ "meet the requirements?");
		nombreArrayList.add("A.\n" + "Option E");
		nombreArrayList.add("B.\n" + "Option D ");
		nombreArrayList.add("C.\n" + "Option C ");
		nombreArrayList.add("D.\n" + "Option A ");
		nombreArrayList.add("E.\n" + "Option B ");
		hashMap.put("38", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given: And given the commands: javac Test.Java Java Test Hello What is the result?");
		nombreArrayList.add("A.\n" + "Success");
		nombreArrayList.add("B.\n" + "Failure");
		nombreArrayList.add("C.\n" + "Compilation fails. ");
		nombreArrayList.add("D.\n" + "An exception is thrown at runtime ");
		hashMap.put("39", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("Which three statements describe the object-oriented features of the Java language?");
		nombreArrayList.add("Which three statements describe the object-oriented features of the Java language?");
		nombreArrayList.add("A.\n" + "Objects can share behaviors with other objects.");
		nombreArrayList.add("B.\n" + "Objects cannot be reused");
		nombreArrayList.add("C.\n" + "A package must contain more than one class. ");
		nombreArrayList.add("D.\n" + "Object is the root class of all other objects. ");
		nombreArrayList.add("E.\n" + "A main method must be declared in every class. ");
		nombreArrayList.add("F.\n" + "A subclass can inherit from a superclass.");
		hashMap.put("40", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the output?");
		nombreArrayList.add("Given the following code: What is the output?");
		nombreArrayList.add("A.\n" + "4 5");
		nombreArrayList.add("B.\n" + "4 21 ");
		nombreArrayList.add("C.\n" + "5 4");
		nombreArrayList.add("D.\n" + "4 7");
		nombreArrayList.add("C.\n" + "3 5 ");
		nombreArrayList.add("D.\n" + "4 4 ");
		hashMap.put("41", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList
				.add("Which two code fragments should you use at line n1, independently, to achieve this requirement?");
		nombreArrayList.add("You are developing a banking module. You have developed a class named ccMask that has\n"
				+ "a maskcc method. Given the code fragment: You must ensure that the maskcc method\n"
				+ "returns a string that hides all digits of the credit card number except the four last digits (and\n"
				+ "the hyphens that separate each group of four digits). Which two code fragments should you\n"
				+ "use at line n1, independently, to achieve this requirement?");
		nombreArrayList.add("A.\n" + "Option B");
		nombreArrayList.add("B.\n" + "Option C ");
		nombreArrayList.add("C.\n" + "Option D ");
		nombreArrayList.add("D.\n" + "Option A ");
		hashMap.put("42", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("Which statement is true?");
		nombreArrayList.add("Given: Which statement is true?");
		nombreArrayList.add("A.\n" + "Both p and s are accessible by obj.");
		nombreArrayList.add("B.\n" + "Only s is accessible by obj. ");
		nombreArrayList.add("C.\n" + "Both r and s are accessible by obj.");
		nombreArrayList.add("D.\n" + "p, r, and s are accessible by obj. ");
		hashMap.put("43", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given: What is the result?");
		nombreArrayList.add("A.\n" + "Base DerivedB");
		nombreArrayList.add("B.\n" + "A classcast Except ion is thrown at runtime. ");
		nombreArrayList.add("C.\n" + "Base DerivedA ");
		nombreArrayList.add("D.\n" + "DerivedB DerivedA ");
		nombreArrayList.add("D.\n" + "DerivedB DerivedB  ");
		hashMap.put("44", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given the code fragment: What is the result?");
		nombreArrayList
				.add("A.\n" + "Execution terminates in the first catch statement, and caught a RuntimeException is\n"
						+ "printed to the console.");
		nombreArrayList
				.add("B.\n" + "Execution terminates In the second catch statement, and caught an Exception is printed\n"
						+ "\n" + "to the console. ");
		nombreArrayList.add("C.\n" + "A runtime error is thrown in the thread “main”. ");
		nombreArrayList.add("D.\n" + "Execution completes normally, and Ready to use is printed to the console.");
		nombreArrayList.add("E.\n" + "The code fails to compile because a throws keyword is required.");
		hashMap.put("45", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given: What is the result?");
		nombreArrayList.add("A.\n" + "Option C ");
		nombreArrayList.add("B.\n" + "Option D ");
		nombreArrayList.add("C.\n" + "Option B");
		nombreArrayList.add("D.\n" + "Option A ");
		hashMap.put("46", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("Which code fragment, when inserted at line n1, enables the code to print Hank?");
		nombreArrayList
				.add("Given the code fragments: Which code fragment, when inserted at line n1, enables the code\n"
						+ "to print Hank?");
		nombreArrayList.add("A.\n" + "checkAge(iList, Person p -> p.getAge( ) > 40);");
		nombreArrayList.add("B.\n" + "checkAge (iList, p -> p.getAge ( ) > 40); ");
		nombreArrayList.add("C.\n" + "checkAge(iList, (Person p) -> { p.getAge() > 40; });");
		nombreArrayList.add("D.\n" + "checkAge (iList, ( ) -> p. get Age ( ) > 40); ");
		hashMap.put("47", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("");
		nombreArrayList.add("A.\n" + "\n" + "\n" + "Given the code fragment: What is the result?");
		nombreArrayList.add("B.\n" + "A B C");
		nombreArrayList.add("C.\n" + "A B C D E ");
		nombreArrayList.add("D.\n" + "A B D E");
		nombreArrayList.add("D.\n" + "Compilation fails. ");
		hashMap.put("48", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("\n" + "\n" + "Given the code fragment: What is the result?");
		nombreArrayList.add("A.\n" + "true false");
		nombreArrayList.add("B.\n" + "false false");
		nombreArrayList.add("C.\n" + "true true ");
		nombreArrayList.add("D.\n" + "false true ");
		hashMap.put("49", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("Which code fragment, when inserted at line n1, enables the App class to print Equal?");
		nombreArrayList.add("Given the code fragment: Which code fragment, when inserted at line n1, enables the App\n"
				+ "class to print Equal?");
		nombreArrayList.add("A.\n" + "Option A");
		nombreArrayList.add("B.\n" + "Option B ");
		nombreArrayList.add("C.\n" + "Option C ");
		nombreArrayList.add("D.\n" + "Option D ");
		hashMap.put("50", nombreArrayList);
		
		
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given: What is the result?");
		nombreArrayList.add("A.\n" + "Option D");
		nombreArrayList.add("B.\n" + "Option A ");
		nombreArrayList.add("C.\n" + "Option B ");
		nombreArrayList.add("D.\n" + "Option C");
		hashMap.put("51", nombreArrayList);
		
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given the code fragment: What is the result?");
		nombreArrayList.add("A.\n" + "A NullPointerException is thrown at runtime.");
		nombreArrayList.add("B.\n" + "Null Null ");
		nombreArrayList.add("C.\n" + "Element 0 Element 1 ");
		nombreArrayList.add("D.\n" + "\n" + "Null element 0 Null element 1 ");
		hashMap.put("52", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given: What is the result?");
		nombreArrayList.add("A.\n" + "10:20");
		nombreArrayList.add("B.\n" + "0:20 ");
		nombreArrayList.add("C.\n" + "Compilation fails at line n1 ");
		nombreArrayList.add("D.\n" + "Compilation fails at line n2 ");
		hashMap.put("53", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given the definitions of the MyString class and the Test class: What is the result?");
		nombreArrayList.add("A.\n" + "Option D");
		nombreArrayList.add("B.\n" + "Option C ");
		nombreArrayList.add("C.\n" + "Option B ");
		nombreArrayList.add("D.\n" + "Option A");
		hashMap.put("54", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("Which three lines fail to compile?");
		nombreArrayList.add("Given the code fragment: Which three lines fail to compile?");
		nombreArrayList.add("A.\n" + "Line 8");
		nombreArrayList.add("B.\n" + "Line 9 ");
		nombreArrayList.add("C.\n" + "Line 10");
		nombreArrayList.add("D.\n" + "Line 11");
		nombreArrayList.add("E.\n" + "Line 12");
		nombreArrayList.add("F.\n" + "Line 7 ");
		hashMap.put("55", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given: What is the result?");
		nombreArrayList.add("A.\n" + "String main 1");
		nombreArrayList.add("B.\n" + "Compilation fails ");
		nombreArrayList.add("C.\n" + "Object main 1 ");
		nombreArrayList.add("D.\n" + "int main 1 ");
		nombreArrayList.add("E.\n" + "An exception is thrown at runtime");
		hashMap.put("56", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add(
				"Which option represents the state of the num array after successful completion of the outer loop?");
		nombreArrayList.add("Given the code fragment: Which option represents the state of the num array after\n"
				+ "successful completion of the outer loop?");
		nombreArrayList.add("A.\n" + "Option A");
		nombreArrayList.add("B.\n" + "Option B ");
		nombreArrayList.add("C.\n" + "Option C ");
		nombreArrayList.add("D.\n" + "Option D");
		hashMap.put("57", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given the code fragment: What is the result?");
		nombreArrayList.add("A.\n" + "Jesse 25 Walter 52");
		nombreArrayList.add("B.\n" + "Compilation fails only at line n1 ");
		nombreArrayList.add("C.\n" + "Compilation fails only at line n2 ");
		nombreArrayList.add("D.\n" + "Compilation fails at both line n1 and line n2 ");
		hashMap.put("58", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the output?");
		nombreArrayList.add("Given the following code for a Planet object: What is the output?");
		nombreArrayList.add("A.\n" + "Option C");
		nombreArrayList.add("B.\n" + "Option D ");
		nombreArrayList.add("C.\n" + "Option A ");
		nombreArrayList.add("D.\n" + "Option B");
		nombreArrayList.add("D.\n" + "Option E");
		hashMap.put("59", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList
				.add("Which definition of the Toy class adds a valid layer of abstraction to the class hierarchy?");
		nombreArrayList.add("You are asked to develop a program for a shopping application, and you are given the\n"
				+ "following information: The application must contain the classes Toy, EduToy, and consToy.\n"
				+ "The Toy class is the superclass of the other two classes. The int caicuiatePrice (Toy t)\n"
				+ "method calculates the price of a toy. The void printToy (Toy t) method prints the details of a\n"
				+ "toy. Which definition of the Toy class adds a valid layer of abstraction to the class\n"
				+ "hierarchy?");
		nombreArrayList.add("A.\n" + "Option A");
		nombreArrayList.add("B.\n" + "Option B ");
		nombreArrayList.add("C.\n" + "Option C ");
		nombreArrayList.add("D.\n" + "Option D ");
		hashMap.put("60", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What are the values of each element in intArr after this code has executed?");
		nombreArrayList
				.add("Given the following code: What are the values of each element in intArr after this code has\n"
						+ "executed?");
		nombreArrayList.add("A.\n" + "15, 30, 75, 60, 90");
		nombreArrayList.add("B.\n" + "15, 30, 90, 60, 90 ");
		nombreArrayList.add("C.\n" + "15, 90, 45, 90, 75");
		nombreArrayList.add("D.\n" + "15, 60, 45, 90, 75 ");
		nombreArrayList.add("D.\n" + "15, 4, 45, 60, 90 ");
		hashMap.put("61", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("Which two code fragments, independently, print each element in this array?");
		nombreArrayList
				.add("Given the following array: Which two code fragments, independently, print each element in\n"
						+ "this array?");
		nombreArrayList.add("A.\n" + "Option A");
		nombreArrayList.add("B.\n" + "Option B");
		nombreArrayList.add("C.\n" + "Option C ");
		nombreArrayList.add("D.\n" + "Option D ");
		nombreArrayList.add("E.\n" + "Option E ");
		nombreArrayList.add("F.\n" + "Option F ");
		hashMap.put("62", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("Which statement is true?");
		nombreArrayList.add("Given the content of three files: Which statement is true?");
		nombreArrayList.add("A.\n" + "The A.Java and B.java files compile successfully.");
		nombreArrayList.add("B.\n" + " The B.java and C.java files compile successfully. ");
		nombreArrayList.add("C.\n" + " The A.Java and C.java files compile successfully. ");
		nombreArrayList.add("D.\n" + " Only the B.java file compiles successfully. ");
		nombreArrayList.add("F.\n" + " Only the A.Java file compiles successfully. ");
		nombreArrayList.add("G.\n" + " Only the C.java file compiles successfully. ");
		hashMap.put("63", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("Which two statements are true?");
		nombreArrayList.add("Given the code fragment: And given the requirements: – Process all the elements of the\n"
				+ "array in the order of entry. – Process all the elements of the array in the reverse order of\n"
				+ "entry. – Process alternating elements of the array in the order of entry. Which two\n"
				+ "statements are true?");
		nombreArrayList.add("A.\n" + "Requirements 1, 2, and 3 can be implemented by using the enhanced for loop.");
		nombreArrayList.add("B.\n" + "Requirements 1, 2, and 3 can be implemented by using the standard for loop.");
		nombreArrayList.add("C.\n" + "Requirements 2 and 3 CANNOT be implemented by using the standard for loop. ");
		nombreArrayList.add("D.\n" + "Requirement 1 can be implemented by using the enhanced for loop. ");
		nombreArrayList
				.add("D.\n" + "Requirement 3 CANNOT be implemented by using either the enhanced for loop or the\n"
						+ "standard for loop.");
		hashMap.put("64", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given: What is the result?");
		nombreArrayList.add("A.\n" + "400 400");
		nombreArrayList.add("B.\n" + "Compilation fails. ");
		nombreArrayList.add("C.\n" + "200 200 ");
		nombreArrayList.add("D.\n" + "400 200");
		hashMap.put("65", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("Which answer fails to compile?");
		nombreArrayList.add("Given the following class declarations: Which answer fails to compile?");
		nombreArrayList.add("A.\n" + "Option B");
		nombreArrayList.add("B.\n" + "Option C");
		nombreArrayList.add("C.\n" + "Option D");
		nombreArrayList.add("D.\n" + "Option E");
		nombreArrayList.add("D.\n" + "Option A ");
		hashMap.put("66", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("Which statement is true about Java byte code?");
		nombreArrayList.add("Which statement is true about Java byte code?");
		nombreArrayList.add("A.\n" + "It can run on any platform");
		nombreArrayList.add("B.\n" + "It can run on any platform only if it was compiled for that platform.");
		nombreArrayList.add("C.\n" + "It can run on any platform that has the Java Runtime Environment. ");
		nombreArrayList.add("D.\n" + "It can run on any platform that has a Java compiler.");
		nombreArrayList
				.add("E.\n" + "It can run on any platform only if that platform has both the Java Runtime Environment\n"
						+ "and a Java compiler. ");
		hashMap.put("67", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("How many MarkList instances are created in memory at runtime?");
		nombreArrayList.add("Given: How many MarkList instances are created in memory at runtime?");
		nombreArrayList.add("A.\n" + "1");
		nombreArrayList.add("B.\n" + "4");
		nombreArrayList.add("C.\n" + "2");
		nombreArrayList.add("D.\n" + "3");
		hashMap.put("68", nombreArrayList);
		nombreArrayList.clear();

		nombreArrayList.add("What is the result?");
		nombreArrayList.add("\n" + "\n" + "Given: What is the result?");
		nombreArrayList.add("A.\n" + "Area is 6.0");
		nombreArrayList.add("B.\n" + "Area is 3.0 ");
		nombreArrayList.add("C.\n" + "Compilation fails at line n1 ");
		nombreArrayList.add("D.\n" + "Compilation fails at line n2. ");
		hashMap.put("69", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add(
				"Which three code fragments can be independently inserted at line nl to enable the code to print one?");
		nombreArrayList
				.add("Given the code fragment: Which three code fragments can be independently inserted at line\n"
						+ "nl to enable the code to print one?");
		nombreArrayList.add("A.\n" + "Double x = 1;");
		nombreArrayList.add("B.\n" + "Integer x = new Integer (“1”);");
		nombreArrayList.add("C.\n" + "Long x = 1;");
		nombreArrayList.add("D.\n" + "String x = “1”;");
		nombreArrayList.add("F.\n" + "short x = 1; ");
		nombreArrayList.add("G.\n" + "Byte x = 1; ");
		hashMap.put("70", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given: What is the result?");
		nombreArrayList.add("A.\n" + "True null");
		nombreArrayList.add("B.\n" + "Compilation fails ");
		nombreArrayList.add("C.\n" + "A NullPointerException is thrown at runtime ");
		nombreArrayList.add("D.\n" + "True false ");
		hashMap.put("71", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given the following code for the classes MyException and Test: What is the result?");
		nombreArrayList.add("A.\n" + "A");
		nombreArrayList.add("B.\n" + "B ");
		nombreArrayList.add("C.\n" + "Either A or B ");
		nombreArrayList.add("D.\n" + "A B ");
		nombreArrayList.add("D.\n" + "A compile time error occurs at line n1 ");
		hashMap.put("72", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given: What is the result?");
		nombreArrayList.add("A.\n" + "myStr: 9009, myNum: 9009");
		nombreArrayList.add("B.\n" + "Compilation fails ");
		nombreArrayList.add("C.\n" + "myStr: 7007, myNum: 9009");
		nombreArrayList.add("D.\n" + "myStr: 7007, myNum: 7007");
		hashMap.put("73", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("Which two are benefits of polymorphism?");
		nombreArrayList.add("Which two are benefits of polymorphism?");
		nombreArrayList.add("A.\n" + "Faster code at runtime");
		nombreArrayList.add("B.\n" + "More efficient code at runtime");
		nombreArrayList.add("C.\n" + "More dynamic code at runtime ");
		nombreArrayList.add("D.\n" + "More flexible and reusable code");
		nombreArrayList.add("D.\n" + "Code that is protected from extension by other classes");
		hashMap.put("74", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given the code fragment: What is the result?");
		nombreArrayList.add("A.\n" + "Compilation fails.");
		nombreArrayList.add("B.\n" + "An ArrayoutofBoundsException is thrown at runtime.");
		nombreArrayList.add("C.\n" + "1:2:3: ");
		nombreArrayList.add("D.\n" + "1:2:3:4:5: ");
		hashMap.put("75", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("What is the result?");
		nombreArrayList.add("Given: What is the result?");
		nombreArrayList.add("A.\n" + "true:false");
		nombreArrayList.add("B.\n" + "false:true ");
		nombreArrayList.add("C.\n" + "false:false ");
		nombreArrayList.add("D.\n" + "true:true ");
		hashMap.put("76", nombreArrayList);
		nombreArrayList.clear();
		nombreArrayList.add("Which two options fail to compile when placed at line n1 of the main method?");
		nombreArrayList
				.add("Given the following classes: Which two options fail to compile when placed at line n1 of the\n"
						+ "main method?");
		nombreArrayList.add("A.\n" + "director.stockOptions = 1_000;");
		nombreArrayList.add("B.\n" + "employee.salary = 50_000; ");
		nombreArrayList.add("C.\n" + "director.salary = 80_000; ");
		nombreArrayList.add("D.\n" + "employee.budget = 200_000; ");
		nombreArrayList.add("D.\n" + "manager.budget = 1_000_000; ");
		nombreArrayList.add("D.\n" + "manager.stockOption = 500; ");
		hashMap.put("77", nombreArrayList);
		
		

		ArrayList<String> question = new ArrayList<String>();

		question = hashMap.get(questionNumber);
		return question;

	}

	@Override
	public void setFails(int questionNumber) {
		fail=fail+1;

		fails.add(questionNumber);
	}

	@Override
	public void setSuccess(int questionNumber) {
		succes=succes+1;
		success.add(questionNumber);
	}

	@Override
	public int calculateScore() {
		try {
			int scoreFinal =(succes*100) / hashMap.size();
		    return scoreFinal;
		}catch (Exception e){
	    return 1;
		}
	}

	@Override
	public String getImage(String imagenNumber) {
		ArrayList<Integer> nombreArrayList = new ArrayList<Integer>();
		boolean existImage;
		
		ImgModel img = new ImgModel();

		/*nombreArrayList.add(5);
		nombreArrayList.add(31);
		nombreArrayList.add(40);
		nombreArrayList.add(43);
		nombreArrayList.add(63);
		nombreArrayList.add(67);
		nombreArrayList.add(72);
		nombreArrayList.add(74);

		existImage = nombreArrayList.contains(imagenNumber);

		if (existImage) {

			return 0;

		} else {

			return 1;
		}*/
		String imagen = img.getImgNumber();
		
		return imagen;
	}

	@Override
	public ArrayList<Integer> failQuestionList() {

		return fails;
	}

	@Override
	public ArrayList<Integer> successQuestionList() {
		// TODO Auto-generated method stub
		return success;
	}

	@Override
	public boolean verifyAnswer(int questionNumber, ArrayList<String> answersUser) {
		HashMap<Integer,ArrayList<String>> answers = new HashMap<Integer, ArrayList<String>>();
		//answersUser.add(String.valueOf(questionNumber));
		ArrayList<String> answer = new ArrayList<String>();
		ArrayList<String> answer1 = new ArrayList<String>();
		ArrayList<String> answer2 = new ArrayList<String>();
		ArrayList<String> answer3 = new ArrayList<String>();
		ArrayList<String> answer4 = new ArrayList<String>();
		ArrayList<String> answer5 = new ArrayList<String>();
		
		answer1.add("1");
		answer1.add("A");
		answers.put(1, answer1);
		answer2.add("2");
		answer2.add("A");
		answers.put(2, answer2);
		answer3.add("3");
		answer3.add("A");
		answers.put(3, answer3);
		answer4.add("E");
		answers.put(4, answer4);
		answer4.clear();
		answer5.add("C");
		answers.put(5, answer5);
		answer5.clear();
		/*answer.add("B");
		answer.add("C");
		answers.put(6, answer);
		answer.clear();
		answer.add("D");
		answers.put(7, answer);
		answer.clear();*/
		answer.add("8");
		answer.add("D");
		answer.add("E");
		answers.put(8, answer);/*
		answer.clear();
		answer.add("A");
		answer.add("C");
		answers.put(9, answer);
		answer.clear();
		answer.add("C");
		answers.put(10, answer);
		answer.clear();
		answer.add("C");
		answers.put(11, answer);
		answer.clear();
		answer.add("D");
		answers.put(12, answer);
		answer.clear();
		answer.add("D");
		answers.put(13, answer);
		answer.clear();
		answer.add("D");
		answers.put(14, answer);
		answer.clear();
		answer.add("A");
		answers.put(15, answer);
		answer.clear();
		answer.add("B");
		answers.put(16, answer);
		answer.clear();
		answer.add("B");
		answer.add("D");
		answer.add("E");
		answers.put(17, answer);
		answer.clear();
		answer.add("D");
		answers.put(18, answer);
		answer.clear();
		answer.add("A");
		answers.put(19, answer);
		answer.clear();
		answer.add("C");
		answers.put(20, answer);
		answer.clear();
		answer.add("C");
		answers.put(21, answer);
		answer.clear();
		answer.add("A");
		answers.put(22, answer);
		answer.clear();
		answer.add("A");
		answers.put(23, answer);
		answer.clear();
		answer.add("D");
		answers.put(24, answer);
		answer.clear();
		answer.add("D");
		answer.add("E");
		answers.put(25, answer);
		answer.clear();
		answer.add("D");
		answers.put(26, answer);
		answer.clear();
		answer.add("D");
		answers.put(27, answer);
		answer.clear();
		answer.add("C");
		answers.put(28, answer);
		answer.clear();
		answer.add("C");
		answers.put(29, answer);
		answer.clear();
		answer.add("B");
		answers.put(30, answer);
		answer.clear();
		answer.add("A");
		answer.add("C");
		answer.add("D");
		answers.put(31, answer);
		answer.clear();
		answer.add("D");
		answers.put(32, answer);
		answer.clear();
		answer.add("B");
		answers.put(33, answer);
		answer.clear();
		answer.add("C");
		answers.put(34, answer);
		answer.clear();
		answer.add("B");
		answers.put(35, answer);
		answer.clear();
		answer.add("C");
		answers.put(36, answer);
		answer.clear();
		answer.add("D");
		answers.put(37, answer);
		answer.clear();
		answer.add("B");
		answer.add("D");
		answers.put(38, answer);
		answer.clear();
		answer.add("B");
		answers.put(39, answer);
		answer.clear();
		answer.add("A");
		answer.add("E");
		answer.add("F");
		answers.put(40, answer);
		answer.clear();
		answer.add("F");
		answers.put(41, answer);
		answer.clear();
		answer.add("A");
		answer.add("B");
		answers.put(42, answer);
		answer.clear();
		answer.add("C");
		answers.put(43, answer);
		answer.clear();
		answer.add("E");
		answers.put(44, answer);
		answer.clear();
		answer.add("D");
		answers.put(45, answer);
		answer.clear();
		answer.add("C");
		answers.put(46, answer);
		answer.clear();
		answer.add("C");
		answers.put(47, answer);
		answer.clear();
		answer.add("C");
		answers.put(48, answer);
		answer.clear();
		answer.add("B");
		answers.put(49, answer);
		answer.clear();
		answer.add("A");
		answers.put(50, answer);
		answer.clear();
		answer.add("D");
		answers.put(51, answer);
		answer.clear();
		answer.add("A");
		answers.put(52, answer);
		answer.clear();
		answer.add("A");
		answers.put(53, answer);
		answer.clear();
		answer.add("B");
		answers.put(54, answer);
		answer.clear();
		answer.add("C");
		answer.add("D");
		answer.add("E");
		answers.put(55, answer);
		answer.clear();
		answer.add("E");
		answers.put(56, answer);
		answer.clear();
		answer.add("D");
		answers.put(57, answer);
		answer.clear();
		answer.add("B");
		answers.put(58, answer);
		answer.clear();
		answer.add("A");
		answers.put(59, answer);
		answer.clear();
		answer.add("A");
		answers.put(60, answer);
		answer.clear();
		answer.add("C");
		answers.put(61, answer);
		answer.clear();
		answer.add("A");
		answer.add("B");
		answers.put(62, answer);
		answer.clear();
		answer.add("B");
		answers.put(63, answer);
		answer.clear();
		answer.add("B");
		answer.add("E");
		answers.put(64, answer);
		answer.clear();
		answer.add("D");
		answers.put(65, answer);
		answer.clear();
		answer.add("D");
		answers.put(66, answer);
		answer.clear();
		answer.add("D");
		answers.put(67, answer);
		answer.clear();
		answer.add("D");
		answers.put(68, answer);
		answer.clear();
		answer.add("D");
		answers.put(69, answer);
		answer.clear();
		answer.add("A");
		answer.add("B");
		answer.add("C");
		answers.put(70, answer);
		answer.clear();
		answer.add("A");
		answers.put(71, answer);
		answer.clear();
		answer.add("A");
		answers.put(72, answer);
		answer.clear();
		answer.add("C");
		answers.put(73, answer);
		answer.clear();
		answer.add("B");
		answer.add("D");
		answers.put(74, answer);
		answer.clear();
		answer.add("D");
		answers.put(75, answer);
		answer.clear();
		answer.add("B");
		answers.put(76, answer);
		answer.clear();
		answer.add("D");
		answer.add("E");
		answers.put(77, answer);
		answer.clear();
		*/
		
		answer = answers.get(questionNumber);
		
		int totalAnswers = answer.size();
		
		if(totalAnswers == 1) {
			
			if (answersUser.get(questionNumber)==answer.get(questionNumber)) {
				setSuccess(getSuccess()+1);
				return true;
			}else {
				setFails(getFails()+1);
				return false;
			}
			
		}else {
			
			Collections.sort(answersUser);
		    Collections.sort(answer);
		    if(answersUser.equals(answer)) {
		    	setSuccess(getSuccess()+1);
		    	return true;
		    }else {
		    	setFails(getFails()+1);
		    	return false;
		    }
			
			
		}
		
		
	}

	@Override
	public void setQuestionNow(int questionNumber) {
		JavaModel jm = new JavaModel();
		jm.setQuetionNow(questionNumber);
		
	}

	@Override
	public int getFails() {
		JavaModel jvm = new JavaModel();
		return jvm.getFails();
	}

	@Override
	public int getSuccess() {
		
		return succes;
	}

	@Override
	public int getQuestionNow() {

		return fail;
	}

	@Override
	public void setImage(String imgNumber) {
		ImgModel img = new ImgModel();
		String image =imgNumber + ".jpg";
		img.setImgNumber(image);

	}

	@Override
	public int getTier() {
		return tier;
	}

	@Override
	public void setTier(int tier) {
		this.tier=tier+1;
		
	}

}
