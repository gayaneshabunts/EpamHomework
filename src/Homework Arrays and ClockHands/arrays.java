public class arrays {
    public static void main(String[] args) {
        double [] a = {-1,5,8,0,-11};
        double [] b = new double[5];
        int i =0;
        if (a[0]>0){
            b[i]=a[0];
        i++;}
        if (a[1]>0){
            b[i]=a[1];
            i++;
        }
        if (a[2]>0) {
            b[i] = a[2];
            i++;
        }
        if (a[3]>0){
            b[i] =a[3];
            i++;
        }
        if (a[4]>0) {
            b[i] = a[4];
        }
            System.out.println("[" + b[0] +"," + b[1] + "," + b[2] + "," + b[3] + "," + b[4] + "]");

    }
}
