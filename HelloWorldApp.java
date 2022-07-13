package main;

public class HelloWorldApp {
    private static String helloWorldApp;

    public HelloWorldApp(String helloWorldApp) {
        this.helloWorldApp = helloWorldApp;
    }

    public String HelloWorldApp(String helloWorldApp) {
        return HelloWorldApp.getHelloWorldApp();
    }

    public String printOut(String helloWorldApp){
        return helloWorldApp.valueOf(HelloWorldApp(helloWorldApp));
    }
    public static String getHelloWorldApp() {
        helloWorldApp.toString();
        return helloWorldApp;
    }


     public void setHelloWorldApp(String helloWorldApp) {
     this.helloWorldApp = helloWorldApp;
     }


    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        HelloWorldApp helloWorldApp = new HelloWorldApp("Hello World!");
//        helloWorldApp1.setHelloWorldApp("Hello World!");

        Object printOutHelloWorld = new Object();
        helloWorldApp.printOut(("Hello World!"));

        System.out.println(helloWorldApp.printOut(("Hello World!")));
    }


}
