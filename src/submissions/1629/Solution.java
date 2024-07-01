class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxIndex = 0;
        int maxDuration = releaseTimes[0];

        for (int i = 1; i < releaseTimes.length; i++) {
            int duration = releaseTimes[i] - releaseTimes[i - 1];
            if (duration > maxDuration || (duration == maxDuration && keysPressed.charAt(i) > keysPressed.charAt(maxIndex))) {
                maxDuration = duration;
                maxIndex = i;
            }
        }

        return keysPressed.charAt(maxIndex);
    }
}

