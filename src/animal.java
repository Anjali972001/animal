public class animal {
    public void eat(){
        System.out.println("I am eating .");
    }

    public static void main(String[] args) {
        System.out.println("1");
        animal dog = new animal ();
        // creating the object dog.
        dog.eat();
        // calling the method eat with the help object dog using (.)operator
    }

    
}
        // output : 1 and I am eating . firstly it will search main method and run it then
          // it will create an object and call the method and perform the task.