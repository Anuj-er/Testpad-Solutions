public static boolean hasDuplicateMappings(Map<String, String> map) 
    {
        if (map.size() <= 1) {
            return false;
        }
        Set<String> seenValues = new HashSet<>();
        for (String value : map.values()) {
            if (!seenValues.add(value)) {
                return true;
            }
        }
        return false;
    }