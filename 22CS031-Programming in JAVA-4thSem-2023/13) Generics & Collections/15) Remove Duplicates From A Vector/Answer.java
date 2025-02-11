static void removeDuplicates(Vector<Integer> v) 
{
        Set<Integer> seen = new HashSet<>();
        Vector<Integer> uniqueElements = new Vector<>();
        for (Integer num : v) {
            if (seen.add(num)) {
                uniqueElements.add(num);
            }
        }
        v.clear();
        v.addAll(uniqueElements);
}