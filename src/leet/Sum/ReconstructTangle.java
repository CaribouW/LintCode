package leet.Sum;

/**
 * 492
 */
public class ReconstructTangle {
    /**
     * For a web developer, it is very important to know how to design a web page's size.
     * So, given a specific rectangular web page’s area, your job by now is to design a rectangular web page,
     * whose length L and width W satisfy the following requirements:
     * <p>
     * 1. The area of the rectangular web page you designed must equal to the given target area.
     * <p>
     * 2. The width W should not be larger than the length L, which means L >= W.
     * <p>
     * 3. The difference between length L and width W should be as small as possible.
     * You need to output the length L and the width W of the web page you designed in sequence.
     * Example:
     * Input: 4
     * Output: [2, 2]
     * Explanation: The target area is 4, and all the possible ways to construct it are [1,4], [2,2], [4,1].
     * But according to requirement 2, [1,4] is illegal; according to requirement 3,
     * [4,1] is not optimal compared to [2,2]. So the length L is 2, and the width W is 2.
     */
    public int[] constructRectangle(int area) {
        for (int i = (int) Math.sqrt(area); true; i--)
            if (area % i == 0)
                return new int[]{area / i, i};
    }

    public static void main(String[] args) {
        int[] nums = new ReconstructTangle().constructRectangle(16055);
    }
}
