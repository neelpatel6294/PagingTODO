package com.example.patel.pagingtodo.Dao;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.patel.pagingtodo.Model.Todo;

@Database(entities = {Todo.class}, version = 1)
public abstract class TodoDataBase extends RoomDatabase {


    public static final String DATABASE_NAME = "user_db";

    public abstract TodoDao TodoDao();
}
