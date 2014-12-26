package com.mynightout.bencarroll.mynightout.backend.tables;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.sql.SQLException;

/**
 * Created by bencarroll on 2014-12-26.
 */

@DatabaseTable(tableName = "night")
public class DbNight extends MyNightOutObject {

    @DatabaseField(foreign = true, foreignAutoRefresh = true)
    DbLocation mDbLocation;

    @DatabaseField
    String mDescription;

    @DatabaseField
    int mDate;

    public DbLocation getDbLocation() {
        return mDbLocation;
    }

    public void setDbLocation(DbLocation dbLocation) {
        mDbLocation = dbLocation;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public int getDate() {
        return mDate;
    }

    public void setDate(int date) {
        mDate = date;
    }

    public static Dao<DbNight, Integer> getDao(OrmLiteSqliteOpenHelper helper) throws SQLException {
        return helper.getDao(DbNight.class);
    }
}
