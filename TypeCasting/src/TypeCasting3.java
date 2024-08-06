class TypeCasting3{
    static public void main(String [] s){
        System.out.println(10);//Integer Literal is by default int 
        System.out.println(10.2); //FloatingPoint Literal is by default double 
        //float a=6.2;//error
        //float a=(float)6.2;//allowed
        //float a=6.2f;//allowed
        float a=6.2F;//allowed
        System.out.println(a);

        //double b=6.2;//allowed
        //double b=6.2d;//allowed
        double b=6.2D;//allowed
        System.out.println(b);

        //long x=200;//allowed
        //long x=20000000000;//error
        long x=20000000000L;
        System.out.println(x);
    }
}