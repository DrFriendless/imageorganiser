package com.drfriendless.organiser.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * An image stored in the database.
 *
 * Created by john on 12/02/17.
 */
@Entity
class Image(@Id @GeneratedValue(strategy=GenerationType.AUTO) val key: Long,
            val copyrightOwner: String) {

}