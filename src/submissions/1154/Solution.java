class Solution {
    public int dayOfYear(String date) {
        int[] previousDays = new int[] {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
        int year = (date.charAt(0) - '0') * 1000 + (date.charAt(1) - '0') * 100 + (date.charAt(2) - '0') * 10 + (date.charAt(3) - '0');
        int month = (date.charAt(5) - '0') * 10 + date.charAt(6) - '0';
        int day = (date.charAt(8) - '0') * 10 + date.charAt(9) - '0';

        day += previousDays[month - 1];

        if (isLeapYear(year) && month > 2) {
            day++;
        }

        return day;
    }

    private boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
}
