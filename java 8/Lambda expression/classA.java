public class classA{
    public static void main(String[] args){
        Audi a1 = new Audi();
        System.out.println(a1.getspeed());

        Car c1 = new Car(){
            public int getspeed(){
                System.out.println("Driving BMW");
                return 80;
            }
        };
        System.out.println(c1.getspeed());

        //Lambda expression with anonymous function
        Car c2 = () -> { 
            int speed = 100;
            System.out.println("Driving tata");
            System.out.println("Car is driving very smoothly at speed "+speed);
            if(speed>100)
                System.out.println("speed driving");
            else
                System.out.println("slow driving");
                return speed;   
        };
        System.out.println(c2.getspeed());
    }
}

class Audi implements Car{
    @Override
    public int getspeed(){
        System.out.println("Driving audi");
        return 50;
    }
}

@FunctionalInterface
interface Car{
    public int getspeed();
}