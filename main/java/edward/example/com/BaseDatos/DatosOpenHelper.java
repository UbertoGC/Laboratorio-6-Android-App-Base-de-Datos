package edward.example.com.BaseDatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatosOpenHelper extends SQLiteOpenHelper {
    public DatosOpenHelper(Context context){
        super(context, "Datos", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase){
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE IF NOT EXISTS CLIENTE(");
        sql.append("NOMBRE TEXT(250), ");
        sql.append("DIRECCION TEXT(250), ");
        sql.append("EMAIL TEXT(200), ");
        sql.append("TELEFONO TEXT(20))");

        sqLiteDatabase.execSQL(sql.toString());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int il) {

    }
}
