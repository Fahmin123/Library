public class Main {
    public static void main(String[] args) {
        Kitab kitab1 = new Kitab("Cerpeleng", "Xalid Huseyni", 4.99 );
        Kitab kitab2 = new ElmiKitab("Mentiq", "Ruslan Zeynalov", 6.58, 12);
        Kitab kitab3 = new BediiKitab("Besiktas", "Sergen Yalcin", 1903,"Tarix" );
        
        Kitabxana kb = new Kitabxana();
        kb.elaveEt(kitab1);
        kb.elaveEt(kitab2);
        kb.elaveEt(kitab3);
        kb.goster();
        kb.kitabSil(kitab1);
    }
}
