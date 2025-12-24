package com.app.agrilink360;

import static org.xmlpull.v1.XmlPullParser.TEXT;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.sql.SQLClientInfoException;

public class Connect extends SQLiteOpenHelper {

    public  static String dbname = "DATABASE";
    public static String dbtable = "users";
    public static int dbversion = 1;

   public static String emailAddress = " emailAddress ";
    public static  String password = "password";

    public static String pnone = "pnone";

    public static String ageODB = "ageODB";
    public static String place = "place";
    public static String fullName = "fullName";
    public Connect(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = "create table " + dbtable + "("+" INTERGER PRIMARY KEY AUTOINCREMENT, "+ fullName + " TEXT,  "+ emailAddress +" TEXT, "+ password +"TEXT, "+pnone +" TEXT, "+place +" TEXT, "+ ageODB+" TEXT)";
            db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + dbtable);
        onCreate(db);

    }

    public void addUser(User user){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(fullName, user.getFullName());
        values.put(emailAddress, user.getEmailAddress());
        values.put(pnone, user.getPnone());
        values.put(ageODB, user.getAgeODB());
        values.put(place, user.getPlace());
        values.put(password, user.getPassword());
        db.insert(dbtable, null,values);


    }
}
