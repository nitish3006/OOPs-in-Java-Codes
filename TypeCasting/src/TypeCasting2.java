class TypeCasting2{
    static public void main(String [] s){
        char a='h';
        int b=a;//Implicit TypeCasting (Widening or Upcasting)
        System.out.println(a); 
        System.out.println(b); 

        int x=104;
        //char y=x;//error
        char y=(char)x;//Explicit TypeCasting (Narrowing or Downcasting)
        System.out.println(x); 
        System.out.println(y); 
    }
}