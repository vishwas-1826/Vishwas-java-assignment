static void twoSum(int[] a, int target) {
    for (int i = 0; i < a.length; i++) {
        for (int j = i + 1; j < a.length; j++) {

            if (a[i] + a[j] == target) {
                System.out.println(i + " " + j);
                return;
            }
        }
    }

    System.out.println("-1 -1");
}
