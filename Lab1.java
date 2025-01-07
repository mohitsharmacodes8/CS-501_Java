
public class Main {
    public static void WallPainter(){
        int Walllength, numbuckets;
        Walllength=700;
        //for 2 coats
        Walllength=Walllength*2;

        numbuckets=Walllength/100;
        if (Walllength%100!=0)
                numbuckets=numbuckets+1;
        System.out.println(numbuckets + " is the total paint required for walllength:"+Walllength);

        int Walllength2;
        Walllength2=2950;
        Walllength2=Walllength2*2;
        numbuckets=Walllength2/100;
        if(Walllength2%100!=0)
            numbuckets=numbuckets+1;
        System.out.println(numbuckets + " is the total paint required for Walllength"+Walllength2);

        int Walllength3;
        Walllength3=462;
        Walllength3=Walllength3*2;
        numbuckets=Walllength3/100;
        if(Walllength3%100!=0)
            numbuckets=numbuckets+1;
        System.out.println(numbuckets + " is the total paint required for Walllength"+Walllength3);

    }
    public static void main(String[] args) {
        WallPainter();
    }
}
