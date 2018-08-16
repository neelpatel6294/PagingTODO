package com.example.patel.pagingtodo.Model;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;

@Entity
public class Todo {

    public static DiffUtil.ItemCallback<Todo> DIFF_CALLBACK = new DiffUtil.ItemCallback<Todo>() {
        @Override
        public boolean areItemsTheSame(@NonNull Todo oldItem, @NonNull Todo newItem) {
            return oldItem.id == newItem.id;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Todo oldItem, @NonNull Todo newItem) {
            return oldItem.equals(newItem);
        }
    };


//    private DiffCallback diffCallback = new  DiffCallback<Todo>() {
//
//        @Override
//        public boolean areItemsTheSame(@NonNull Todo oldItem, @NonNull Todo newItem) {
//
//            return  oldItem.id == newItem.id;
//        }
//
//        @Override
//        public boolean areContentsTheSame(@NonNull Todo oldItem, @NonNull Todo newItem) {
//            return  oldItem == newItem;
//        }
//    };

    @PrimaryKey(autoGenerate = true)
    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String todo;

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }


}
