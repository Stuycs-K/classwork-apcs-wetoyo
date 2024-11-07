// It didn't change anything
// The getName for the Animal class remaned the same, and Bird calls speak from the Animal superclas
// This caused the change for getName in the Bird class to not affect its speak method. 
// The first two work as Bird inherits Animal
// The third doesnt work as the Animal class does not contain Bird
// The fourth works as the Bird class contains Animal
public class Driver {
  public static void main(String[] args) {
    Animal cat = new Animal("meow", 2, "Mittens");
    cat.speak();

    Bird b1 = new Bird("chirp", 4, "Ari", 3, "blue");
    b1.speak();
  }
}
