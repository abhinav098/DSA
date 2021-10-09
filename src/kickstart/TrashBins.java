package kickstart;

import java.util.*;

public class TrashBins {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int tesCases = sn.nextInt();
        for(int i = 0; i < tesCases; i++) {
            int houses = sn.nextInt();
            String trashList = sn.next();
            System.out.println("Case #" + i + ": " + calculateTotalDist(houses, trashList));
        }
    }

    private static int calculateTotalDist(int n, String s) {
        int distance = 0;
        List<Integer> indexList = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                indexList.add(i);
            }
        }

        for(int j = 0; j < s.length(); j++) {
            if(s.charAt(j) == '0') {
                distance += findClosestTrash(j, indexList);
            }
        }
        return distance;
    }

    private static int findClosestTrash(int houseNumber, List<Integer> indexList) {
        int minDist = Integer.MAX_VALUE;
        for(int index: indexList) {
            minDist = Math.min(Math.abs(houseNumber - index), minDist);
        }
        return minDist;
    }
}
