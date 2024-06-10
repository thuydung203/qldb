package com.example.qunldanhb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "university.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_UNITS = "units";
    public static final String TABLE_EMPLOYEES = "employees";

    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_UNIT_CODE = "unit_code";
    public static final String COLUMN_UNIT_NAME = "unit_name";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_WEBSITE = "website";
    public static final String COLUMN_LOGO = "logo";
    public static final String COLUMN_ADDRESS = "address";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_PARENT_UNIT_CODE = "parent_unit_code";

    public static final String COLUMN_EMPLOYEE_ID = "employee_id";
    public static final String COLUMN_EMPLOYEE_NAME = "employee_name";
    public static final String COLUMN_POSITION = "position";
    public static final String COLUMN_EMPLOYEE_EMAIL = "employee_email";
    public static final String COLUMN_EMPLOYEE_PHONE = "employee_phone";
    public static final String COLUMN_AVATAR = "avatar";

    private static final String TABLE_CREATE_UNITS =
            "CREATE TABLE " + TABLE_UNITS + " (" +
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_UNIT_CODE + " TEXT, " +
                    COLUMN_UNIT_NAME + " TEXT, " +
                    COLUMN_EMAIL + " TEXT, " +
                    COLUMN_WEBSITE + " TEXT, " +
                    COLUMN_LOGO + " BLOB, " +
                    COLUMN_ADDRESS + " TEXT, " +
                    COLUMN_PHONE + " TEXT, " +
                    COLUMN_PARENT_UNIT_CODE + " TEXT" +
                    ");";

    private static final String TABLE_CREATE_EMPLOYEES =
            "CREATE TABLE " + TABLE_EMPLOYEES + " (" +
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_EMPLOYEE_ID + " TEXT, " +
                    COLUMN_EMPLOYEE_NAME + " TEXT, " +
                    COLUMN_POSITION + " TEXT, " +
                    COLUMN_EMPLOYEE_EMAIL + " TEXT, " +
                    COLUMN_EMPLOYEE_PHONE + " TEXT, " +
                    COLUMN_AVATAR + " BLOB" +
                    ");";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE_UNITS);
        db.execSQL(TABLE_CREATE_EMPLOYEES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_UNITS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EMPLOYEES);
        onCreate(db);
    }
}
