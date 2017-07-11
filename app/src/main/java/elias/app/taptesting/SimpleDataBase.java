package elias.app.taptesting;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Debug;
import android.util.Log;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by vhmOliveira on 06/06/2016.
 */
public class SimpleDataBase extends SQLiteOpenHelper {

    // Logcat tag
    private static final String LOG = "DatabaseHelper";

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "TestManager";

    // Table Names
    private static final String TABLE_TEST = "testTable";

    // Test_Table names
    private static final String KEY_ID = "id";
    private static final String FREQUENCY_LIST = "frequencyList";
    private static final String KEY_MAIN_BUTTON = "main_button";
    private static final String PDQ39_TOTAL_SCORE = "pdq39_total_score";
    private static final String MEEMinfo_TOTAL_SCORE = "MEEMinfo_total_score";
    private static final String KEY_CREATED_AT = "created_at";

    // Table Create Statements
    // testTable table create statement
    private static final String CREATE_TABLE_TEST = "CREATE TABLE "
            + TABLE_TEST + "(" + KEY_ID + " INTEGER PRIMARY KEY,"
            + KEY_MAIN_BUTTON + " INTEGER," + FREQUENCY_LIST + " TEXT NOT NULL," + PDQ39_TOTAL_SCORE + " INTEGER,"
            + MEEMinfo_TOTAL_SCORE + " INTEGER,"+ KEY_CREATED_AT + " DATETIME" + ")";

    private Context _context;
    private  static SQLiteDatabase db = null;
    private static SimpleDataBase info;

    private SimpleDataBase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        _context = context;
        db = this.getDatabase();
    }

    public static SimpleDataBase getInstance(Context context){
        if(info == null){
            info = new SimpleDataBase(context);
        }
        return info;
    }

    /**
     * Este é o endereço onde o android salva os bancos de dados criado pela aplicação,
     */
    private static String DBPATH = "/data/data/elias.app.taptesting/databases/";

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
    }

    private boolean checkDataBase(){
        SQLiteDatabase db = null;

        try {
            String path = DBPATH + DATABASE_NAME;
            db = SQLiteDatabase.openDatabase(path, null, SQLiteDatabase.OPEN_READONLY);
            db.close();
        } catch (SQLiteException e) {
            // O banco não existe
        }

        // Retorna verdadeiro se o banco existir, pois o ponteiro irá existir,
        // se não houver referencia é porque o banco não existe
        return db != null;

    }
    private void createDataBase() throws Exception {
        // Verifica se o banco da aplicação já foi criado
        boolean exists = checkDataBase();

        if(!exists) {
            // Chama esse método para que o android
            // crie um banco vazio e o diretório onde iremos copiar
            // no banco que está no assets.
            this.getReadableDatabase();

            // Se o banco de dados não existir será copiado o nosso
            // arquivo em /assets para o local onde o android os salva
            try {
                copyDatabase();
            } catch (IOException e) {
                throw new Error("Não foi possível copiar o arquivo");
            }

        }

    }

    /**
     * Esse método é responsável por copiar o banco do diretório
     * assets para o diretório padrão do android.
     */

    private void copyDatabase() throws IOException {
        String dbPath = DBPATH + DATABASE_NAME;

        // Abre o arquivo o destino para copiar o banco de dados
        OutputStream dbStream = new FileOutputStream(dbPath);

        // Abre Stream do nosso arquivo que esta no assets
        InputStream dbInputStream =
                _context.getAssets().open("linguagens.sqlite");

        byte[] buffer = new byte[1024];
        int length;
        while((length = dbInputStream.read(buffer)) > 0) {
            dbStream.write(buffer, 0, length);
        }

        dbInputStream.close();

        dbStream.flush();
        dbStream.close();

    }

    private SQLiteDatabase getDatabase() {
        try{
            // Verificando se o banco já foi criado e se não foi o
            // mesmo é criado.
            createDataBase();

            // Abrindo database
            String path = DBPATH + DATABASE_NAME;

            return SQLiteDatabase.openDatabase(path, null, SQLiteDatabase.OPEN_READWRITE);
        }catch (Exception e) {
            // Se não conseguir copiar o banco um novo será retornado
            return getWritableDatabase();
        }

    }
    // ------------------------ "test_Table" table methods ----------------//

    /**
     * Creating test_Table
     */
    public void createTest_Table(String Longs, int mainButton, int pdq39, int MEEMinfo) throws IOException, SQLException{
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(FREQUENCY_LIST, Longs);
        values.put(KEY_MAIN_BUTTON, mainButton);
        values.put(PDQ39_TOTAL_SCORE, pdq39);
        values.put(MEEMinfo_TOTAL_SCORE, MEEMinfo);
        values.put(KEY_CREATED_AT, getDateTime());

        //inserting row
        long id = db.insert(TABLE_TEST, null, values);
        db.close();
    }
    private long lastID(){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT" + KEY_ID + "from" + TABLE_TEST + "order by" + KEY_ID + "DESC limit 1";
        Cursor c = db.rawQuery(query,null);
        if (c != null && c.moveToFirst()) {
            long lastId = c.getLong(0); //The 0 is the column index, we only have 1 column, so the index is 0
            return lastId;
        }
        return 0;
    }
    public void insertTaptestisting(String Longs, int mainButton){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(FREQUENCY_LIST, Longs);
        values.put(KEY_MAIN_BUTTON, mainButton);
        values.put(KEY_CREATED_AT, getDateTime());
        long aux = lastID();
        //update row
        long id = db.update(TABLE_TEST,values, KEY_ID + "=" + aux,null);
        db.close();
    }
    public void insertPdq39(int pdq39){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(PDQ39_TOTAL_SCORE, pdq39);
        long aux = lastID();
        //update row
        long id = db.update(TABLE_TEST,values, KEY_ID + "=" + aux,null);
        db.close();
    }
    public void insertMEEM(int MEEMinfo){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(MEEMinfo_TOTAL_SCORE, MEEMinfo);
        long aux = lastID();
        //update row
        long id = db.update(TABLE_TEST,values, KEY_ID + "=" + aux,null);
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

    public String getFrenquency(long todo_id) {
        SQLiteDatabase db = this.getReadableDatabase();
        String selectQuery = "SELECT  * FROM " + TABLE_TEST + " WHERE "
                + KEY_ID + " = " + todo_id;

        Log.e(LOG, selectQuery);

        Cursor c = db.rawQuery(selectQuery, null);
        return  c.getString(c.getColumnIndex(FREQUENCY_LIST));
    }
}