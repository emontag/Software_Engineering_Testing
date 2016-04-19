//Ephraim Montag

import java.io.*;
public class Tester {
   static MyException exception=null;
   static OC oc=new OC();
   static IC ic=new IC();

   public static void main(String[] args) {
      try {
         BufferedReader bf=new BufferedReader(new FileReader(args[0]));
         String line="";
         while(line!=null){
            try{
               line=bf.readLine();
              // System.out.println(line);
               if(line==null) return;
               if(line.startsWith("0")) continue;
               String[] split=line.split("([:]|\\s)");
               int classNumber=Integer.parseInt(split[0]);
               String className=split[1];
               int number=Integer.parseInt(split[2]);
               String methodName=split[3];
               //arguments 4 and up
               switch(classNumber){
               case 1:{
                  if(number==1){
                     System.out.println("Creating a MyException with no arguments");
                     exception=new MyException();
                     System.out.println("Created myException");
                  }
                  else if(number==2){
                     System.out.println("Creating a MyException with string argument");
                     exception=new MyException(split[4]);
                     System.out.println("Created myException");
                  }
                  break;
               }
               case 2:{
                  if(number==1){
                     ic.ICfunc(Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]));
                  }
                  else if(number==2){
                     ic.CompareFunc(Integer.parseInt(split[4]));
                  }
                  break;
               }
               case 3:{
                  if(number==1){
                     oc.OCinit();
                  }
                  else if (number==2){
                     oc.OCfunc(Integer.parseInt(split[4]), Integer.parseInt(split[5]));
                  }
                  break;
               }
               default:{
                  break;
               }
                     
               
               }
            }catch(Exception e){
               System.err.println(e);
            }
         }
            
      } catch (FileNotFoundException er) {
         System.err.println(er);
      }

   }

}
