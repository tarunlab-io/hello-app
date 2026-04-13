public class UC4_HelloMultipleNames {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello World");
            return;
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("Hello " + args[i]);
        }
    }
}
