 public class ArrayDb {
    int[] ad;
    public ArrayDb(int[] ad) {
        //TODO Auto-generated constructor stub
        this.ad=ad;
    }
    public int sum(){
        int sum=0;
        for (int i = 0; i < ad.length; i++) {
            sum = sum+ad[i];
        }
        return sum;
    }
    public int min(){
        int min = ad[0];
        for (int i = 0; i < ad.length; i++) {
            if (ad[i] < min) {
                min = ad[i];
            }
        }
        return min;
    }
    public int max(){
        int max = ad[0];
        for (int i = 0; i < ad.length; i++) {
            max = ad[i];
        }
        return max;
    }
    public double avg(){
        int sum = sum();
        double avg = (double)sum/ad.length;
        return avg;
    }
    public static void main(String[] args) {
       int ad[] = {1,2,5,6};
        ArrayDb db = new ArrayDb(ad);
        System.out.println("Sum:"+db.sum());
        System.out.println("Minimum:"+db.min());
        System.out.println("Maximum:"+db.max());
        System.out.println("Average:"+db.avg());
    }
}
   


