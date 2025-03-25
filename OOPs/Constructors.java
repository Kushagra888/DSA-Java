// package OOP;


// class Student {
//     String name;
//     int roll;
//     String password;
//     int marks[];

//     Student() {
//         marks = new int[3];
//         System.out.println("student created.");
//     }

//     // copy constructor
//     Student(Student s) {
//         marks = new int[3];
//         this.name = s.name;
//         this.roll = s.roll;
//         // shallow copy
//         // this.marks = s.marks;

//         // deep copy
//         for(int i=0; i<marks.length; i++) {
//             this.marks[i] = s.marks[i];
//         }
//     }
// }

// public class Constructors {
//     public static void main(String[] args) {
//         // Student s1 = new Student();
//         // Student s2 = new Student("kush");
//         // System.out.println(s2.name);

//         Student s1 = new Student();
//         s1.name = "kush";
//         s1.roll = 24;
//         s1.password = "pwsd";
//         s1.marks[0] = 76;
//         s1.marks[1] = 86;
//         s1.marks[2] = 96;

//         System.out.println("marks of s1: ");
//         System.out.println(s1.marks[0]);
//         System.out.println(s1.marks[1]);
//         System.out.println(s1.marks[2]);

//         System.out.println();


//         Student s2 = new Student(s1);
//         s2.password = "new paswed";

//         // changing marks of s1
//         s1.marks[0] = 100;

//         System.out.println(s2.name);
//         System.out.println(s2.roll);
//         System.out.println(s2.password);

//         System.out.println("marks of s2: ");
//         System.out.println(s2.marks[0]);
//         System.out.println(s2.marks[1]);
//         System.out.println(s2.marks[2]);

//         System.out.println();
//     }
// }