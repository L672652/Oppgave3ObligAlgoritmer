public class linearSearch {
    linearSearch(){};
    public static boolean linersok(int[] samling, int nokkel){
        for(int i=0;i< samling.length;i++){
            if(samling[i]==nokkel){
                return  true;
            }
            if(samling[i]>nokkel){
                return false;
            }

        }
    return false;
    }
    public static boolean usortertLinersok(int[] samling, int nokkel){
        for(int i=0;i< samling.length;i++){
            if(samling[i]==nokkel){
                return true;
            }

        }
        return false;
    }
}
