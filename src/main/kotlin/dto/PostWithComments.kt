package ru.netology.nmedia.dto

data class PostWithComments(
    val post: Post,
    val author: Author,
    val comments: List<CommentWithAuthor>
)