package practice2;

public class problem2 {
    public static void main(String[] args) {
        StarTriangle small = new StarTriangle(6);
        System.out.println(small.toString());
    }
}

class StarTriangle {
    private int width;

    public StarTriangle(int width) {
        this.width = width;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= width; i++) {
            for (int j = 0; j < i; j++) {
                sb.append("[*]"); 
            }
            sb.append("\n"); 
        }
        return sb.toString();
    }
}