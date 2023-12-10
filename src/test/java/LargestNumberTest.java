import org.example.LargestNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestNumberTest {

    @Test
    public void testLargestNumber() {
        LargestNumber largestNumber = new LargestNumber();

        // Test case 1
        int[] nums1 = {10, 2};
        String expected1 = "210";
        String result1 = largestNumber.largestNumber(nums1);
        assertEquals(expected1, result1);

        // Test case 2
        int[] nums2 = {3, 30, 34, 5, 9};
        String expected2 = "9534330";
        String result2 = largestNumber.largestNumber(nums2);
        assertEquals(expected2, result2);

        // Test case 3
        int[] nums3 = {1};
        String expected3 = "1";
        String result3 = largestNumber.largestNumber(nums3);
        assertEquals(expected3, result3);

        // Test case 4
        int[] nums4 = {10};
        String expected4 = "10";
        String result4 = largestNumber.largestNumber(nums4);
        assertEquals(expected4, result4);

        // Test case 5
        int[] nums5 = {0, 0};
        String expected5 = "0";
        String result5 = largestNumber.largestNumber(nums5);
        assertEquals(expected5, result5);
    }
}