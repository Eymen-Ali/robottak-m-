public class dersler {
String odev;
String girenhoca;
int yazilinotu;
int sozlunotu;
String ad;


public dersler( String odev, String girenhoca, int yazilinotu, int sozlunotu, String ad){
    this.odev = odev;
    this.girenhoca=girenhoca;
    this.yazilinotu=yazilinotu;
    this.sozlunotu=sozlunotu;
    this.ad=ad;
}
public String toString(){return odev+" " + girenhoca+" "+yazilinotu+" "+sozlunotu+" "+ad; }

}


