package com.example.patel.pagingtodo.ViewModel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.paging.LivePagedListBuilder;
import android.arch.paging.PagedList;
import android.os.AsyncTask;

import com.example.patel.pagingtodo.Dao.TodoDao;
import com.example.patel.pagingtodo.Model.Todo;

public class TodoViewModel extends ViewModel {

    public LiveData<PagedList<Todo>> todoList;

    public TodoViewModel() {
    }

    public void init(TodoDao todoDao) {
        PagedList.Config pagedListConfig = (new PagedList.Config.Builder())
                .setEnablePlaceholders(true)
                .setPrefetchDistance(10)
                .setPageSize(20)
                .build();

        todoList = new LivePagedListBuilder<>(
                todoDao.allTodoByName(), pagedListConfig)
                .build();
    }

}

