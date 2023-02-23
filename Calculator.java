public class Calculator {
    public static void main(String []args)
    {   
        int z=0;
        String str=args[1];
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[2]);

        if (str.equals("+")) {
            z = x+y;
        } else if (str.equals("-")){
            z = x-y;
        } else if (str.equals("*")){
            z = x*y;
        } else if (str.equals("/")){
            z = x/y;
        } else{
           System.out.println("Invalid operator");
        }
        System.out.println(z);
    }
}
