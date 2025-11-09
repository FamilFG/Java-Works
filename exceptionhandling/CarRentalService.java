//package exceptionhandling;
//
//import java.util.ArrayList;
//
//public class CarRentalService {
//    ArrayList<boolean> cars =  new ArrayList<>();
//
//    public void rentCar(String model) throws CarNotAvailableException, AllCarsBusyException {
//        boolean isAvailable = true;
//        for (String car : cars) {
//            if (car.equals(model)) {
//                if (isAvailable) {
//                    isAvailable = false;
//                    System.out.println("Car Rental Successful");
//                }
//                else {
//                    throw new AllCarsBusyException("All Cars Are Busy");
//                }
//            }
//            else {
//                throw new CarNotAvailableException("Car Not Available");
//            }
//        }
//    }
//}
