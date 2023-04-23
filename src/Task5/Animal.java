package Task5;

public class Animal implements Animals{
    String name;
    int age;
    boolean tail;
    private boolean booleanValue = tail;
    private  float floatValue = age;
    private double doubleValue = 9873234.123;
    private byte[] arrayValue = {1, 2, 3, 4};
    private long longValue = 1231234422L;
    private char charValue = 'd';


    public Animal(String name, int age, boolean tail){
        this.age = age;
        this.name = name;
        this.tail = tail;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        if (!name.equalsIgnoreCase(animal.name) || age != animal.age) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        String stringValue = this.name;
        result = 37 * result + (booleanValue ? 1 : 0);
        result = 37 * result + (int) charValue;
        result = 37 * result + (int) (longValue ^ (longValue >>> 32));
        result = 37 * result + (stringValue == null ? 0 : stringValue.hashCode());
        result = 37 * result + Float.floatToIntBits(floatValue);
        long longBits = Double.doubleToLongBits(doubleValue);
        result = 37 * result + (int) (longBits ^ (longBits >>> 32));
        for (byte b : arrayValue)
            result = 37 * result + (int) b;

        return result;
    }

    @Override
    public String toString() {
        String tail;
        if (this.tail) tail = "Yes";
        else tail = "No";
        return "Name: " + this.name + " Age: " + this.age + " Tail: " + tail;
    }

}
