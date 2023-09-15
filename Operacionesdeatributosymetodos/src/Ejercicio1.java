public class Ejercicio1 {
//atributos de la clase    
   double a;
    float b;
    int c;
    char d;
    double resultado=0;
    
//métodos de la clase
    void setA(double a1){
         a=a1;
    }
    void setB(float a2){
        b=a2;
        
    }
    void setC(int a3){
        c=a3;
        
    }
    
   double getA(){
         return a;
    }
   double getB(){
         return b;
    }
   double getC(){
         return c;
    }
  
     public static void main(String [] args) {
            Ejercicio1   objs=new Ejercicio1();
            Ejercicio1   objs1=new Ejercicio1();
            Ejercicio1   objs2=new Ejercicio1();
            Ejercicio1   objs3=new Ejercicio1();
            
          
        objs.setA(15.8);
        objs1.setB(10);
        objs2.setC(24);
     
        System.out.println("el valor de a es " +objs.getA()+" y el valor de b es "+objs1.getB()+" y el de c es "+objs2.getC());
        System.out.println("LA SUMA DE LOS 3 ATRIBUTOS ES "+(objs.getA()+objs1.getB()+objs2.getC()));
        System.out.println("LA RESTA DE LOS 3 ATRIBUTOS ES "+(objs.getA()-objs1.getB()-objs2.getC()));
        System.out.println("LA MULTIPLICACION DE LOS 3 ATRIBUTOS ES "+(objs.getA()*objs1.getB()*objs2.getC()));
        System.out.println("LA DIVISION DE LOS 3 ATRIBUTOS ES "+(objs.getA()/objs1.getB()/objs2.getC()));
    }
}
