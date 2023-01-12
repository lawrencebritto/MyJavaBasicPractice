import java.util.*;
class SampleException extends Exception{
   String str1;
   SampleException(String str2) {
	str1=str2;
   }
   public String toString(){ 
	return ("SampleException Occurred: "+str1) ;
   }
}
