package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class WalkinRobotSim {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        Set<String> obstacleSet = new HashSet<>();
        for (int[] obs : obstacles) {
            obstacleSet.add(obs[0] + "," + obs[1]);
        }

        int x = 0, y = 0, direction = 0;
        int maxDistSq = 0;

        for (int cmd : commands) {
            if (cmd == -2) {
                // Turn left
                direction = (direction + 3) % 4;
            } else if (cmd == -1) {
                // Turn right
                direction = (direction + 1) % 4;
            } else {
                // Move foward
                for (int i = 0; i < cmd; i++) {
                    int netX = x + dx[direction];
                    int netY = y + dy[direction];

                    if (!obstacleSet.contains(netX + "," + netY)) {
                        x = netX;
                        y = netY;
                        maxDistSq = Math.max(maxDistSq, x * x + y * y);
                    } else {
                        break;
                    }
                }
            }
        }

        return maxDistSq;
    }
}
