package com.example.data.repo

import com.example.data.remot.ApiService
import com.example.domain.entity.CategoryResponse
import com.example.domain.repo.MealsRepo

class MealsRepoImpl (private val api:ApiService):MealsRepo{
    override suspend fun getMealsFromRemote(): CategoryResponse=api.getMeals()
}