public class student {
    public String name;
    public int old;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;

    }

     public student(String name, int old) {
        this.name = name;
        this.old = old;
    }

     public student() {
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", old=" + old +
                '}';
    }
}
