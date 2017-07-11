package elias.app.taptesting;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by vhmOliveira on 31/05/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    // Logcat tag
    private static final String LOG = "DatabaseHelper";

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "TestManager";

    // Table Names
    private static final String TABLE_Frequency = "freqTable";
    private static final String TABLE_TEST = "testTable";

    // Common column names
    private static final String KEY_ID = "id";
    private static final String KEY_CREATED_AT = "created_at";

    // Frequency Table - column names
    private static final String KEY_START_TIME = "StartTime";
    private static final String KEY_END_TIME = "EndTime";

    // Test Table - column names
    private static final String KEY_Frequency_ID = "tag_id";
    private static final String KEY_LEFT_BUTTON = "left_button";
    private static final String KEY_RIGHT_BUTTON = "right_button";

    // Table Create Statements

    // Frequency table create statement
    private static final String CREATE_TABLE_FREQUENCY = "CREATE TABLE " + TABLE_Frequency
            + "(" + KEY_ID + " INTEGER PRIMARY KEY," + KEY_START_TIME + " INTEGER," + KEY_END_TIME + " INTEGER,"
            + KEY_CREATED_AT + " DATETIME" + ")";

    // testTable table create statement
    private static final String CREATE_TABLE_TEST = "CREATE TABLE "
            + TABLE_TEST + "(" + KEY_ID + " INTEGER PRIMARY KEY,"
            + KEY_Frequency_ID + " INTEGER," + KEY_LEFT_BUTTON + " INTEGER," + KEY_RIGHT_BUTTON + " INTEGER,"
            + KEY_CREATED_AT + " DATETIME" + ")";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // creating required tables
        long numOfEntries = DatabaseUtils.queryNumEntries(db, "testTable");
        if(numOfEntries == 0l) {
            // Tabela vazia, preencha com seus dados iniciais
            db.execSQL(CREATE_TABLE_TEST);
        }
        db.execSQL(CREATE_TABLE_FREQUENCY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_Frequency);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_TEST);

        // create new tables
        onCreate(db);
    }
    // ------------------------ "frequency" table methods ----------------//

    /**
     * Creating a Frequency_Table
     */
    public void createFrequencyTable(freqTable freq) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_END_TIME, freq.getEndTime());

        // insert row
        long frequency_id = db.insert(TABLE_Frequency, null, values);
        db.close();
    }

    /**
     * get single frenquency
     */
    public freqTable getFrenquency(long todo_id) {
        SQLiteDatabase db = this.getReadableDatabase();

        String selectQuery = "SELECT  * FROM " + TABLE_Frequency + " WHERE "
                + KEY_ID + " = " + todo_id;

        Log.e(LOG, selectQuery);

        Cursor c = db.rawQuery(selectQuery, null);

        if (c != null)
            c.moveToFirst();

        freqTable td = new freqTable();
        td.setId(c.getInt(c.getColumnIndex(KEY_ID)));
        td.setEndTime(c.getInt(c.getColumnIndex(KEY_END_TIME)));

        return td;
    }

    /**
     * getting all frequency
     * */
    public List<freqTable> getAllFrequency() {
        List<freqTable> todos = new ArrayList<freqTable>();
        String selectQuery = "SELECT  * FROM " + TABLE_Frequency;

        Log.e(LOG, selectQuery);

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {
                freqTable td = new freqTable();
                td.setId(c.getInt((c.getColumnIndex(KEY_ID))));
                td.setEndTime(c.getInt(c.getColumnIndex(KEY_END_TIME)));

                // adding to todo list
                todos.add(td);
            } while (c.moveToNext());
        }

        return todos;
    }

    /**
     * Updating a frequency
     */
    public int updateFrequency(freqTable todo) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_END_TIME, todo.getEndTime());

        // updating row
        return db.update(TABLE_Frequency, values, KEY_ID + " = ?",
                new String[] { String.valueOf(todo.getId()) });
    }

    /**
     * Deleting a frequency
     */
    public void deleteFrequency(long tado_id) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_Frequency, KEY_ID + " = ?",
                new String[] { String.valueOf(tado_id) });
    }

    // Getting contacts Count
    public int getContactsCount() {
        String countQuery = "SELECT  * FROM " + TABLE_TEST;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        // return count
        return cursor.getCount();
    }
    // ------------------------ "test_Table" table methods ----------------//

    /**
     * Creating test_Table
     */
    public void createTest_Table(long frenq_id, long leftButton, long rightButton) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_Frequency_ID, frenq_id);
        values.put(KEY_LEFT_BUTTON, leftButton);
        values.put(KEY_RIGHT_BUTTON, rightButton);
        values.put(KEY_CREATED_AT, getDateTime());

        //inserting row
        long id = db.insert(TABLE_TEST, null, values);
        db.close();
    }
    /**
     * get datetime
     * */
    private String getDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        Date date = new Date();
        return dateFormat.format(date);
    }
}
