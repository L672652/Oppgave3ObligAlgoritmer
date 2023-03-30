public class binarySearch {

    binarySearch(){

    };
    public boolean binersok(int[] samling, int forst, int sist, int nokkel){
        int midten=(forst+sist)/2;
        while(forst<=sist){
            if(samling[midten]<nokkel){
                forst = midten+1;
            }
            else if (samling[midten]==nokkel){
                return true;
            }
            else{
                sist = midten-1;
            }
            midten=(forst+sist)/2;
        }
        return false;
    }

}
