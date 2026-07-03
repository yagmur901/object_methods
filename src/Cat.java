import java.lang.Cloneable;

public class Cat implements Cloneable {

    protected int id;
    protected String isim;
    protected String tur;
    protected int yas;



    @Override
    public String toString(){ // kediye ait bilgileri stringle return et
        return "id : " + id + " isim : " + isim + " tur: " + tur + " yas: " +yas;
    }

    /*@Override
    public int hashCode(){ // id return et
        return id;
    }*/

    @Override
    public boolean equals(Object obj){
        // object null mu degil mi kontrol
        // object dogru classa mı ait
        // casting

        //if (obj == null) return false; // null kontrolu, gelen nesne null ise eşit olamazlar zaten

        if (!(obj instanceof Cat)) return false; // hem null kontrolu yapıyor hem de objectin tipi doğru mu değil mi onu kontrol eder.

        Cat cat = (Cat) obj;

        // mesela burada isim.equals(...) deyince burada java cat sınıfının değil de
        // String sınıfının kendi equals() metodunu çağırır.
        // Bu yüzden recursive olmaz.
        // String için ".equals()", int için "==" kullanılır.
        // Çünkü primitive tipleri karşılaştırmak için == operatoru kullanılır, Sting ise bir object olduğu için kendi metotları vardır.



        // Objectler için metot, primitive tipler için operator kullanılıyor
        return (id==cat.id) && isim.equals(cat.isim) && tur.equals(cat.tur) && (yas == cat.yas);
        // true is trueyu false ise false dondurecek boolean olarak.

    }

    /*
    @Override //-> java 9 sonrasında kullanımdan kaldırılmıs
    protected void finalize() {
        System.out.println("Object is destroyed");
    }
    */

    @Override // şu hatayı kaldırmak için: java: clone() has protected access in java.lang.Object
    public Cat clone() throws CloneNotSupportedException {
        return (Cat) super.clone(); //super.clone bir Object döner onu Cat nesnesine type cast yapıyoruz.
    }
}
