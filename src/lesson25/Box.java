package lesson25;

public class Box <T>{

   private  T value1;
   private Double value;

   public <T extends Number> Box(T value){
       this.value = value.doubleValue();
    }

    public Box (T value){
        this.value1 = value;
    }

    public T getValue() {
        return value1;
    }

    public void setValue(T value) {
        this.value1 = value;
    }

}
