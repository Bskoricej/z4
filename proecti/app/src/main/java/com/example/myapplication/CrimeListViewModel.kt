package com.example.myapplication

import androidx.lifecycle.ViewModel
import java.util.*

class CrimeListViewModel: ViewModel() {
    private val crimeRepository=CrimeRepository.get()
    val crimeListLiveData =crimeRepository.getCrimes()
    }