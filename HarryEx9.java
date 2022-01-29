// Repeat problem 4 for a circle.


// Question 1. Create a class Employee with the following properties and methods:
// Salary (property) (int)
// getSalary (method returning int)
// name (property) (String)
// getName (method returning String)
// setName (method changing name)


// class Employee{
       
//     int salary;
//     String name;

//     public int getSalary(){
//         return salary;
//     }

//     public String getName(){
//         return name;
//     }

//     public void setName(String n){
//         name = n;
//     }    
//    }

// Question 2. Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.

//    class CellPhone{
//        public void ringing()
//        {
//            System.out.println("Ringing...");
//        }

//        public void vibrating()
//        {
//            System.out.println("Vibrating...");
//        }
//        public void callFriend()
//        {
//            System.out.println("Calling Deyvant!");
//        }
//    }



// public class HarryEx9{
//     public static void main(String[] args){
//         Employee emp = new Employee();
//         emp.setName("Code_With_Harry");
//         System.out.println(emp.getName());
//         emp.salary = 233;
        
//         System.out.println(emp.getSalary());


//         CellPhone cell = new CellPhone();
//         cell.callFriend();
//         cell.vibrating();
//         cell.ringing();
//     }
// {


// }

//}

// Question 3. Create a class Square with a method to initialize its side, calculating area, perimeter etc.

// class Rectangle{
//     int side;
//     public int getPerimeter(){
//         return side*4;
//     }

//     public int getArea(){
//         return side^2;
//     }
// }


// public class HarryEx9{
    
// public static void main(String[] args) {
//     Rectangle s = new Rectangle();

    
//     s.getPerimeter();
//     s.getArea();
//     System.out.println("Perimeter of the side ")
// }


// Question 4. Create a class Rectangle & problem 3.

// class Square{
//     int length, breadth;

//     public int getPerimeter()
//     {
//         return 2*(length+breadth);
//     }

//     public int getArea()
//     {
//         return (length*breadth);
//     }

// }

// public class HarryEx9{
//     public static void main(String[] args) {
//         Square sc = new Square();

//         sc.length = 10;
//         sc.breadth = 20;

//         System.out.print("Perimeter: " + sc.getPerimeter());
        
//         System.out.print("Area: " + sc.getArea());
        
//     }
// }



// Question 5. Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.


class TommyVecetti{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }

}

public class HarryEx9{
    public static void main(String[] args) {

        TommyVecetti tv = new TommyVecetti();

        tv.hit();
        tv.run();
        tv.fire();
        
    }
}