package models


case class Movie(
                  imdb: String, name: String, image: String)

object Movie {
  var movies = Set(
    Movie("tt2782216", "请回答1997", "https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2407174319.webp"),
    Movie("tt1431045", "死侍", "https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2309264172.webp")
  )

  def findAll = movies.toList.sortBy(_.imdb)
}