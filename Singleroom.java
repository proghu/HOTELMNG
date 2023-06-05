package HotellSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;



public class Singleroom implements Serializable{
	  String name;
	    String contact;
	    String gender;   
	    ArrayList<Food> food =new ArrayList<>();

	   
	    Singleroom()
	    {
	        this.name="";
	    }
	    Singleroom(String name,String contact,String gender)
	    {
	        this.name=name;
	        this.contact=contact;
	        this.gender=gender;
	    }
	}
class Doubleroom extends Singleroom implements Serializable
{ 
  String name2;
  String contact2;
  String gender2;  
  
  Doubleroom()
  {
      this.name="";
      this.name2="";
  }
  Doubleroom(String name,String contact,String gender,String name2,String contact2,String gender2)
  {
      this.name=name;
      this.contact=contact;
      this.gender=gender;
      this.name2=name2;
      this.contact2=contact2;
      this.gender2=gender2;
  }
}

class holder implements Serializable
{
  Doubleroom luxury_doublerrom[]=new Doubleroom[10]; //Luxury
  Doubleroom deluxe_doublerrom[]=new Doubleroom[20]; //Deluxe
  Singleroom luxury_singleerrom[]=new Singleroom[10]; //Luxury
  Singleroom deluxe_singleerrom[]=new Singleroom[20]; //Deluxe
}
