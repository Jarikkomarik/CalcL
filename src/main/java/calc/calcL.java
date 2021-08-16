package calc;
import java.util.Scanner;

public class calcL {
    public static void main (String []args){
        //Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to calculator");         //Welcome
        System.out.println("--------ver2.0-------");
        
        double result=0;                                     //Updateble result value  
        
        System.out.println();                                //getting first value
        System.out.print("Enter value              -->");
        double FistOperand=getDouble();
        System.out.println("");
        int i=0;
        while(true){                                         //Operational loop (to operate with result value)         
        System.out.print("chooseOperation (+,-,*,/)-->");
        String operation=getOperation();                     //getting second value
        System.out.println("");
        
        System.out.print("Enter value              -->");
        double nextOperand=getDouble();
        
         switch(operation){                                 //Choosing operaion 
            
            
            case "+":                                       //plus calculation
                if(i==0){                                   //first step with 2 values
                result=FistOperand+nextOperand;
                i++;}
                else{                                       //second step with result and another value
                result+=nextOperand;
                }
                break;
                
            case "-":                                        //minus
                if(i==0){
                result=FistOperand-nextOperand;
                i++;}
                else{
                result-=nextOperand;
                }
                break;
                
            case "*":                                        //multiply
                if(i==0){
                result=FistOperand*nextOperand;
                i++;}
                else{
                result*=nextOperand;
                }
                break;
               
                
                
            case "/":                                         //devide
                if(i==0){
                result=FistOperand/nextOperand;
                i++;}
                else{
                result/=nextOperand;
                }
                break;
        }       
        System.out.println("Result: "+result);  
        
        System.out.println("press Q to quit");                //Offering to quit or continue
        System.out.print("or Any key to continue   -->");
        if(Quit()){break;}
    }    
    }
    
    static boolean Quit(){                                                      //method that stops program
           Scanner f=new Scanner(System.in);
           String s=f.nextLine();
           if(s.equals("q")||s.equals("Q")){
           return true; }
           else{
           return false;
           }
    }
    
    
    
    
    static String getOperation(){                                               //method that returns operation
    String operation=null;        
            while(true){
            Scanner f=new Scanner(System.in);
            operation=f.nextLine();
                 if(!(operation.equals("+")||operation.equals("-")||operation.equals("*")||operation.equals("/"))){
                     System.out.print("please choose one operation (+,-,*,/)-->");}
                 else{break;}
                 }
            return operation;
    }
    
    static double getDouble(){                                                  //method that returns numeric value
    double inputDouble=0;
    while(true){
                try{
                    Scanner f=new Scanner(System.in);
               inputDouble=f.nextDouble();
                break;
                
                }
                catch(Exception e){
                    System.out.print("please use Number value-->");
                }
                }
    return inputDouble;
    }
        }
//test



