public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("The area of your circle is : " +area(-2));
        System.out.println("The area of your rectangle is: " +(area(3, 4)));

    }

    public static double area(double radius){

        double PI =3.14159;

        if(radius <0){
            return -1;
        }
        return(radius*radius*PI);
    }

    public static double area(double x, double y){

        if(x <0 || y<0 ){
            return -1;
        }
        return x*y;
    }}
