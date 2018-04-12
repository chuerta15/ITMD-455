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
import java.util.*;

/**
 * Created by joanc on 4/07/2018.
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
    //Adding Books function
    public void addBook(Book book) {
        Log.d("addBook", book.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_TITLE, book.getTitle());
        values.put(KEY_AUTHOR, book.getAuthor());
        values.put(KEY_RATING, book.getRatings());
        db.insert(TABLE_BOOKS, null, values);
        db.close();

    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> books = new LinkedList<Book>();
        String query = "SELECT * FROM " + TABLE_BOOKS;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        Book book = null;
        if (cursor.moveToFirst()) {
            do {
                book = new Book();
                book.setId(Integer.parseInt(cursor.getString(0)));
                book.setTitle(cursor.getString(1));
                book.setAuthor(cursor.getString(2));
                book.setRatings(cursor.getString(3));
                books.add(book);
            } while (cursor.moveToNext());
        }
        Log.d("getAllBooks()", books.toString());
        return books;
    }


    @Override
    public void UpdateBook(Book b) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("title", book.getTitle());
        values.put("author", book.getAuthor());
        int j = db.update(TABLE_BOOKS, values, KEY_ID+" = ?"
        new String[] { String.valueOf(book.getId()) });
        db.close();
        Log.d("UpdateBook", book.toString());
        return j;

    }


    @Override
    public void deleteBook(Book b) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_BOOKS, KEY_ID+" = ?",
                new String[] { String.valueOf(book.getId()) });
        db.close();
        Log.d("deleteBook", book.toString());
    }
}
