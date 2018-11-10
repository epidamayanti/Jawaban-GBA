package bootcamp;

import java.util.ArrayList;
import java.util.Scanner;

public class cekusername {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner input = new Scanner(System.in);
  
  ArrayList<Character> karakter = new ArrayList<>();
  String username;
  
  do {
	  System.out.println("Masukkan Username: ");
	  username = input.nextLine();
	  
	  if(username.length() != 8)
		  System.out.println("Panjang karakter harus 8! ");
	  
  }while(username.length() != 8);
  
  
  for(int i = 0; i < username.length(); i++) {
	  karakter.add(username.charAt(i));
  }
  
  String status = "";
  
  for(int i = 0; i < 5; i++) {
	   if(karakter.get(i) > 97 && karakter.get(i) < 122) {
		   	status="valid";
	   }
  }
  
  if(status.equals("valid")) {
   int sumValid = 0;
	   if(karakter.get(5) == '_' || karakter.get(5) == '.') {
		    int j = 6;
		    for(int i = 0; i < 2; i++) {
			     if(karakter.get(j) >= 65 && karakter.get(j) < 91) {
			      	sumValid++;
			     }
		     j++;
		}
   }
	   
   if(sumValid == 2) {
	   System.out.println("Valid");
   }
   else {
	   System.out.println("Tidak Valid");
   }
   
  } else {
	  System.out.println("Tidak Valid");
  }
  
 }
}
