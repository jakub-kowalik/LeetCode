package leetcode.DesignParkingSystem;

class ParkingSystem {
    int big, medium, small;

    int bigNumber, mediumNumber, smallNumber = 0;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (bigNumber < big) {
                    bigNumber++;
                    return true;
                } else {
                    return false;
                }
            case 2:
                if (mediumNumber < medium) {
                    mediumNumber++;
                    return true;
                } else {
                    return false;
                }
            case 3:
                if (smallNumber < small) {
                    smallNumber++;
                    return true;
                } else {
                    return false;
                }
            default:
                return false;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
