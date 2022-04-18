package Class18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_List {
    public static void main(String[] args) {

        Set<Double> tempValues = new HashSet<>();
        tempValues.add(10.0);
        tempValues.add(23.2);
        tempValues.add(55.3);
        tempValues.add(10.4);
        tempValues.add(2.2);
        tempValues.add(57.3);
        tempValues.add(10.2);
        tempValues.add(23.4);
        tempValues.add(55.3);
        tempValues.add(11.4);
        tempValues.add(33.4);
        tempValues.add(65.3);

        System.out.println("\ntempValues -> " + tempValues);
        System.out.println("tempValues length -> " + tempValues.size());

        List<Double> tempValues_List = new ArrayList<>(tempValues);

        System.out.println("\ntempValues_List -> " + tempValues_List);
        System.out.println("tempValues_List length -> " + tempValues_List.size());


        List<String> names = new ArrayList<>();
        names.add("Happy");         //  ["Happy"]
        names.add("OLD");          //  ["Happy", "GroW"]
        names.add("LeaRN");         //  ["Happy", "GroW", "LeaRN"]
        names.add("PeaCEfUL");      //  ["Happy", "GroW", "LeaRN", "PeaCEfUL"]
        names.add("NEW");      //  ["Happy", "GroW", "LeaRN", "PeaCEfUL", "Learning"]
        names.add("HAPPy");
        names.add("Growing");
        names.add("ListeN");
        names.add("PEACE");
        names.add("King KONG");
        names.add("happiness");
        names.add("greeN");
        names.add("SkiLLS");
        names.add("PRICELeSs");
        names.add("Health");
        names.add("NEW");
        names.add("LAUgh");
        names.add("QUeeN");
        names.add("YouNG");
        names.add("OLD");

        System.out.println("\n\nnames List -> " + names);
        System.out.println("names List length-> " + names.size());

        Set<String> names_Set = new HashSet<>(names);

        System.out.println("\nnames Set -> " + names_Set);
        System.out.println("names Set length-> " + names_Set.size());



        Set<String> idSet = new HashSet<>();
        idSet.add("ab123");
        idSet.add("cd123");
        idSet.add("ef123");
        idSet.add("gg123");
        idSet.add("ij123");

        System.out.println("\nidSet -> " + idSet);
        System.out.println("idSet size -> " + idSet.size());

        /**
         * replace gg123 to gh123
         *
         * method-1
         * 1. convert Set into List
         * 2. use Set() on List to replace
         * 3. convert updated List into Set
         *
         * Method-2:
         * 1. remove gg123
         * 2. add gh123
         */
        // Method-1
//        List<String> idList = new ArrayList<>(idSet);
//        int gg123Index = idList.indexOf("gg123");
//        idList.set(gg123Index, "gh123");
//
//        idSet.clear();
//
//        idSet = new HashSet<>(idList);


        // Method-2
        idSet.remove("gg123");
        idSet.add("gh123");

        System.out.println("\nidSet -> " + idSet);
        System.out.println("idSet size -> " + idSet.size());











    }
}
