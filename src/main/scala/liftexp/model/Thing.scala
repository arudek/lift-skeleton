package liftexp 
package model 

import _root_.net.liftweb.mapper._
import _root_.net.liftweb.util._
import _root_.net.liftweb.common._

/**
* The singleton that has methods for accessing the database
*/
object Thing extends Thing with LongKeyedMetaMapper[Thing] with CRUDify[Long,Thing] {
  override def dbTableName = "thing" // define the DB table name
  override def fieldOrder = List(number, size, color)
  override def showAllMenuName = "Räume"
  override def createMenuName = "Neuen Raum anlegen"
}

class Thing extends LongKeyedMapper[Thing] with IdPK {
  def getSingleton = Thing

  object number extends MappedInt (this)
  object size extends MappedInt (this)
  object color extends MappedInt (this)
  
}
