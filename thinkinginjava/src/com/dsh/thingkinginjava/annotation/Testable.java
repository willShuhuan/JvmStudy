package com.dsh.thingkinginjava.annotation;

/**
 * @author dongshuhuan
 * date 2020-01-20
 * version
 */
public class Testable {
    public String execute(){
        return "Executing...";
    }
    @UseCase(value = "hhh",id = 100,description = "HaHaHaHa")
    //@UseCase("s")//如果定义了名为value的元素，并且在应用注解的时候，该元素是唯一需要赋值的元素，只需要在括号内给出value元素所需的值即可

    public void testExecute(){
        execute();
    }

    public static void main(String[] args) {
        Testable testable = new Testable();
        assert testable.execute().equals("Executing");
    }

}
