// Version: 20200917
// Handin done by:
//   202508292 Ida Tragstrup
//   202505728 Tobias Clasen
//   202509301 Rasmus Poulsen
// Contributions:
//   Tobias Clasen - Has written the code
//   Ida Tragstrup - Intellectual sparring

import java.io.*;
import java.util.*;

public class Median {
  // Add your private fields here
  private PriorityQueue<Integer> l; // Max-heap
  private PriorityQueue<Integer> r; // Min-heap

  public Median() {
    l = new PriorityQueue<>(Comparator.reverseOrder());
    r = new PriorityQueue<>(Comparator.naturalOrder());
  }

  public void add(int x) {
    if (l.size() == 0 || x < l.peek()) {
      l.add(x);
    } else {
      r.add(x);
    }

    if (l.size() > r.size() + 1) {
      r.add(l.remove());
    } else if (r.size() > l.size()) {
      l.add(r.remove());
    }
  }

  public int median() {
    // Implement your method to return the median of the numbers added so far
    if (l.size() > r.size()) {
      return l.peek();
    } else {
      return r.peek();
    }
  }
}
