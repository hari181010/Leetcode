class Solution {
    public boolean findsucessors(int[] ha, int groupSize, int i, int n) {
        int f = ha[i] + 1;
        ha[i] = -1;
        int count = 1;
        i += 1;
        while (i < n && count < groupSize) {
            if (ha[i] == f) {
                f = ha[i] + 1;
                ha[i] = -1;
                count++;
            }
            i++;
        }
        if (count != groupSize)
            return false;
        else
            return true;
    }







    public boolean isNStraightHand(int[] ha, int groupSize) {
        int n = ha.length;
        if (n % groupSize != 0)
            return false;
        Arrays.sort(ha);
        int i = 0;
        for (; i < n; i++) {
            if (ha[i] >= 0) {
                if (!findsucessors(ha, groupSize, i, n))
                    return false;
            }
        }
        return true;
    }
}