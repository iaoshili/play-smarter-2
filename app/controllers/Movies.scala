package controllers

import javax.inject._

import play.api.i18n.{I18nSupport, MessagesApi}
import models.Movie
import play.api._
import play.api.mvc._
/**
  * Created by liaoshi on 4/23/17.
  */

@Singleton
class Movies @Inject() (val messagesApi: MessagesApi) extends Controller with I18nSupport {
  def list = Action { implicit request =>

    val movies = Movie.findAll

    Ok(views.html.movies.list(movies))
  }
}

