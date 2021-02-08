package com.popcorn.PopcornsAPI.Repository;

import java.util.List;

public interface CRUD<T> {

    public void saveItem(T item);
    public void updateItem(T item, Integer id);
    public void deleteItem(Integer id);
    public List<T> listItems();

}
