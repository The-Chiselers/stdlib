// (c) 2024 Rocksavage Technology, Inc.
// This code is licensed under the Apache Software License 2.0 (see LICENSE.MD)
package tech.rocksavage.traits

/**
 * A trait that defines the interface for module configurations.
 * Implementations of this trait should provide a method to retrieve default configurations
 * as a `Map[String, Any]`, where the keys are configuration names and the values are the
 * corresponding configuration parameters.
 */
trait ModuleConfig {
  /**
   * Retrieves the default configurations for the module.
   *
   * @return A `Map[String, Any]` containing the default configurations, where the keys are
   *         configuration names and the values are the corresponding configuration parameters.
   */
  def getDefaultConfigs: Map[String, Any]
}