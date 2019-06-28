package com.jason;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class TransportProviderApplicationTests {

    @Test
    public void contextLoads() {
        List<Integer> newList = new ArrayList<Integer>();
        newList.add(1);
        newList.add(8);
        newList.add(5);
        newList.add(3);
        newList.add(9);
        newList.add(1);
        newList.stream().forEach(list->{System.out.println(list);});
        newList.stream().sorted(Comparator.comparing(Integer::longValue)).forEach(list->{System.out.println(list);});
        newList.stream().filter(list->list>5).forEach(list->{ System.out.println(list);});
        newList.stream().distinct().forEach(list-> System.out.println(list));
    }

}
