package com.javacosmos.dao;

import com.javacosmos.model.TodoItem;

import java.util.List;

public interface TodoDao {
    /**
     * @return A list of TodoItems
     */
    public List<TodoItem> readTodoItems() throws Exception;

    /**
     * @param todoItem
     * @return whether the todoItem was persisted.
     */
    public TodoItem createTodoItem(TodoItem todoItem);

    /**
     * @param id
     * @return the TodoItem
     */
    public TodoItem readTodoItem(String id) throws Exception;

    /**
     * @param id
     * @return the TodoItem
     */
    public TodoItem updateTodoItem(String id, boolean isComplete) throws Exception;

    /**
     *
     * @param id
     * @return whether the delete was successful.
     */
    public boolean deleteTodoItem(String id) throws Exception;
}