package edu.android.firebase_test01;

import java.util.HashMap;

public class Users {
    String name;
    String age;
    String job;

    public Users(String name, String age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public HashMap<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();

        result.put("name", name);
        result.put("age", age);
        result.put("job", job);

        return result;
    }
}
