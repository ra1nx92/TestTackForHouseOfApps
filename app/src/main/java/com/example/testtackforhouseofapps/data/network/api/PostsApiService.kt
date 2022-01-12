package com.example.testtackforhouseofapps.data.network.api

import com.example.testtackforhouseofapps.data.network.model.AlbumsList
import com.example.testtackforhouseofapps.data.network.model.CommentsList
import com.example.testtackforhouseofapps.data.network.model.PhotosList
import com.example.testtackforhouseofapps.data.network.model.PostsList
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface PostsApiService {

    @GET("posts?_start=0&_")
    fun getPostsList(
        @Query("limit") limit: Int = LIMIT_MESSAGE
    ): Observable<PostsList>

    @GET("comments?")
    fun getComments(
        @Query("postId") postsId: Int = POSTS_ID
    ): Observable<CommentsList>

    @GET("albums?_start=0&_")
    fun getAlbums(
        @Query("limit") albumLimit: Int = LIMIT_ALBUM
    ): Observable<AlbumsList>

    @GET("photos?")
    fun getPhotoFromAlbum(
        @Query("albumId") albumId: Int = ALBUM_ID
    ): Observable<PhotosList>

    companion object {
        private const val LIMIT_MESSAGE = 20
        private const val LIMIT_ALBUM = 20
        private const val POSTS_ID = 1
        private const val ALBUM_ID = 1
    }
}