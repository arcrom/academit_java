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
        } else {
            this.value = new double[size];
            int countArray = Math.min(size, value.length);
            System.arraycopy(value, 0, this.value, 0, countArray);
        }
    }

    public double getSize() {
        return value.length;
    }

    public double getLength() {
        double length = 0;
        for (double localValue : this.value) {
            length += Math.pow(localValue, 2);
        }
        return Math.sqrt(length);
    }

    public double getValue(int i) {
        return value[i];
    }

    public double setValue(int element, double value) {
        return this.value[element] = value;
    }

    public Vector plus(Vector vector) {
        if (this.value.length > vector.value.length) {
            for (int i = 0; i < vector.value.length; i++) {
                this.value[i] += vector.value[i];
            }
            return this;
        } else {
            Vector newVector = new Vector(vector.value.length);
            System.arraycopy(value, 0, newVector.value, 0, value.length);
            for (int i = 0; i < newVector.value.length; i++) {
                newVector.value[i] += vector.value[i];
            }
            return newVector;
        }
    }

    public Vector minus(Vector vector) {
        if (this.value.length > vector.value.length) {
            for (int i = 0; i < vector.value.length; i++) {
                this.value[i] -= vector.value[i];
            }
            return this;
        } else {
            Vector newVector = new Vector(vector.value.length);
            System.arraycopy(value, 0, newVector.value, 0, value.length);
            for (int i = 0; i < newVector.value.length; i++) {
                newVector.value[i] -= vector.value[i];
            }
            return newVector;
        }
    }

    public Vector scalar(double scalar) {
        for (int i = 0; i < this.getSize(); i++) {
            this.value[i] *= scalar;
        }
        return this;
    }

    public Vector reverse() {
        return scalar(-1);
    }

    public static Vector sum(Vector a, Vector b) {
        return a.plus(b);
    }

    public static Vector minus(Vector a, Vector b) {
        return a.minus(b);
    }

    public static double scalar(Vector a, Vector b) {
        double scalarSum = 0;
        for (int i = 0; i < Math.min(b.getSize(), a.getSize()); i++) {
            scalarSum += a.value[i] * b.value[i];
        }
        return scalarSum;
    }

    @Override
    public boolean equals(Object vector) {
        if (this == vector) {
            return true;
        }
        if (vector == null) {
            return false;
        }
        if (this.getClass() != vector.getClass()) {
            return false;
        }
        Vector localVector = (Vector) vector;
        if (this.getSize() != localVector.getSize()) {
            return false;
        }
        double epsilon = 0.0001;
        for (int i = 0; i < this.getSize(); i++) {
            double a = this.value[i];
            double b = localVector.value[i];
            if (Math.abs(a - b) > epsilon) {
                return false;
            }
        }
        return true;
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
        return string.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        int localNumber = 15;
        for (double localValue : this.value) {
            result = (int) (localNumber * result + localValue);
        }
        return result;
    }
}
