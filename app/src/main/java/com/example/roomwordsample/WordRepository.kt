package com.example.roomwordsample

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.roomwordsample.WordDao
import com.example.roomwordsample.Word

class WordRepository (private val wordDao: WordDao) {

    val allWords: LiveData<List<Word>> = wordDao.getAllWords()

    @WorkerThread
    suspend fun insert(word: Word){
        wordDao.insert(word)
    }
}