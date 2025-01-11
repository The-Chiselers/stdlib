package tech.rocksavage

import chisel3.RawModule

trait ChiselModule extends RawModule {
  def defaultConfigs: Map[String, Any]
}
