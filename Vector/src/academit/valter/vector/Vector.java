package academit.valter.vector;

public class Vector {
    private double[] value;

    public Vector(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Массив не может быть меньше нуля");
        } else {
            this.value = new double[size];
        }
    }

    public Vector(double[] value) {
        this.value = value;
    }

    public Vector(Vector vector) {
        this.value = new double[vector.value.length];
    }

    public Vector(int size, double[] value) {
        if (size <= 0) {
            throw new IllegalArgumentException("Массив не может быть меньше нуля");
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

    public double[] getValue() {
        return value;
    }

    public void setValue(double[] value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String string = "{";
        for (int i = 0; i < value.length; i++) {
            if (i == value.length - 1) {
                string += (int) value[i] + "}";
            } else {
                string += (int) value[i] + ",";
            }
        }
        return string;
    }

    ;
}
