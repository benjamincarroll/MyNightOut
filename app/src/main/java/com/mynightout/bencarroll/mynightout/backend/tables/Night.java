package com.mynightout.bencarroll.mynightout.backend.tables;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by bencarroll on 2014-12-26.
 */
public class Night extends MyNightOutObject {

    @DatabaseField(foreign = true, foreignAutoRefresh = true)
    DbLocation mDbLocation;

    @DatabaseField
    String mDescription;

    @DatabaseField
    int mDate;

    
}
