// (c) 2024 Rocksavage Technology, Inc.
// This code is licensed under the Apache Software License 2.0 (see LICENSE.MD)
package tech.rocksavage.traits

trait ModuleConfig {
  def getDefaultConfigs: Map[String, Any]
}