public class BmiService {
    public int calculate(int weight, int height) {
        int imt = weight * (height * height) / 100000;
        return imt;
    }

}




