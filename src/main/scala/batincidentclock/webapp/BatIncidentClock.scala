package batincidentclock.webapp

import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document
import org.scalajs.jquery.jQuery

object BatIncidentClock extends JSApp {
  def main(): Unit = {
    println("Hello world!")
    //appendPar(document.body, "Hello Mom!")
    //jQuery("body").append("<p>[message]</p>")
    //jQuery(setupUI _)
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }
  
  def addClickedMessage(): Unit = {
    appendPar(document.body, "You clicked the button! You get nothing.")
  }
  
  def setupUI(): Unit = {
    jQuery("#click-me-button").click(addClickedMessage _)
    jQuery("body").append("<p>Hello World</p>")
  }
}
