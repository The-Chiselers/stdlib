package tech.rocksavage.traits

trait ParameterizedModule {
  def setParams(params: Map[String, Any]): Unit
  def getParams: Map[String, Any]
}
