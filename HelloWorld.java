public class HelloWorld {
    private String greeting = "Hello, World!";
    public HelloWorld(String greeting)
    {
        this.greeting = greeting;
    }

    public void getGreeting(){
        System.out.println(greeting);
    }
    
    public static void main (String args[])
    {
        HelloWorld helloWorld = new HelloWorld("Hi");
        helloWorld.getGreeting();
    } 
}