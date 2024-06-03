package Intermedios.Ejercicio2;

public class Main {
  public static void main(String[] args) {
    Tree tree1 = new Tree("tree one" ,4.5, true, "warm", "normal", "solid", 0.7, "brown", "normal");
    Flower flower1 = new Flower("flower one" ,4.5, true, "warm", "normal", 5.2, "green", "rose", "spring");
    Bush bush1 = new Bush("bush one" ,4.5, true, "warm", 4.5, true, "domestinc", "brown", true);

    tree1.sayHi();
    flower1.sayHi();
    bush1.sayHi();
  }
}
