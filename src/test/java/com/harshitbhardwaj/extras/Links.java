package com.harshitbhardwaj.extras;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Links {

    private static final Map<String, String> validLinks;

    static {
        /*Here make sure to give the values of links correctly, such as warmpup1 -> Warmup-1
        and map1 -> Map-1 and so on.
         */
        Map<String, String> linksMap = new HashMap<>();
        linksMap.put(ValidLinkNames.warmup1.toString(), "Warmup-1");
        linksMap.put(ValidLinkNames.array1.toString(), "Array-1");
        linksMap.put(ValidLinkNames.string1.toString(), "String-1");
        linksMap.put(ValidLinkNames.logic1.toString(), "Logic-1");
        linksMap.put(ValidLinkNames.map1.toString(), "Map-1");
        linksMap.put(ValidLinkNames.functional1.toString(), "Functional-1");
        linksMap.put(ValidLinkNames.ap1.toString(), "AP-1");
        linksMap.put(ValidLinkNames.recursion1.toString(), "Recursion-1");
        validLinks = Collections.unmodifiableMap(linksMap);
    }

    public static Map<String, String> getLinksMap() {
        return validLinks;
    }
}
