interface Car{
    public static void main(String[] args){
        Car c1 = new Car() {
            public void drive(){
                System.out.println("Driving BMW");
            }
        };
        //c1.drive();
        Audi a = new Audi();
        a.drive();
    }
}
class Audi implements Car{
    public void drive(){
        System.out.println("Driving Audi");
    }
}