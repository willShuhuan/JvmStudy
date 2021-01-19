package com.dsh.thingkinginjava.annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author dongshuhuan
 * date 2020-01-20
 * version
 */
public class TestTracker {

    public static void trackTest(List<Integer> useCases , Class<?> cl){
        for (Method m : cl.getDeclaredMethods()){
            UseCase uc =m.getAnnotation(UseCase.class);
            if (uc!=null){
                System.out.println("Found Use Case:"+uc.id()+" "+uc.description());
                useCases.remove(new Integer(uc.id()));
            }
        }
        for (int i : useCases){
            System.out.println("Warning:Missing use case-"+i);
        }
    }

    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<Integer>();
        Collections.addAll(useCases,47,48,49,50);
        trackTest(useCases,PasswordUtils.class);
    }

}
