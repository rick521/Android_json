package com.example.android_json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(Person person:parseEasyJson(json)){
            Log.e("--->",person.toString());
        }
    }
    String json="[\n" +
            "    { \"id\":\"1\",\"name\":\"小明\",\"age\":\"16\" },\n" +
            "    { \"id\":\"2\",\"name\":\"小红\",\"age\":\"17\"  },\n" +
            "    { \"id\":\"3\",\"name\":\"小绿\",\"age\":\"18\" }\n" +
            "]";

    private ArrayList<Person> parseEasyJson(String json){
        ArrayList<Person> persons = new ArrayList<Person>();
        try{
            JSONArray jsonArray = new JSONArray(json);
            for(int i = 0;i < jsonArray.length();i++){
                JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                Person person = new Person();
                person.setId(i+"");
                person.setName(jsonObject.getString("name"));
                person.setAge(jsonObject.getString("age"));
                persons.add(person);
            }
        }catch (Exception e){e.printStackTrace();}
        return persons;
    }
}