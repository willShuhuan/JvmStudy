package com.dsh.kt.io;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dongshuhuan
 * date 2020/11/14
 * version
 */
class Test<T extends Fruit>{
    List<T> list;
    List<T> list2;

    public void setList(List<T> list) {
        this.list = list;
    }

    public void setList2(List<T> list2) {
        this.list2 = list2;
    }

}
