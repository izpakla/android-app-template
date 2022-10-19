package com.example.data.local.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.data.local.db.entities.Item
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemsDao {

    @Query("SELECT * FROM items")
    fun getItems(): Flow<List<Item>>

    @Insert
    suspend fun insertItem(item: Item): Long

    @Delete
    suspend fun deleteItem(item: Item)

}