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
	public int tier = 1;

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
		ArrayList<String> nombreArrayList49 = new ArrayList<String>();
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
		nombreArrayList1.add("");
		hashMap.put("1", nombreArrayList1);
		// LOG.info("++++++++++++++++++++++++++++++++++++++++++++++++"+hashMap);

		nombreArrayList2.add("What is the result if the integer aVar is 9?");
		nombreArrayList2.add("Given the code fragment: What is the result if the integer aVar is 9?");
		nombreArrayList2.add("A.\n" + "Hello World!");
		nombreArrayList2.add("B.\n" + "Hello Universe! ");
		nombreArrayList2.add("C.\n" + "Hello World! ");
		nombreArrayList2.add("D.\n" + "Compilation fails. ");
		nombreArrayList2.add("");
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
		nombreArrayList4.add("");
		hashMap.put("4", nombreArrayList4);

		nombreArrayList5.add(
				"What is the name of the Java concept that uses access modifiers to protect variables and hide them within a cl");
		nombreArrayList5
				.add("What is the name of the Java concept that uses access modifiers to protect variables and\n"
						+ "hide them within a class?");
		nombreArrayList5.add("A.\n" + "Polymorphism");
		nombreArrayList5.add("B.\n" + "Instantiation");
		nombreArrayList5.add("C.\n" + "Encapsulation");
		nombreArrayList5.add("D.\n" + "Inheritance");
		nombreArrayList5.add("E.\n" + "Abstraction");
		nombreArrayList5.add("");
		nombreArrayList5.add("");
		hashMap.put("5", nombreArrayList5);

		nombreArrayList6.add("Which two modifications, made independently, enable the code to compile?");
		nombreArrayList6
				.add("Given the code fragment: Which two modifications, made independently, enable the code to\n"
						+ "compile?");
		nombreArrayList6.add("A.\n" + "Make the method at line n1 public.");
		nombreArrayList6.add("B.\n" + "Make the method at line n2 public. ");
		nombreArrayList6.add("C.\n" + "Make the method at line n3 public. ");
		nombreArrayList6.add("D.\n" + "Make the method at line n3 protected. ");
		nombreArrayList6.add("E.\n" + "Make the method at line n4 public. ");
		nombreArrayList6.add("");
		nombreArrayList6.add("");
		hashMap.put("6", nombreArrayList6);

		nombreArrayList7.add("What is the result?");
		nombreArrayList7.add("Given: And given the code fragment: What is the result?");
		nombreArrayList7.add("A.\n" + "Compilation fails only at line n2");
		nombreArrayList7.add("B.\n" + "Compilation fails at both line n1 and line n2 ");
		nombreArrayList7.add("C.\n" + "C Compilation fails only at line n1 ");
		nombreArrayList7.add("D.\n" + "Null 0 Auto 4W 150 Manual");
		nombreArrayList7.add("E.\n" + "4W 100 Auto 4W 150 Manual ");
		nombreArrayList7.add("");
		nombreArrayList7.add("");
		hashMap.put("7", nombreArrayList7);

		nombreArrayList8.add("Which two modifications should you make so that the code compiles successfully?");
		nombreArrayList8.add("Given the code fragment: Which two modifications should you make so that the code\n"
				+ "compiles successfully?");
		nombreArrayList8.add("A.\n" + "Option B");
		nombreArrayList8.add("B.\n" + "Option C ");
		nombreArrayList8.add("C.\n" + "Option D ");
		nombreArrayList8.add("D.\n" + "Option E ");
		nombreArrayList8.add("D.\n" + "Option A ");
		nombreArrayList8.add("");
		nombreArrayList8.add("");
		nombreArrayList8.add("");
		hashMap.put("8", nombreArrayList8);

		nombreArrayList9.add(
				"How should you write methods in the ElectricAccount class at line n1 so that the member variable bill…?");
		nombreArrayList9
				.add("Given the following two classes: How should you write methods in the ElectricAccount class\n"
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
		nombreArrayList9.add("");
		nombreArrayList9.add("");
		nombreArrayList9.add("");
		hashMap.put("9", nombreArrayList9);

		nombreArrayList10.add("What is the result?");
		nombreArrayList10.add("Given the code fragment: What is the result?");
		nombreArrayList10.add("A.\n" + "A NullPointerException is thrown at runtime.");
		nombreArrayList10.add("B.\n" + "No Match ");
		nombreArrayList10.add("C.\n" + "Match 2 ");
		nombreArrayList10.add("D.\n" + "Match 1 ");
		nombreArrayList10.add("");
		nombreArrayList10.add("");
		nombreArrayList10.add("");
		hashMap.put("10", nombreArrayList10);

		nombreArrayList11.add("Which option enables the code to compile?");
		nombreArrayList11.add("Given: Which option enables the code to compile?");
		nombreArrayList11.add("A.\n" + "Option B");
		nombreArrayList11.add("B.\n" + "Option C ");
		nombreArrayList11.add("C.\n" + "Option D ");
		nombreArrayList11.add("D.\n" + "Option A ");
		nombreArrayList11.add("");
		nombreArrayList11.add("");
		nombreArrayList11.add("");
		hashMap.put("11", nombreArrayList11);

		nombreArrayList12.add("What is the result?");
		nombreArrayList12.add("Given: What is the result?");
		nombreArrayList12.add("A.\n" + "A B C D");
		nombreArrayList12.add("B.\n" + "A C D ");
		nombreArrayList12.add("C.\n" + "A B C C ");
		nombreArrayList12.add("D.\n" + "A B D ");
		nombreArrayList12.add("E.\n" + "A B D C ");
		nombreArrayList12.add("");
		nombreArrayList12.add("");
		hashMap.put("12", nombreArrayList12);

		nombreArrayList13
				.add("Which code fragment should you use at line n1 to instantiate the dvd object successfully?");
		nombreArrayList13.add("Given: Which code fragment should you use at line n1 to instantiate the dvd object\n"
				+ "successfully?");
		nombreArrayList13.add("A.\n" + "Option A");
		nombreArrayList13.add("B.\n" + "Option D ");
		nombreArrayList13.add("C.\n" + "Option B ");
		nombreArrayList13.add("D.\n" + "Option C ");
		nombreArrayList13.add("");
		nombreArrayList13.add("");
		nombreArrayList13.add("");
		hashMap.put("13", nombreArrayList13);

		nombreArrayList14.add("Which option can replace xxx to enable the code to print 135?");
		nombreArrayList14.add("Given the code fragment: Which option can replace xxx to enable the code to print 135?");
		nombreArrayList14.add("A.\n" + "int e = 0; e < = 4; e++");
		nombreArrayList14.add("B.\n" + "int e = 0; e < 5; e + = 2 ");
		nombreArrayList14.add("C.\n" + "int e = 1; e < = 5; e + = 1 ");
		nombreArrayList14.add("D.\n" + "int e = 1; e < 5; e+ =2 ");
		nombreArrayList14.add("");
		nombreArrayList14.add("");
		nombreArrayList14.add("");
		hashMap.put("14", nombreArrayList14);

		nombreArrayList15.add("Which statement best describes encapsulation?");
		nombreArrayList15.add("Which statement best describes encapsulation?");
		nombreArrayList15.add("A.\n" + "Encapsulation ensures that classes can be designed so that if a method has an\n"
				+ "argument MyType x, any subclass of MyType can be passed to that method.");
		nombreArrayList15
				.add("B.\n" + "Encapsulation ensures that classes can be designed so that only certain fields and\n"
						+ "methods of an object are accessible from other objects. ");
		nombreArrayList15.add("C.\n" + "Encapsulation ensures that classes can be designed so that their methods are\n"
				+ "inheritable. ");
		nombreArrayList15
				.add("D.\n" + "Encapsulation ensures that classes can be designed with some fields and methods\n"
						+ "declared as abstract. ");
		nombreArrayList15.add("");
		nombreArrayList15.add("");
		nombreArrayList15.add("");
		hashMap.put("15", nombreArrayList15);

		nombreArrayList16.add("Which code fragment, when inserted at line 2, enables the code to compile?");
		nombreArrayList.add("Given the code fragment from three files: Which code fragment, when inserted at line 2,\n"
				+ "enables the code to compile?");
		nombreArrayList16.add("A.\n" + "Option E");
		nombreArrayList16.add("B.\n" + "Option D ");
		nombreArrayList16.add("C.\n" + "Option A ");
		nombreArrayList16.add("D.\n" + "Option C ");
		nombreArrayList16.add("E.\n" + "Option B ");
		nombreArrayList16.add("");
		nombreArrayList16.add("");
		hashMap.put("16", nombreArrayList16);

		nombreArrayList17.add(
				"Which three lines, when inserted independently at line n1, cause the program to print a o balance?");
		nombreArrayList17
				.add("Given the following class: And given the following main method, located in another class:\n"
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
		nombreArrayList18.add("");
		nombreArrayList18.add("");
		nombreArrayList18.add("");
		hashMap.put("18", nombreArrayList18);

		nombreArrayList19.add("What is the result?");
		nombreArrayList19.add("Given the code fragment: What is the result?");
		nombreArrayList19.add("A.\n" + "Compilation fails at both line n2 and line n3.");
		nombreArrayList19.add("B.\n" + "Reading Card Checking Card ");
		nombreArrayList19.add("C.\n" + "Compilation fails only at line n1. ");
		nombreArrayList19.add("D.\n" + "Compilation fails only at line n2. ");
		nombreArrayList19.add("E.\n" + "Compilation fails only at line n3. ");
		nombreArrayList19.add("");
		nombreArrayList19.add("");
		hashMap.put("19", nombreArrayList19);

		nombreArrayList20.add("Which modification enables the code to print 54321?");
		nombreArrayList20.add("Given the code fragment: Which modification enables the code to print 54321?");
		nombreArrayList20.add("A.\n" + "Replace line 12 With return (x > 0) ? false: true;");
		nombreArrayList20.add("B.\n" + "Replace line 6 with –x; and, at line 7, insert system, out. print (x); ");
		nombreArrayList20.add("C.\n" + "Replace line 6 with System, out. print (–x) ; ");
		nombreArrayList20.add("D.\n" + "At line 1, insert x –; ");
		nombreArrayList20.add("");
		nombreArrayList20.add("");
		nombreArrayList20.add("");
		hashMap.put("20", nombreArrayList20);

		nombreArrayList21.add("Which modification enables the code fragment to print TrueDone?");
		nombreArrayList21
				.add("Given the code fragment: Which modification enables the code fragment to print TrueDone?");
		nombreArrayList21.add("A.\n" + "Replace line 5 With String result = “true”; Replace line 7 with case “true”:");
		nombreArrayList21.add("B.\n" + "Replace line 5 with boolean opt = l; Replace line 7 with case 1= ");
		nombreArrayList21.add("C.\n" + "At line 9, remove the break statement. ");
		nombreArrayList21.add("D.\n" + "Remove the default section. ");
		nombreArrayList21.add("");
		nombreArrayList21.add("");
		nombreArrayList21.add("");
		hashMap.put("21", nombreArrayList21);

		nombreArrayList22.add("What is the result?");
		nombreArrayList22.add("Given the following main method: What is the result?");
		nombreArrayList22.add("A.\n" + "5 4 3 2 1 0");
		nombreArrayList22.add("B.\n" + "5 4 3 2 1 ");
		nombreArrayList22.add("C.\n" + "4 2 1 ");
		nombreArrayList22.add("D.\n" + "5");
		nombreArrayList22.add("E.\n" + "Nothing is printed ");
		nombreArrayList22.add("");
		nombreArrayList22.add("");
		hashMap.put("22", nombreArrayList22);

		nombreArrayList23.add("What is the result?");
		nombreArrayList23.add("Given the code fragment: What is the result?");
		nombreArrayList23.add("A.\n" + "100");
		nombreArrayList23.add("B.\n" + "Compilation fails ");
		nombreArrayList23.add("C.\n" + "103");
		nombreArrayList23.add("D.\n" + "101");
		nombreArrayList23.add("E.\n" + "102 ");
		nombreArrayList23.add("");
		nombreArrayList23.add("");
		hashMap.put("23", nombreArrayList23);

		nombreArrayList24.add("What is the result?");
		nombreArrayList24.add("Given: What is the result?");
		nombreArrayList24.add("A.\n" + "91 98 99 100 null null null");
		nombreArrayList24.add("B.\n" + "91 98 99 100 101 102 103 ");
		nombreArrayList24.add("C.\n" + "Compilation rails. ");
		nombreArrayList24.add("D.\n" + "A NullPointerException is thrown at runtime. ");
		nombreArrayList24.add("E.\n" + "An ArraylndexOutOfBoundsException is thrown at runtime. ");
		nombreArrayList24.add("");
		nombreArrayList24.add("");
		hashMap.put("24", nombreArrayList24);

		nombreArrayList25
				.add("Which two modifications, when made independently, enable the code to print joe:true: 100.0?");
		nombreArrayList25.add("Given the code fragment: Which two modifications, when made independently, enable the\n"
				+ "code to print joe:true: 100.0?");
		nombreArrayList25.add("A.\n" + "Option A");
		nombreArrayList25.add("B.\n" + "Option E ");
		nombreArrayList25.add("C.\n" + "Option D ");
		nombreArrayList25.add("D.\n" + "Option B ");
		nombreArrayList25.add("E.\n" + "Option C ");
		nombreArrayList25.add("");
		nombreArrayList25.add("");
		hashMap.put("25", nombreArrayList25);

		nombreArrayList26.add("What is the result?");
		nombreArrayList26.add("Given the code fragment: What is the result?");
		nombreArrayList26.add("A.\n" + "[Robb, Rick, Bran]");
		nombreArrayList26.add("B.\n" + "[Robb, Rick] ");
		nombreArrayList26.add("C.\n" + "[Robb, Bran, Rick, Bran] ");
		nombreArrayList26.add("D.\n" + "An exception is thrown at runtime. ");
		nombreArrayList26.add("");
		nombreArrayList26.add("");
		nombreArrayList26.add("");
		hashMap.put("26", nombreArrayList26);

		nombreArrayList27.add("What is the result?");
		nombreArrayList27.add("Given: What is the result?");
		nombreArrayList27.add("A.\n" + "Compilation fails at line n1 and line n2");
		nombreArrayList27.add("B.\n" + "C B A ");
		nombreArrayList27.add("C.\n" + "C ");
		nombreArrayList27.add("D.\n" + "A B C");
		nombreArrayList27.add("");
		nombreArrayList27.add("");
		nombreArrayList27.add("");
		hashMap.put("27", nombreArrayList27);

		nombreArrayList28.add("What is the result?");
		nombreArrayList28.add("Given: What is the result?");
		nombreArrayList28.add("A.\n" + "3 6 4 6");
		nombreArrayList28.add("B.\n" + "5 4 5 6 ");
		nombreArrayList28.add("C.\n" + "3 4 5 6 ");
		nombreArrayList28.add("D.\n" + "3 4 3 6 ");
		nombreArrayList28.add("");
		nombreArrayList28.add("");
		nombreArrayList28.add("");
		hashMap.put("28", nombreArrayList28);

		nombreArrayList29.add("Which code fragment, when inserted at line 3, enables the code to print 10:20?");
		nombreArrayList29
				.add("Given the code fragment: Which code fragment, when inserted at line 3, enables the code\n"
						+ "to print 10:20?");
		nombreArrayList29.add("A.\n" + "int array [2] ;");
		nombreArrayList29.add("B.\n" + "int[] array n= new int[2]; ");
		nombreArrayList29.add("C.\n" + "int[] array; array = int[2] ");
		nombreArrayList29.add("D.\n" + "int array = new int[2]; ");
		nombreArrayList29.add("");
		nombreArrayList29.add("");
		nombreArrayList29.add("");
		hashMap.put("29", nombreArrayList29);

		nombreArrayList30.add("What is the result?");
		nombreArrayList30.add("Given the code fragment: What is the result?");
		nombreArrayList30.add("A.\n" + "Compilation fails");
		nombreArrayList30.add("B.\n" + "A Work done ");
		nombreArrayList30.add("C.\n" + "A B C Work done ");
		nombreArrayList30.add("D.\n" + "A B C D Work done ");
		nombreArrayList30.add("");
		nombreArrayList30.add("");
		nombreArrayList30.add("");
		hashMap.put("30", nombreArrayList30);

		nombreArrayList31.add("Which three are advantages of the Java exception mechanism?");
		nombreArrayList31.add("Which three are advantages of the Java exception mechanism?");
		nombreArrayList31
				.add("A.\n" + "Improves the program structure because the error handling code is separated from the\n"
						+ "normal program function");
		nombreArrayList31.add("B.\n" + "Provides a set of standard exceptions that covers all the possible errors ");
		nombreArrayList31.add("C.\n"
				+ "Improves the program structure because the programmer can choose where to handle\n" + "exceptions ");
		nombreArrayList31
				.add("D.\n" + "Improves the program structure because exceptions must be handled in the method in\n"
						+ "which they occurred");
		nombreArrayList31.add(
				"E.\n" + "Allows the creation of new exceptions that are tailored to the particular program being\n"
						+ "created ");
		nombreArrayList31.add("");
		nombreArrayList31.add("");
		hashMap.put("31", nombreArrayList31);

		nombreArrayList32.add("Which set of commands prints Hello Duke in the console?");
		nombreArrayList32
				.add("Given the code from the Greeting.Java file: Which set of commands prints Hello Duke in the\n"
						+ "console?");
		nombreArrayList32.add("A.\n" + "Option C");
		nombreArrayList32.add("B.\n" + "Option D ");
		nombreArrayList32.add("C.\n" + "Option B ");
		nombreArrayList32.add("D.\n" + "Option A ");
		nombreArrayList32.add("");
		nombreArrayList32.add("");
		nombreArrayList32.add("");
		hashMap.put("32", nombreArrayList32);

		nombreArrayList33.add("What is the result?");
		nombreArrayList33.add("Given: What is the result?");
		nombreArrayList33.add("A.\n" + "Option B");
		nombreArrayList33.add("B.\n" + "Option C ");
		nombreArrayList33.add("C.\n" + "Option D ");
		nombreArrayList33.add("D.\n" + "Option A ");
		nombreArrayList33.add("");
		nombreArrayList33.add("");
		nombreArrayList33.add("");
		hashMap.put("33", nombreArrayList33);

		nombreArrayList34.add("What is the result?");
		nombreArrayList34.add("Given the code fragment: What is the result?");
		nombreArrayList34.add("A.\n" + "2 4");
		nombreArrayList34.add("B.\n" + "0 2 4 6 ");
		nombreArrayList34.add("C.\n" + "0 2 4");
		nombreArrayList34.add("D.\n" + " Compilation fails ");
		nombreArrayList34.add("");
		nombreArrayList34.add("");
		nombreArrayList34.add("");
		hashMap.put("34", nombreArrayList34);

		nombreArrayList35.add("What is the result?");
		nombreArrayList35.add(
				"Given the code fragment: Assume that the system date is June 20, 2014. What is the\n" + "result?");
		nombreArrayList35.add("A.\n" + "Option A");
		nombreArrayList35.add("B.\n" + "Option D ");
		nombreArrayList35.add("C.\n" + "Option B ");
		nombreArrayList35.add("D.\n" + "Option C ");
		nombreArrayList35.add("");
		nombreArrayList35.add("");
		nombreArrayList35.add("");
		hashMap.put("35", nombreArrayList35);

		nombreArrayList36.add("Which code fragment, when inserted at line 9, enables the code to print true?");
		nombreArrayList36
				.add("Given the code fragment: Which code fragment, when inserted at line 9, enables the code\n"
						+ "to print true?");
		nombreArrayList36.add("A.\n" + "String str2 = str1; ");
		nombreArrayList36.add("B.\n" + "String str2 = new String (str1); ");
		nombreArrayList36.add("C.\n" + "String str2 = sb1. toString ();");
		nombreArrayList36.add("D.\n" + "String str2 = “Duke”; ");
		nombreArrayList36.add("");
		nombreArrayList36.add("");
		nombreArrayList36.add("");
		hashMap.put("36", nombreArrayList36);

		nombreArrayList37.add("What is the result?");
		nombreArrayList37.add("Given the code fragment: What is the result?");
		nombreArrayList37.add("A.\n" + "Compilation fails");
		nombreArrayList37.add("B.\n" + "10 : 10");
		nombreArrayList37.add("C.\n" + "5 : 5 ");
		nombreArrayList37.add("D.\n" + "5 : 10");
		nombreArrayList37.add("");
		nombreArrayList37.add("");
		nombreArrayList37.add("");
		hashMap.put("37", nombreArrayList37);

		nombreArrayList38
				.add("Which two code fragments can be independently placed at line n1 to meet the requirements?");
		nombreArrayList38
				.add("Given the code fragment: And given the requirements: * If the value of the qty variable is\n"
						+ "greater than or equal to 90, discount = 0.5. * If the value of the qty variable is between 80\n"
						+ "and 90, discount = 0.2. Which two code fragments can be independently placed at line n1 to\n"
						+ "meet the requirements?");
		nombreArrayList38.add("A.\n" + "Option E");
		nombreArrayList38.add("B.\n" + "Option D ");
		nombreArrayList38.add("C.\n" + "Option C ");
		nombreArrayList38.add("D.\n" + "Option A ");
		nombreArrayList38.add("E.\n" + "Option B ");
		nombreArrayList38.add("");
		nombreArrayList38.add("");
		hashMap.put("38", nombreArrayList38);

		nombreArrayList39.add("What is the result?");
		nombreArrayList39.add("Given: And given the commands: javac Test.Java Java Test Hello What is the result?");
		nombreArrayList39.add("A.\n" + "Success");
		nombreArrayList39.add("B.\n" + "Failure");
		nombreArrayList39.add("C.\n" + "Compilation fails. ");
		nombreArrayList39.add("D.\n" + "An exception is thrown at runtime ");
		nombreArrayList39.add("");
		nombreArrayList39.add("");
		nombreArrayList39.add("");
		hashMap.put("39", nombreArrayList39);

		nombreArrayList40.add("Which three statements describe the object-oriented features of the Java language?");
		nombreArrayList40.add("Which three statements describe the object-oriented features of the Java language?");
		nombreArrayList40.add("A.\n" + "Objects can share behaviors with other objects.");
		nombreArrayList40.add("B.\n" + "Objects cannot be reused");
		nombreArrayList40.add("C.\n" + "A package must contain more than one class. ");
		nombreArrayList40.add("D.\n" + "Object is the root class of all other objects. ");
		nombreArrayList40.add("E.\n" + "A main method must be declared in every class. ");
		nombreArrayList40.add("F.\n" + "A subclass can inherit from a superclass.");
		nombreArrayList40.add("");
		hashMap.put("40", nombreArrayList40);

		nombreArrayList41.add("What is the output?");
		nombreArrayList41.add("Given the following code: What is the output?");
		nombreArrayList41.add("A.\n" + "4 5");
		nombreArrayList41.add("B.\n" + "4 21 ");
		nombreArrayList41.add("C.\n" + "5 4");
		nombreArrayList41.add("D.\n" + "4 7");
		nombreArrayList41.add("E.\n" + "3 5 ");
		nombreArrayList41.add("F.\n" + "4 4 ");
		nombreArrayList41.add("");

		hashMap.put("41", nombreArrayList41);

		nombreArrayList42
				.add("Which two code fragments should you use at line n1, independently, to achieve this requirement?");
		nombreArrayList42.add("You are developing a banking module. You have developed a class named ccMask that has\n"
				+ "a maskcc method. Given the code fragment: You must ensure that the maskcc method\n"
				+ "returns a string that hides all digits of the credit card number except the four last digits (and\n"
				+ "the hyphens that separate each group of four digits). Which two code fragments should you\n"
				+ "use at line n1, independently, to achieve this requirement?");
		nombreArrayList42.add("A.\n" + "Option B");
		nombreArrayList42.add("B.\n" + "Option C ");
		nombreArrayList42.add("C.\n" + "Option D ");
		nombreArrayList42.add("D.\n" + "Option A ");
		nombreArrayList42.add("");
		nombreArrayList42.add("");
		nombreArrayList42.add("");
		hashMap.put("42", nombreArrayList42);

		nombreArrayList43.add("Which statement is true?");
		nombreArrayList43.add("Given: Which statement is true?");
		nombreArrayList43.add("A.\n" + "Both p and s are accessible by obj.");
		nombreArrayList43.add("B.\n" + "Only s is accessible by obj. ");
		nombreArrayList43.add("C.\n" + "Both r and s are accessible by obj.");
		nombreArrayList43.add("D.\n" + "p, r, and s are accessible by obj. ");
		nombreArrayList43.add("");
		nombreArrayList43.add("");
		nombreArrayList43.add("");
		hashMap.put("43", nombreArrayList43);

		nombreArrayList44.add("What is the result?");
		nombreArrayList44.add("Given: What is the result?");
		nombreArrayList44.add("A.\n" + "Base DerivedB");
		nombreArrayList44.add("B.\n" + "A classcast Except ion is thrown at runtime. ");
		nombreArrayList44.add("C.\n" + "Base DerivedA ");
		nombreArrayList44.add("D.\n" + "DerivedB DerivedA ");
		nombreArrayList44.add("E.\n" + "DerivedB DerivedB  ");
		nombreArrayList44.add("");
		nombreArrayList44.add("");
		hashMap.put("44", nombreArrayList44);

		nombreArrayList45.add("What is the result?");
		nombreArrayList45.add("Given the code fragment: What is the result?");
		nombreArrayList45
				.add("A.\n" + "Execution terminates in the first catch statement, and caught a RuntimeException is\n"
						+ "printed to the console.");
		nombreArrayList45
				.add("B.\n" + "Execution terminates In the second catch statement, and caught an Exception is printed\n"
						+ "\n" + "to the console. ");
		nombreArrayList45.add("C.\n" + "A runtime error is thrown in the thread “main”. ");
		nombreArrayList45.add("D.\n" + "Execution completes normally, and Ready to use is printed to the console.");
		nombreArrayList45.add("E.\n" + "The code fails to compile because a throws keyword is required.");
		nombreArrayList45.add("");
		nombreArrayList45.add("");
		hashMap.put("45", nombreArrayList45);

		nombreArrayList46.add("What is the result?");
		nombreArrayList46.add("Given: What is the result?");
		nombreArrayList46.add("A.\n" + "Option C ");
		nombreArrayList46.add("B.\n" + "Option D ");
		nombreArrayList46.add("C.\n" + "Option B");
		nombreArrayList46.add("D.\n" + "Option A ");
		nombreArrayList46.add("");
		nombreArrayList46.add("");
		nombreArrayList46.add("");
		hashMap.put("46", nombreArrayList46);

		nombreArrayList47.add("Which code fragment, when inserted at line n1, enables the code to print Hank?");
		nombreArrayList47
				.add("Given the code fragments: Which code fragment, when inserted at line n1, enables the code\n"
						+ "to print Hank?");
		nombreArrayList47.add("A.\n" + "checkAge(iList, Person p -> p.getAge( ) > 40);");
		nombreArrayList47.add("B.\n" + "checkAge (iList, p -> p.getAge ( ) > 40); ");
		nombreArrayList47.add("C.\n" + "checkAge(iList, (Person p) -> { p.getAge() > 40; });");
		nombreArrayList47.add("D.\n" + "checkAge (iList, ( ) -> p. get Age ( ) > 40); ");
		nombreArrayList47.add("");
		nombreArrayList47.add("");
		nombreArrayList47.add("");
		hashMap.put("47", nombreArrayList47);

		nombreArrayList48.add("What is the result?");
		nombreArrayList48.add("");
		nombreArrayList48.add("A.\n" + "\n" + "\n" + "Given the code fragment: What is the result?");
		nombreArrayList48.add("B.\n" + "A B C");
		nombreArrayList48.add("C.\n" + "A B C D E ");
		nombreArrayList48.add("D.\n" + "A B D E");
		nombreArrayList48.add("E.\n" + "Compilation fails. ");
		nombreArrayList48.add("");
		nombreArrayList48.add("");
		hashMap.put("48", nombreArrayList48);

		nombreArrayList49.add("What is the result?");
		nombreArrayList49.add("\n" + "\n" + "Given the code fragment: What is the result?");
		nombreArrayList49.add("A.\n" + "true false");
		nombreArrayList49.add("B.\n" + "false false");
		nombreArrayList49.add("C.\n" + "true true ");
		nombreArrayList49.add("D.\n" + "false true ");
		nombreArrayList49.add("");
		nombreArrayList49.add("");
		nombreArrayList49.add("");
		hashMap.put("49", nombreArrayList49);

		nombreArrayList50.add("Which code fragment, when inserted at line n1, enables the App class to print Equal?");
		nombreArrayList50
				.add("Given the code fragment: Which code fragment, when inserted at line n1, enables the App\n"
						+ "class to print Equal?");
		nombreArrayList50.add("A.\n" + "Option A");
		nombreArrayList50.add("B.\n" + "Option B ");
		nombreArrayList50.add("C.\n" + "Option C ");
		nombreArrayList50.add("D.\n" + "Option D ");
		nombreArrayList50.add("");
		nombreArrayList50.add("");
		nombreArrayList50.add("");
		hashMap.put("50", nombreArrayList50);

		nombreArrayList51.add("What is the result?");
		nombreArrayList51.add("Given: What is the result?");
		nombreArrayList51.add("A.\n" + "Option D");
		nombreArrayList51.add("B.\n" + "Option A ");
		nombreArrayList51.add("C.\n" + "Option B ");
		nombreArrayList51.add("D.\n" + "Option C");
		nombreArrayList51.add("");
		nombreArrayList51.add("");
		nombreArrayList51.add("");
		hashMap.put("51", nombreArrayList51);

		nombreArrayList52.add("What is the result?");
		nombreArrayList52.add("Given the code fragment: What is the result?");
		nombreArrayList52.add("A.\n" + "A NullPointerException is thrown at runtime.");
		nombreArrayList52.add("B.\n" + "Null Null ");
		nombreArrayList52.add("C.\n" + "Element 0 Element 1 ");
		nombreArrayList52.add("D.\n" + "\n" + "Null element 0 Null element 1 ");
		nombreArrayList52.add("");
		nombreArrayList52.add("");
		nombreArrayList52.add("");
		hashMap.put("52", nombreArrayList52);

		nombreArrayList53.add("What is the result?");
		nombreArrayList53.add("Given: What is the result?");
		nombreArrayList53.add("A.\n" + "10:20");
		nombreArrayList53.add("B.\n" + "0:20 ");
		nombreArrayList53.add("C.\n" + "Compilation fails at line n1 ");
		nombreArrayList53.add("D.\n" + "Compilation fails at line n2 ");
		nombreArrayList53.add("");
		nombreArrayList53.add("");
		nombreArrayList53.add("");
		hashMap.put("53", nombreArrayList53);

		nombreArrayList54.add("What is the result?");
		nombreArrayList54.add("Given the definitions of the MyString class and the Test class: What is the result?");
		nombreArrayList54.add("A.\n" + "Option D");
		nombreArrayList54.add("B.\n" + "Option C ");
		nombreArrayList54.add("C.\n" + "Option B ");
		nombreArrayList54.add("D.\n" + "Option A");
		nombreArrayList54.add("");
		nombreArrayList54.add("");
		nombreArrayList54.add("");
		hashMap.put("54", nombreArrayList54);

		nombreArrayList55.add("Which three lines fail to compile?");
		nombreArrayList55.add("Given the code fragment: Which three lines fail to compile?");
		nombreArrayList55.add("A.\n" + "Line 8");
		nombreArrayList55.add("B.\n" + "Line 9 ");
		nombreArrayList55.add("C.\n" + "Line 10");
		nombreArrayList55.add("D.\n" + "Line 11");
		nombreArrayList55.add("E.\n" + "Line 12");
		nombreArrayList55.add("F.\n" + "Line 7 ");
		nombreArrayList55.add("");
		hashMap.put("55", nombreArrayList55);

		nombreArrayList56.add("What is the result?");
		nombreArrayList56.add("Given: What is the result?");
		nombreArrayList56.add("A.\n" + "String main 1");
		nombreArrayList56.add("B.\n" + "Compilation fails ");
		nombreArrayList56.add("C.\n" + "Object main 1 ");
		nombreArrayList56.add("D.\n" + "int main 1 ");
		nombreArrayList56.add("E.\n" + "An exception is thrown at runtime");
		nombreArrayList56.add("");
		nombreArrayList56.add("");
		hashMap.put("56", nombreArrayList56);

		nombreArrayList57.add(
				"Which option represents the state of the num array after successful completion of the outer loop?");
		nombreArrayList57.add("Given the code fragment: Which option represents the state of the num array after\n"
				+ "successful completion of the outer loop?");
		nombreArrayList57.add("A.\n" + "Option A");
		nombreArrayList57.add("B.\n" + "Option B ");
		nombreArrayList57.add("C.\n" + "Option C ");
		nombreArrayList57.add("D.\n" + "Option D");
		nombreArrayList57.add("");
		nombreArrayList57.add("");
		nombreArrayList57.add("");
		hashMap.put("57", nombreArrayList57);

		nombreArrayList58.add("What is the result?");
		nombreArrayList58.add("Given the code fragment: What is the result?");
		nombreArrayList58.add("A.\n" + "Jesse 25 Walter 52");
		nombreArrayList58.add("B.\n" + "Compilation fails only at line n1 ");
		nombreArrayList58.add("C.\n" + "Compilation fails only at line n2 ");
		nombreArrayList58.add("D.\n" + "Compilation fails at both line n1 and line n2 ");
		nombreArrayList58.add("");
		nombreArrayList58.add("");
		nombreArrayList58.add("");
		hashMap.put("58", nombreArrayList58);

		nombreArrayList59.add("What is the output?");
		nombreArrayList59.add("Given the following code for a Planet object: What is the output?");
		nombreArrayList59.add("A.\n" + "Option C");
		nombreArrayList59.add("B.\n" + "Option D ");
		nombreArrayList59.add("C.\n" + "Option A ");
		nombreArrayList59.add("D.\n" + "Option B");
		nombreArrayList59.add("E.\n" + "Option E");
		nombreArrayList59.add("");
		nombreArrayList59.add("");
		hashMap.put("59", nombreArrayList59);

		nombreArrayList60
				.add("Which definition of the Toy class adds a valid layer of abstraction to the class hierarchy?");
		nombreArrayList60.add("You are asked to develop a program for a shopping application, and you are given the\n"
				+ "following information: The application must contain the classes Toy, EduToy, and consToy.\n"
				+ "The Toy class is the superclass of the other two classes. The int caicuiatePrice (Toy t)\n"
				+ "method calculates the price of a toy. The void printToy (Toy t) method prints the details of a\n"
				+ "toy. Which definition of the Toy class adds a valid layer of abstraction to the class\n"
				+ "hierarchy?");
		nombreArrayList60.add("A.\n" + "Option A");
		nombreArrayList60.add("B.\n" + "Option B ");
		nombreArrayList60.add("C.\n" + "Option C ");
		nombreArrayList60.add("D.\n" + "Option D ");
		nombreArrayList60.add("");
		nombreArrayList60.add("");
		nombreArrayList60.add("");
		hashMap.put("60", nombreArrayList60);

		nombreArrayList61.add("What are the values of each element in intArr after this code has executed?");
		nombreArrayList61
				.add("Given the following code: What are the values of each element in intArr after this code has\n"
						+ "executed?");
		nombreArrayList61.add("A.\n" + "15, 30, 75, 60, 90");
		nombreArrayList61.add("B.\n" + "15, 30, 90, 60, 90 ");
		nombreArrayList61.add("C.\n" + "15, 90, 45, 90, 75");
		nombreArrayList61.add("D.\n" + "15, 60, 45, 90, 75 ");
		nombreArrayList61.add("E.\n" + "15, 4, 45, 60, 90 ");
		nombreArrayList61.add("");
		nombreArrayList61.add("");
		hashMap.put("61", nombreArrayList61);

		nombreArrayList62.add("Which two code fragments, independently, print each element in this array?");
		nombreArrayList62
				.add("Given the following array: Which two code fragments, independently, print each element in\n"
						+ "this array?");
		nombreArrayList62.add("A.\n" + "Option A");
		nombreArrayList62.add("B.\n" + "Option B");
		nombreArrayList62.add("C.\n" + "Option C ");
		nombreArrayList62.add("D.\n" + "Option D ");
		nombreArrayList62.add("E.\n" + "Option E ");
		nombreArrayList62.add("F.\n" + "Option F ");
		nombreArrayList62.add("");
		hashMap.put("62", nombreArrayList62);

		nombreArrayList63.add("Which statement is true?");
		nombreArrayList63.add("Given the content of three files: Which statement is true?");
		nombreArrayList63.add("A.\n" + "The A.Java and B.java files compile successfully.");
		nombreArrayList63.add("B.\n" + " The B.java and C.java files compile successfully. ");
		nombreArrayList63.add("C.\n" + " The A.Java and C.java files compile successfully. ");
		nombreArrayList63.add("D.\n" + " Only the B.java file compiles successfully. ");
		nombreArrayList63.add("F.\n" + " Only the A.Java file compiles successfully. ");
		nombreArrayList63.add("G.\n" + " Only the C.java file compiles successfully. ");
		hashMap.put("63", nombreArrayList63);

		nombreArrayList64.add("Which two statements are true?");
		nombreArrayList64.add("Given the code fragment: And given the requirements: – Process all the elements of the\n"
				+ "array in the order of entry. – Process all the elements of the array in the reverse order of\n"
				+ "entry. – Process alternating elements of the array in the order of entry. Which two\n"
				+ "statements are true?");
		nombreArrayList64.add("A.\n" + "Requirements 1, 2, and 3 can be implemented by using the enhanced for loop.");
		nombreArrayList64.add("B.\n" + "Requirements 1, 2, and 3 can be implemented by using the standard for loop.");
		nombreArrayList64.add("C.\n" + "Requirements 2 and 3 CANNOT be implemented by using the standard for loop. ");
		nombreArrayList64.add("D.\n" + "Requirement 1 can be implemented by using the enhanced for loop. ");
		nombreArrayList64
				.add("E.\n" + "Requirement 3 CANNOT be implemented by using either the enhanced for loop or the\n"
						+ "standard for loop.");
		nombreArrayList64.add("");
		nombreArrayList64.add("");
		hashMap.put("64", nombreArrayList64);

		nombreArrayList65.add("What is the result?");
		nombreArrayList65.add("Given: What is the result?");
		nombreArrayList65.add("A.\n" + "400 400");
		nombreArrayList65.add("B.\n" + "Compilation fails. ");
		nombreArrayList65.add("C.\n" + "200 200 ");
		nombreArrayList65.add("D.\n" + "400 200");
		nombreArrayList65.add("");
		nombreArrayList65.add("");
		nombreArrayList65.add("");
		hashMap.put("65", nombreArrayList65);

		nombreArrayList66.add("Which answer fails to compile?");
		nombreArrayList66.add("Given the following class declarations: Which answer fails to compile?");
		nombreArrayList66.add("A.\n" + "Option B");
		nombreArrayList66.add("B.\n" + "Option C");
		nombreArrayList66.add("C.\n" + "Option D");
		nombreArrayList66.add("D.\n" + "Option E");
		nombreArrayList66.add("E.\n" + "Option A ");
		nombreArrayList66.add("");
		nombreArrayList66.add("");
		hashMap.put("66", nombreArrayList66);

		nombreArrayList67.add("Which statement is true about Java byte code?");
		nombreArrayList67.add("Which statement is true about Java byte code?");
		nombreArrayList67.add("A.\n" + "It can run on any platform");
		nombreArrayList67.add("B.\n" + "It can run on any platform only if it was compiled for that platform.");
		nombreArrayList67.add("C.\n" + "It can run on any platform that has the Java Runtime Environment. ");
		nombreArrayList67.add("D.\n" + "It can run on any platform that has a Java compiler.");
		nombreArrayList67
				.add("E.\n" + "It can run on any platform only if that platform has both the Java Runtime Environment\n"
						+ "and a Java compiler. ");
		nombreArrayList67.add("");
		nombreArrayList67.add("");
		hashMap.put("67", nombreArrayList67);

		nombreArrayList68.add("How many MarkList instances are created in memory at runtime?");
		nombreArrayList68.add("Given: How many MarkList instances are created in memory at runtime?");
		nombreArrayList68.add("A.\n" + "1");
		nombreArrayList68.add("B.\n" + "4");
		nombreArrayList68.add("C.\n" + "2");
		nombreArrayList68.add("D.\n" + "3");
		nombreArrayList68.add("");
		nombreArrayList68.add("");
		nombreArrayList68.add("");
		hashMap.put("68", nombreArrayList68);

		nombreArrayList69.add("What is the result?");
		nombreArrayList69.add("\n" + "\n" + "Given: What is the result?");
		nombreArrayList69.add("A.\n" + "Area is 6.0");
		nombreArrayList69.add("B.\n" + "Area is 3.0 ");
		nombreArrayList69.add("C.\n" + "Compilation fails at line n1 ");
		nombreArrayList69.add("D.\n" + "Compilation fails at line n2. ");
		nombreArrayList69.add("");
		nombreArrayList69.add("");
		nombreArrayList69.add("");
		hashMap.put("69", nombreArrayList69);

		nombreArrayList70.add(
				"Which three code fragments can be independently inserted at line nl to enable the code to print one?");
		nombreArrayList70
				.add("Given the code fragment: Which three code fragments can be independently inserted at line\n"
						+ "nl to enable the code to print one?");
		nombreArrayList70.add("A.\n" + "Double x = 1;");
		nombreArrayList70.add("B.\n" + "Integer x = new Integer (“1”);");
		nombreArrayList70.add("C.\n" + "Long x = 1;");
		nombreArrayList70.add("D.\n" + "String x = “1”;");
		nombreArrayList70.add("F.\n" + "short x = 1; ");
		nombreArrayList70.add("G.\n" + "Byte x = 1; ");
		hashMap.put("70", nombreArrayList70);

		nombreArrayList71.add("What is the result?");
		nombreArrayList71.add("Given: What is the result?");
		nombreArrayList71.add("A.\n" + "True null");
		nombreArrayList71.add("B.\n" + "Compilation fails ");
		nombreArrayList71.add("C.\n" + "A NullPointerException is thrown at runtime ");
		nombreArrayList71.add("D.\n" + "True false ");
		nombreArrayList71.add("");
		nombreArrayList71.add("");
		nombreArrayList71.add("");
		hashMap.put("71", nombreArrayList71);

		nombreArrayList72.add("What is the result?");
		nombreArrayList72.add("Given the following code for the classes MyException and Test: What is the result?");
		nombreArrayList72.add("A.\n" + "A");
		nombreArrayList72.add("B.\n" + "B ");
		nombreArrayList72.add("C.\n" + "Either A or B ");
		nombreArrayList72.add("D.\n" + "A B ");
		nombreArrayList72.add("F.\n" + "A compile time error occurs at line n1 ");
		nombreArrayList72.add("");
		hashMap.put("72", nombreArrayList72);

		nombreArrayList73.add("What is the result?");
		nombreArrayList73.add("Given: What is the result?");
		nombreArrayList73.add("A.\n" + "myStr: 9009, myNum: 9009");
		nombreArrayList73.add("B.\n" + "Compilation fails ");
		nombreArrayList73.add("C.\n" + "myStr: 7007, myNum: 9009");
		nombreArrayList73.add("D.\n" + "myStr: 7007, myNum: 7007");
		nombreArrayList73.add("");
		nombreArrayList73.add("");
		nombreArrayList73.add("");
		hashMap.put("73", nombreArrayList73);

		nombreArrayList74.add("Which two are benefits of polymorphism?");
		nombreArrayList74.add("Which two are benefits of polymorphism?");
		nombreArrayList74.add("A.\n" + "Faster code at runtime");
		nombreArrayList74.add("B.\n" + "More efficient code at runtime");
		nombreArrayList74.add("C.\n" + "More dynamic code at runtime ");
		nombreArrayList74.add("D.\n" + "More flexible and reusable code");
		nombreArrayList74.add("E.\n" + "Code that is protected from extension by other classes");
		nombreArrayList74.add("");
		nombreArrayList74.add("");
		hashMap.put("74", nombreArrayList74);

		nombreArrayList75.add("What is the result?");
		nombreArrayList75.add("Given the code fragment: What is the result?");
		nombreArrayList75.add("A.\n" + "Compilation fails.");
		nombreArrayList75.add("B.\n" + "An ArrayoutofBoundsException is thrown at runtime.");
		nombreArrayList75.add("C.\n" + "1:2:3: ");
		nombreArrayList75.add("D.\n" + "1:2:3:4:5: ");
		nombreArrayList75.add("");
		nombreArrayList75.add("");
		nombreArrayList75.add("");
		hashMap.put("75", nombreArrayList75);

		nombreArrayList76.add("What is the result?");
		nombreArrayList76.add("Given: What is the result?");
		nombreArrayList76.add("A.\n" + "true:false");
		nombreArrayList76.add("B.\n" + "false:true ");
		nombreArrayList76.add("C.\n" + "false:false ");
		nombreArrayList76.add("D.\n" + "true:true ");
		nombreArrayList76.add("");
		nombreArrayList76.add("");
		nombreArrayList76.add("");
		hashMap.put("76", nombreArrayList76);

		nombreArrayList77.add("Which two options fail to compile when placed at line n1 of the main method?");
		nombreArrayList77
				.add("Given the following classes: Which two options fail to compile when placed at line n1 of the\n"
						+ "main method?");
		nombreArrayList77.add("A.\n" + "director.stockOptions = 1_000;");
		nombreArrayList77.add("B.\n" + "employee.salary = 50_000; ");
		nombreArrayList77.add("C.\n" + "director.salary = 80_000; ");
		nombreArrayList77.add("D.\n" + "employee.budget = 200_000; ");
		nombreArrayList77.add("E.\n" + "manager.budget = 1_000_000; ");
		nombreArrayList77.add("F.\n" + "manager.stockOption = 500; ");
		nombreArrayList77.add("");
		hashMap.put("77", nombreArrayList77);

		ArrayList<String> question = new ArrayList<String>();

		question = hashMap.get(questionNumber);
		return question;

	}

	@Override
	public void setFails(int questionNumber) {
		fail = fail + 1;

		fails.add(questionNumber);
	}

	@Override
	public void setSuccess(int questionNumber) {
		succes = succes + 1;
		success.add(questionNumber);
	}

	@Override
	public int calculateScore() {
		try {
			int scoreFinal = (succes * 100) / hashMap.size();
			return scoreFinal;
		} catch (Exception e) {
			return 1;
		}
	}

	@Override
	public String getImage(String imagenNumber) {
		ArrayList<Integer> nombreArrayList = new ArrayList<Integer>();
		boolean existImage;

		ImgModel img = new ImgModel();

		/*
		 * nombreArrayList.add(5); nombreArrayList.add(31); nombreArrayList.add(40);
		 * nombreArrayList.add(43); nombreArrayList.add(63); nombreArrayList.add(67);
		 * nombreArrayList.add(72); nombreArrayList.add(74);
		 * 
		 * existImage = nombreArrayList.contains(imagenNumber);
		 * 
		 * if (existImage) {
		 * 
		 * return 0;
		 * 
		 * } else {
		 * 
		 * return 1; }
		 */
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
		HashMap<Integer, ArrayList<String>> answers = new HashMap<Integer, ArrayList<String>>();
		// answersUser.add(String.valueOf(questionNumber));
		ArrayList<String> answer = new ArrayList<String>();
		ArrayList<String> answer1 = new ArrayList<String>();
		ArrayList<String> answer2 = new ArrayList<String>();
		ArrayList<String> answer3 = new ArrayList<String>();
		ArrayList<String> answer4 = new ArrayList<String>();
		ArrayList<String> answer5 = new ArrayList<String>();
		ArrayList<String> answer6 = new ArrayList<String>();
		ArrayList<String> answer7 = new ArrayList<String>();
		ArrayList<String> answer8 = new ArrayList<String>();
		ArrayList<String> answer9 = new ArrayList<String>();
		ArrayList<String> answer10 = new ArrayList<String>();
		ArrayList<String> answer11 = new ArrayList<String>();
		ArrayList<String> answer12 = new ArrayList<String>();
		ArrayList<String> answer13 = new ArrayList<String>();
		ArrayList<String> answer14 = new ArrayList<String>();
		ArrayList<String> answer15 = new ArrayList<String>();
		ArrayList<String> answer16 = new ArrayList<String>();
		ArrayList<String> answer17 = new ArrayList<String>();
		ArrayList<String> answer18 = new ArrayList<String>();
		ArrayList<String> answer19 = new ArrayList<String>();
		ArrayList<String> answer20 = new ArrayList<String>();
		ArrayList<String> answer21 = new ArrayList<String>();
		ArrayList<String> answer22 = new ArrayList<String>();
		ArrayList<String> answer23 = new ArrayList<String>();
		ArrayList<String> answer24 = new ArrayList<String>();
		ArrayList<String> answer25 = new ArrayList<String>();
		ArrayList<String> answer26 = new ArrayList<String>();
		ArrayList<String> answer27 = new ArrayList<String>();
		ArrayList<String> answer28 = new ArrayList<String>();
		ArrayList<String> answer29 = new ArrayList<String>();
		ArrayList<String> answer30 = new ArrayList<String>();
		ArrayList<String> answer31 = new ArrayList<String>();
		ArrayList<String> answer32 = new ArrayList<String>();
		ArrayList<String> answer33 = new ArrayList<String>();
		ArrayList<String> answer34 = new ArrayList<String>();
		ArrayList<String> answer35 = new ArrayList<String>();
		ArrayList<String> answer36 = new ArrayList<String>();
		ArrayList<String> answer37 = new ArrayList<String>();
		ArrayList<String> answer38 = new ArrayList<String>();
		ArrayList<String> answer39 = new ArrayList<String>();
		ArrayList<String> answer40 = new ArrayList<String>();
		ArrayList<String> answer41 = new ArrayList<String>();
		ArrayList<String> answer42 = new ArrayList<String>();
		ArrayList<String> answer43 = new ArrayList<String>();
		ArrayList<String> answer44 = new ArrayList<String>();
		ArrayList<String> answer45 = new ArrayList<String>();
		ArrayList<String> answer46 = new ArrayList<String>();
		ArrayList<String> answer47 = new ArrayList<String>();
		ArrayList<String> answer48 = new ArrayList<String>();
		ArrayList<String> answer49 = new ArrayList<String>();
		ArrayList<String> answer50 = new ArrayList<String>();
		ArrayList<String> answer51 = new ArrayList<String>();
		ArrayList<String> answer52 = new ArrayList<String>();
		ArrayList<String> answer53 = new ArrayList<String>();
		ArrayList<String> answer54 = new ArrayList<String>();
		ArrayList<String> answer55 = new ArrayList<String>();
		ArrayList<String> answer56 = new ArrayList<String>();
		ArrayList<String> answer57 = new ArrayList<String>();
		ArrayList<String> answer58 = new ArrayList<String>();
		ArrayList<String> answer59 = new ArrayList<String>();
		ArrayList<String> answer60 = new ArrayList<String>();
		ArrayList<String> answer61 = new ArrayList<String>();
		ArrayList<String> answer62 = new ArrayList<String>();
		ArrayList<String> answer63 = new ArrayList<String>();
		ArrayList<String> answer64 = new ArrayList<String>();
		ArrayList<String> answer65 = new ArrayList<String>();
		ArrayList<String> answer66 = new ArrayList<String>();
		ArrayList<String> answer67 = new ArrayList<String>();
		ArrayList<String> answer68 = new ArrayList<String>();
		ArrayList<String> answer69 = new ArrayList<String>();
		ArrayList<String> answer70 = new ArrayList<String>();
		ArrayList<String> answer71 = new ArrayList<String>();
		ArrayList<String> answer72 = new ArrayList<String>();
		ArrayList<String> answer73 = new ArrayList<String>();
		ArrayList<String> answer74 = new ArrayList<String>();
		ArrayList<String> answer75 = new ArrayList<String>();
		ArrayList<String> answer76 = new ArrayList<String>();
		ArrayList<String> answer77 = new ArrayList<String>();

		answer1.add("1");
		answer1.add("A");
		answers.put(1, answer1);
		
		answer2.add("2");
		answer2.add("A");
		answers.put(2, answer2);
		
		answer3.add("3");
		answer3.add("A");
		answers.put(3, answer3);
		
		answer4.add("4");
		answer4.add("E");
		answers.put(4, answer4);
		
		answer5.add("5");
		answer5.add("C");
		answers.put(5, answer5);
		
		answer6.add("6");
		answer6.add("B");
		answer6.add("C");
		answers.put(6, answer6);
		
		answer7.add("7");
		answer7.add("D");
		answers.put(7, answer7);

		answer8.add("8");
		answer8.add("D");
		answer8.add("E");
		answers.put(8, answer8);
		
		answer9.add("9");
		answer9.add("A");
		answer9.add("C");
		answers.put(9, answer9);
		
		answer10.add("10");
		answer10.add("C");
		answers.put(10, answer10);
		
		answer11.add("11");
		answer11.add("C");
		answers.put(11, answer11);
		
		answer12.add("12");
		answer12.add("D");
		answers.put(12, answer12);
		
		answer13.add("13");
		answer13.add("D");
		answers.put(13, answer13);
		
		answer14.add("14");
		answer14.add("D");
		answers.put(14, answer14);
		
		answer15.add("15");
		answer15.add("A");
		answers.put(15, answer15);
		
		answer16.add("16");
		answer16.add("B");
		answers.put(16, answer16);
		
		answer17.add("17");
		answer17.add("B");
		answer17.add("D");
		answer17.add("E");
		answers.put(17, answer17);
		
		answer18.add("18");
		answer18.add("D");
		answers.put(18, answer18);
		
		answer19.add("19");
		answer19.add("A");
		answers.put(19, answer19);
		
		answer20.add("20");
		answer20.add("C");
		answers.put(20, answer20);
		
		answer21.add("21");
		answer21.add("C");
		answers.put(21, answer21);
		
		answer22.add("22");
		answer22.add("A");
		answers.put(22, answer22);
		
		answer23.add("23");
		answer23.add("A");
		answers.put(23, answer23);
		
		answer24.add("24");
		answer24.add("D");
		answers.put(24, answer24);
		
		answer25.add("25");
		answer25.add("D");
		answer25.add("E");
		answers.put(25, answer25);
		
		answer26.add("26");
		answer26.add("D");
		answers.put(26, answer26);
		
		answer27.add("27");
		answer27.add("D");
		answers.put(27, answer27);
		
		answer28.add("28");
		answer28.add("C");
		answers.put(28, answer28);
		
		answer29.add("29");
		answer29.add("C");
		answers.put(29, answer29);
		
		answer30.add("30");
		answer30.add("B");
		answers.put(30, answer30);
		
		
		
		
		
		
		
		
		
		answer31.add("31");
		answer31.add("A");
		answer31.add("C");
		answer31.add("D");
		answers.put(31, answer31);
		
		answer32.add("32");
		answer32.add("D");
		answers.put(32, answer32);
		
		answer33.add("33");
		answer33.add("B");
		answers.put(33, answer33);
		
		answer34.add("34");
		answer34.add("C");
		answers.put(34, answer34);
		
		answer35.add("35");
		answer35.add("B");
		answers.put(35, answer35);
		
		answer36.add("36");
		answer36.add("C");
		answers.put(36, answer36);
		
		answer37.add("37");
		answer37.add("D");
		answers.put(37, answer37);
		
		answer33.add("33");
		answer33.add("B");
		answer33.add("D");
		answers.put(38, answer33);
		
		answer39.add("39");
		answer39.add("B");
		answers.put(39, answer39);
		
		answer40.add("40");
		answer40.add("A");
		answer40.add("E");
		answer40.add("F");
		answers.put(40, answer40);
		
		answer41.add("41");
		answer41.add("F");
		answers.put(41, answer41);
		
		answer42.add("42");
		answer42.add("A");
		answer42.add("B");
		answers.put(42, answer42);
		
		answer43.add("43");
		answer43.add("C");
		answers.put(43, answer43);
		
		answer44.add("44");
		answer44.add("E");
		answers.put(44, answer44);
		
		answer45.add("45");
		answer45.add("D");
		answers.put(45, answer45);
		
		answer46.add("46");
		answer46.add("C");
		answers.put(46, answer46);
		
		answer47.add("47");
		answer47.add("C");
		answers.put(47, answer47);
		
		answer48.add("48");
		answer48.add("C");
		answers.put(48, answer48);
		
		answer49.add("49");
		answer49.add("B");
		answers.put(49, answer49);
		
		answer50.add("50");
		answer50.add("A");
		answers.put(50, answer50);
		
		answer51.add("51");
		answer51.add("D");
		answers.put(51, answer51);
		
		answer52.add("52");
		answer52.add("A");
		answers.put(52, answer52);
		
		answer53.add("53");
		answer53.add("A");
		answers.put(53, answer53);
		
		answer54.add("54");
		answer54.add("B");
		answers.put(54, answer54);
		
		answer55.add("55");
		answer55.add("C");
		answer55.add("D");
		answer55.add("E");
		answers.put(55, answer55);
		
		answer56.add("56");
		answer56.add("E");
		answers.put(56, answer56);
		
		answer57.add("57");
		answer57.add("D");
		answers.put(57, answer57);
		
		answer58.add("58");
		answer58.add("B");
		answers.put(58, answer58);
		
		answer59.add("59");
		answer59.add("A");
		answers.put(59, answer59);
		
		answer60.add("60");
		answer60.add("A");
		answers.put(60, answer60);
		
		answer61.add("61");
		answer61.add("C");
		answers.put(61, answer61);
		
		answer62.add("62");
		answer62.add("A");
		answer62.add("B");
		answers.put(62, answer62);
		
		answer63.add("63");
		answer63.add("B");
		answers.put(63, answer63);
		
		answer64.add("64");
		answer64.add("B");
		answer64.add("E");
		answers.put(64, answer64);
		
		answer65.add("65");
		answer65.add("D");
		answers.put(65, answer65);
		
		answer66.add("66");
		answer66.add("D");
		answers.put(66, answer66);
		
		answer67.add("67");
		answer67.add("D");
		answers.put(67, answer67);
		
		answer68.add("68");
		answer68.add("D");
		answers.put(68, answer68);
		
		answer69.add("69");
		answer69.add("D");
		answers.put(69, answer69);
		
		answer70.add("70");
		answer70.add("A");
		answer70.add("B");
		answer70.add("C");
		answers.put(70, answer70);
		
		answer71.add("71");
		answer71.add("A");
		answers.put(71, answer71);
		
		answer72.add("72");
		answer72.add("A");
		answers.put(72, answer72);
		
		answer73.add("73");
		answer73.add("C");
		answers.put(73, answer73);
		
		answer74.add("74");
		answer74.add("B");
		answer74.add("D");
		answers.put(74, answer74);
		
		answer75.add("75");
		answer75.add("D");
		answers.put(75, answer75);
		
		answer76.add("76");
		answer76.add("B");
		answers.put(76, answer76);
		
		answer77.add("77");
		answer77.add("D");
		answer77.add("E");
		answers.put(77, answer77);

		answer = answers.get(questionNumber);

		int totalAnswers = answer.size();

		if (totalAnswers == 1) {

			if (answersUser.get(questionNumber) == answer.get(questionNumber)) {
				setSuccess(getSuccess() + 1);
				return true;
			} else {
				setFails(getFails() + 1);
				return false;
			}

		} else {

			Collections.sort(answersUser);
			Collections.sort(answer);
			if (answersUser.equals(answer)) {
				setSuccess(getSuccess() + 1);
				return true;
			} else {
				setFails(getFails() + 1);
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
		String image = imgNumber + ".jpg";
		img.setImgNumber(image);

	}

	@Override
	public int getTier() {
		return tier;
	}

	@Override
	public void setTier(int tier) {
		this.tier = tier + 1;

	}

}
