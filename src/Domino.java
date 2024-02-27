public class Domino {
    private int top;
    private int bottom;
    public Domino() {
        top = 0;
        bottom = 0;
    }
    public Domino(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }
    public int getTop() {
        return top;
    }
    public int getBottom() {
        return bottom;
    }
    public void setTop(int top) {
        this.top = top;
    }
    public void setBottom(int bottom) {
        this.bottom = bottom;
    }
    public String toString() {
        return top + "/" + bottom;
    }
    public void flip() {
        int temp = top;
        top = bottom;
        bottom = temp;
    }
    public void settle() {
        if (bottom < top) flip();
    }
    public int compareTo(Domino other) {
        settle();
        other.settle();
        if (this.top < other.top) return -1;
        else if (this.top > other.top) return 1;
        else {
            if (this.bottom < other.bottom) return -1;
            else if (this.bottom > other.bottom) return 1;
            else return 0;
        }
    }
    public int compareToWeight(Domino other) {
        int x = top + bottom;
        int y = other.top + other.bottom;
        if (x > y) return 1;
        else if (y < x) return -1;
        else return 0;
    }
    public boolean canConnect(Domino other) {
        if (this.top == other.top || this.top == other.bottom || this.bottom == other.top || this.bottom == other.bottom) return true;
        return false;
    }
}