import java.util.*;

class Interval {
    int start;
    int end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class C43 {
    public static void main(String[] args) {
        Interval[] intervals = {new Interval(1, 3), new Interval(2, 4), new Interval(6, 8), new Interval(9, 10)};
        Interval[] mergedIntervals = mergeIntervals(intervals);

        for (Interval interval : mergedIntervals) {
            System.out.println("[" + interval.start + ", " + interval.end + "]");
        }
    }

    public static Interval[] mergeIntervals(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new Interval[0];
        }

        // Sort the intervals based on the start time
        Arrays.sort(intervals, (a, b) -> a.start - b.start);

        List<Interval> mergedIntervals = new ArrayList<>();
        mergedIntervals.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            Interval currentInterval = intervals[i];
            Interval lastMergedInterval = mergedIntervals.get(mergedIntervals.size() - 1);

            // Check if the current interval overlaps with the last merged interval
            if (currentInterval.start <= lastMergedInterval.end) {
                // Merge the current interval with the last merged interval
                lastMergedInterval.end = Math.max(lastMergedInterval.end, currentInterval.end);
            } else {
                // Add the current interval to the list of merged intervals
                mergedIntervals.add(currentInterval);
            }
        }

        return mergedIntervals.toArray(new Interval[0]);
    }
}