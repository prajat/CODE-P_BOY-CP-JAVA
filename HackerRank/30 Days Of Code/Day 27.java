static class TestDataEmptyArray {
    public static int[] get_array() {
        return new int[0];
    }
}

static class TestDataUniqueValues {
    public static int[] get_array() {
        int[] a = { 1, 2, 3 };
        return a;
    }

    public static int get_expected_result() {
        return 0;
    }
}

static class TestDataExactlyTwoDifferentMinimums {
    public static int[] get_array() {
        int a[] = { 1, 2, 1 };
        return a;
    }

    public static int get_expected_result() {
        return 0;
    }
}