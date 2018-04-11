package com.example.joanc.hw7and8;

import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;

/**
 * Created by joanc on 4/10/2018.
 */

public class SqlHelper extends SQLiteOpenHelper {

    public SqlHelper() {
        super();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        return null;
    }


    @Override
    public void addBook(Book b) {
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return null;
    }


    @Override
    public void UpdateBook(Book b) {
        return null;
    }


    @Override
    public void deleteBook(Book b) {
        return null;
    }
}