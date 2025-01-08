/*Wall painter function to determine buckets needed to paint walls with 2 coats*/
public class Main {
    // Calculates the number of paint buckets needed for a given wall length
    private int calculateNumberOfBucketsRequired(int wallLength){
        int numBuckets;
        wallLength=wallLength*2;
        numBuckets=wallLength/100;
        if (wallLength%100!=0)
            numBuckets=numBuckets+1;
        return numBuckets;

    }
    public static void wallPainter(){
        Main obj = new Main();

        int wallLength, numBuckets;
        wallLength=700;
        numBuckets=obj.calculateNumberOfBucketsRequired(700);
        System.out.println(numBuckets + " is the total paint required for wallLength"+wallLength);

        wallLength=2950;
        numBuckets= obj.calculateNumberOfBucketsRequired(2950);
        System.out.println(numBuckets + " is the total paint required for wallLength"+wallLength);

        wallLength=462;
        numBuckets=obj.calculateNumberOfBucketsRequired(462);
        System.out.println(numBuckets + " is the total paint required for wallLength"+wallLength);

    }


    public static void main(String[] args) {
        wallPainter();

    }
}


