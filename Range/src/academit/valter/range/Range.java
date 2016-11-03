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
        if (notCrossingPoint(Range.this, nCut)) {
            return null;
        }
        double localFrom = Math.max(this.from, nCut.from);
        double localTo = Math.max(this.to, nCut.to);
        return new Range(localFrom, localTo);
    }

    public Range[] union(Range nCut) {
        if (notCrossingPoint(Range.this, nCut)) {
            return new Range[]{
                    new Range(nCut.from, nCut.to),
                    new Range(this.from, this.to)
            };
        } else {
            double localFrom = Math.min(this.from, nCut.from);
            double localTo = Math.min(this.to, nCut.to);
            return new Range[]{
                    new Range(localFrom, localTo)
            };
        }
    }

    public Range[] difference(Range nCut) {
        if (this.to <= nCut.from || nCut.to <= this.from) {
            return new Range[]{
                    new Range(nCut.from, nCut.to),
                    new Range(this.from, this.to)};
        } else if (notCrossingPoint(Range.this, nCut)) {
            return new Range[]{
                    new Range(this.from, this.to)};
        } else if (this.from >= nCut.from && this.to <= nCut.to) {
            double maxCut = Math.max(this.to, nCut.to);
            return new Range[]{
                    new Range(this.from, maxCut)};
        } else {
            return new Range[0];
        }
    }
}
