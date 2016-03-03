package controllers

import play.api.mvc._

object Application extends Controller{
  def hello(name: String) = Action {
          Ok(views.html.hello(name))

}
}
