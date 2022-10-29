public class Activity2 {

    public boolean Activity(){
        int sum=0;
        int[] array1 = {10, 77, 10, 54, -11, 10};
        for(int i=0;i<array1.length;i++){
            if (array1[i]==10){
                sum+=array1[i];


            }

        }
        if(sum==30)
            return true;
        else
            return false;




    }


}
