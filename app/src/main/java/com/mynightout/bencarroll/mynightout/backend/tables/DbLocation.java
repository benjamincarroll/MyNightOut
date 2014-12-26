package com.mynightout.bencarroll.mynightout.backend.tables;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.sql.SQLException;

/**
 * Created by bencarroll on 2014-12-26.
 */

@DatabaseTable(tableName = "location")
public class DbLocation extends MyNightOutObject {

    public static final String LOCATION_NAME_FIELD_NAME = "location_name";

    @DatabaseField(canBeNull = false, columnName = LOCATION_NAME_FIELD_NAME)
    private String name;

    @DatabaseField
    private long createdAt;

    @DatabaseField
    private long updatedAt;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public static Dao<DbLocation, Integer> getDao(OrmLiteSqliteOpenHelper helper) throws SQLException {
        return helper.getDao(DbLocation.class);
    }
}
