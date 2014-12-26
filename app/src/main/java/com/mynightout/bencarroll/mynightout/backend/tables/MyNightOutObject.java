package com.mynightout.bencarroll.mynightout.backend.tables;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by Benjamin Carroll on 2014-12-26.
 */
public abstract class MyNightOutObject {

    public static final String ID_FIELD_NAME = "_id";
    public static final String SERVER_ID_FIELD_NAME = "server_id";


    @DatabaseField(generatedId = true, columnName = SERVER_ID_FIELD_NAME)
    private int mDbId;

    @DatabaseField(columnName = ID_FIELD_NAME)
    private int mServerId;

    public MyNightOutObject() { }

    protected MyNightOutObject(MyNightOutObject other) {
        this.mDbId = other.mDbId;
    }

    public int getServerId() {
        return mServerId;
    }

    public void setServerId(int serverId) {
        mServerId = serverId;
    }

    public int getDbId() {
        return mDbId;
    }

    public void setDbId(int dbId) {
        this.mDbId = dbId;
    }

    @Override
    public String toString() {
        return "LocalObject{" +
                "mDbId=" + mDbId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyNightOutObject)) return false;

        MyNightOutObject that = (MyNightOutObject) o;

        if (mDbId != that.mDbId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return mDbId;
    }
}
