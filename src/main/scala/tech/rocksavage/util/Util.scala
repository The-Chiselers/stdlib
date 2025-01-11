// (c) 2024 Rocksavage Technology, Inc.
// This code is licensed under the Apache Software License 2.0 (see LICENSE.MD)
package tech.rocksavage.util

import java.io.{ByteArrayOutputStream, PrintWriter}
import scala.util.Using
import sys.process._

/**
 * Utility object providing helper methods for system operations, such as finding executables
 * in the system's PATH and running shell commands.
 */
object Util {

  /**
   * Searches for an executable in the system's PATH.
   *
   * @param program The name of the executable to search for.
   * @return An `Option[String]` containing the full path to the executable if found, or `None` if not found.
   */
  def which(program: String): Option[String] = {
    val envPath  = sys.env("PATH")
    val pathList = envPath.split(java.io.File.pathSeparator).toList
    // search with and without .exe on Windows
    val resultUnix = pathList
      .find(dir => new java.io.File(dir, program).canExecute)
      .map(_ + "/" + program)
    val resultWindows = pathList
      .find(dir => new java.io.File(dir, program + ".exe").canExecute)
      .map(_ + "\\" + program + ".exe")
    resultUnix.orElse(resultWindows)
  }

  /**
   * Runs a shell command and captures its output and exit status.
   *
   * @param cmd A sequence of strings representing the command and its arguments.
   * @return A tuple containing:
   *         - The exit status of the command (Int).
   *         - The standard output of the command as a String.
   *         - The standard error of the command as a String.
   */
  def runCommand(cmd: Seq[String]): (Int, String, String) = {
    val stdout = new StringBuilder
    val stderr = new StringBuilder
    val logger = ProcessLogger(
      (line: String) => stdout.append(line + "\n"), // Append newline to stdout
      (line: String) => stderr.append(line + "\n")  // Append newline to stderr
    )
    val status = cmd ! logger
    (status, stdout.toString, stderr.toString)
  }
}
