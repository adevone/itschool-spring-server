package io.adev.itschool

import io.adev.itschool.data.ZinevichYanDataset
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GenresController {
    @GetMapping("genres/all/Zinevich")
    fun getAllGenres(): List<SubCategory> {
        return ZinevichYanDataset().getAllGenres()
    }
}