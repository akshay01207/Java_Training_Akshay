package basicPrograms;

public class StaticVar {
	final static String company = "BhavnaCorp";
    String name;
    long rollno;
    
  public static void main(String[] args)
    {
        StaticVar ob = new StaticVar();
  
//        ob.company = "BhavnaCorp India";
  
        ob.name = "Akshay";
        ob.rollno = 915;
        System.out.println(ob.company);
        System.out.println(ob.name);
        System.out.println(ob.rollno);
    }
}


