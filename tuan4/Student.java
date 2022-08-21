package tuan4;
import javax.swing.plaf.synth.SynthTreeUI;
public class Student {
    private String name = "Join";
    private String clas = "C05";

    public Student() {
    }

    public Student(String name, String clas) {
        this.name = name;
        this.clas = clas;
    }

    public void setName(String name) {
        this.name=  name;
    }
    public void setClas(String clas) {
        this.clas= clas;
    }
    public  static void  main(String[] args){
        Student  st=  new Student();
        String name="PHAM THANG";
        st.setName(name);
        String clas="25t1";
        st.setName(clas);
    }
}
