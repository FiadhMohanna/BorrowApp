package com.session4.borrow.db;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.TypeConverters;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;
// TODO 3:  Use @Dao to tell Room that this is a DAO class.
@Dao
@TypeConverters(DateConverter.class)
public interface BorrowModelDao {
    // TODO 4: TODO : Write an SQL query to find all borrowed items


    // TODO 5: Write add borrow Function



    @Delete
    void deleteBorrow(BorrowModel borrowModel);

}
