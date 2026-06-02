public class animal {
    private String name;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    void indformation(){
        this.name="cat";
        this.id=12;
        System.out.println("my name is "+name+"， I m NO."+id);
    }


    static void main() {
        animal animal=new animal();
        animal.indformation();
    }
}
