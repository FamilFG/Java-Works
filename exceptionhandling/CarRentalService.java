package exceptionhandling;

public class CarRentalService {
    String[] cars = {"bmw", "mercedes", "chevrolet", "mclaren"};

    public void rentCar(String model) throws CarNotAvailableException, AllCarsBusyException {
        boolean isAvailable = true;
        for (String car : cars) {
            if (car.equals(model)) {
                if (isAvailable) {
                    isAvailable = false;
                    System.out.println("Car Rental Successful");
                }
                else {
                    throw new AllCarsBusyException("All Cars Are Busy");
                }
            }
            else {
                throw new CarNotAvailableException("Car Not Available");
            }
        }
    }
}
