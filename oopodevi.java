public class oopodevi {
    dersler matematik = new dersler("ünitesoruları","murat hoca",90,85,"matematik");
    dersler edebiyat = new dersler("metin soruları","mustafa hoca",80,90,"edebiyat");
    dersler ingilizcewriting = new dersler("writing an essay","hülya hoca",90,75,"ingilizcewriting");
    dersler ingilizcelistening = new dersler("finding unknown words","nermin hoca",89,79,"ingilizcelistenig");
    dersler ingilzcemaincourse = new dersler("finishing the book","erman hoca",90,95,"ingilizcemaincourse");
    dersler bilisim = new dersler("ortalama hesaplayan kod","özgür hoca",100,60,"bilisim");
    dersler beden = new dersler("60 sayılık ritim","yılmaz hoca",100,100,"beden");
    dersler resim = new dersler("resim çizme","çiğdem hoca",70,85,"resim");
    dersgunleri pazartesi = new dersgunleri(matematik,edebiyat,edebiyat,ingilizcelistening,ingilizcewriting,bilisim,beden,resim);
    dersgunleri sali = new dersgunleri(matematik,edebiyat,edebiyat,ingilizcelistening,ingilizcewriting,bilisim,beden,resim);
    dersgunleri carsamba = new dersgunleri(matematik,edebiyat,edebiyat,ingilizcelistening,ingilizcewriting,bilisim,beden,resim);
    dersgunleri persembe = new dersgunleri(matematik,edebiyat,edebiyat,ingilizcelistening,ingilizcewriting,bilisim,beden,resim);
    dersgunleri cuma = new dersgunleri(matematik,edebiyat,edebiyat,ingilizcelistening,ingilizcewriting,bilisim,beden,resim);
void main(){
    System.out.println("pazartesi");
pazartesiyiyazdir();
    System.out.println("sali");
saliyiyazdir();
    System.out.println("carsamba");
carsambayiyazdir();
    System.out.println("persembe");
persembeyiyazdir();
    System.out.println("cuma");
cumayiyazdir();
}
public void pazartesiyiyazdir(){
    System.out.println(pazartesi.birinciders);
    System.out.println(pazartesi.ikinciders);
    System.out.println(pazartesi.ucuncuders);
    System.out.println(pazartesi.dorduncuders);
    System.out.println(pazartesi.besinciders);
    System.out.println(pazartesi.altinciders);
    System.out.println(pazartesi.yedinciders);
    System.out.println(pazartesi.sekizinciders);
}
public void saliyiyazdir(){
    System.out.println(sali .birinciders);
    System.out.println(sali .ikinciders);
    System.out.println(sali .ucuncuders);
    System.out.println(sali .dorduncuders);
    System.out.println(sali .besinciders);
    System.out.println(sali .altinciders);
    System.out.println(sali .yedinciders);
    System.out.println(sali .sekizinciders);
}
public void carsambayiyazdir(){
    System.out.println(carsamba .birinciders);
    System.out.println(carsamba.ikinciders);
    System.out.println(carsamba.ucuncuders);
    System.out.println(carsamba.dorduncuders);
    System.out.println(carsamba.besinciders);
    System.out.println(carsamba.altinciders);
    System.out.println(carsamba.yedinciders);
    System.out.println(carsamba.sekizinciders);
}
public void persembeyiyazdir() {
    System.out.println(persembe.birinciders);
    System.out.println(persembe.ikinciders);
    System.out.println(persembe.ucuncuders);
    System.out.println(persembe.dorduncuders);
    System.out.println(persembe.besinciders);
    System.out.println(persembe.altinciders);
    System.out.println(persembe.yedinciders);
    System.out.println(persembe.sekizinciders);
}
public void cumayiyazdir() {
    System.out.println(cuma.birinciders);
    System.out.println(cuma.ikinciders);
    System.out.println(cuma.ucuncuders);
    System.out.println(cuma.dorduncuders);
    System.out.println(cuma.besinciders);
    System.out.println(cuma.altinciders);
    System.out.println(cuma.yedinciders);
    System.out.println(cuma.sekizinciders);
}}