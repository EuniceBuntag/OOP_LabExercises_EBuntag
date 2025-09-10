public class Car {
    private String brand;
    private String color;
    private String plateNo;
    private String chassisNo;
    private String fuelType;

    public Car (){
        this.brand = "No Brand";
        this.color = "No Color";
        this.plateNo = "No Plate Number";
        this.chassisNo = "No Chassis Number Yet";
        this.fuelType = "No Fuel Type";
    }
    public Car (String brand, String color, String plateNo, String chassisNo, String fuelType){
        this.brand = brand;
        this.color = color;
        this.plateNo = plateNo;
        this.chassisNo = chassisNo;
        this.fuelType = fuelType;
    }
    public void displayInfo(){
        String info = "";
        info += "Brand: " + this.brand + "\n";
        info += "Color: " + this.color + "\n" ;
        info += "PlateNo: "  + this.plateNo + "\n";
        info += "ChassisNo: "  + this.chassisNo + "\n";
        info += "FuelType: "  + this.fuelType + "\n";
        System.out.println("-----------------------");
        System.out.print(info);
}
       
    public static void main (String[] args) {
            Car c1 = new Car("Ford", "Yellow", "KAW12345", "AB123", "Gasoline");
            Car c2 = new Car("Toyota", "Red", "XYZ5678", "CD456",  "Diesel");
            Car c3 = new Car("Honda", "Blue", "LMN9101", "EF789", "Hybrid");
            Car c4 = new Car("BMW", "Black", "QRS2345", "GH012", "Gasoline");
            Car c5 = new Car("Mitsubishi", "White", "TUV6789", "IJ345", "Electric");
            Car c6 = new Car("Chevrolet", "Silver", "CHE1234", "KL678", "Gasoline");
            Car c7 = new Car("Nissan", "Green", "NIS5678", "MN890", "Gasoline");
            Car c8 = new Car("Hyundai", "Orange", "HYU9101", "OP234", "Hybrid");
            Car c9 = new Car("Kia", "Brown", "KIA2345", "QR567", "Diesel");
            Car c10 = new Car("Mercedes", "Gray", "MER6789", "ST890",  "Gasoline");

    
    
            c1.displayInfo();
            c2.displayInfo();
            c3.displayInfo();
            c4.displayInfo();
            c5.displayInfo();
            c6.displayInfo();
            c7.displayInfo();
            c8.displayInfo();
            c9.displayInfo();
            c10.displayInfo();
        
        } 

    public String getBrand() {
        return brand;
    }
    }
 
