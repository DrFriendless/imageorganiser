package com.drfriendless.organiser.model

import javax.persistence.Entity
import javax.persistence.Id

/**
 * A tag used to describe an image.
 *
 * Created by john on 12/02/17.
 */
@Entity
class Tag(@Id val name: String, val description: String) {
}