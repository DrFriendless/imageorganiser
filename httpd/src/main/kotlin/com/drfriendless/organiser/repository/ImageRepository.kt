package com.drfriendless.organiser.repository

import com.drfriendless.organiser.model.Image
import org.springframework.data.repository.CrudRepository

/**
 * Created by john on 12/02/17.
 */
interface ImageRepository: CrudRepository<Image, Long> {

}