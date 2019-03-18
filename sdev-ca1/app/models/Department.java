package models;

import models.users.*;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Department extends Model{

    @Id
    private Long id;
    @Constraints.Required
    private String name;

    @OneToMany(mappedBy="department", cascade = CascadeType.PERSIST)
    private List<Employee> employees;

    public Department(){
    }

    public Department(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public static Finder<Long,Department> find = new Finder<Long,Department>(Department.class);

    public static List<Department> findAll(){
        return Department.find.query().where().orderBy("id asc").findList();
    }

    public static Map<String, String> options(){
        LinkedHashMap<String, String> options = new LinkedHashMap();

        for(Department d: Department.findAll()){
            options.put(d.getId().toString(), d.getName());
        }
        return options;
}
}