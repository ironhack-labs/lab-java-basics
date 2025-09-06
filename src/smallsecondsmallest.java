public class smallsecondsmallest {
    public static void main(String[] args) {
        int[] numm ={100,200,34,234,123,342};
        int minn = numm[0];
        for (int i = 1; i < numm.length ; i++) {
            if (numm[i] < minn) {
                minn = numm[i];
            }
        }
        int secMin= Integer.MAX_VALUE;
        for (int i = 0; i < numm.length; i++) {
            if (numm[i]>secMin){
                secMin=numm[i];
            }
        }

        System.out.println("smallest number:"+ minn);
        System.out.println("second smallest number"+ secMin);

    }
}
