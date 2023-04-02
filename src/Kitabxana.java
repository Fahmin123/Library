import java.util.ArrayList;
import java.util.List;

public class Kitabxana {

    List list = new ArrayList();


    public void elaveEt(Kitab kitab) {
        list.add(kitab);
    }
    public void kitabSil(Kitab kitab){
        list.remove(kitab);
        System.out.println("Kitab Silindi");
        System.out.println("Qalan Kitablar");
        goster();
    }
    public void goster(){
        for(int i =0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}