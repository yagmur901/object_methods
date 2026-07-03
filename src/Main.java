
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Cat cat1 = new Cat(1,"mehmet" ,"tekir", 3);
        Cat cat2 = new Cat(2,"duman", "scottish", 2);
        Cat cat3 = new Cat(3,"venus", "van kedisi", 4);
        Cat cat4 = new Cat(1,"mehmet", "tekir", 3);
        Cat cat5 = new Cat(2, "kleopatra", "sfenks kedisi", 2);
        Cat cat6 = new Cat(4, "duman", "scottish", 6);
        Cat cat7 = cat1; // cat7 yeni bir Cat nesnesi değil, cat1i gösteren ikinci bir etiket






        System.out.println(cat1.equals(cat2)); //false
        System.out.println(cat1.equals(cat3)); //false
        System.out.println("-------------------------------------------");
        System.out.println(cat1.equals(cat4)); // aynısı // true
        System.out.println(cat2.equals(cat5)); // int aynı stringler farklı //false
        System.out.println(cat2.equals(cat6)); // int farklı stringler aynı //false
        System.out.println("-------------------------------------------");
        System.out.println(cat1.equals(cat7)); // referans kopyası // true
        System.out.println(cat4.equals(cat7)); // referans kopyasıyla direk bilgi kopyası olan eşit mi? kontrolu //true !!!!!!

        System.out.println("-------------------------------------------");

        System.out.println(cat1 == cat2); //false
        System.out.println(cat1 == cat3); //false
        System.out.println("-------------------------------------------");
        System.out.println(cat1 == cat4); // aynısı // false
        System.out.println(cat2 == cat5); // int aynı stringler farklı //false
        System.out.println(cat2 == cat6); // int farklı stringler aynı //false
        System.out.println("-------------------------------------------");
        System.out.println(cat1 == cat7); // referans kopyası // true
        System.out.println(cat4 == cat7); // 1in referans kopyası ama 1in aynısıyla(bilgiler olarak) aynı mı? kontrolu //false !!!!!


        System.out.println("-------------------------------------------");

        System.out.println(cat1); // override edilmiş hali outputu: id : 1isim : mehmet tur: tekir yas: 3
        // (toString'i yorum satırı haline alınca outputu: Cat@1)
        // (sadece hashCode()'u yorum satırına alınca output:( id : 1isim : mehmet tur: tekir yas: 3))
        System.out.println(cat1.hashCode()); // hashCode() fonk. yorum halindeykenki output: 780237624
        // hashCode() fonk. override edilmiş hali aktifkenki output: 1
        System.out.println(cat4.hashCode()); // .equals() metoduna göre eşitler hashcodeları da eşit olmalı (hashcode yorumda):
        // 1637070917 -> (cat1) 1in hashcodu değişmiş
        // 780237624 -> (cat4) 1in eski hashkoduyla aynı -> tesaduf jvmnin bellek yonetimiyle alakalı
        System.out.println(cat7.hashCode()); //hashcode yorumda (4, 1in bilgi kopyası; 7, 1in referans kopyası)
        //1637070917 (cat1)
        //780237624  (cat4)
        //1637070917 (cat7)
        // 1 ile 7ninki aynı çünkü aynı bellek adresini gösteriyorlar.
        System.out.println(cat1.getClass()); // class Cat
        //System.gc(); //-> finalize ile kullanacktım, outputu değiştirmedi


        System.out.println("-------------------------------------------");

        Cat cat8 = new Cat(8, "okyanus", "ankara kedisi", 1);
        Cat cat9 = cat8; // shadow copy

        Cat cat10 = new Cat(10, "dokuz", "sokak kedisi", 4);
        Cat cat11 = (Cat) cat10.clone(); //

        System.out.println(cat8.equals(cat9)); //true
        System.out.println(cat9 == cat8); //true
        System.out.println(cat8.hashCode()); //205797316
        System.out.println(cat8.hashCode());//205797316 // aynısı

        System.out.println("-------------------------------------------");


        System.out.println(cat10.equals(cat11)); //true
        System.out.println(cat10 == cat11); //FALSE!!! referansları farklı
        System.out.println(cat10.hashCode()); //1128032093
        System.out.println(cat11.hashCode());//1066516207

        System.out.println("-------------------------------------------");

        System.out.println(cat8); //okyanus
        System.out.println(cat9); //okyanus
        System.out.println(cat10); //dokuz
        System.out.println(cat11); //dokuz

        cat9.isim = "kırmızı";
        cat11.isim = "üçgen";

        System.out.println("-------------------------------------------");

        System.out.println(cat8); //kırmızı (9la 8 birbirine bağlı olduğundan = yani aynı referansa sahip old. = aynı nesneye işraet ettiğinden bu da değişti.)
        System.out.println(cat9); //kırmızı
        System.out.println(cat10); //dokuz (referansları-adresleri 11 ile farklı olduğundan 11 değişince bu değişmedi)
        System.out.println(cat11); // üçgen



    }
}