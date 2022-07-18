package classifiedgenerics;

public class NumericOperation <T extends Number>{
    private T firstnumber;
    private T secondnumber;

    public int sum(){
        return firstnumber.intValue()+secondnumber.intValue();
    }

    public NumericOperation(T firstnumber, T secondnumber) {
        this.firstnumber = firstnumber;
        this.secondnumber = secondnumber;
    }

    public NumericOperation() {
    }

    public T getFirstnumber() {
        return firstnumber;
    }

    public void setFirstnumber(T firstnumber) {
        this.firstnumber = firstnumber;
    }

    public T getSecondnumber() {
        return secondnumber;
    }

    public void setSecondnumber(T secondnumber) {
        this.secondnumber = secondnumber;
    }

    }

