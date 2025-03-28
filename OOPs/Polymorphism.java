// package OOP;

// class Calculator {

//     // compile-time polymorphism  -- method overloading
//     int sum(int a, int b) {
//         return a+b;
//     }

//     float sum(float a, float b) {
//         return a+b;
//     }

//     int sum(int a, int b, int c) {
//         return a+b+c;
//     }
// }

// // run-time polymorphism  -- method overriding
// class Fruit {
//     void taste() {
//         System.out.println("sweet in taste");
//     }
// }

// class Mango extends Fruit {
//     void taste() {
//         System.out.println("sweet pulp");
//     }
// }

// public class Polymorphism {
//     public static void main(String[] args) {
//         // compile-time polymorphism  -- method overloading
//         Calculator c = new Calculator();

//         System.out.println(c.sum(2, 4));
//         System.out.println(c.sum(2.3f, 6.5f));
//         System.out.println(c.sum(2,3,4));

//         // run-time polymorphism  -- method overriding
//         Mango m = new Mango();
//         m.taste();
//     }
// }

