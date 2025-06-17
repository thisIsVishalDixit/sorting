| **Algorithm**      | **Time Complexity** | **Stable** | **Extra Space** | **Suitable For**             |
| ------------------ | ------------------- | ---------- | --------------- | ---------------------------- |
| **Bubble Sort**    | O(n²)               | ✅ Yes      | ❌ No            | Simple data, educational     |
| **Selection Sort** | O(n²)               | ❌ No       | ❌ No            | Small datasets               |
| **Insertion Sort** | O(n²)               | ✅ Yes      | ❌ No            | Nearly sorted data           |
| **Merge Sort**     | O(n log n)          | ✅ Yes      | ✅ Yes           | Large datasets, linked lists |
| **Quick Sort**     | O(n log n) avg.     | ❌ No       | ❌ No            | General-purpose, fast        |
| **Heap Sort**      | O(n log n)          | ❌ No       | ❌ No            | Priority queues, heaps       |
| **Counting Sort**  | O(n + k)            | ✅ Yes      | ✅ Yes           | Integers, small range        |

📘 Summary Table
| Algorithm          | 🔎 Definition                                                                               | 💡 Use-Case                                                                           |
| ------------------ | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| **Bubble Sort**    | Repeatedly compares adjacent elements and swaps them if they're in the wrong order.         | Best for educational purposes or very small, nearly sorted datasets.                  |
| **Selection Sort** | Repeatedly finds the minimum element and moves it to the beginning.                         | Easy to implement; good for small arrays where memory is a constraint.                |
| **Insertion Sort** | Builds the sorted array one element at a time by inserting items in their correct position. | Very efficient for small or nearly sorted datasets.                                   |
| **Merge Sort**     | Divides the array into halves, sorts each half, then merges them.                           | Ideal for sorting large datasets and linked lists; stable and consistent performance. |
| **Quick Sort**     | Uses a pivot to partition the array, then sorts the partitions recursively.                 | Very fast on average; widely used in real-world systems. Not stable.                  |
| **Heap Sort**      | Builds a heap and repeatedly extracts the maximum (or minimum) to sort.                     | Useful in priority queues or when consistent `O(n log n)` is required.                |
| **Counting Sort**  | Counts occurrences of elements and places them in order.                                    | Efficient for integers in a small range (e.g., `[0–1000]`); not comparison-based.     |
