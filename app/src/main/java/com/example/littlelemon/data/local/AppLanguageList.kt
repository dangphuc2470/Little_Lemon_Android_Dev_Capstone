package com.example.littlelemon.data.local

import com.example.littlelemon.model.AppLanguage
import com.example.littlelemoncoursera.R

object AppLanguageList {
    val allLanguages:List<AppLanguage> = listOf(
        AppLanguage(name = "English", res = R.drawable.en, langCode = "en",),
        AppLanguage(name = "Vietnamese", res = R.drawable.vi, langCode = "vi",),
    )
}