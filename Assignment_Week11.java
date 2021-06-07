public class Assignment_Week11{
    public static void main(String[] args) {
    PoliceCar cars[];
  }
    interface Vehicle{
        String name = "";
        int maxPassengers = 5;
        int maxSpeed = 200;
        
    }
    interface LandVehicle extends Vehicle{
        int numWheels =4;
        public void drive();
    }
    
    interface SeaVehicle extends  Vehicle{
        int displacement = 0;
        public void launch();
    }
    
    class Jeep implements  LandVehicle{
        public void soundHorn(){
    }
    
        @Override
        public void drive() {
        }
    }
    class Hovercraft implements LandVehicle,SeaVehicle{
        public void enterLand(){
    }
        public void enterSea(){
        }
        @Override
        public void launch() {
            
        }
        @Override
        public void drive() {
            
        }
    }
    class Frigate implements SeaVehicle{
        public void fireGun(){
    }
    
        @Override
        public void launch() {
            
        }
    }
    interface IsEmergancy {
        public void soundSiren();
                
    }
    class PoliceCar implements IsEmergancy,LandVehicle {
        @Override
        public void drive() {
            System.out.print("Patrol");
        }
    
        @Override
        public void soundSiren() {
            System.out.print("*Siren sound*");
            
        }
        public void Dispatch() {
            System.out.print("Roger That.Dispatch.");
        
        }
        int carNo = 1000;
    }
    }