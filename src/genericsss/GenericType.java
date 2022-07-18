package genericsss;

public class GenericType<T> {
    private T obj;

    public GenericType(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
    public void showType(){
        System.out.println("Type: "+ this.obj.getClass().getName());
    }

    @Override
    public String toString() {
        return "GenericType{" +
                "obj=" + obj +
                '}';
    }
}
