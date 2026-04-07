package LeetCode;

public class Robot {
    int width, height, pos, perimeter;
    boolean moved = false;
    String[] directions = {"East", "North", "West", "South"};

    public Robot(int width, int height) {
        this.width = width;
        this.height = height;
        this.perimeter = 2 * (width + height) - 4;
        this.pos = 0;    
    }
    
    public void step(int num) {
        moved = true;
        pos = (pos + num) % perimeter;
    }
    
    public int[] getPos() {
        if (pos < width) {
            return new int[]{pos, 0};
        } else if (pos < width + height - 1) {
            return new int[]{width - 1, pos - (width - 1)};
        } else if (pos < 2 * width + height - 2) {
            return new int[]{width - 1 - (pos - (width + height - 2)), height - 1};
        } else {
            return new int[]{0, height - 1 - (pos - (2 * width + height - 3))};
        }
    }
    
    public String getDir() {
        if (!moved) return "East";
        if (pos == 0) return "South";

        if (pos >= 1 && pos <= width - 1) return "East";
        if (pos >= width && pos <= width + height - 2) return "North";
        if (pos >= width + height - 1 && pos <= 2 * width + height - 3) return "West";
        return "South";
    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */
