package com.example.patel.pagingtodo.Dao;

import android.arch.paging.DataSource;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.patel.pagingtodo.Model.Todo;

import java.util.List;

@Dao
public interface TodoDao {


    @Query("SELECT * FROM Todo ORDER BY todo COLLATE NOCASE ASC")
    DataSource.Factory<Integer, Todo> allTodoByName();

    @Insert
    void insert(List<Todo> todos);

    @Insert
    void insert(Todo todo);

    @Delete
    void delete(Todo todo);

}
