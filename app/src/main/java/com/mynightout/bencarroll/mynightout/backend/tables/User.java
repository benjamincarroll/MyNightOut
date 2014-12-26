package com.mynightout.bencarroll.mynightout.backend.tables;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by bencarroll on 2014-12-26.
 */
public class User extends MyNightOutObject {

    @DatabaseField(generatedId = true)
    private String mFirstName;

    @DatabaseField
    private String mLastName;

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }
}
