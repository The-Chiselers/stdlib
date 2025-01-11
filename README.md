# Stdlib

## Overview

Stdlib library is a collection of reusable components and utilities designed to simplify hardware design and development in Chisel. 
It provides a set of traits, utilities, and configurations that can be shared across multiple modules, ensuring consistency and reducing boilerplate code. This library is particularly useful for projects that require modularity, configurability, and integration with external tools like Yosys for synthesis.   

## Current Features

### Traits

- `ModuleConfig` - A trait that a class implements such that it can be passed into the [main file](https://github.com/The-Chiselers/main) to configure the module.

### Utilities

- `which` - A utility function that searches for a program in the system's PATH environment variable.
- `runCommand` - A utility function that runs a command and returns the exit status, stdout, and stderr.