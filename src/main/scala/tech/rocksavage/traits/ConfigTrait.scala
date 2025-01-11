package tech.rocksavage.traits

trait ModuleConfig {
  def getDefaultConfigs: Map[String, Any]
}