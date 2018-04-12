package com.example.joanc.hw7and8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SqlHelper db = new SqlHelper(this);
/** CRUD Operations **/
// add Books
        db.addBook(new Book("Professional Android 4 Application Development",
                "Reto Meier"));
        db.addBook(new Book("Beginning Android 4 Application Development",
                "WeiMeng Lee"));
        db.addBook(new Book("Programming Android", "Wallace Jackson"));
        db.addBook(new Book("Hello, Android", "Wallace Jackson"));

// get all books
        List<Book> list = db.getAllBooks();
// update one book
        int j = db.updateBook(list.get(0));
// delete one book
        db.deleteBook(list.get(0));
// get all books
        db.getAllBooks();
    }
}
