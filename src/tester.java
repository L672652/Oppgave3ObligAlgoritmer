import org.junit.Assert;
import org.junit.Test;

public class tester {
    linearSearch l= new linearSearch();
    binarySearch b=new binarySearch();

    int[] sortertTabell={1,4,6,7,9,12};
    int[] usortertTabell={1,4,6,12,9,7};

    int[] annenSortertTabell={1,3,5,6,10,16,18};

    int topp=sortertTabell.length-1;
    int annenTopp=annenSortertTabell.length-1;


    @Test
    public void sortertLinerTestErDer(){
        Assert.assertTrue(l.linersok(sortertTabell,4));
    }
    @Test
    public void sortedLinerTestIkkeDer(){
        Assert.assertFalse(l.linersok(sortertTabell,8));
    }
    @Test
    public void usortertLinerTestErDer(){
        Assert.assertTrue(l.usortertLinersok(usortertTabell,9));
    }
    @Test
    public void usortertLinerTestIkkeDer(){
        Assert.assertFalse(l.usortertLinersok(usortertTabell,13));
    }
    @Test
    public void binerSokErDer(){
        Assert.assertTrue(b.binersok(sortertTabell,0,topp,6));
    }
    @Test
    public void binerSokIkkeDer(){
        Assert.assertFalse(b.binersok(sortertTabell,0,topp,14));
    }

    @Test
    public void annenBinerSokErDer(){
        Assert.assertTrue(b.binersok(annenSortertTabell,0,annenTopp,6));
    }


}
