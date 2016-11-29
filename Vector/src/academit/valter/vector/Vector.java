package academit.valter.vector;

public class Vector {
    private double[] value;

    public Vector(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Массив не может быть <=0");
        } else {
            this.value = new double[size];
        }
    }

    public Vector(double[] value) {
        this(value.length, value);
    }

    public Vector(Vector vector) {
        this.value = new double[vector.value.length];
        System.arraycopy(vector.value, 0, this.value, 0, vector.value.length);
    }

    public Vector(int size, double[] value) {
        if (size <= 0) {
            throw new IllegalArgumentException("Массив не может быть <=0");
        } else if (size < value.length) {
            this.value = new double[size];
            for (int i = 0; i < size; i++) {
                this.value[i] = value[i];
            }
        } else {
            this.value = new double[size];
            for (int i = 0; i < value.length; i++) {
                this.value[i] = value[i];
            }
        }
    }

    public int getSize() {
        return value.length;
    }

    public double getValue(int i) {
        return value[(int) i];
    }

    public void setValue(int element, double value) {
        this.value[element] = value;
    }

    public Vector add(Vector vector) {
        int sizeThis = this.value.length;
        int sizeCopy = vector.value.length;
        Vector newArray = new Vector(sizeThis + sizeCopy);
        for (int i = 0; i < sizeThis + sizeCopy; i++)
            if (i < sizeThis) {
                newArray.value[i] = value[i];
            } else {
                newArray.value[i] = vector.value[i - sizeThis];
            }
        return newArray;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("{");
        for (int i = 0; i < value.length; i++) {
            if (i == value.length - 1) {
                string.append(getValue(i)).append("}");
            } else {
                string.append(getValue(i)).append(", ");
            }
        }
        return String.valueOf(string);
    }
}
