package bean;

/**
 * @author ashik_arefin
 */
public class Student {
    private String name;
    private String id;
    // marks
    private int compiler, machine, oop, data, digital;

    public Student() {

    }

    public Student(String name, String id, int compiler, int machine, int oop, int data, int digital) {
        this.name = name;
        this.id = id;
        this.compiler = compiler;
        this.machine = machine;
        this.oop = oop;
        this.data = data;
        this.digital = digital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCompiler() {
        return compiler;
    }

    public void setCompiler(int compiler) {
        this.compiler = compiler;
    }

    public int getMachine() {
        return machine;
    }

    public void setMachine(int machine) {
        this.machine = machine;
    }

    public int getOop() {
        return oop;
    }

    public void setOop(int oop) {
        this.oop = oop;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getDigital() {
        return digital;
    }

    public void setDigital(int digital) {
        this.digital = digital;
    }

}
