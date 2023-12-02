import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map.Entry;

import json.JSONException;
import json.JSONFactory;
import json.JSONObject;
import json.JSONParser;
import json.JSONValue;

public class Driver {

	/**
	 * Prints details about a student, by extracting the property members from a given {@link JSONObject}.
	 * 
	 * @param id the ID of the student
	 * @param properties the {@link JSONObject} containing the properties of the student
	 * @throws JSONException if the given JSON object does not contain the expected property member.
	 */
	private static void printStudentDetails(String id, JSONObject properties) throws JSONException {
		
		System.out.println("\n--------------");
		System.out.println("ID : " + id +"\n");
		
		String name = properties.getMember("name").asString();
		String course = properties.getMember("course").asString();
		int year = properties.getMember("year").asInteger();
		double average = properties.getMember("average").asDouble();
		String uni = properties.getMember("university").asString();
		
		System.out.println("The student name is " + name + ", and they are studying " + course);
		System.out.println("They are currently studying year " + year);
		System.out.println("The average mark is " + average);
		System.out.println("The university they attend is " + uni);
		
		if ( properties.getMember("enrolled").asBoolean() == false ) {
			System.out.println("NOTE: THEY ARE NOT CURRENTLY ENROLLED");
		}
		if ( properties.hasBooleanMember("suspended") ) {
			System.out.println("WARNING: this student has been suspended");
		}
	}
	private static void printModuleDetails(String id, JSONObject properties) throws JSONException {
		
		System.out.println("\n--------------");
		System.out.println("ID : " + id +"\n");
		
		String name = properties.getMember("name").asString();
		int level = properties.getMember("level").asInteger();
		String tutor = properties.getMember("tutor").asString();
		
		System.out.println("The module name is " + name + ", delivered on level " + level);
		System.out.println("Taught by " + tutor);
		
		if (properties.hasMember("students"))	{ // check if 'students' member present before access!
			int studentCount = properties.getMember("students").asInteger();
			System.out.println("The number of students is " + studentCount);
		}
		else {
			
			System.out.println("The number of students is unknown");
		}
		
		if ( properties.getMember("running").asBoolean() == false ) {
			System.out.println("NOTE: this module is not currently running");
		}
	}
	
	
	/////////////////////////////////////////////
	
	private static void generateJSON() throws FileNotFoundException {
		
		// TODO: populate this method for task 4
		JSONObject rootObj = JSONFactory.createObject();// create the root object
		JSONObject book = JSONFactory.createObject(); // create a new book object
		rootObj.addMember("0 7506 5545 3", book);// add the book to the root object
		book.addMember("title", "Electronics : A first Course");
		book.addMember("author", "Owen Bishop");
		book.addMember("year", 2002);
		book.addMember("in print", false);

		book = JSONFactory.createObject();	// create a new book object
		rootObj.addMember("978-0133370461", book);	// add the book to the root object
		
		book.addMember("title", "Java Foundations");
		book.addMember("author", "John Lewis, Peter DePasquale, et al.");
		book.addMember("year", 2013);
		book.addMember("in print", true);
		book.addMember("publisher", "Pearson");
		book.addMember("edition",3);
		
		// another book for task 4
		book = JSONFactory.createObject();	// create a new book object
		rootObj.addMember("978-1661846282", book);	// add the book to the root object
		
		book.addMember("title", "The Computer Programming Bible");
		book.addMember("author", "C.P.A Inc");
		book.addMember("year", 2020);
		book.addMember("in print", true);
		book.addMember("publisher", "Independent");
		book.addMember("edition",1);
		PrintWriter writer = new PrintWriter("books.json");
		writer.print(rootObj);
		writer.close();

	}
	
	/////////////////////////////////////////////
	
	public static void main(String[] args) {

		try {
			// parse the JSON file, this returns a JSONValue object which represents an internal representation of the parsed data
			JSONValue value = JSONParser.parseFile("student_info.json");

			// get the JSON value, converted to a JSONObject, allowing extraction of the properties
			JSONObject rootObj = value.asObject();

			// loop over each JSONObject available
			for (Entry<String, JSONValue> next : rootObj) {

				// print the student details present in the next JSON object
				printStudentDetails(next.getKey(), next.getValue().asObject());
			}

			////////////////////////////////////////////////////////

			// Add code for Task 3 here (parsing module_info.json file).
			
			JSONValue val=JSONParser.parseFile("module_info.json");
			JSONObject rootObject = val.asObject();
			for(Entry<String,JSONValue> next : rootObject) {
				printModuleDetails(next.getKey(), next.getValue().asObject());
			}
			
			////////////////////////////////////////////////////////
			
			generateJSON();	// do not remove: Used for Task 4
			
		} catch (IOException e) {

			System.err.println("I/O Error : " + e.getMessage());
			
		} catch (JSONException e) {

			System.err.println("Parse Error : " + e.getMessage());
		}

	}

}
