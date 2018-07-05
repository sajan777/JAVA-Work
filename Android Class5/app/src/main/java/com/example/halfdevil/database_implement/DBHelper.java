package com.example.halfdevil.database_implement;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class DBHelper extends SQLiteOpenHelper {


    static final String DATABASE_NAME = "Contact_Manager";
    static final int DATABASE_VERSION = 1;
    static final String TABLE_NAME = "contact_Table";
    static final String USER_ID = "userid";
    static final String NAME = "name";
    static final String EMAIL = "email";
    static final String DOB = "dob";
    static final String PASSWORD ="pass";
    //SQLiteDatabase db;


    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String TABLE = "CREATE TABLE " + TABLE_NAME + "(" + USER_ID + "INTEGER PRIMARY KEY AUTOINCREMENT ,  " + NAME + "TEXT,  " + PASSWORD + " text, " + EMAIL + " text, " + DOB + "TEXT" + ")";
        db.execSQL(TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public void addContact(Contacts contact) {
        SQLiteDatabase    db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(NAME, contact.getName());
        cv.put(PASSWORD, contact.getPassword());
        cv.put(EMAIL, contact.getEmail());
        cv.put(DOB, contact.getDob());
        db.insert(TABLE_NAME, null, cv);
        db.close();

    }

    public void deleteContact(Contacts contact) {
        SQLiteDatabase  db = this.getWritableDatabase();
        db.delete(TABLE_NAME, USER_ID + "=?", new String[]{String.valueOf(contact.getUserId())});
    }

    public int getCount() {
        SQLiteDatabase   db = this.getReadableDatabase();
        String count = "SELECT * FROM " + TABLE_NAME;
        Cursor cursor = db.rawQuery(count, null);
        return cursor.getCount();
    }
    public Contacts getContact(int id){
        Contacts contact = null;
        SQLiteDatabase  db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_NAME,new String[]{NAME,PASSWORD,EMAIL,DOB},
                USER_ID+"=?",new  String[]{String.valueOf(contact.getUserId())},null,null,null,null);

        if(cursor!=null){
            cursor.moveToFirst();
            contact = new Contacts(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3));

        }
        return contact;
    }
    public  int updateContact(Contacts contact){

        SQLiteDatabase  db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(NAME,contact.getName());
        cv.put(PASSWORD, contact.getPassword());
        cv.put(EMAIL,contact.getEmail());
        cv.put(DOB,contact.getDob());
        return db.update(TABLE_NAME,cv,USER_ID+"=?",new String[]{String.valueOf(contact.getUserId())});
    }

    public boolean validateLogin(String e, String p)
    {
        SQLiteDatabase  db=this.getReadableDatabase();
        Cursor cursor =db.rawQuery("select email, Pass from contact where Pass=?",new String[]{p});
        if(cursor.getCount()!=0){
            if (EMAIL.equals(cursor.getString(0))){
                if (PASSWORD.equals(cursor.getString(1))){
                    return true;
                }
            }

        }
        return false;
    }
}
