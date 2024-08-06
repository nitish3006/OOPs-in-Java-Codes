class TypeCasting1{
    static public void main(String [] s){
        int a=14;
        double b=a;//Implicit TypeCasting (Widening or Upcasting)
        System.out.println(a); 
        System.out.println(b); 

        double x=14.2;
        //int y=x;//error
        int y=(int)x;//Explicit TypeCasting (Narrowing or Downcasting)
        System.out.println(x); 
        System.out.println(y); 
    }
}