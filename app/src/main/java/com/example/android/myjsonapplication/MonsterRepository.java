package com.example.android.myjsonapplication;

import android.content.Context;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import okio.BufferedSource;
import okio.Okio;

public class MonsterRepository {


    /**
     * Reads a file from the assets folder ( app -> new -> folder -> assets folder )
     * and return the content in a jsonString
     * @param context
     * @param fileName  file within the assets folder
     * @return a string containing the file
     */
    private String readFileFromAssets(Context context, String fileName) {

        try {
            InputStream input = context.getAssets().open(fileName);
            BufferedSource source = Okio.buffer(Okio.source(input));
            return source.readByteString().string(Charset.forName("utf-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Parse a json file, that exists in assets folder, into a List of Monster
     * @param context
     * @param jsonFileName
     * @return  List<Monster>
     */
    private List<Monster> buildMonstersFromJsonString(Context context, String jsonFileName){

        List<Monster> monsters = new ArrayList<>();
        String jsonDataString = readFileFromAssets(context, jsonFileName);


        Moshi moshi = new Moshi.Builder().build();
        Type type = Types.newParameterizedType(List.class, Monster.class);
        JsonAdapter<List<Monster>> adapter = moshi.adapter(type);
        try {
            monsters = adapter.fromJson(jsonDataString);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return monsters;
    }

    public List<Monster> getMonsterData(Context context){
        return buildMonstersFromJsonString(context, "monster_data.json");
    }


}
