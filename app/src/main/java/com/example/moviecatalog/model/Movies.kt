package com.example.moviecatalog.model

data class Movies(
    val adult: Boolean,
    val backdrop_path: String,
    val genre_ids: List<Int>,
    val id: Int,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val video: Boolean,
    val vote_average: Double,
    val vote_count: Int
)

fun mockMovies() = listOf(
    Movies(
        adult = false,
        backdrop_path = "/bOGkgRGdhrBYJSLpXaxhXVstddV.jpg",
        genre_ids = listOf(28, 12, 14, 878),
        id = 299536,
        original_language = "en",
        original_title = "Avengers: Infinity War",
        overview = "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
        poster_path = "/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg",
        release_date = "2018-04-25",
        title = "Avengers: Infinity War",
        video = false,
        vote_average = 8.3,
        vote_count = 6937,
        popularity = 358.799,
    ),
    Movies(

        adult = false,
        backdrop_path = "/3P52oz9HPQWxcwHOwxtyrVV1LKi.jpg",
        genre_ids = listOf(28, 35, 878),
        id = 383498,
        original_language = "en",
        original_title = "Deadpool 2",
        overview = "Wisecracking mercenary Deadpool battles the evil and powerful Cable and other bad guys to save a boy's life.",
        poster_path = "/to0spRl1CMDvyUbOnbb4fTk3VAd.jpg",
        release_date = "2018-05-15",
        title = "Deadpool 2",
        video = false,
        vote_average = 7.6,
        vote_count = 3938,
        popularity = 223.011

    ),
    Movies(
        adult = false,
        backdrop_path = "/22cUd4Yg5euCxIwWzXrL4m4otkU.jpg",
        genre_ids = listOf(28, 878, 53),
        id = 500664,
        original_language = "en",
        original_title = "Upgrade",
        overview = "A brutal mugging leaves Grey Trace paralyzed in the hospital and his beloved wife dead. A billionaire inventor soon offers Trace a cure — an artificial intelligence implant called STEM that will enhance his body. Now able to walk, Grey finds that he also has superhuman strength and agility — skills he uses to seek revenge against the thugs who destroyed his life.",
        poster_path = "/adOzdWS35KAo21r9R4BuFCkLer6.jpg",
        release_date = "2018-06-01",
        title = "Upgrade",
        video = false,
        vote_average = 7.6,
        vote_count = 138,
        popularity = 32.969
    )
)