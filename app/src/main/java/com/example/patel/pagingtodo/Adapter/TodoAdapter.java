package com.example.patel.pagingtodo.Adapter;

import android.arch.paging.PagedListAdapter;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.patel.pagingtodo.MainActivity;
import com.example.patel.pagingtodo.Model.Todo;
import com.example.patel.pagingtodo.R;

import java.util.List;

public class TodoAdapter extends PagedListAdapter<Todo, TodoAdapter.ViewHolder> {


    public TodoAdapter() {
        super(Todo.DIFF_CALLBACK);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.todo_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindTo(getItem(position));
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView todoName;
        public Todo todo;

        public ViewHolder(View itemView) {
            super(itemView);
            todoName = itemView.findViewById(R.id.name);

        }

        void bindTo(Todo todo) {
            this.todo = todo;
            todoName.setText(todo.getTodo());
        }


    }
}
