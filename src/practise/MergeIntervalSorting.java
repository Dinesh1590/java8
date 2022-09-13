package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MergeIntervalSorting {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();

        if (intervals.length == 0 || intervals == null)
            return res.toArray(new int[0][]);

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int[] i : intervals) {
            if (i[0] <= end) {
                end = Math.max(end, i[1]);
            } else {
                res.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[]{start, end});
        System.out.println(Arrays.deepToString(intervals));

        return res.toArray(new int[0][]);
    }

    public static void main(String[] args) {

        MergeIntervalSorting ans = new MergeIntervalSorting();

        int[][] intervals = new int[3][2];

        intervals[0][0] = 2;
        intervals[0][1] = 6;
        intervals[1][0] = 1;
        intervals[1][1] = 5;
        intervals[2][0] = 8;
        intervals[2][1] = 9;

        for (int[] arr : ans.merge(intervals)) {
            System.out.print(Arrays.toString(arr));
        }
    }
}
