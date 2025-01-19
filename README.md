# Kotlin removeIf Unexpected Behavior

This repository demonstrates a subtle but important point about using the `removeIf` function with mutable collections (Lists, Maps, and Sets) in Kotlin.  The `removeIf` function modifies the collection directly and can lead to unexpected side effects if not properly understood.

The `bug.kt` file showcases the behavior, while `bugSolution.kt` (optional) provides improved approaches if necessary.

## How to reproduce:
1. Clone this repository.
2. Open the `bug.kt` file with a Kotlin IDE.
3. Run the `main` function.  Observe the output.
4. Note how `removeIf` modifies the collections directly.

## Discussion:
The example highlights the imperative nature of `removeIf`. While convenient, it demands awareness of potential consequences when working with shared collections or when the order of elements matters.  This example could lead to bugs if the programmer expects a new collection to be returned rather than the original modified.
