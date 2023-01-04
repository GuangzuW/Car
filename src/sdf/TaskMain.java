package sdf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TaskMain {

    public static void main(String[] args) {

        List<Car> garage= new LinkedList<Car>();
        Set<String> addressBook= new HashSet<>();
        Map<String,Integer> debts=new HashMap<>();

        garage.add(new Car());
        garage.add(new Porche());

        System.out.println(garage);

        addressBook.add("fred");
        addressBook.add("barney");
        addressBook.add("wilma");
        addressBook.add("fred");

        System.out.println(addressBook);
        
        debts.put("fred",10);
        debts.put("barney",10);
        debts.put("wilma",100);

        System.out.println(debts);
    }
    
}
