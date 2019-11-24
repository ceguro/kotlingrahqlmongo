package com.example.demo.dao

import com.example.demo.repository.PersonRepository
import org.springframework.stereotype.Component

@Component
class PersonDao(
        private val personRepository: PersonRepository
) {

    fun getPersonById(id: String) = personRepository.findById(id)

    fun getPersonByName(name: String) = personRepository.findByNameLike(name)

}