package com.company.spring5.collectiontype;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    private String[] courses;

    private List<String> list;

    private Map<String, String> maps;

    private Set<String> sets;

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void test() {
        System.out.println(courses.toString());
        System.out.println(list.toString());
        System.out.println(maps.toString());
        System.out.println(sets .toString());
    }
}
