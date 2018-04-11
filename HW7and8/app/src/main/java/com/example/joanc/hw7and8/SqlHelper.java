package com.example.joanc.hw7and8;

import android.database.SQLException;
import java.util.ArrayList;
import java.util.List;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;
import java.util.LinkedList;
import android.content.Context;
import android.content.ContentValues;

/**
 * Created by joanc on 4/10/2018.
 */



public class SqlHelper extends SQLiteOpenHelper {

    // Create Table Columns
    public static final String TABLE_BOOKS = "books";
    private static final String KEY_ID = "id";
    private static final String KEY_TITLE = "title";
    private static final String KEY_AUTHOR = "author";
    private static final String KEY_RATING = "rating";

    public SqlHelper(Context context) {
        super(context, DATABSE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_BOOK_TABLE = "CREATE TABLE books ( " + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "title TEXT, " + "author TEXT, " + "rating TEXT )";

        db.execSQL(CREATE_BOOK_TABLE);
    }
}

    @Override
    public void addBook(SQLiteDatabase db) {

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
