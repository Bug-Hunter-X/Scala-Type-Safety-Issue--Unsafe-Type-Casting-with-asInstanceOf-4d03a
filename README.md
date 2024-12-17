# Scala Type Safety Issue: Unsafe Type Casting with `asInstanceOf`

This repository demonstrates a common type safety issue in Scala related to the use of `asInstanceOf` for type checking.  `asInstanceOf` performs a raw cast, bypassing Scala's type system and potentially causing `ClassCastException` at runtime if the type assertion is incorrect. The example shows how this can be solved safely using pattern matching.

## Problem
The `MyClass` uses `asInstanceOf` to handle different types, potentially resulting in runtime errors if the types don't match.

## Solution
The solution replaces `asInstanceOf` with a safer approach using pattern matching.  Pattern matching explicitly checks the type and handles each case separately, preventing unexpected runtime exceptions.