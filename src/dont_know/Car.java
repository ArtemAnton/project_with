package dont_know;

public class Car {
    String model;
    Integer maxSpeed;
    public Car(String model, Integer maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        System.out.println("создали лексус");
    }
    public Car(String model){
        this.model = model;
    }
    public void main(String[] args){
        Car lexus = new Car("rx350");
        System.out.println("а первый конструктор то пососал!");
    }
    public void gas(){
        System.out.println("нажимаю на педаль");
    }
    public void brake(){
        System.out.println("нажимаю тормаз");
    }
}

