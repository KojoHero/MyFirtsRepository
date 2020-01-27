package org.amalitech.javarecap;

import java.util.Scanner;

public class JosWheel  {
static Scanner kybd_inpt = new Scanner(System.in);

public static void main(String [] args) {
System.out.println("Enter 'Start' to Begin");

re_run();
} 
public static void re_run() {
boolean program_running_bool = true;

String code_trigger_starter_str="start";
String code_trigger_ender_str="end";
String kybd_inpt_str = kybd_inpt.nextLine();

	if (kybd_inpt_str.equalsIgnoreCase(code_trigger_starter_str)) {

			System.out.println("Enter word and it will repeat it");
			System.out.println("");
			System.out.println("When done, Enter 'end' to stop program running");

		while  (program_running_bool == true) {
String rpt_wrd = kybd_inpt.nextLine();
            //System.out.println(rpt_wrd);

   if(rpt_wrd.equalsIgnoreCase(code_trigger_ender_str)) {
       program_running_bool=false;
            System.out.println("program just ended");
            //break;
            System.exit(0);

} System.out.println(rpt_wrd);
} }
  if(kybd_inpt_str.equalsIgnoreCase(code_trigger_ender_str)) {

System.out.println("You have not started");
System.out.println("Enter 'Start' to begin the program");
re_run();

} else {
System.out.println("please reset");
re_run();
}} } 

