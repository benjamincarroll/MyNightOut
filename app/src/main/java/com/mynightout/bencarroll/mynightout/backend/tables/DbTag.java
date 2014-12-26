package com.mynightout.bencarroll.mynightout.backend.tables;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.sql.SQLException;

/**
 * Created by bencarroll on 2014-12-26.
 */

@DatabaseTable(tableName = "tag")
public class DbTag {

    public static final String TAG_NAME_FIELD_NAME = "tag_name";

    @DatabaseField(canBeNull = false, columnName = TAG_NAME_FIELD_NAME)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Dao<DbTag, Integer> getDao(OrmLiteSqliteOpenHelper helper) throws SQLException {
        return helper.getDao(DbTag.class);
    }
}
