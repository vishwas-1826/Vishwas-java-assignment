static int countAnagramGroups(String[] a) {
    HashSet<String> set = new HashSet<>();

    for (String s : a) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        set.add(new String(ch));
    }

    return set.size();
}
