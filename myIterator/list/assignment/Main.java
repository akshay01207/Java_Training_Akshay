import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        System.out.println("*****Welcome to ABC Company******");
        System.out.println("#####Register Yourself");
        String name,email, add;
        int mobile;
        System.out.println("\n please enter Your Name");
        name=sc.next();
        System.out.println("\n please enter Your address");
        add=sc.next();
        System.out.println("\n please enter Your phone number");
        mobile=sc.nextInt();
        System.out.println("=======Registration Successful========");
        UserDetails obj=new UserDetails(name,email, add, mobile);
        System.out.println("\n \n LoGin Details");
//        System.out.println(obj.getName()+"\n  enter "+obj.getAddress());
        System.out.println("\n  enter the otp sent on "+obj.getMobile());
        int otp=sc.nextInt();
        System.out.println("=======LOGIN Successful========");
        System.out.println("\n Search Restraunt by entering Longitude and Latitude");
        int latitude=sc.nextInt();    
        int longitude=sc.nextInt();
        Restaurant res=new Restaurant();
        int radius=res.getRadius();
        System.out.println("hii!"+obj.getName());
        System.out.println("*****Searching the restraunts in 1.5Km area near you " );
        List list=res.restraunt();
        if(radius>5) {
             Iterator<String> iter=list.iterator();
                while(iter.hasNext()) {
                    System.out.println(iter.next()+" ");
                }
        }else {
            System.out.println("the Restraunts are less than 5 so extending the area to 2.5 km");
             Iterator<String> iter=list.iterator();
                while(iter.hasNext()) {
                    System.out.println(iter.next()+" ");
                }
        }
    }