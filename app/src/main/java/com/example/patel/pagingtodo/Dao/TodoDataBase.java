package com.example.patel.pagingtodo.Dao;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.util.Log;

import com.example.patel.pagingtodo.MainActivity;
import com.example.patel.pagingtodo.Model.Todo;

@Database(entities = {Todo.class}, version = 1)
public abstract class TodoDataBase extends RoomDatabase {

    private static final Object LOCK = new Object();
    private static final String DATABASE_NAME = "todolist";
    private static TodoDataBase sInstance;


    public abstract TodoDao TodoDao();

    public static TodoDataBase getInstance(Context context) {
        if (sInstance == null) {
            synchronized (LOCK) {
                sInstance = Room.databaseBuilder(context.getApplicationContext(),
                        TodoDataBase.class, TodoDataBase.DATABASE_NAME)
                        .build();
            }
        }
        return sInstance;
    }
}
