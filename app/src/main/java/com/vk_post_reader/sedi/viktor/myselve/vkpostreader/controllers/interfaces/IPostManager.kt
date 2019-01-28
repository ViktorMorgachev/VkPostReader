package com.vk_post_reader.sedi.viktor.myselve.vkpostreader.controllers.interfaces

import com.vk_post_reader.sedi.viktor.myselve.vkpostreader.controllers.data.Post

interface IPostManager {

    fun updatePosts()
    fun getAllPosts()
    fun deletePost(post : Post)
    fun markPostAsReaded()

}