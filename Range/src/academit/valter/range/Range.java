package academit.valter.range;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        if (from < to) {
            this.from = from;
            this.to = to;
        } else {
            this.from = to;
            this.to = from;
        }
    }

    public double getTo() {
        return to;
    }

    public double getFrom() {
        return from;
    }

    public void print() {
        System.out.printf("%.1f %.1f%n", from, to);
    }

    public boolean isInside(double point) {
        return point >= from && point <= to;
    }

    public double length() {
        return to - from;
    }

    private static boolean notCrossingPoint(Range nCut2, Range nCut) {
        return nCut2.from > nCut.to || nCut2.to < nCut.from;
    }

    public Range crossing(Range nCut) {
        if (this.to < nCut.from || this.from > nCut.to) {
            return null;
        }
        return new Range(Math.max(this.from, nCut.from), Math.min(this.to, nCut.to));
    }

    public Range[] union(Range nCut) {
        if (notCrossingPoint(Range.this, nCut)) {
            return new Range[]{
                    new Range(this.from, this.to),
                    new Range(nCut.from, nCut.to)
            };
        } else {
            return new Range[]{
                    new Range(Math.min(this.from, nCut.from), Math.max(this.to, nCut.to))
            };
        }
    }

    public Range[] difference(Range nCut) {
        if (notCrossingPoint(Range.this, nCut)) {
            return new Range[]{
                    new Range(this.from, this.to)
            };
        } else if (this.from <= nCut.from && this.to >= nCut.to) {
            return new Range[]{
                    new Range(this.from, nCut.from),
                    new Range(nCut.to, this.to)
            };
        } else if (this.from <= nCut.from && this.to <= nCut.to) {
            return new Range[]{
                    new Range(this.from, nCut.from)
            };
        } else if (this.from >= nCut.from && this.to >= nCut.to) {
            return new Range[]{
                    new Range(nCut.to, this.to)
            };
        } else return new Range[0];
    }
}